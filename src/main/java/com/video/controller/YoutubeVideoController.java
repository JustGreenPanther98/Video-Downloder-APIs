package com.video.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.video.response.YoutubeDownloadResponse;
import com.video.service.YoutubeService;

@RestController
@RequestMapping("/api/v1/")
public class YoutubeVideoController {
	
	private YoutubeService youtubeService;
	
	public YoutubeVideoController(YoutubeService youtubeService) {
		this.youtubeService=youtubeService;
	}
	
	@GetMapping("/download/{youtubeLink}")
	public YoutubeDownloadResponse downloadVideo(@PathVariable String youtubeLink) {
		return youtubeService.downloadVideo(youtubeLink);
	}
	
	@GetMapping("shorts/download/{youtubeLink}")
	public YoutubeDownloadResponse downloadShortVideo(@PathVariable String youtubeLink) {
		return null;
	}
	
}
