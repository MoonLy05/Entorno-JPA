package com.dogocorp.jpa.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "usuarios")
public class Usuario {

    //1. Llave primaria autoincrementable
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //2. Nombre de usuario, primer columna
    @Column(name = "username", nullable = false, unique = true)
    private String username;

    //3. Correo electrónico, segunda columna
    @Column(name = "email", nullable = false, unique = true)
    private String email;

    //4. Fecha de creación, tercera columna
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    //5. Fecha de actualización, cuarta columna
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    @PrePersist
        protected void antesDeGuardar() {
            this.createdAt = LocalDateTime.now();
            if (this.updatedAt == null) {
                this.updatedAt = LocalDateTime.now();
            }
        }

    public Usuario() {}

    public Usuario(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}