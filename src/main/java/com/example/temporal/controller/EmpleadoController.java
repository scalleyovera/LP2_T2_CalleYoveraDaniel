package com.example.temporal.controller;

import com.example.temporal.entity.EmpleadoEntity;
import com.example.temporal.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.*;

@Controller
public class EmpleadoController {
    @Autowired
    private EmpleadoRepository er;

    @GetMapping("/")
    public String home(Model model){
        List<EmpleadoEntity> listaEmpleados = er.findAll();
        model.addAttribute("list", listaEmpleados);
        return "home";
    }


}