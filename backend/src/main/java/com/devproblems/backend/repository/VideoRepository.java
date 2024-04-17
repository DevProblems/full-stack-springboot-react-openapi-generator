package com.devproblems.backend.repository;

import com.devproblems.backend.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VideoRepository extends JpaRepository<Video, Integer> {

    List<Video> findByTag(String tag);

}
