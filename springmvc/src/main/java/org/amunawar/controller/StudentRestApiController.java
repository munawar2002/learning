package org.amunawar.controller;

import org.amunawar.model.Student;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sheik on 8/4/2018.
 */
@RestController
public class StudentRestApiController {

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public List<Student> getStudentList(){

        Student student1 = new Student();
        student1.setName("Munawar");
        student1.setHobby("Footabll");

        Student student2 = new Student();
        student2.setName("Adnan");
        student2.setHobby("Cricket");

        Student student3 = new Student();
        student3.setName("Zaman");
        student3.setHobby("Baseball");

        List<Student> students = new ArrayList();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        return students;
    }

    @RequestMapping(value = "/students/{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
    public Student getStudent(@PathVariable("name") String name ){

        Student student = new Student();
        student.setName(name);
        student.setHobby("Gootbal");
        return student;
    }

    /**
     * Response from Postman
     *
     *{
     "student_name": "Updated Munawar",
     "hobby": "Changed Hobby"
     }
     * With PUT request selected.
     * And set header "content-type" = "application/json"
     */
    @RequestMapping(value = "/students/{name}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Boolean> updateStudent(@PathVariable("name") String studentName,
                                        @RequestBody Student student){
        System.out.println("---Student Name "+studentName);
        System.out.println("--To set Name :"+student.getName()+" -- Hobby :"+student.getHobby());
        // find the student where name = studentName
        // update the record with student object.
        // return true if updated successfully else false.
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Key1","Value1");
        httpHeaders.add("Key2","Value2");

        return new ResponseEntity<Boolean>(false,httpHeaders,HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = "/students", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Boolean> addStudent(@RequestBody Student student){
        System.out.println("Adding new resource (student) with name :"+student.getName()+ " and hobby :"+student.getHobby());
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Location", ServletUriComponentsBuilder.fromCurrentRequest()
                                                .path("/{name}")
                                                .buildAndExpand(student.getName()).toUri()
                                                .toString());
        return new ResponseEntity<Boolean>(true,httpHeaders,HttpStatus.CREATED);
    }

    @RequestMapping(value = "/students/{name}",method = RequestMethod.DELETE)
    public ResponseEntity<Boolean> deleteStudent(@PathVariable("name")String name){
        System.out.println("Deleting this student with name : "+name);
        return new ResponseEntity<Boolean>(true,HttpStatus.OK);
    }

}
