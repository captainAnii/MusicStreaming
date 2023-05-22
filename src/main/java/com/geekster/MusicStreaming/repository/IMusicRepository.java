package com.geekster.MusicStreaming.repository;

import com.geekster.MusicStreaming.model.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMusicRepository extends JpaRepository<Music, Integer> {

}