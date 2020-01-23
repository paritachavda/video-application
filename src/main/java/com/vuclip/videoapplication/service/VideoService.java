package com.vuclip.videoapplication.service;


import com.vuclip.videoapplication.dao.VideoRepository;
import com.vuclip.videoapplication.model.Video;
import com.vuclip.videoapplication.model.VideoDto;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
//import  java.util.Map;


@Component
public class VideoService {

    private final VideoRepository videorepo;

    public VideoService(VideoRepository videorepo) {
        this.videorepo = videorepo;
    }

    public void deleteVideoService(int id) {
        videorepo.deleteById(id);
    }
    public Video addVideoService(VideoDto v){
        Video newVideo = new Video();
        newVideo.setTitle(v.getTitle());
        newVideo.setDescription(v.getDescription());
        return videorepo.save(newVideo);



    }
    public Video findById(int id) {
        Optional<Video> optionalUser = videorepo.findById(id);
        return optionalUser.isPresent() ? optionalUser.get() : null;
    }
    public VideoDto updateVideoService(int id, VideoDto v){
        System.out.println("updated video oblect : " + v.getVid()+ v.getDescription()+v.getTitle() );

            Video video = findById(id);
            if(video != null) {
                BeanUtils.copyProperties(v, video);
                System.out.println("updated final video object : " + video.getVid()+ video.getDescription()+video.getTitle() );
                videorepo.save(video);
            }
            return v;
    }


    public List<Video> getAllVideosService(){
        return  videorepo.findAll();
    }
    public Video getVideoService(int id){
        return videorepo.findById(id).get();

    }
}




