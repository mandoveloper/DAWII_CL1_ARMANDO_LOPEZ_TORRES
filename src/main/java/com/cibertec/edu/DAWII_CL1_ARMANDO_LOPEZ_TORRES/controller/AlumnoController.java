package com.cibertec.edu.DAWII_CL1_ARMANDO_LOPEZ_TORRES.controller;

import com.cibertec.edu.DAWII_CL1_ARMANDO_LOPEZ_TORRES.model.bd.Alumno;
import com.cibertec.edu.DAWII_CL1_ARMANDO_LOPEZ_TORRES.model.bd.Especialidad;
import com.cibertec.edu.DAWII_CL1_ARMANDO_LOPEZ_TORRES.model.request.AlumnoRequest;
import com.cibertec.edu.DAWII_CL1_ARMANDO_LOPEZ_TORRES.model.response.ResultadoResponse;
import com.cibertec.edu.DAWII_CL1_ARMANDO_LOPEZ_TORRES.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/Alumno")
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;

    @GetMapping("/frmMantAlumnos")
    public String frmMantAlumnos(Model model){
//        model.addAttribute("listaAlumnos", alumnoService.listarAlumnos());
        return "Alumnos/frmMantAlumnos";
    }

    @PostMapping("/registrarAlumno")
    @ResponseBody
    public ResultadoResponse registrarAlumno(@RequestBody
                                             AlumnoRequest alumnoRequest){
        String mensaje = "Alumno registrado correctamente";
        Boolean respuesta = true;
        try{
            Alumno objAlumno = new Alumno();
            if(alumnoRequest.getIdalumno() > 0){
                objAlumno.setIdalumno(alumnoRequest.getIdalumno());
            }
            objAlumno.setApealumno(alumnoRequest.getApealumno());
            objAlumno.setNomalumno(alumnoRequest.getNomalumno());
            objAlumno.setProce(alumnoRequest.getProce());
            Especialidad objEspecialidad = new Especialidad();
            objEspecialidad.setIdesp(alumnoRequest.getIdesp());
            objAlumno.setEspecialidad(objEspecialidad);
            alumnoService.registrarAlumno(objAlumno);
        }catch (Exception ex){
            mensaje = "Alumno no registrado";
            respuesta = false;
        }
        return ResultadoResponse.builder()
                .mensaje(mensaje)
                .respuesta(respuesta).build();
    }

    @DeleteMapping("/eliminarAlumno")
    @ResponseBody
    public ResultadoResponse eliminarAlumno(@RequestBody
                                            AlumnoRequest alumnoRequest){
        String mensaje = "Alumno eliminado correctamente";
        Boolean respuesta = true;
        try{
            alumnoService.eliminarAlumno(alumnoRequest.getIdalumno());
        }catch (Exception ex){
            mensaje = "Alumno no eliminado";
            respuesta = false;
        }
        return ResultadoResponse.builder()
                .mensaje(mensaje).respuesta(respuesta).build();
    }

    @GetMapping("/listarAlumnos")
    @ResponseBody
    public List<Alumno> listarAlumnos(){
        return alumnoService.listarAlumnos();
    }
}
