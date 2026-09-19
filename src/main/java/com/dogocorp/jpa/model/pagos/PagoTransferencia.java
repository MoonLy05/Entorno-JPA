package com.dogocorp.jpa.model.pagos;

import jakarta.persistence.*;

@Entity
@Table(name = "pago_transferencia")
public class PagoTransferencia extends DetallePago {

    @Column(name = "referencia", nullable = false)
    private String referencia;

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
}