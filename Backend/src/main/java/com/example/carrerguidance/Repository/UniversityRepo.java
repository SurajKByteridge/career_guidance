package com.example.carrerguidance.Repository;

import com.example.carrerguidance.Model.University;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface UniversityRepo extends JpaRepository<University, Long> {

}
