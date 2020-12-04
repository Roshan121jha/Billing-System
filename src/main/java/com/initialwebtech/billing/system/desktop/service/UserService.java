package com.initialwebtech.billing.system.desktop.service;

import com.initialwebtech.billing.system.desktop.model.Users;

import java.util.Optional;

public interface UserService {

    public Optional<Users> authenticateUser(String email, String password);
}
