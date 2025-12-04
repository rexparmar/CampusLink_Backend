package com.campuslink.cl.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "notifications")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long notification_id;

    private Long user_id;
    private String character;
    private String payload;
    private boolean read;
    private LocalDateTime created_at;
}
