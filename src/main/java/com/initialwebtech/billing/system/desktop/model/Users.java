package com.initialwebtech.billing.system.desktop.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.UUID;

@Data
@Entity
@Table(name = "users")
public class Users implements Serializable {

    @Id
    private UUID id;

    @Column(name = "Email")
    private String email;

    @Column(name = "Password")
    private String password;
}
