package com.goyarce.api.beans.mysql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class First {
    @Id
    public Integer id;

    @Column(name="name")
    public String name;

    public First(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return getId() + " - " + getName();
    }
}