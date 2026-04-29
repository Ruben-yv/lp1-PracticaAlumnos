package com.example.demo1.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo1.model.Alumno;
public interface AlumnoRepository  extends JpaRepository<Alumno, Long>{
}
