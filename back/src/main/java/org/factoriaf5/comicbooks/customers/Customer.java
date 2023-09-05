package org.factoriaf5.comicbooks.customers;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    /* @GeneratedValue(strategy = GenerationType.IDENTITY) */
    @Column(name = "email")
    private String email;

    @Column(name = "dni")
    private String dni;

    @Column(name = "nombre")
    private Date nombre;

    @Column(name = "apellido1")
    private String apellido1;

    @Column(name = "apellido2")
    private String apellido2;

    @Column(name = "calle")
    private String calle;

    @Column(name = "numero")
    private String numero;

    @Column(name = "portal")
    private String portal;

    @Column(name = "escalera")
    private String escalera;

    @Column(name = "piso")
    private String piso;

    @Column(name = "letra")
    private String letra;

    @Column(name = "codigo_postal")
    private String codigopostal;

    @Column(name = "municipio")
    private String municipio;

    @Column(name = "provincia")
    private String provincia;

    @Column(name = "password")
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getNombre() {
        return nombre;
    }

    public void setNombre(Date nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPortal() {
        return portal;
    }

    public void setPortal(String portal) {
        this.portal = portal;
    }

    public String getEscalera() {
        return escalera;
    }

    public void setEscalera(String escalera) {
        this.escalera = escalera;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getCodigopostal() {
        return codigopostal;
    }

    public void setCodigopostal(String codigopostal) {
        this.codigopostal = codigopostal;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
