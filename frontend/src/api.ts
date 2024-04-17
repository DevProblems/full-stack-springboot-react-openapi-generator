import { Configuration, VideoApiFactory, YoutubeVideo } from "@devproblems/youtube-videos-api"
import axios from "axios"

const api = axios.create({
    baseURL: "http://localhost:8081/api",
    headers: {
        Accept: "application/json"
    }
})


const videoApi = VideoApiFactory(new Configuration(), "", api)

export const getVideoByTag = async(tag: string): Promise<YoutubeVideo[]> => {
    const response = await videoApi.getVideoByTag(tag);
    return response.data;
}

export const getVideos = async(): Promise<YoutubeVideo[]> => {
    const response = await videoApi.getVideos();
    return response.data;
}
