package com.dogocorp.jpa.model.pagos;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "corte_caja")
public class CorteCaja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_corte")
    private TipoCorteEnum tipoCorte;

    @Column(name = "fecha_corte")
    private LocalDateTime fechaCorte;

    @OneToMany(mappedBy = "corteCaja")
    private List<Pago> pagos = new ArrayList<>();

    public CorteCaja() {
    }

    public long getId() {
        return id;
    }
    
    public CorteCaja(TipoCorteEnum tipoCorte, LocalDateTime fechaCorte) {
        this.tipoCorte = tipoCorte;
        this.fechaCorte = fechaCorte;
    }
    // Getters and Setters

    public TipoCorteEnum getTipoCorte() {
        return tipoCorte;
    }

    public void setTipoCorte(TipoCorteEnum tipoCorte) {
        this.tipoCorte = tipoCorte;
    }

    public LocalDateTime getFechaCorte() {
        return fechaCorte;
    }

    public void setFechaCorte(LocalDateTime fechaCorte) {
        this.fechaCorte = fechaCorte;
    }

    public List<Pago> getPagos() {
        return pagos;
    }

    public void setPagos(List<Pago> pagos) {
        this.pagos = pagos;
    }
}