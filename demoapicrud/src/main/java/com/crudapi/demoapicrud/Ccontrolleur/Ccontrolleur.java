package com.crudapi.demoapicrud.Ccontrolleur;




import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crudapi.demoapicrud.Cmodel.Cmodel;
import com.crudapi.demoapicrud.Cservice.Cservice;



import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/api")


public class Ccontrolleur {
    @Autowired
    private Cservice cservice ;

   
    @PostMapping(path = "/contact")
    @CrossOrigin(origins  = "http://localhost:4200")
   public Cmodel postdetailsContact(@RequestBody Cmodel cmodel ){
    
    
    return cservice.savedetailsContact(cmodel);
   }
}
