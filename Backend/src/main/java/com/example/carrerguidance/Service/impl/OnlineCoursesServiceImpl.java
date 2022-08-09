package com.example.carrerguidance.Service.impl;


import com.example.carrerguidance.Model.OnlineCourses;
import com.example.carrerguidance.Repository.OnlineCoursesRepo;
import com.example.carrerguidance.Service.OnlineCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OnlineCoursesServiceImpl implements OnlineCourseService {

    @Autowired
    private OnlineCoursesRepo onlineCoursesRepo;
    public OnlineCoursesServiceImpl(OnlineCoursesRepo onlineCoursesRepo){
        this.onlineCoursesRepo = onlineCoursesRepo;
    }
    @Override
    public OnlineCourses saveOnlineCourses(OnlineCourses onlineCourses) {
        return onlineCoursesRepo.save(onlineCourses);
    }
    @Override
    public List<OnlineCourses> getAllOnlineCourses() {
        return onlineCoursesRepo.findAll();
    }
    @Override
    public OnlineCourses getOnlineCourseById(long id) {
        return onlineCoursesRepo.findById(id).orElse(null);
    }
    @Override
    public void deleteOnlineCourse(long id) {
        onlineCoursesRepo.deleteById(id);
    }


    @Override
    public OnlineCourses updateOnlineCourses(OnlineCourses onlineCourses, long id) {
        return onlineCoursesRepo.findById(id).map(onlineCourses1 -> {
            onlineCourses1.setName(onlineCourses.getName());
            onlineCourses1.setDuration(onlineCourses.getDuration());
            onlineCourses1.setCourseUrl(onlineCourses.getCourseUrl());
            onlineCourses1.setImageUrl(onlineCourses.getImageUrl());
            return onlineCoursesRepo.save(onlineCourses1);
        }).orElseGet(() -> {
            onlineCourses.setId(id);
            return onlineCoursesRepo.save(onlineCourses);
        });
    }


}
