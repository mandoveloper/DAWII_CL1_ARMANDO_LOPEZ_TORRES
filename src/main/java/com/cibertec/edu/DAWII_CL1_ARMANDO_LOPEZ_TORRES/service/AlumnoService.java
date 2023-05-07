package com.cibertec.edu.DAWII_CL1_ARMANDO_LOPEZ_TORRES.service;

import com.cibertec.edu.DAWII_CL1_ARMANDO_LOPEZ_TORRES.model.bd.Alumno;
import com.cibertec.edu.DAWII_CL1_ARMANDO_LOPEZ_TORRES.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoService {
    @Autowired
    private AlumnoRepository alumnoRepository;

    public List<Alumno> listarAlumnos() {
        return alumnoRepository.findAll();
    }

    public void registrarAlumno(Alumno alumno) {
        alumnoRepository.save(alumno);
    }

    public void eliminarAlumno(Integer idAlumno) {
        alumnoRepository.deleteById(idAlumno);
    }
}