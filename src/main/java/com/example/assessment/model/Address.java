package com.example.assessment.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Address {

    @Id
    @SequenceGenerator(

            name = "address_sequence",
            sequenceName = "address_sequence",
            allocationSize = 1
    )
    @GeneratedValue(

            strategy = GenerationType.SEQUENCE,
            generator = "address_sequence"
    )

    private long id;

    private String type;
    private String addressLineDetails;
    private String provinceOrState;
    private String cityOrTown;
    private String postalCode;
    private String country;
    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "address")

    private AddressDetails addressDetails;

    public Address() {
    }

    public Address(long id, String lineDetails, String city, String province, String postalCode, String country,String type) {
        this.id = id;
        addressLineDetails = lineDetails;
        this.provinceOrState = city;
        this.cityOrTown = province;
        this.postalCode = postalCode;
        this.country = country;
        this.type = type;
    }

    public Address(String lineDetails,String  city, String province, String postalCode, String country,String type) {
        addressLineDetails = lineDetails;
        this.provinceOrState = city;
        this.cityOrTown = province;
        this.postalCode = postalCode;
        this.country = country;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", LineDetails='" + addressLineDetails + '\'' +
                ", city='" + provinceOrState + '\'' +
                ", province='" + cityOrTown + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAddressLineDetails() {
        return addressLineDetails;
    }

    public void setAddressLineDetails(String addressLineDetails) {
        this.addressLineDetails = addressLineDetails;
    }

    public String  getCity() {
        return provinceOrState;
    }

    public void setCity(String  city ) {
        this.provinceOrState = city;
    }

    public String getCityOrTown() {
        return cityOrTown;
    }

    public void setCityOrTown(String cityOrTown) {
        this.cityOrTown = cityOrTown;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
