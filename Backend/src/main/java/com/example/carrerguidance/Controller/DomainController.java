package com.example.carrerguidance.Controller;

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
    @GetMapping("/api/Domain")
    public List<Domain> getAllCourses(){
        return domainService.getAllDomain();
    }

    @GetMapping("/api/Domain/oc/{domainName}")
    public List<OnlineCourses> getOnlineCoursesByDomainName(@PathVariable String domainName){
        return domainService.getOnlineCoursesByDomain(domainName);
    }
    @GetMapping("/api/Domain/un/{domainName}")
    public List<University> getUniversityByCourses(@PathVariable String domainName){
        return domainService.getUniversityByDomain(domainName);
    }
    @GetMapping("/api/Domain/{id}")
    public Domain getDomainById(@PathVariable("id") long id){
        return domainService.getDomainById(id);
    }

    @PutMapping({"/api/Domain/{id}"})
    public Domain updateCourses(@PathVariable("id") long id1,@RequestBody Domain courses){
        return domainService.updateDomain(courses, id1);
    }

    @DeleteMapping("/api/courses/{id}")
    public void deleteCourses(@PathVariable("id") long id){
        domainService.deleteDomain(id);
    }
    @PostMapping("/api/courses")
    public Domain saveCourses(@RequestBody Domain courses){
        return domainService.saveDomain(courses);
    }

}
