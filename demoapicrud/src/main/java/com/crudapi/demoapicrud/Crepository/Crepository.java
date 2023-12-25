package com.crudapi.demoapicrud.Crepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crudapi.demoapicrud.Cmodel.Cmodel;

@Repository
public interface Crepository extends JpaRepository<Cmodel,Long>{
    
}
