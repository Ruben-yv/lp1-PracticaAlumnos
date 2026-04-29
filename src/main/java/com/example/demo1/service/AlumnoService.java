package com.example.demo1.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo1.model.Alumno;
import com.example.demo1.repository.AlumnoRepository;

import java.util.List;

@Service
public class AlumnoService {
    @Autowired
    private AlumnoRepository repository;
    public List<Alumno> listar(){
        return repository.findAll();
    }
}
