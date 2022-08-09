package com.example.carrerguidance;

import com.example.carrerguidance.Model.Career;

import com.example.carrerguidance.Model.Interests;
import com.example.carrerguidance.Repository.CareerRepo;
import com.example.carrerguidance.Repository.InterestsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarrerGuidanceApplication{ //implements CommandLineRunner {
    @Autowired
    CareerRepo careerRepo;
    @Autowired
    InterestsRepo interestsRepo;
    public static void main(String[] args) {
        SpringApplication.run(CarrerGuidanceApplication.class, args);
    }

//    @Override
//    public void run(String... args) throws Exception
//    {
//        Interests interests = new Interests();
//        interests.setInterestName("Maths");
//        Career career = new Career();
//        career.setCareerName("Software Engineer");
//        Career career1 = new Career();
//        career1.setCareerName("Data Scientist");
//        Career career2 = new Career();
//        career2.setCareerName("Data Analyst");
//        Courses courses = new Courses();
//        courses.setCourseName("B.Tech");
//        Courses courses1 = new Courses();
//        courses1.setCourseName("M.Tech");
//        Courses courses2 = new Courses();
//        courses2.setCourseName("MBA");
//        interests.getCourses().add(courses);
//        interests.getCourses().add(courses1);
//        interests.getCourses().add(courses2);
//        interests.getCareer().add(career);
//        interests.getCareer().add(career1);
//        interests.getCareer().add(career2);
//        interestsRepo.save(interests);
//    }
}
