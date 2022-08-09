package com.example.carrerguidance.Controller;

import com.example.carrerguidance.Model.Career;

import com.example.carrerguidance.Model.Domain;
import com.example.carrerguidance.Model.Interests;
import com.example.carrerguidance.Service.InterestsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InterestsController {

    @Autowired
    private InterestsService interestsService;
    public InterestsController(InterestsService interestsService) {
        this.interestsService = interestsService;
    }
    @GetMapping("/api/interests")
    public List<Interests> getAllInterests(){
        return interestsService.getAllInterests();
    }
    @GetMapping("/api/interests/dm/{interestName}")
    public List<Domain> getDomainByInterests(@PathVariable String interestName){
        return interestsService.getDomainByInterests(interestName);
    }
    @GetMapping("/api/interests/{id}")
    public Interests getInterestsById(@PathVariable("id") long id){
        return interestsService.getInterestsById(id);
    }
    @PutMapping({"/api/interests/{id}"})
    public Interests updateInterests(@PathVariable("id") long id1,@RequestBody Interests interests){
        return interestsService.updateInterests(interests, id1);
    }
    @DeleteMapping("/api/interests/{id}")
    public void deleteInterests(@PathVariable("id") long id){
        interestsService.deleteInterests(id);
    }
    @PostMapping("/api/interests")
    public Interests saveInterests(@RequestBody Interests interests){
        return interestsService.saveInterests(interests);
    }
}
