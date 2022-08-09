package com.example.carrerguidance.Controller;

import com.example.carrerguidance.Model.Career;
import com.example.carrerguidance.Model.Interests;
import com.example.carrerguidance.Service.CareerService;
import com.example.carrerguidance.exception.ResourceNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/career/")
public class CareerController {
   private CareerService careerService;
   public CareerController(CareerService careerService) {
       this.careerService = careerService;
   }
    @GetMapping()
    public List<Career> getAllCareers(){
        return careerService.getAllCareer();
    }
    //get interest object by a career name
    @GetMapping("/cN/{careerName}")
    public String getInterestsByCareerName(@PathVariable String careerName){
       Interests interests=careerService.getInterestsByCareerName(careerName);
       if(interests==null){
           return "No interests found for career name: "+careerName;
        }
        return interests.getName();
    }

    @GetMapping("{id}")
    public Career getCareerById(@PathVariable("id") long id){
        return careerService.getCareerById(id);
    }
    @PutMapping({"{id}"})
    public Career updateCareer(@PathVariable("id") long id1,@RequestBody Career career){
        return careerService.updateCareer(career, id1);
    }
    @DeleteMapping("{id}")
    public void deleteCareer(@PathVariable("id") long id){
        careerService.deleteCareer(id);
    }
    @PostMapping()
    public Career saveCareer(@RequestBody Career career){
        return careerService.saveCareer(career);
    }

}
