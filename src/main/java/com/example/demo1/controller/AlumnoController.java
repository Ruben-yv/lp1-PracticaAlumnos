package com.example.demo1.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo1.service.AlumnoService;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
@RequestMapping("/alumno")
public class AlumnoController {
    @Autowired
    private AlumnoService alumnoService;

    @GetMapping
    public String listar(Model model){
        model.addAttribute("lista", alumnoService.listar());
        return "alumnos";
    }
}
