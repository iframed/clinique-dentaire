package com.crudapi.demoapicrud.Cservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudapi.demoapicrud.Cmodel.Cmodel;
import com.crudapi.demoapicrud.Crepository.Crepository;

@Service
public class Cservice {
    
    @Autowired
    private Crepository crepository;

    
    
    public Cmodel savedetailsContact(Cmodel cmodel) {
        System.out.println("hi");
       
        System.out.println("Attempting to save contact: " + cmodel.toString());
        Cmodel savedCmodel = crepository.save(cmodel);
        
        
        return savedCmodel;
       

       }
}
