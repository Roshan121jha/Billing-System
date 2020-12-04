package com.initialwebtech.billing.system.desktop.repository;

import com.initialwebtech.billing.system.desktop.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<Users, UUID> {
}
