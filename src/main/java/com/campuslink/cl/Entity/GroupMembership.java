package com.campuslink.cl.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "group_memberships")
public class GroupMembership {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long membership_id;

    private Long group_id;
    private Long user_id;
    private String role;
    private LocalDateTime joined_at;
}
