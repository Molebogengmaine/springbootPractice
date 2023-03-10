package com.example.assessment.controller;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AddressConfig {
    @Bean    //to have access to our repository
    CommandLineRunner  commandLineRunner(AddressRepository repository){
        return  args-> {
      //      ArrayList<ProvinceDetails> provinceOrState = new ArrayList<ProvinceDetails>();
            Address address = new Address(
                    "59",
                    " Sunset Blvd",
                    "Lonehill",
                    "Sandton Fourways",
                    "South Africa",
                    "45 type"
            );
            Address addressLonehill = new Address(
                    "59",
                    " Sunset Blvd",
                    "Lonehill",
                    "Sandton Fourways",
                    "South Africa",
                    "45 type"
            );
            Address addressFourways = new Address(
                    "59 Lonehill",
                    " Sandton",
                    "Gauteng",
                    "2191",
                    "South Africa",
                    "45 type"
            );

            repository.saveAll(List.of(addressLonehill,address,addressFourways));

        };
    }
}
