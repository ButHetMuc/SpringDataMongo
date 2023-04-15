package com.example.ledinhbut.services;

import com.example.ledinhbut.entities.District;
import com.example.ledinhbut.repos.DistrictRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictService {
    @Autowired
    DistrictRepo repo;
    public DistrictService(){}
    public District save(District district){
        return repo.save(district);
    }
    public List<District> findAll(){
        return repo.findAll();
    }
}
