package com.cibertec.edu.DAWII_CL1_ARMANDO_LOPEZ_TORRES.controller;

import com.cibertec.edu.DAWII_CL1_ARMANDO_LOPEZ_TORRES.model.bd.Especialidad;
import com.cibertec.edu.DAWII_CL1_ARMANDO_LOPEZ_TORRES.service.EspecialidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/Especialidad")
public class EspecialidadController {
    @Autowired
    private EspecialidadService especialidadService;

    @GetMapping("/listarEspecialidad")
    @ResponseBody
    public List<Especialidad> listarEspecialidad() { return especialidadService.listarEspecialidad();}
}
