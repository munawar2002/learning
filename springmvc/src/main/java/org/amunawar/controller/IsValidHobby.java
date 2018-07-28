package org.amunawar.controller;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Created by sheik on 7/29/2018.
 */
@Documented
@Constraint(validatedBy = HobbyValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface IsValidHobby {

    String message() default "Please provide a valid hobby; "+
            " accepted hobbies are - Music, Cricket, Football, and Hockey";

    String listOfValidHobbies() default "Music|Cricket|Football|Hockey";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
