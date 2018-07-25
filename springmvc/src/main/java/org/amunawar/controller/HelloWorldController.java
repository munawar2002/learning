package main.java.org.amunawar.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by sheik on 7/25/2018.
 */
public class HelloWorldController  extends AbstractController{

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request,
                                                 HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView("HelloPage");
        modelAndView.addObject("welcomeMessage","Hi user, welcome to the project Spring MVC");
        return modelAndView;
    }


}
