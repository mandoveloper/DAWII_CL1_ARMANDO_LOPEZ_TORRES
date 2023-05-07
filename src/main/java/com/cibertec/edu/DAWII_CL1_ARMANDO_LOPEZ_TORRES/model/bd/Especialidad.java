package com.cibertec.edu.DAWII_CL1_ARMANDO_LOPEZ_TORRES.model.bd;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "especialidad")
public class Especialidad {

    @Id
    private Integer idesp;

    @Column(name = "nomesp")
    private String nomesp;

    @Column(name = "costo")
    private Number costo;

    @JsonManagedReference
    @OneToMany(mappedBy = "idesp",
            cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Especialidad> listaespecialidad = new ArrayList<>();
}
