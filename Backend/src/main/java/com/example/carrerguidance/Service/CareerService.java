package com.example.carrerguidance.Service;

import com.example.carrerguidance.Model.Career;
import com.example.carrerguidance.Model.Interests;

import java.util.List;

public interface CareerService {
    Career saveCareer(Career career);
    List<Career> getAllCareer();
    Career getCareerById(long id);
    Career updateCareer(Career career, long id);
    void deleteCareer(long id);
}
