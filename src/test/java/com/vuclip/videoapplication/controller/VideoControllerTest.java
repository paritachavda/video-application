package com.vuclip.videoapplication.controller;

import com.vuclip.videoapplication.model.VideoDto;
import com.vuclip.videoapplication.service.VideoService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@WebMvcTest(value = VideoController.class)
class VideoControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private VideoService videoService;

    @MockBean
     private VideoDto videoDto;


    VideoDto mockVideo = new VideoDto();



    String exampleCourseJson = "{\"name\":\"Spring\",\"description\":\"10 Steps\",\"steps\":[\"Learn Maven\",\"Import Project\",\"First Example\",\"Second Example\"]}";


    @Test
    void deleteController() {
    }

    @Test
    void updateController() {
    }

    @Test
    void createController() {
    }

    @Test
    void getallController() {
    }

    @Test
    void getController() {
    }
}