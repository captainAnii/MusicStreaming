package com.geekster.MusicStreaming.service;

import com.geekster.MusicStreaming.model.Music;
import com.geekster.MusicStreaming.model.MusicUser;
import com.geekster.MusicStreaming.repository.IMusicRepository;
import com.geekster.MusicStreaming.repository.IMusicUserRepository;
import com.geekster.MusicStreaming.utils.UserUtil;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserUtil userUtil;
    @Autowired
    IMusicUserRepository iMusicUserRepository;

    @Autowired
    IMusicRepository iMusicRepository;

    public int addUser(JSONObject jsonObject) {
        MusicUser musicuser=userUtil.setAdmin(jsonObject);
        MusicUser musicuser1=iMusicUserRepository.save(musicuser);
        return musicuser1.getUserId();

    }



    public List<Music> getPlaylist(Integer id) {
        List<Music> list=new ArrayList<>();
        MusicUser musicUser=iMusicUserRepository.findById(id).get();
        List<Integer> arrayList=musicUser.getPlaylist();

        for(int i=0;i<arrayList.size();i++) {
            Music music=iMusicRepository.findById(arrayList.get(i)).get();
            list.add(music);
        }
        return list;
    }



    public String  deleteMusic(Integer id,Integer musicId) {
        String string="";
        try {
            MusicUser musicUser=iMusicUserRepository.findById(id).get();
            List<Integer> arrayList=musicUser.getPlaylist();
            for(int i=0;i<arrayList.size();i++) {
                int id1=arrayList.get(i);
                if(id1==musicId) {
                    arrayList.remove(i);
                }
            }
            string="done";
        }
        catch (Exception e) {
            string=e.getMessage();
        }

        return string;
    }
}