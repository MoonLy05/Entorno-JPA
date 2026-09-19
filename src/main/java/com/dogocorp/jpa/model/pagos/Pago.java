package com.dogocorp.jpa.model.pagos;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "pagos")
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "monto", nullable = false)
    private BigDecimal monto;

    @Column(name = "fecha_pago", nullable = false)
    private LocalDateTime fechaPago;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "detalle_id", nullable = false)
    private DetallePago detallePago;

    public Pago(){}

    public Pago(BigDecimal monto, LocalDateTime fechaPago, DetallePago detallePago) {
        this.monto = monto;
        this.fechaPago = fechaPago;
        this.detallePago = detallePago;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public LocalDateTime getFechaPago() {
        return fechaPago;
    }

    public DetallePago getDetallePago() {
        return detallePago;
    }

    public Long getId() {
        return id;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public void setFechaPago(LocalDateTime fechaPago) {
        this.fechaPago = fechaPago;
    }

    public void setDetallePago(DetallePago detallePago) {
        this.detallePago = detallePago;
    }
}