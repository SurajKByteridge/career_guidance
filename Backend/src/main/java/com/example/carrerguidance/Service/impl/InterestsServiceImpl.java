package com.example.carrerguidance.Service.impl;

import com.example.carrerguidance.Model.Career;
import com.example.carrerguidance.Model.Domain;
import com.example.carrerguidance.Model.Interests;
import com.example.carrerguidance.Repository.InterestsRepo;
import com.example.carrerguidance.Service.InterestsService;
import com.example.carrerguidance.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterestsServiceImpl implements InterestsService {
    @Autowired
    private InterestsRepo interestsRepo;

    public InterestsServiceImpl(InterestsRepo interestsRepo) {
        this.interestsRepo = interestsRepo;
    }
    @Override
    public Interests saveInterests(Interests interests) {
        return interestsRepo.save(interests);
    }

    @Override
    public List<Interests> getAllInterests() {
        return interestsRepo.findAll();
    }

    @Override
    public Interests getInterestsById(long id) {
        return interestsRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Interests", "Id", id));
    }

    @Override
    public Interests updateInterests(Interests interests, long id) {
        return interestsRepo.findById(id).map(interests1 -> {
            interests1.setId(id);
            interests1.setName(interests.getName());
            return interestsRepo.save(interests1);
        }).orElseGet(() -> {
            interests.setId(id);
            return interestsRepo.save(interests);
        });
    }

    @Override
    public void deleteInterests(long id) {
        interestsRepo.deleteById(id);
    }


    @Override
    public List<Domain> getDomainByInterests(String interestName) {
        //get interests by name
        Interests i=interestsRepo.findByInterestName(interestName);
        if(i==null){
            return null;
        }
        //get domains by interests
        return i.getDomains();
    }

}
