/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SIFAPIEntidades;

/**
 *
 * @author Estudiante
 */
public class Salonero {
    private int numeroRestaurante;
    private String identificacion;
    private String nombreCompleto;
    private Provincia provincia;
    private Canton canton;
    private Distrito distrito;
    private String direccionExacta;
    private String telefono;

    public Salonero() {
    }

    public Salonero(int numeroRestaurante, String identificacion, String nombreCompleto, Provincia provincia, Canton canton, Distrito distrito, String direccionExacta, String telefono) {
        this.numeroRestaurante = numeroRestaurante;
        this.identificacion = identificacion;
        this.nombreCompleto = nombreCompleto;
        this.provincia = provincia;
        this.canton = canton;
        this.distrito = distrito;
        this.direccionExacta = direccionExacta;
        this.telefono = telefono;
    }

    public int getNumeroRestaurante() {
        return numeroRestaurante;
    }

    public void setNumeroRestaurante(int numeroRestaurante) {
        this.numeroRestaurante = numeroRestaurante;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
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
    
    public String toStringArchivo(){
        return this.numeroRestaurante +";" +
                this.identificacion +";" +
                this.nombreCompleto + ";" +
                this.provincia.getIdentificador() + ";" +
                this.canton.getIdentificador() + ";" +
                this.distrito.getIdentificador() + ";" +
                this.direccionExacta +";" +
                this.telefono;
    }
    
}
