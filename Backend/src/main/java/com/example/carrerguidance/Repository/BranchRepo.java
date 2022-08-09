package com.example.carrerguidance.Repository;

import com.example.carrerguidance.Model.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BranchRepo extends JpaRepository<Branch, Long> {
}
