package com.geekster.MusicStreaming.repository;

import com.geekster.MusicStreaming.model.MusicAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMusicAdmin extends JpaRepository<MusicAdmin, Integer> {

}