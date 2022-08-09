package com.example.carrerguidance.Repository;

import com.example.carrerguidance.Model.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface BranchRepo extends JpaRepository<Branch, Long> {
    @Query("select c from Branch c where c.name=?1")
    Branch findByName(String name);
}
