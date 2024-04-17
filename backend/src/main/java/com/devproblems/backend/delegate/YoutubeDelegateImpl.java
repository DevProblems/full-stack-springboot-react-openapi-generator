package com.devproblems.backend.delegate;

import com.devproblems.backend.server.api.YoutubeApiDelegate;
import com.devproblems.backend.server.dto.YoutubeVideo;
import com.devproblems.backend.service.VideoService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YoutubeDelegateImpl implements YoutubeApiDelegate {

    private final VideoService videoService;

    public YoutubeDelegateImpl(VideoService videoService) {
        this.videoService = videoService;
    }

    @Override
    public ResponseEntity<List<YoutubeVideo>> getVideoByTag(String tag) {
        return ResponseEntity.ok(this.videoService.getVideoByTag(tag));
    }
}
