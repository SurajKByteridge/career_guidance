package com.example.carrerguidance.Controller;

import com.example.carrerguidance.Model.Branch;
import com.example.carrerguidance.Service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BranchController {
    @Autowired
    private BranchService branchService;
    public BranchController(BranchService branchService) {
        this.branchService = branchService;
    }
    @GetMapping("/branch/")
    public List<Branch> getAllStreams(){
        return branchService.getAllBranch();
    }
    @GetMapping("/branch{id}")
    public Branch getBranchById(@PathVariable long id){
        return branchService.getBranchById(id);
    }
    @PutMapping("/branch{id}")
    public Branch updateBranch(@PathVariable long id, Branch stream){
        return branchService.updateBranch(stream, id);
    }
    @DeleteMapping("/branch{id}")
    public void deleteBranch(@PathVariable long id){
        branchService.deleteBranch(id);
    }
    @PostMapping("/branch/")
    public Branch saveBranch(Branch stream){
        return branchService.saveBranch(stream);
    }

}
