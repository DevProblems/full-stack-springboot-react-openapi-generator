package com.devproblems.backend.mapper;

import com.devproblems.backend.entity.Video;
import com.devproblems.backend.server.dto.YoutubeVideo;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Dev Problems(A Sarang Kumar Tak)
 * @youtubechannel <a href="https://www.youtube.com/@devproblems">...</a>
 */
@Mapper(componentModel = "spring")
public interface VideoMapper {

    List<YoutubeVideo> videoToYoutubeVideo(List<Video> videos);
}
