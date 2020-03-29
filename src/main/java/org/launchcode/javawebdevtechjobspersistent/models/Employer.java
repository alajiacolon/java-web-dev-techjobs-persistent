package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {
    String location;
    // this list will represent the list of all items in a given job.
    @OneToMany
    @JoinColumn
    private List<Job> jobs = new ArrayList<>();

    public void Employer (){

    }
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
