package com.example.carrerguidance.Service;

import com.example.carrerguidance.Model.Career;
import com.example.carrerguidance.Model.Domain;
import com.example.carrerguidance.Model.Interests;

import java.util.List;

public interface InterestsService {
    Interests saveInterests(Interests interests);
    List<Interests> getAllInterests();
    Interests getInterestsById(long id);
    Interests updateInterests(Interests interests, long id);
    void deleteInterests(long id);
    List<Career> getCareersByInterests(String interests);
    List<Domain> getDomainByInterests(String interestName);
}
