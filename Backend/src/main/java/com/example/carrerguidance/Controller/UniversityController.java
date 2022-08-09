package com.example.carrerguidance.Controller;

import com.example.carrerguidance.Model.University;
import com.example.carrerguidance.Service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UniversityController {
    @Autowired
    private UniversityService universityService;
    public UniversityController(UniversityService universityService){
        this.universityService = universityService;
    }
    @GetMapping("/api/university")
    public List<University> getAllUniversity(){
        return universityService.getAllUniversity();
    }
    @GetMapping("/api/university/{id}")
    public University getUniversityById(@PathVariable("id") long id){
        return universityService.getUniversityById(id);
    }
    @DeleteMapping("/api/university/{id}")
    public void deleteUniversity(@PathVariable("id") long id){
        universityService.deleteUniversity(id);
    }
    @PostMapping("/api/university")
    public University saveUniversity(@RequestBody University university){
        return universityService.saveUniversity(university);
    }
    @PutMapping("/api/university/")
    public University updateUniversity(@RequestBody University university, long id){
        return universityService.updateUniversity(university, id);
    }
}
