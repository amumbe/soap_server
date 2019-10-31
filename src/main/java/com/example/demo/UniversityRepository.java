package com.example.demo;

import localhost.universities.University;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;



@Component
public class UniversityRepository {

    private static Map<String, University> universities = new HashMap<>();
    @PostConstruct
    public void populateUniversities(){
        University university = new University();
        university.setName("Strathmore");
        university.setYearFounded(2019);
        university.setLocation("Madaraka");

        University university1 = new University();
        university1.setName("KU");
        university1.setYearFounded(2019);
        university1.setLocation("Thika");

        University university2 = new University();
        university2.setName("JKUAT");
        university2.setYearFounded(2019);
        university2.setLocation("juja");

        universities.put(university.getName(), university);
        universities.put(university1.getName(),university1);
        universities.put(university2.getName(), university2);
    }

    public University getUniversity(String name){
        return universities.get(name);
    }
}
