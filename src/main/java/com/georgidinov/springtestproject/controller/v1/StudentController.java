package com.georgidinov.springtestproject.controller.v1;

import com.georgidinov.springtestproject.domain.Student;
import com.georgidinov.springtestproject.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/v1")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        log.info("StudentController::getAllStudents called");
        return studentService.findAllStudents();



    }


}
