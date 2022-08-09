package com.example.carrerguidance.Service;

import com.example.carrerguidance.Model.Branch;
import com.example.carrerguidance.Model.Career;
import com.example.carrerguidance.Model.OnlineCourses;
import com.example.carrerguidance.Model.University;

import java.util.List;

public interface BranchService {
    Branch saveBranch(Branch branch);
    List<Branch> getAllBranch();
    Branch getBranchById(long id);
    Branch updateBranch(Branch branch, long id);
    void deleteBranch(long id);
    List<OnlineCourses> getOnlineCoursesByBranchName(String branchName);
    List<Career> getCareersByBranchName(String branchName);
    List<University> getUniversitiesByBranchName(String branchName);
}
