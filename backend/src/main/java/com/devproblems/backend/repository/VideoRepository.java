package com.devproblems.backend.repository;

import com.devproblems.backend.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author Dev Problems(A Sarang Kumar Tak)
 * @youtubechannel <a href="https://www.youtube.com/@devproblems">...</a>
 */
public interface VideoRepository extends JpaRepository<Video, Integer> {

    List<Video> findByTag(String tag);

    @Query(value = "SELECT e.id, e.title, e.url, e.tag FROM video e WHERE e.id IN (SELECT MIN(e2.id) FROM video e2 GROUP BY e2.tag)", nativeQuery = true)
    List<Video> findDistinctByTag();

}
