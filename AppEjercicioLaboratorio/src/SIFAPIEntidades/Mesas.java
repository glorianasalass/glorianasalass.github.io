/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SIFAPIEntidades;

/**
 *
 * @author Estudiante
 */
public class Mesas {
    private int NumeroRestaurante;
    private static int numeroMesa = 0;
    private String descripcion;
    private int cantidadSillas;

    public Mesas(int NumeroRestaurante, String descripcion, int cantidadSillas) {
        this.NumeroRestaurante = NumeroRestaurante;
        this.descripcion = descripcion;
        this.cantidadSillas = cantidadSillas;
    }

    public Mesas() {
    }

    public int getNumeroRestaurante() {
        return NumeroRestaurante;
    }

    public void setNumeroRestaurante(int NumeroRestaurante) {
        this.NumeroRestaurante = NumeroRestaurante;
    }

    public static int getNumeroMesa() {
        return numeroMesa;
    }

    public static void setNumeroMesa(int numeroMesa) {
        Mesas.numeroMesa = numeroMesa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidadSillas() {
        return cantidadSillas;
    }

    public void setCantidadSillas(int cantidadSillas) {
        this.cantidadSillas = cantidadSillas;
    }
    
    public String toStringArchivo (){
        return this.NumeroRestaurante + ";" +
                this.numeroMesa + ";" + 
                this.descripcion + ";" +
                this.cantidadSillas;
    }
}
