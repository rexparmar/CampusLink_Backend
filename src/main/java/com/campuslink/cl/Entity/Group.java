package com.campuslink.cl.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "groups")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long group_id;

    private String name;
    private String type;
    private Long created_by;
    private LocalDateTime created_at;
}
