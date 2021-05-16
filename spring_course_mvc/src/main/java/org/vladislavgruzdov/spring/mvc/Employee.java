package org.vladislavgruzdov.spring.mvc;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class Employee {
    private String name;
    private String surname;
    private Integer salary;
    private String department;
    @ToString.Exclude
    private Map<String, String> departments;
    @ToString.Exclude
    private String carBrand;
    @ToString.Exclude
    private Map<String, String> carBrands;
    @ToString.Exclude
    private String[] languages;
    @ToString.Exclude
    private Map<String, String> languageMap;

    {
        departments = new HashMap<>();
        departments.put("Information Technology", "IT");
        departments.put("Human Resources", "HR");
        departments.put("Sales","Sales");

        carBrands = new HashMap<>();
        carBrands.put("Lada", "LADA");
        carBrands.put("Audi", "AUDI");
        carBrands.put("BMW", "BMW");

        languageMap = new HashMap<>();
        languageMap.put("English", "EN");
        languageMap.put("Deutch", "DE");
        languageMap.put("French", "FR");
    }
}
