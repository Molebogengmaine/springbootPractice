package com.example.assessment.config;

import com.example.assessment.model.AddressDetails;
import com.example.assessment.repository.AddressDetailsrepository;
import com.example.assessment.repository.AddressRepository;
import com.example.assessment.model.Address;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AddressConfig {
    @Bean    //to have access to our repository
    CommandLineRunner  commandLineRunner(AddressRepository repository, AddressDetailsrepository detailsrepository ){
        return  args-> {

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
            AddressDetails addressDetails = new AddressDetails(
                    "code56",
                    "Maboneng",
                    "Zone1",
                    "Zone2",
                    address
            );

            addressFourways.setAddressLineDetails(String.valueOf(addressDetails));
            addressDetails.setAddress(addressFourways);

            repository.saveAll(List.of(addressLonehill,address,addressFourways));
         //   detailsrepository.saveAll(addressDetails);

        };
    }
}
