package com.task.springboot.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Role {

    @Id
    private String name;

    @ManyToMany(mappedBy = "roles")
    private List<User> usres;


    public Role() {
    }

    public Role(String name, List<User> usres) {
        this.name = name;
        this.usres = usres;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsres() {
        return usres;
    }

    public void setUsres(List<User> usres) {
        this.usres = usres;
    }
}
