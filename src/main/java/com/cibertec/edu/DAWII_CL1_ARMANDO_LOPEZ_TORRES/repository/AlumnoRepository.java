package com.cibertec.edu.DAWII_CL1_ARMANDO_LOPEZ_TORRES.repository;

import com.cibertec.edu.DAWII_CL1_ARMANDO_LOPEZ_TORRES.model.bd.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Integer> {
}
