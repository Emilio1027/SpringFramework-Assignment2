package org.Assignment2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component

public class Employee {


    private int id=1234;
    private String name="Emilio";
    @Autowired
    private List<Phone> ph;
    @Autowired
    private Address address;


    public Employee() {
    }


    public Employee(int id, String name, List<Phone> ph, Address address) {
        this.id = id;
        this.name = name;
        this.ph = ph;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee" + " Id = " + id +
                ", Name= " + name  +
                ", Ph= " + ph +
                ", Address= " + address ;
    }
}
