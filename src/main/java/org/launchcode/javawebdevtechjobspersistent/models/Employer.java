package org.launchcode.javawebdevtechjobspersistent.models;


import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.lang.reflect.Constructor;

@Entity

public class Employer extends AbstractEntity {

    @NotBlank(message = "Location required")
    @Size(min = 3, max = 100)
    private String location;

   // Constructor
    public Employer (String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    //Hibernate
    public Employer (){

    }

}
