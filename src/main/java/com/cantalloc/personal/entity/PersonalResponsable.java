package com.cantalloc.personal.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "personal_responsable")
public class PersonalResponsable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPersonalResponsable;

    private int dni;
    private String nombrePersonal;
    private String cargoPersonal;
    private String correo;

    public int getIdPersonalResponsable() { return idPersonalResponsable; }
    public void setIdPersonalResponsable(int idPersonalResponsable) { this.idPersonalResponsable = idPersonalResponsable; }
    public int getDni() { return dni; }
    public void setDni(int dni) { this.dni = dni; }
    public String getNombrePersonal() { return nombrePersonal; }
    public void setNombrePersonal(String nombrePersonal) { this.nombrePersonal = nombrePersonal; }
    public String getCargoPersonal() { return cargoPersonal; }
    public void setCargoPersonal(String cargoPersonal) { this.cargoPersonal = cargoPersonal; }
    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }
}
