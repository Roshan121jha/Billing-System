package com.initialwebtech.billing.system.desktop.service.impl;

import com.initialwebtech.billing.system.desktop.model.Users;
import com.initialwebtech.billing.system.desktop.repository.UserRepository;
import com.initialwebtech.billing.system.desktop.service.UserService;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Optional<Users> authenticateUser(String email, String password) {
        Users users = new Users();
        users.setEmail(email);
        users.setPassword(password);
        return this.userRepository.findOne(Example.of(users));
    }
}
