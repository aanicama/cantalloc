package com.cantalloc.personal.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "personal")
public class Personal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPersonal;

    private int dni;
    private String nombrePersonal;
    private String apellidoPersonal;
    private String cargoPersonal;
    private String correo;

    public int getIdPersonal() { return idPersonal; }
    public void setIdPersonal(int idPersonal) { this.idPersonal = idPersonal; }
    public int getDni() { return dni; }
    public void setDni(int dni) { this.dni = dni; }
    public String getNombrePersonal() { return nombrePersonal; }
    public void setNombrePersonal(String nombrePersonal) { this.nombrePersonal = nombrePersonal; }
    public String getApellidoPersonal() { return apellidoPersonal; }
    public void setApellidoPersonal(String apellidoPersonal) { this.apellidoPersonal = apellidoPersonal; }
    public String getCargoPersonal() { return cargoPersonal; }
    public void setCargoPersonal(String cargoPersonal) { this.cargoPersonal = cargoPersonal; }
    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }
}
