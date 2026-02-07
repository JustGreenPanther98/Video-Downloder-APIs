package com.video.service;

import com.video.response.YoutubeDownloadResponse;

public interface YoutubeService {
	
	YoutubeDownloadResponse downloadVideo(String link,boolean longVideo);	
	
}
