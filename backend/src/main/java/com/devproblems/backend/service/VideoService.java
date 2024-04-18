package com.devproblems.backend.service;

import com.devproblems.backend.entity.Video;
import com.devproblems.backend.mapper.VideoMapper;
import com.devproblems.backend.repository.VideoRepository;
import com.devproblems.backend.server.dto.YoutubeVideo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Dev Problems(A Sarang Kumar Tak)
 * @youtubechannel <a href="https://www.youtube.com/@devproblems">...</a>
 */
@Service
public class VideoService {

    private final VideoRepository videoRepository;

    private final VideoMapper videoMapper;

    public VideoService(VideoRepository videoRepository, VideoMapper videoMapper) {
        this.videoRepository = videoRepository;
        this.videoMapper = videoMapper;
    }


    public List<YoutubeVideo> getVideoByTag(String tag) {
        var videos = this.videoRepository.findByTag(tag);
        return this.videoMapper.videoToYoutubeVideo(videos);
    }

    public List<YoutubeVideo> getVideos() {
        var videos = this.videoRepository.findDistinctByTag();
        return this.videoMapper.videoToYoutubeVideo(videos);
    }
}
