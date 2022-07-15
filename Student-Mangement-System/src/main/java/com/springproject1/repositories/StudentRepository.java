package com.springproject1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject1.entity.Student;
//nie trzeba dodawac anotacji repository - w jpa repository znajduje sie juz klasa jpasimplerepository

public interface StudentRepository extends JpaRepository<Student, Long>{

}
