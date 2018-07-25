package main.java.org.amunawar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by sheik on 7/25/2018.
 */
@Controller
@RequestMapping("/springmvc")
public class HelloWorldController{

    @RequestMapping("/welcome/{countryName}/{userName}")
    protected ModelAndView helloWorld(@PathVariable Map<String,String> pathVars) throws Exception {
        String name = pathVars.get("userName");
        String country = pathVars.get("countryName");

        ModelAndView modelAndView = new ModelAndView("HelloPage");
        modelAndView.addObject("welcomeMessage","Hi "+name+", welcome to "+country);
        return modelAndView;
    }
}
