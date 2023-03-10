package com.example.assessment.service;

import com.example.assessment.repository.AddressRepository;
import com.example.assessment.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    private final AddressRepository addressRepository;
    @Autowired
    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }
    public List<Address> getAddress(){
        return addressRepository.findAll();//returns a list instead of implementing a static list
    }


}
