package com.example.carrerguidance.Repository;

import com.example.carrerguidance.Model.Career;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


//@Repository
public interface CareerRepo extends JpaRepository<Career, Long> {
    //find career by name
    @Query(value = "select c from Career c where c.name=?1")
    Career findByCareerName(String careerName);
}
