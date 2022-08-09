package com.example.carrerguidance.Service.impl;

import com.example.carrerguidance.Model.University;
import com.example.carrerguidance.Repository.UniversityRepo;
import com.example.carrerguidance.Service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversityServiceImpl implements UniversityService
{
    @Autowired
    private UniversityRepo universityRepo;
    @Override
    public University saveUniversity(University university) {
        return universityRepo.save(university);
    }

    @Override
    public List<University> getAllUniversity() {
        return universityRepo.findAll();
    }

    @Override
    public University getUniversityById(long id) {
        return universityRepo.findById(id).orElse(null);
    }

    @Override
    public University updateUniversity(University university, long id) {
        //update university
        University university1 = universityRepo.findById(id).orElse(null);
        assert university1 != null;
//        university1.setDesc(university.getDesc());
        university1.setName(university.getName());
        return universityRepo.save(university1);
    }

    @Override
    public void deleteUniversity(long id) {
        universityRepo.deleteById(id);
    }

}
