/*
 * Universidad Técnica Nacional - UTN
 * Carrera de Ingeniería del Software
 * Curso ISW-311 Programación II
 * Prof. Ing. Alexánder Agüero Castillo
 */
package SIFAPIEntidades;

/**
 * Clase Canton: Modela un cantón de una provincia
 * Referencia: Material de Curso
 * @author Ing. Alexander Agüero Castillo
 * @version 3.0
 * @since Julio 2019
 */
public class Canton {
    private int identificador;
    private int numeroProvincia;
    private int numeroCanton;
    private String nombre;

    public Canton(int pIdentificador, int pNumeroProvincia, int pNumeroCanton, String pNombre) {
        this.identificador = pIdentificador;
        this.numeroProvincia = pNumeroProvincia;
        this.numeroCanton = pNumeroCanton;
        this.nombre = pNombre;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setNumeroProvincia(int codigo) {
        this.numeroProvincia = codigo;
    }

    public int getNumeroProvincia() {
        return numeroProvincia;
    }

    public void setNumeroCanton(int numeroCanton) {
        this.numeroCanton = numeroCanton;
    }

    public int getNumeroCanton() {
        return numeroCanton;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return this.numeroCanton + " - " + this.nombre;
    }    
}
