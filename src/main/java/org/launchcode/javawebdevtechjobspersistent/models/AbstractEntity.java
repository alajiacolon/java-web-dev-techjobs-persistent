package org.launchcode.javawebdevtechjobspersistent.models;


import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;

//holds the fields and methods that are common across the Job class and the classes it contains as fields
@MappedSuperclass
public abstract class AbstractEntity {

    @Id
    @GeneratedValue
    private int id;

    @NotBlank
    @Size(min = 3, max = 250, message = "Name must be between 3 and 250 characters. Please try again")
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractEntity that = (AbstractEntity) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}