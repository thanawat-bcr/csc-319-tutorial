package com.example.videodemojpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideoRepository extends CrudRepository<Video, Integer> {
    public List<Video> findAll();
}
