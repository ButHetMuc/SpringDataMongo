package com.example.ledinhbut.repos;

import com.example.ledinhbut.entities.City;
import com.example.ledinhbut.entities.District;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface DistrictRepo extends MongoRepository<District,String> {
    public District findDistrictById(String id);
}
