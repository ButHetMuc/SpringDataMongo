package com.example.ledinhbut;

import com.example.ledinhbut.entities.City;
import com.example.ledinhbut.entities.District;
import com.example.ledinhbut.services.CityService;
import com.example.ledinhbut.services.DistrictService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class LeDinhButApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeDinhButApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CityService cityService, DistrictService districtService){
        return args -> {
//            District d1 = new District("d1","1000","quan 1");
//            District d2 = new District("d2","1000","quan 2");
//            List<District> list = new ArrayList<>();
//            list.add(d1);
//            list.add(d2);
//            districtService.save(d1);
//            districtService.save(d2);
//            City c1 = new City("c1","abc",list,"dsd");
//            cityService.save(c1);

            cityService.findAll().forEach(city -> {
                System.out.println(city.getName());
            });
            City c1 = cityService.findById("c1");
            System.out.println(c1.getName());
            cityService.findDistrict("abc").forEach(district -> {
                System.out.println(district.getName());
            });
            City c2 = cityService.findCityByDistrict("quan 1");
            System.out.println(c2.getName());
        };
    }

}
