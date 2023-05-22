package com.geekster.MusicStreaming.repository;

import com.geekster.MusicStreaming.model.UserStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserStatusRepo extends JpaRepository<UserStatus, Integer> {

}