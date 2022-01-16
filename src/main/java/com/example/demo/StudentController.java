package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/student")
    public Student getStudent(){
     return  new Student("Feliks","Bekeshov");
         }

         @GetMapping("/students")
         public List<Student> studentList(){
        List<Student> students = new ArrayList<>();
                     students.add(new Student("Nurlan","Kzakabaev"));
                     students.add(new Student("Yeha","Kzakabaev"));
                     students.add(new Student("Murat","Kzakabaev"));
                     students.add(new Student("Shavkat","Kzakabaev"));
                     students.add(new Student("Naruh","Kzakabaev"));

             return students;
         }

}
