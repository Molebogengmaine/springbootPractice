package com.example.assessment.model;

import jakarta.persistence.*;
//import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table
public class AddressDetails implements Serializable {

    @Id
    @SequenceGenerator(

            name = "addressDetails_sequence",
            sequenceName = "addressDetails_sequence",
            allocationSize = 1
    )
    @GeneratedValue(

            strategy = GenerationType.SEQUENCE,
            generator = "addressDetails_sequence"
    )

    private  long id;
 //   @Size(max = 100)
    private  String code;
 //   @Size(max = 100)
    private String name;
 //   @Size(max = 100)
    private String line1;
 //   @Size(max = 100)
    private String line2;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id", nullable = false)
    private Address address;

    public AddressDetails() {
    }

    public AddressDetails(String code, String name, String line1, String line2, Address address) {
        this.code = code;
        this.name = name;
        this.line1 = line1;
        this.line2 = line2;
        this.address = address;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "AddressDetails{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", line1='" + line1 + '\'' +
                ", line2='" + line2 + '\'' +
                ", address=" + address +
                '}';
    }
}
