/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SIFAPIDAL;

import SIFAPIEntidades.Restaurante;
import SIFAPIUtilitarios.Formatos;

/**
 *
 * @author Usuario
 */
public class RestauranteDAL extends BaseDAL{
    
    private DivisionTerritorialDAL oDivisionTerritorialDAL;
    
    
    public RestauranteDAL() {
        this.rutaArchivoDatos = ".\\src\\SIFAPIDatos\\DivisionTerritorial.dat";

        //Crear la instancia del manejador de archivos
        this.oManejadorArchivosDAL = new ManejadorArchivosDAL();
        
        this.oDivisionTerritorialDAL = new DivisionTerritorialDAL();
    }
    
    public void agregarRestaurante (Restaurante pRestaurante){
        this.agregarLinea(pRestaurante.toString());  //Agrega un restaurante nuevo
    }
    
    public void modificarRestaurante (Restaurante pRestaurante){
        this.modificarLinea(Formatos.conFormatoEntero(pRestaurante.getNumeroRestaurante()), 0, pRestaurante.toStringArchivo());
    }
    
    public void eliminarRestaurante (int pNumeroRestaurante){
        this.eliminarLinea(Formatos.sinFormatoEntero(pNumeroRestaurante), 0);
    }
}
