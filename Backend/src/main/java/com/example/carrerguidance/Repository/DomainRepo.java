package com.example.carrerguidance.Repository;

import com.example.carrerguidance.Model.Domain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

//@Repository
public interface DomainRepo extends JpaRepository<Domain, Long> {
    @Query("select c from Domain c where c.name=?1")
    Domain findByDomainName(String courseName);
}
