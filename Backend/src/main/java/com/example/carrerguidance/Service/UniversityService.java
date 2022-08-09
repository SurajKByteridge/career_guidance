package com.example.carrerguidance.Service;

import com.example.carrerguidance.Model.University;

import java.util.List;

public interface UniversityService {
    University saveUniversity(University university);
    List<University> getAllUniversity();
    University getUniversityById(long id);
    University updateUniversity(University university, long id);
    void deleteUniversity(long id);
}
