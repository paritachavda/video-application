package com.vuclip.videoapplication.controller;



import com.vuclip.videoapplication.model.ApiResponse;
import com.vuclip.videoapplication.model.Video;
import com.vuclip.videoapplication.model.VideoDto;
import com.vuclip.videoapplication.service.VideoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class VideoController {

    private final VideoService vservice;
    public VideoController(VideoService vservice) {
        this.vservice = vservice;
    }


    @DeleteMapping(value = "/videos/{id}")
    public ApiResponse<Void>deleteController(@PathVariable("id") int id) {

        vservice.deleteVideoService(id);
        return new ApiResponse<>(HttpStatus.OK.value()," Video deleted successfully",null);
    }

    @PutMapping(value = "/videos/{id}")
    public ApiResponse<VideoDto> updateController(@PathVariable("id") int id, @RequestBody VideoDto video) {
        System.out.println("Edited object id : " + video.getVid()+id);
        return new ApiResponse<>(HttpStatus.OK.value(),"Video deleted successfully ",vservice.updateVideoService(id,video));
    }

    @PostMapping(value = "/videos")
    public ApiResponse<Video> createController(@RequestBody VideoDto video) {
        System.out.println("Request Body : " + video.getDescription() + video.getTitle());

        return new ApiResponse<>(HttpStatus.OK.value(),"Video is saved successfully",vservice.addVideoService(video));
    }

    @GetMapping(value = "/videos")
    public ApiResponse<List<Video>> getallController() {
        return new ApiResponse<>(HttpStatus.OK.value(),"Video List fetched successfully",vservice.getAllVideosService());
    }
    @GetMapping(value = "/videos/{id}")
    public ApiResponse<Video> getController(@PathVariable("id") int id) {
        return new ApiResponse<>( HttpStatus.OK.value(),"Video fetched successfully",vservice.getVideoService(id));
    }

}
