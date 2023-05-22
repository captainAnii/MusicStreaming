package com.geekster.MusicStreaming.service;

import com.geekster.MusicStreaming.model.MusicAdmin;
import com.geekster.MusicStreaming.repository.IMusicAdmin;
import com.geekster.MusicStreaming.utils.AdminUtil;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    AdminUtil adminUtil;

    @Autowired
    IMusicAdmin iMusicAdmin;

    public int addAdmin(JSONObject admin) {
        MusicAdmin musicAdmin=adminUtil.setAdmin(admin);
        MusicAdmin musicAdmin2=iMusicAdmin.save(musicAdmin);
        return musicAdmin2.getAdminId();
    }

}