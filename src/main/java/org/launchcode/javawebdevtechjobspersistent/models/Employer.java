package org.launchcode.javawebdevtechjobspersistent.models;


import javax.persistence.*;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

@Entity

public class Employer extends AbstractEntity {

    @NotBlank(message = "Location required")
    @Size(min = 3, max = 100)
    private String location;

   // Constructor
    @OneToMany
    @JoinColumn(name="employer_id")
    private List<Job> jobs = new ArrayList<>();

    public Employer () {
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    //Hibernate


    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}
