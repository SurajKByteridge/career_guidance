package com.example.carrerguidance.Service.impl;

import com.example.carrerguidance.Model.Branch;
import com.example.carrerguidance.Repository.BranchRepo;
import com.example.carrerguidance.Service.BranchService;
import com.example.carrerguidance.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchServiceImpl implements BranchService {

    @Autowired
    private BranchRepo branchRepo;
    public BranchServiceImpl(BranchRepo branchRepo) {
        this.branchRepo = branchRepo;
    }

    @Override
    public Branch saveBranch(Branch branch) {
        return branchRepo.save(branch);
    }

    @Override
    public List<Branch> getAllBranch() {
        return branchRepo.findAll();
    }

    @Override
    public Branch getBranchById(long id) {
        return branchRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Branch", "id", id));
    }

    @Override
    public Branch updateBranch(Branch branch, long id) {
        return branchRepo.findById(id).map(branch1 -> {
            branch1.setId(id);
            branch1.setName(branch.getName());
            return branchRepo.save(branch1);
        }).orElseGet(() -> {
            branch.setId(id);
            return branchRepo.save(branch);
        });
    }

    @Override
    public void deleteBranch(long id) {
        branchRepo.deleteById(id);
    }
}





