package com.ws.worldskills.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "usr")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String password;
}
