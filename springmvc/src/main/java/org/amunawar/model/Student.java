package org.amunawar.model;

import org.amunawar.controller.IsValidHobby;

import javax.validation.constraints.Max;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by sheik on 7/28/2018.
 */
public class Student {

    @Size(min = 5,max = 10)
    private String name;

    @Pattern(regexp = "[^0-9]*")
    @IsValidHobby(listOfValidHobbies = "Music|Cricket|Football|Hockey")
    private String hobby;

    @Max(200)
    private Long mobile;

    @Past
    private Date dob;
    private ArrayList<String> skills;
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public Long getMobile() {
        return mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public ArrayList<String> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }
}
