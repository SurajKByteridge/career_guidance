package com.example.carrerguidance.Service.impl;

import com.example.carrerguidance.Model.Branch;
import com.example.carrerguidance.Model.Domain;
import com.example.carrerguidance.Repository.DomainRepo;

import com.example.carrerguidance.Service.DomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DomainServiceImpl implements DomainService {
    @Autowired
    private DomainRepo domainRepo;

    public DomainServiceImpl(DomainRepo domainRepo) {
        this.domainRepo = domainRepo;
    }

    @Override
    public Domain saveDomain(Domain domain) {
        return domainRepo.save(domain);
    }

    @Override
    public List<Domain> getAllDomain() {
        return domainRepo.findAll();
    }

    @Override
    public Domain getDomainById(long id) {
        return domainRepo.findById(id).orElse(null);
    }

    @Override
    public Domain updateDomain(Domain domain, long id) {
        return domainRepo.findById(id).map(domain1 -> {
            domain1.setId(id);
            domain1.setName(domain.getName());
            return domainRepo.save(domain1);
        }).orElse(null);
    }

    @Override
    public void deleteDomain(long id) {
        domainRepo.deleteById(id);
    }

    @Override
    public List<Branch> getAllBranchesByDomainName(String domainName) {
         Domain byDomainName = domainRepo.findByDomainName(domainName);
         if (byDomainName == null) {
             return null;
         }
            return byDomainName.getBranches();
    }
}
