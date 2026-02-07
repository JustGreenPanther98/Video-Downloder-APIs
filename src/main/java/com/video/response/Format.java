package com.video.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Format {
	public String url; 
    public String qualityLabel;
}
