package com.dogocorp.jpa;

import com.dogocorp.jpa.model.citas.Cita;
import com.dogocorp.jpa.model.pagos.Pago;
import com.dogocorp.jpa.model.pagos.PagoTarjeta;
import com.dogocorp.jpa.model.pagos.PagoEfectivo;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-practice-pu");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Cita c = new Cita("Juan Pérez", 500.0);
        em.persist(c);
        em.getTransaction().commit();
        
        em.getTransaction().begin();
        PagoTarjeta detalle = new PagoTarjeta();
        detalle.setUltimosDigitos("1234");

        Pago pago = new Pago(BigDecimal.valueOf(500.0), LocalDateTime.now(), detalle);
        em.persist(pago);
        em.getTransaction().commit();

        em.getTransaction().begin();
        PagoEfectivo detalleEfectivo = new PagoEfectivo();

        Pago pagoEfectivo = new Pago(BigDecimal.valueOf(300.0), LocalDateTime.now(), detalleEfectivo);
        em.persist(pagoEfectivo);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}