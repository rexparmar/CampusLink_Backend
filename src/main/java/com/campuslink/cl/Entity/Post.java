package com.campuslink.cl.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long post_id;

    private Long group_id;
    private Long user_id;
    private String content;
    private boolean pinned;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
}
