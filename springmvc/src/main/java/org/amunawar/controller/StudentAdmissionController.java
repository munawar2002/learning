package org.amunawar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {

    @RequestMapping(value = "/admissionForm", method = RequestMethod.GET)
    public ModelAndView getAdmissionForm(){
        ModelAndView modelAndView = new ModelAndView("AdmissionForm");
        return modelAndView;
    }

    @RequestMapping(value = "/submitAdmissionForm", method = RequestMethod.POST)
    public ModelAndView submitAdmissionForm(@RequestParam(value = "studentName", defaultValue = "Munawar") String name,
                                            @RequestParam("studentHobby") String hobby){
        ModelAndView modelAndView = new ModelAndView("AdmissionSuccess");
        modelAndView.addObject("msg","Details Submitted are, Name: ["+name+"] and Hobby ["+hobby+"]");
        return modelAndView;
    }
}
