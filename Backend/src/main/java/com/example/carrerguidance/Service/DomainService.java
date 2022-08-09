package com.example.carrerguidance.Service;

import com.example.carrerguidance.Model.Branch;
import com.example.carrerguidance.Model.Domain;
import com.example.carrerguidance.Model.OnlineCourses;
import com.example.carrerguidance.Model.University;

import java.util.List;

public interface DomainService {
    Domain saveDomain(Domain domain);
    List<Domain> getAllDomain();
    Domain getDomainById(long id);
    Domain updateDomain(Domain domain, long id);
    void deleteDomain(long id);
    List<Branch> getAllBranchesByDomainName(String domainName);
}
