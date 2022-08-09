package com.example.carrerguidance.Service;

import com.example.carrerguidance.Model.Branch;

import java.util.List;

public interface BranchService {
    Branch saveBranch(Branch branch);
    List<Branch> getAllBranch();
    Branch getBranchById(long id);
    Branch updateBranch(Branch branch, long id);
    void deleteBranch(long id);
}
