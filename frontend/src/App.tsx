import { useEffect, useState } from "react";
import "./App.css";
import Header from "./components/Header";
import Search from "./components/Search";
import { getVideoByTag, getVideos } from "./api";
import { YoutubeVideo } from "@devproblems/youtube-videos-api";
import VideoGrid from "./VideoGrid";

/**
 * @author Dev Problems(A Sarang Kumar Tak)
 * @youtubechannel <a href="https://www.youtube.com/@devproblems">...</a>
 */
function App() {
  const [videos, setVideos] = useState<YoutubeVideo[]>([]);
  const [isLoading, setIsLoading] = useState<boolean>(true);

  useEffect(() => {
    setIsLoading(true);
    getVideos().then((youtubeVideo) => {
      setVideos(youtubeVideo);
      setIsLoading(false);
    });
  }, []);

  const searchFunctionality = async (tag: string): Promise<void> => {
    setIsLoading(true);
    let videoDetails: YoutubeVideo[];
    if (tag) {
      videoDetails = await getVideoByTag(tag);
    } else {
      videoDetails = await getVideos();
    }
    setVideos(videoDetails);
    setIsLoading(false);
  };

  return (
    <div className="container">
      <Header />
      <Search search={searchFunctionality} />
      <VideoGrid isLoading={isLoading} videos={videos} />
    </div>
  );
}

export default App;
