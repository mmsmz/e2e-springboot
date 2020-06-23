package com.arafath.student.dal.repos;

import com.arafath.student.dal.entities.Student;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface StudentRepository extends CrudRepository<Student, Long> {
                                                    // <needs two generic types>
}
