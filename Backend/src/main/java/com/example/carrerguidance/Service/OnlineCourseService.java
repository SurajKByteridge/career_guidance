package com.example.carrerguidance.Service;

import com.example.carrerguidance.Model.OnlineCourses;

import java.util.List;

public interface OnlineCourseService {
    OnlineCourses saveOnlineCourses(OnlineCourses onlineCourses);
    List<OnlineCourses> getAllOnlineCourses();
    OnlineCourses getOnlineCourseById(long id);
    OnlineCourses updateOnlineCourses(OnlineCourses onlineCourses, long id);
    void deleteOnlineCourse(long id);
}
