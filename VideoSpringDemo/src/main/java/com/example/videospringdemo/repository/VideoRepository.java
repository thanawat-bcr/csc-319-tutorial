package com.example.videospringdemo.repository;

import com.example.videospringdemo.controller.Video;

import java.util.Collection;

public interface VideoRepository {
    // Add a Video
    public boolean addVideo(Video v);
    // Get the added videos
    public Collection<Video> getVideos();
    // Find all videos matching by a Title
    public Collection<Video> findByTitle(String title);
}
