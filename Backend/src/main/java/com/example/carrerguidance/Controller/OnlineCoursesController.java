package com.example.carrerguidance.Controller;

import com.example.carrerguidance.Model.*;
import com.example.carrerguidance.Service.OnlineCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OnlineCoursesController {
    @Autowired
    private OnlineCourseService onlineCourseService;
    public OnlineCoursesController(OnlineCourseService onlineCourseService){
        this.onlineCourseService = onlineCourseService;
    }
    @GetMapping("/api/onlineCourse")
    public List<OnlineCourses> getAllCourses(){
        return onlineCourseService.getAllOnlineCourses();
    }
    @GetMapping("/api/onlineCourse/{id}")
    public OnlineCourses getonlineCourseById(@PathVariable("id") long id){
        return onlineCourseService.getOnlineCourseById(id);
    }
    @PutMapping("/api/onlineCourse/{id}")
    public OnlineCourses updateSubCourses(@PathVariable("id") long id, @RequestBody OnlineCourses onlineCourse){
        return onlineCourseService.updateOnlineCourses(onlineCourse, id);
    }
    @DeleteMapping("/api/onlineCourse/{id}")
    public void deleteonlineCourse(@PathVariable("id") long id){
        onlineCourseService.deleteOnlineCourse(id);
    }
    @PostMapping("/api/onlineCourse")
    public OnlineCourses saveonlineCourse(@RequestBody OnlineCourses onlineCourse){
        return onlineCourseService.saveOnlineCourses(onlineCourse);
    }
}
