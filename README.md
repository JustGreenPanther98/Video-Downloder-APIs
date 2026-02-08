🎯 <b><big>Universal Video Downloader API</b></big>
<br>
A powerful Spring Boot REST API for fetching high-quality download links from Facebook, Instagram, and YouTube.

🔗 <big><b>Quick Links</b></big>

>Live Documentation: <a href="https://platform-video-downloder.onrender.com/swagger-ui/index.html#/">Swagger UI</a>

Base Production URL: https://platform-video-downloder.onrender.com
<br>

📌 <big><b>Features</b></big>

1) Multi-Platform Support: Facebook, Instagram, and YouTube.

2) Smart Parsing: Handles Reels, Shorts, and long-form video links.
   
3) Error Handling: Global exception management for invalid links or API timeouts.

👉 <b><big>API Endpoints</big></b>

1) Instagram

>GET /api/v1/instagram/reels/download?url={link}

2) YouTube

>GET /api/v1/youtube/download?url={link} (For long videos)

>GET /api/v1/youtube/shorts/download?url={link} (For shorts)

3) Facebook
>POST /api/v1/facebook/download

Note: 
1) Ensure your URL does not end with a end with /.
2) Face API could give you 422 status code, just re-run it couple of time to download video 
Example Body: {"url": "Your facebook URL here"}
