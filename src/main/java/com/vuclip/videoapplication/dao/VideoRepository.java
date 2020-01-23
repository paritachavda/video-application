package com.vuclip.videoapplication.dao;

import com.vuclip.videoapplication.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface VideoRepository extends JpaRepository<Video, Integer> {

}

//@Component
//public class VideoRepository {
//    private static Map<Integer, Video> videoRepo = new HashMap<>();
//
//    @PostConstruct
//    private void init() {
//        Video video1 = new Video("sa re ga ma","Singing by new talent");
////        video1.setVid(1);
////        video1.setTitle("sa re ga ma");
////        video1.setDescription("Singing by ne talent");
//        Video video2 = new Video("DID","Hum sabko nachaaenge");
////        video2.setVid(2);
////        video2.setTitle("sa re ga ma");
////        video2.setDescription("Singing by ne talent");
//
//        videoRepo.put(1,video1);
//        videoRepo.put(2,video2);
//    }
//    public void delete(int key){
//        videoRepo.remove(key);
//    }
//    public void create(int key,Video v){
//        videoRepo.put(key,v);
//    }
//    public void update(int key, Video v){
//        videoRepo.remove(key);
//        videoRepo.put(key,v);
//    }
//    public Map<Integer, Video> getAll(){
//        return videoRepo;
//    }
//    public Video get(int key){
//        return videoRepo.get(key);
//    }
//
//
//}