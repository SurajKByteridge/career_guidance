package com.example.carrerguidance.Service.impl;

import com.example.carrerguidance.Model.Career;
import com.example.carrerguidance.Model.Interests;
import com.example.carrerguidance.Repository.CareerRepo;
import com.example.carrerguidance.Service.CareerService;
import com.example.carrerguidance.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
;

import java.util.List;

@Service
public class CareerServiceImpl implements CareerService {
    @Autowired
    private CareerRepo careerRepo;
    public CareerServiceImpl(
            CareerRepo careerRepo) {
        this.careerRepo = careerRepo;
    }
    @Override
    public Career saveCareer(Career career) {
        //save career to database
        return careerRepo.save(career);
    }

    @Override
    public List<Career> getAllCareer() {
        return careerRepo.findAll();
    }

    @Override
    public Career getCareerById(long id) {
        return careerRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Career", "Id", id));
    }

    @Override
    public Career updateCareer(Career career, long id) {
        return careerRepo.findById(id).map(career1 -> {
            career1.setId(id);
            career1.setName(career.getName());
            return careerRepo.save(career1);
        }).orElseThrow(() -> new ResourceNotFoundException("Career", "Id", id));
    }

    @Override
    public void deleteCareer(long id) {
        careerRepo.deleteById(id);
    }

    @Override
    public Interests getInterestsByCareerName(String careerName) {
        //first find the career by name using hql
//        String hql = "from Career where careerName = :careerName";
        Career c=careerRepo.findByCareerName(careerName);
        if(c==null){
            return null;
        }
        //then find the interests by career name
        return c.getInterests();
    }

}
