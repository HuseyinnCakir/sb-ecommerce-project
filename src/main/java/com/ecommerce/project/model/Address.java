package com.ecommerce.project.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name = "addresses")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;
    @NotBlank
    @Size(min = 5, message = "Building name must be 5 at least characters")
    private String buildingName;
    @NotBlank
    @Size(min = 3, message = "City name must be 3 at least characters")
    private String city;
    @Size(min = 3, message = "Country name must be 3 at least characters")
    private String country;
    @Size(min = 6, message = "Pincode name must be 6 at least characters")
    private String pinCode;
    @Size(min = 3, message = "State name must be 6 at least characters")
    private String state;
    @Size(min = 3, message = "Street name must be 6 at least characters")
    private String street;
    @ToString.Exclude
    @ManyToMany(mappedBy = "addresses")
    private List<User> user;

    public Address(String buildingName, String city, String country, String pinCode, String state, String street) {
        this.buildingName = buildingName;
        this.city = city;
        this.country = country;
        this.pinCode = pinCode;
        this.state = state;
        this.street = street;
    }
}
