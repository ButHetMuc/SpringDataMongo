package com.example.ledinhbut.repos;

import com.example.ledinhbut.entities.City;
import com.example.ledinhbut.entities.District;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface CityRepo extends MongoRepository<City,String> {
    public City findCityById(String id);
    public City deleteCitiesById(String id);
    public City findCityByName(String name);
}
