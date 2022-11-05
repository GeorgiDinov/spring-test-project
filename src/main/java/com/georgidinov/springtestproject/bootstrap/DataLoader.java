package com.georgidinov.springtestproject.bootstrap;

import com.georgidinov.springtestproject.domain.Student;
import com.georgidinov.springtestproject.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DataLoader implements CommandLineRunner {


    private final StudentRepository studentRepository;

    @Autowired
    public DataLoader(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        load();
    }

    private void load() {
        Student student = new Student();
        student.setFirstName("Georgi");
        student.setLastName("Petrov");
        log.info("Saving {}", student);
        studentRepository.save(student);
    }
}
