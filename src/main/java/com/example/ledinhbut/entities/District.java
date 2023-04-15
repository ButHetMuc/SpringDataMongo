package com.example.ledinhbut.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document(collection = "districts")
public class District {
    @Id
    private String id;
    private String population;
    private String name;

    public District() {
    }

    public District(String id, String population, String name) {
        this.id = id;
        this.population = population;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        District district = (District) o;
        return Objects.equals(id, district.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "District{" +
                "id='" + id + '\'' +
                ", population='" + population + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
