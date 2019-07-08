package com.goyarce.api.beans.mongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection="players")
public class Player {

    @Id
    public String id;

    public String Team;
    public String Guardian;
    public String FirstName;
    public String LastName;
    public Date Birthdate;

    public Player(){}

    public Player(String Team, String Guardian, String FirstName, String LastName, Date Birthdate){
        this.Team = Team;
        this.Guardian = Guardian;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Birthdate= Birthdate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTeam() {
        return Team;
    }

    public void setTeam(String team) {
        Team = team;
    }

    public String getGuardian() {
        return Guardian;
    }

    public void setGuardian(String guardian) {
        Guardian = guardian;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Date getBirthdate() {
        return Birthdate;
    }

    public void setBirthdate(Date birthdate) {
        Birthdate = birthdate;
    }

    @Override
    public String toString(){
        return "Player: {" + getFirstName() + ", " + getLastName() + "}";
    }
}