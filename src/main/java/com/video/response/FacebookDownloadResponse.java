package com.video.response;

import java.util.List;

public class FacebookDownloadResponse {

	private List<UrlItem> urls;
	private String pictureUrl;
	private String service;

	public static class UrlItem {
		private String url;
		private String name; // MP4 or something else
		private String subName; // HD,SD or something else

		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSubName() {
			return subName;
		}

		public void setSubName(String subName) {
			this.subName = subName;
		}

	}

	public List<UrlItem> getUrls() {
		return urls;
	}

	public void setUrls(List<UrlItem> urls) {
		this.urls = urls;
	}

	public String getPictureUrl() {
		return pictureUrl;
	}

	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

}
