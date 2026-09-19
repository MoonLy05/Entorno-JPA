package com.dogocorp.jpa.model.citas;

import jakarta.persistence.*;

@Entity
@Table(name = "citas")
public class Cita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_paciente", nullable = false)
    private String nombrePaciente;

    @Column(name = "monto", nullable = false)
    private Double monto;
    
    public Cita() {}

    public Cita(String nombrePaciente, Double monto) {
        this.nombrePaciente = nombrePaciente;
        this.monto = monto;
    }

    public Long getId() {
        return id;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public Double getMonto() {
        return monto;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }
}