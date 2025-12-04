package com.campuslink.cl.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;

    private String name;
    private String email;
    private String password_hash;
    private String role;
    private String profile_photo_url;
    private LocalDateTime created_at;
}
