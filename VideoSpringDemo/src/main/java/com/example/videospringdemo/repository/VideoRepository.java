package com.example.videospringdemo.repository;

import com.example.videospringdemo.controller.Video;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface VideoRepository extends CrudRepository<Video, Long> {
    // Add a Video
    public boolean addVideo(Video v);
    // Get the added videos
    public Collection<Video> getVideos();
    // Find all videos matching by a Title
    public Collection<Video> findByTitle(String title);
}
