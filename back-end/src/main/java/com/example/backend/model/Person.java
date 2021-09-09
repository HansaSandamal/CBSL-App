package com.example.backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "person")
public class Person {
    @Id
    private String id;

    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private Number phoneNo;
    private String nic;
    private String gender;
    private String address;

    public Person(String id, String firstName, String lastName, Date dateOfBirth, Number phoneNo, String nic, String gender, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.phoneNo = phoneNo;
        this.nic = nic;
        this.gender = gender;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Number getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Number phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth + ",phoneNo="+phoneNo+",nic="+nic+",gender="+gender+",address="+address+"]";
    }
    public Person(){

    }

}
