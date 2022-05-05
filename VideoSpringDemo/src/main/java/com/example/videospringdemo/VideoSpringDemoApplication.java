package com.example.videospringdemo;

import com.example.videospringdemo.controller.Video;
import com.example.videospringdemo.repository.VideoModel;
import com.example.videospringdemo.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.Collection;

@SuppressWarnings("ALL")
@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@EnableWebMvc
@Configuration
public class VideoSpringDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(VideoSpringDemoApplication.class, args);
    }

    @Bean
    public VideoRepository videoRepository(){
        return new VideoModel();
    }
}

