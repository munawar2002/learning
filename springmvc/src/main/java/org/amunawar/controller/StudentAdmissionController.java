package org.amunawar.controller;

import org.amunawar.model.Student;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class StudentAdmissionController {

    @RequestMapping(value = "/admissionForm", method = RequestMethod.GET)
    public ModelAndView getAdmissionForm(){
        ModelAndView modelAndView = new ModelAndView("AdmissionForm");
        return modelAndView;
    }

    @ModelAttribute
    public void addCommonObjects(Model model){
        model.addAttribute("headerMessage","Munawar's Training Program.");
    }

    @InitBinder
    public void initBinder(WebDataBinder binder){
        //binder.setDisallowedFields(new String[]{"mobile"});
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy****MM****dd");
        binder.registerCustomEditor(Date.class,"dob",new CustomDateEditor(dateFormat,false));
        binder.registerCustomEditor(String.class,"name",new StudentNameEditor());
    }

    @RequestMapping(value = "/submitAdmissionForm", method = RequestMethod.POST)
    public ModelAndView submitAdmissionForm(@Valid @ModelAttribute("student") Student student,
                                            BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            ModelAndView model = new ModelAndView("AdmissionForm");
            return model;
        }

        ModelAndView modelAndView = new ModelAndView("AdmissionSuccess");
        return modelAndView;
    }
}
