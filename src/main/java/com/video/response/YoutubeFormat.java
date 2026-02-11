package com.video.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class YoutubeFormat {
	private String url;
	private String qualityLabel;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getQualityLabel() {
		return qualityLabel;
	}

	public void setQualityLabel(String qualityLabel) {
		this.qualityLabel = qualityLabel;
	}

}
