package com.example.videodemojpa.repository;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Video {
    @Id
    private int id;
    private String name;
    private String genre;
    private int duration;

    public Video(String name, String genre, int duration) {
        this.name = name;
        this.genre = genre;
        this.duration = duration;
    }
}
