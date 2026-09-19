package com.dogocorp.jpa.model.pagos;

import jakarta.persistence.*;

@Entity
@Table(name = "pago_tarjeta")
public class PagoTarjeta extends DetallePago{

    @Column(name = "ultimos_digitos", nullable = false)
    private String ultimosDigitos;

    public String getUltimosDigitos() {
        return ultimosDigitos;
    }

    public void setUltimosDigitos(String ultimosDigitos) {
        this.ultimosDigitos = ultimosDigitos;
    }
}