import { YoutubeVideo } from "@devproblems/youtube-videos-api";
import Spinner from "./components/Spinner";
import { FC } from "react";
import Video from "./Video";

/**
 * @author Dev Problems(A Sarang Kumar Tak)
 * @youtubechannel <a href="https://www.youtube.com/@devproblems">...</a>
 */
export interface VideoGrodProp {
  videos: YoutubeVideo[];
  isLoading: boolean;
}

const VideoGrid: FC<VideoGrodProp> = ({ videos, isLoading }) => {
  return isLoading ? (
    <Spinner />
  ) : (
    <section className="cards">
      {videos.map((video) => (
        <Video key={Number(video.id)} video={video} />
      ))}
    </section>
  );
};

export default VideoGrid;
