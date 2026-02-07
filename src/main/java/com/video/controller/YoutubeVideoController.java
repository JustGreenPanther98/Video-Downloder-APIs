package com.video.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.video.response.YoutubeDownloadResponse;
import com.video.service.YoutubeService;

@RestController
@RequestMapping("/api/v1")
public class YoutubeVideoController {
	
	private YoutubeService youtubeService;
	
	public YoutubeVideoController(YoutubeService youtubeService) {
		this.youtubeService=youtubeService;
	}
	
	@GetMapping("/download")
	public YoutubeDownloadResponse downloadVideo(@RequestParam("url") String youtubeLink) {
		return youtubeService.downloadVideo(youtubeLink,true);
	}
	
	@GetMapping("/shorts/download")
	public YoutubeDownloadResponse downloadShortVideo(@RequestParam("url") String youtubeLink) {
		return youtubeService.downloadVideo(youtubeLink,false);
	}
	
}
