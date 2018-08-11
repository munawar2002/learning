package org.amunawar.learning.courseapi;

import org.amunawar.learning.courseapi.Model.Topic;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sheik on 8/11/2018.
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hi(){
        return "HI";
    }


}
