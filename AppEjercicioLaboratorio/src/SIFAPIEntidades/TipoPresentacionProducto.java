/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SIFAPIEntidades;

/**
 *
 * @author Estudiante
 */
public class TipoPresentacionProducto {
    private String tip_Present_Product;
    private String descripcion_tip_Product;

    public TipoPresentacionProducto(String tip_Present_Product, String descripcion_tip_Product) {
        this.tip_Present_Product = tip_Present_Product;
        this.descripcion_tip_Product = descripcion_tip_Product;
    }

    public String getTip_Present_Product() {
        return tip_Present_Product;
    }

    public void setTip_Present_Product(String tip_Present_Product) {
        this.tip_Present_Product = tip_Present_Product;
    }

    public String getDescripcion_tip_Product() {
        return descripcion_tip_Product;
    }

    public void setDescripcion_tip_Product(String descripcion_tip_Product) {
        this.descripcion_tip_Product = descripcion_tip_Product;
    }
    
    public String toStringArchivo(){
        return this.tip_Present_Product +";" +
                this.descripcion_tip_Product;
    }
}
