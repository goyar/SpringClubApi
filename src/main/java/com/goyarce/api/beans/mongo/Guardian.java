package com.goyarce.api.beans.mongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "guardians")
public class Guardian {

    @Id
    public String id;

    @Field("FirstName")
    public String firstName;
    @Field("LastName")
    public String lastName;
    @Field("AddressStreet")
    public String addressStreet;
    @Field("AddressState")
    public String addressState;
    @Field("AddressCity")
    public String addressCity;
    @Field("AddressZip")
    public String addressZip;
    @Field("PhoneNumber")
    public String phoneNumber;
    @Field("Email")
    public String email;

    public Guardian(){};

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    public String getAddressState() {
        return addressState;
    }

    public void setAddressState(String addressState) {
        this.addressState = addressState;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressZip() {
        return addressZip;
    }

    public void setAddressZip(String addressZip) {
        this.addressZip = addressZip;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return "Guardian: {" + getFirstName() + ", " + getLastName() + "}";
    }
}
