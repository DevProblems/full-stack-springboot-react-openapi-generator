package com.devproblems.backend.entity;

import jakarta.persistence.*;
import lombok.Data;

/**
 * @author Dev Problems(A Sarang Kumar Tak)
 * @youtubechannel <a href="https://www.youtube.com/@devproblems">...</a>
 */
@Data
@Entity
@Table(name = "video")
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String url;
    private String tag;
}
