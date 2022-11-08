package com.simpleSpringSecurity.service;

import com.simpleSpringSecurity.model.Student;
import com.simpleSpringSecurity.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Function;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student addData(Student student){
        return studentRepository.save(student);
    }

    public Student updateData(Long rollNo, Student student){
        return studentRepository.save(student);
    }

    public List<Student> viewAll(){
        return studentRepository.findAll();
    }

    public void deleteData(Long rollNo){
        studentRepository.deleteById(rollNo);
    }
}
