package com.cibertec.edu.DAWII_CL1_ARMANDO_LOPEZ_TORRES.service;

import com.cibertec.edu.DAWII_CL1_ARMANDO_LOPEZ_TORRES.model.bd.Especialidad;
import com.cibertec.edu.DAWII_CL1_ARMANDO_LOPEZ_TORRES.repository.EspecialidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EspecialidadService {
    @Autowired
    private EspecialidadRepository especialidadRepository;

    public List<Especialidad> listarEspecialidad() {
        return especialidadRepository.findAll();
    }
}