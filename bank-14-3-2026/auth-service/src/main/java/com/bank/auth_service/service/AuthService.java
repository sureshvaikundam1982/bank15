package com.bank.auth_service.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bank.auth_service.model.User;
import com.bank.auth_service.repository.UserRepository;

@Service
public class AuthService {

    @Autowired
    private UserRepository repository;

    public User validate(String username, String password) {

        User user = repository.findByUsername(username);

        if (user != null && user.getPassword().equals(password)) {
            return user;
        }

        return null;
    }
}
