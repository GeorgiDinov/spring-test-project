package com.georgidinov.springtestproject.repository;

import com.georgidinov.springtestproject.domain.Student;
import org.springframework.data.repository.CrudRepository;


public interface StudentRepository extends CrudRepository<Student, Long> {


}
