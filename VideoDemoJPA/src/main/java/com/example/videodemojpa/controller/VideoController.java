package com.example.videodemojpa.controller;

import com.example.videodemojpa.repository.Video;
import com.example.videodemojpa.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;

@Controller
public class VideoController {

    @Autowired
    private VideoRepository videos;

    @RequestMapping(value = "/video", method = RequestMethod.POST)
    public @ResponseBody boolean addVideo(@RequestBody Video v) {
        videos.save(v);
        return true;
    }
    @RequestMapping(value = "/video", method = RequestMethod.GET)
    public @ResponseBody Collection<Video> getVideoList() {
        return videos.findAll();
    }
}
