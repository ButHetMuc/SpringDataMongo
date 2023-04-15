package com.example.ledinhbut.services;

import com.example.ledinhbut.entities.City;
import com.example.ledinhbut.entities.District;
import com.example.ledinhbut.repos.CityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CityService   {
    @Autowired
    CityRepo repo;

    public  CityService(){
    }
    public City save(City city){
        return repo.save(city);
    }
    public City findById(String id){
        return repo.findCityById(id);
    }
    public List<City> findAll(){
        return repo.findAll();
    }
    public List<District> findDistrict(String name){
        City c = repo.findCityByName(name);
        return c.getDistricts();
    }
    public City findCityByDistrict(String districtName){
        List<City> cities = repo.findAll();
        List<District> districts;
        for(City city: cities){
            districts = new ArrayList<>();
            districts = city.getDistricts();
            for(District d: districts){
                if(districtName.equals(d.getName())){
                    return city;
                }
            }
        }
        return  null;
    }
}
