package org.Assignment2;
import org.springframework.stereotype.Component;

@Component

public class Address {
    private String city;
    private String state;
    private String country;
    private String zipcode;


    public Address() {
    }

    public Address(String city, String state, String country, String zipcode) {
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return  city + ", " + state + ", " + country + ", " + zipcode;
    }
}
