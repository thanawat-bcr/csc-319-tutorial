package com.example.videospringdemo.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class Video {
    String name;
    String genre;
    int duration;
}
