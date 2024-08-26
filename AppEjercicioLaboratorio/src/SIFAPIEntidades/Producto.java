/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SIFAPIEntidades;

/**
 *
 * @author Estudiante
 */
public class Producto {
   private String codigoP;
   private TipoProduct tipoProducto;
   private String descripcionProducto;
   private TipoPresentacionProducto presentacionP;

    public Producto(String codigoP, TipoProduct tipoProducto, String descripcionProducto, TipoPresentacionProducto presentacionP) {
        this.codigoP = codigoP;
        this.tipoProducto = tipoProducto;
        this.descripcionProducto = descripcionProducto;
        this.presentacionP = presentacionP;
    }

    public String getCodigoP() {
        return codigoP;
    }

    public void setCodigoP(String codigoP) {
        this.codigoP = codigoP;
    }

    public TipoProduct getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(TipoProduct tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public TipoPresentacionProducto getPresentacionP() {
        return presentacionP;
    }

    public void setPresentacionP(TipoPresentacionProducto presentacionP) {
        this.presentacionP = presentacionP;
    }
   
   public String toStringArchivo (){
       return this.codigoP +";" +
               this.tipoProducto.getTiooP() +";"+
               this.descripcionProducto+ ";"+
               this.presentacionP.getTip_Present_Product();
   }
}
