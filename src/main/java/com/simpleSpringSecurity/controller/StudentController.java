package com.simpleSpringSecurity.controller;

import com.simpleSpringSecurity.model.Student;
import com.simpleSpringSecurity.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student){
        return service.addData(student);
    }

    @GetMapping("/view")
    public List<Student> viewStudent(){
        return service.viewAll();
    }

    @PutMapping("/update/{rollno}")
    public Student updateStudent(@PathVariable("rollno") Long rollno, @RequestBody Student student){
        return service.updateData(rollno, student);
    }

    @DeleteMapping("/delete/{rollno}")
    public void deleteStudent(@PathVariable("rollno") Long rollno){
        service.deleteData(rollno);
    }
}
