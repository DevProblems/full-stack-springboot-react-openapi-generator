import { YoutubeVideo } from "@devproblems/youtube-videos-api";
import { FC } from "react";

interface VideoProp {
  video: YoutubeVideo;
}

const Video: FC<VideoProp> = ({ video }) => {
  return (
    <div className="card">
      <div className="card-inner">
        <iframe
          src={video.url}
          title={video.title}
          allowFullScreen
          className="card-front"
          width="420"
          height="315"
        ></iframe>
      </div>
    </div>
  );
};

export default Video;
