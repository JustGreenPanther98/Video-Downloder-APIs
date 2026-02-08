🎯 Universal Video Downloader API
<<<<<<< HEAD
=======
<br>
>>>>>>> 3c904e29dcc2cf1722d633e79d3d36158344c8ac
A powerful Spring Boot REST API for fetching high-quality download links from Facebook, Instagram, and YouTube.

🔗 Quick Links

<<<<<<< HEAD
Live Documentation: Swagger UI

Base Production URL: https://platform-video-downloder.onrender.com

📌 Features Multi-Platform Support: Facebook, Instagram, and YouTube.
=======
>Live Documentation: <a href="https://platform-video-downloder.onrender.com/swagger-ui/index.html#/">Swagger UI</a>

Base Production URL: https://platform-video-downloder.onrender.com
<br>

📌 Features
Multi-Platform Support: Facebook, Instagram, and YouTube.
>>>>>>> 3c904e29dcc2cf1722d633e79d3d36158344c8ac

Smart Parsing: Handles Reels, Shorts, and long-form video links.

Dockerized Deployment: Automated builds via Multi-stage Dockerfile.

Error Handling: Global exception management for invalid links or API timeouts.

👉 API Endpoints
<<<<<<< HEAD

Facebook
GET /api/v1/facebook/download
=======
1) Facebook
>GET /api/v1/facebook/download
>>>>>>> 3c904e29dcc2cf1722d633e79d3d36158344c8ac

Note: Ensure your URL does not end with a end with /.

Example Body: {"url": "Your facebook URL here"}

<<<<<<< HEAD
Instagram
GET /api/v1/instagram/reels/download?url={link}

YouTube
GET /api/v1/youtube/download?url={link} (For long videos)

GET /api/v1/youtube/shorts/download?url={link} (For shorts)

💫 Deployment on Render
=======
2) Instagram
>GET /api/v1/instagram/reels/download?url={link}

3) YouTube
>GET /api/v1/youtube/download?url={link} (For long videos)

>GET /api/v1/youtube/shorts/download?url={link} (For shorts)

💫 Deployment on Render
>>>>>>> 3c904e29dcc2cf1722d633e79d3d36158344c8ac
