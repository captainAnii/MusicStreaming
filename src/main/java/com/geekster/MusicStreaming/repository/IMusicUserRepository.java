package com.geekster.MusicStreaming.repository;

import com.geekster.MusicStreaming.model.MusicUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IMusicUserRepository extends JpaRepository<MusicUser, Integer> {

    @Query(value = "Select * from tbl_music_user where usrname= :username and status_id =1", nativeQuery=true)
    List<MusicUser> findByUsername(String username);

}