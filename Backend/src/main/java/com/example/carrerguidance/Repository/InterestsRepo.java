package com.example.carrerguidance.Repository;

import com.example.carrerguidance.Model.Career;
import com.example.carrerguidance.Model.Interests;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
public interface InterestsRepo extends JpaRepository<Interests, Long> {
    @Query("select i from Interests i where i.name=?1")
    Interests findByInterestName(String interests);

}
