/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SIFAPIEntidades;

/**
 *
 * @author Estudiante
 */
public class TipoProduct {
    private String tiooP;
    private String descripcion;

    public TipoProduct(String tiooP, String descripcion) {
        this.tiooP = tiooP;
        this.descripcion = descripcion;
    }

    public String getTiooP() {
        return tiooP;
    }

    public void setTiooP(String tiooP) {
        this.tiooP = tiooP;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String toStringArchivo(){
        return this.tiooP +";"+
                this.descripcion;   
    }
}
