/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SIFAPIEntidades;

import SIFAPIUtilitarios.Formatos;

/**
 *
 * @author Usuario
 */
public class Restaurante {
    private static int numeroRestaurante = 0;
    private String cedulaJuridica;
    private String idAdministrador;
    private String nombreAdministrador;
    private String nombreRestaurante;
    private Provincia provincia;
    private Canton canton;
    private Distrito distrito;
    private String direccionExacta;
    private String telefono;
    private String estado;

    public Restaurante() {
        numeroRestaurante++;
    }

    public Restaurante(String cedulaJuridica, String idAdministrador, String nombreAdministrador, String nombreRestaurante, Provincia provincia, Canton canton, Distrito distrito, String direccionExacta, String telefono, String estado) {
        this.cedulaJuridica = cedulaJuridica;
        this.idAdministrador = idAdministrador;
        this.nombreAdministrador = nombreAdministrador;
        this.nombreRestaurante = nombreRestaurante;
        this.provincia = provincia;
        this.canton = canton;
        this.distrito = distrito;
        this.direccionExacta = direccionExacta;
        this.telefono = telefono;
        this.estado = estado;
        numeroRestaurante++;
    }

    public static int getNumeroRestaurante() {
        return numeroRestaurante;
    }

    public static void setNumeroRestaurante(int numeroRestaurante) {
        Restaurante.numeroRestaurante = numeroRestaurante;
    }

    public String getCedulaJuridica() {
        return cedulaJuridica;
    }

    public void setCedulaJuridica(String cedulaJuridica) {
        this.cedulaJuridica = cedulaJuridica;
    }

    public String getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(String idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public String getNombreAdministrador() {
        return nombreAdministrador;
    }

    public void setNombreAdministrador(String nombreAdministrador) {
        this.nombreAdministrador = nombreAdministrador;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public Canton getCanton() {
        return canton;
    }

    public void setCanton(Canton canton) {
        this.canton = canton;
    }

    public Distrito getDistrito() {
        return distrito;
    }

    public void setDistrito(Distrito distrito) {
        this.distrito = distrito;
    }

    public String getDireccionExacta() {
        return direccionExacta;
    }

    public void setDireccionExacta(String direccionExacta) {
        this.direccionExacta = direccionExacta;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String toStringArchivo(){
        return Formatos.conFormatoEntero(numeroRestaurante) + ";" +
                this.cedulaJuridica + ";" +
                this.idAdministrador + ";" +
                this.nombreAdministrador + ";"+
                this.nombreRestaurante + ";" +
                this.provincia.getIdentificador() + ";" +
                this.canton.getIdentificador() + ";" +
                this.distrito.getIdentificador() + ";" +
                this.direccionExacta +";" +
                this.telefono + ";" +
                this.estado;
    }
}
