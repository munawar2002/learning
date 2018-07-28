package org.amunawar.controller;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by sheik on 7/29/2018.
 */
public class HobbyValidator implements ConstraintValidator<IsValidHobby,String> {

    String listOfValidHobbies;
    @Override
    public void initialize(IsValidHobby isValidHobby){
        this.listOfValidHobbies = isValidHobby.listOfValidHobbies();
    }

    @Override
    public boolean isValid(String hobby, ConstraintValidatorContext cx){
        if(hobby == null){
            return false;
        }

        if (hobby.matches(listOfValidHobbies)){
            return true;
        }else {
            return false;
        }
    }

}
