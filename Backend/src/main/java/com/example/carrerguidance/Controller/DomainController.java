package com.example.carrerguidance.Controller;

import com.example.carrerguidance.Model.Branch;
import com.example.carrerguidance.Model.Domain;
import com.example.carrerguidance.Model.OnlineCourses;

import com.example.carrerguidance.Model.University;

import com.example.carrerguidance.Service.DomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DomainController
{
    @Autowired
    private DomainService domainService;
    public DomainController(DomainService coursesService) {
        this.domainService = coursesService;
    }
    @GetMapping("/api/domain")
    public List<Domain> getAllCourses(){
        return domainService.getAllDomain();
    }

    @GetMapping("/api/domain/{id}")
    public Domain getDomainById(@PathVariable("id") long id){
        return domainService.getDomainById(id);
    }
    @GetMapping("/api/domain/br/{domain}")
    public List<Branch> getBranchByDomain(@PathVariable("domain") String domain){
        return domainService.getAllBranchesByDomainName(domain);
    }
    @PutMapping({"/api/domain/{id}"})
    public Domain updateCourses(@PathVariable("id") long id1,@RequestBody Domain courses){
        return domainService.updateDomain(courses, id1);
    }

    @DeleteMapping("/api/domain/{id}")
    public void deleteCourses(@PathVariable("id") long id){
        domainService.deleteDomain(id);
    }
    @PostMapping("/api/domain/")
    public Domain saveCourses(@RequestBody Domain domain){
        return domainService.saveDomain(domain);
    }

}
