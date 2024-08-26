/*
 * Universidad Técnica Nacional - UTN
 * Carrera de Ingeniería del Software
 * Curso ISW-311 Programación II
 * Prof. Ing. Alexánder Agüero Castillo
 */
package SIFAPIBLL;

import java.util.List;
import SIFAPIDAL.DivisionTerritorialDAL;
import SIFAPIEntidades.Canton;
import SIFAPIEntidades.Distrito;
import SIFAPIEntidades.Provincia;

/**
 * Clase DivisionTerritorialBLL: Clase de la capa de Lógica de Negocio que se conecta
 * con la capa DAL que contiene la persistencia de Datos con el archivo físico 
 * donde se almacena, actualiza y consulta los registros.
 * Referencia: Material de Curso
 * @author Ing. Alexander Agüero Castillo
 * @version 3.0
 * @since Julio 2019
 */
public class DivisionTerritorialBLL {

    //Objeto DAL para la persistencia de datos
    private DivisionTerritorialDAL oDivisionTerritorialDAL;

    /**
     * Constructor de la clase
     */
    public DivisionTerritorialBLL() {
        this.oDivisionTerritorialDAL = new DivisionTerritorialDAL();
    }

    /**
     * Obtener la lista completa de las Provincias
     * @return Objeto List<> con todos los objetos Provincia
     */
    public List<Provincia> getListaProvincias() {
        List<Provincia> vListaArreglo;

        //Invocar el método del DAL para obtener la lista
        vListaArreglo = this.oDivisionTerritorialDAL.getListaProvincias();

        //Retornar el objeto ArrayList
        return vListaArreglo;
    }

    /**
     * Obtener la lista completa de los Cantones de una Provincia
     * @param pNumeroProvincia Número de provincia de los cantones a listar
     * @return Objeto List<> con todos los objetos Cantones
     */
    public List<Canton> getListaCantones(int pNumeroProvincia) {
        List<Canton> vListaArreglo;

        //Invocar el método del DAL para obtener la lista
        vListaArreglo = this.oDivisionTerritorialDAL.getListaCantones(pNumeroProvincia);

        //Retornar el objeto ArrayList
        return vListaArreglo;
    }

    /**
     * Obtener la lista completa de los Distritos de un Cantón
     * @param pNumeroProvincia Número de Provincia
     * @param pNumeroCanton Número de Cantón
     * @return Objeto List<> con todos los objetos Distrito
     */
    public List<Distrito> getListaDistritos(int pNumeroProvincia, int pNumeroCanton) {
        List<Distrito> vListaArreglo;

        //Invocar el método del DAL para obtener la lista
        vListaArreglo = this.oDivisionTerritorialDAL.getListaDistritos(pNumeroProvincia, pNumeroCanton);

        //Retornar el objeto ArrayList
        return vListaArreglo;
    }

    /**
     * Método que busca en archivo el registro que concuerde con el valor
     * llave y retorna una instancia de tipo provincia
     * @param pIdentificador Valor llave a buscar dentro del archivo
     * @return Instancia de provincia
     */
    public Provincia buscarProvincia(int pIdentificador) {
        return this.oDivisionTerritorialDAL.buscarProvincia(pIdentificador);
    }

    /**
     * Método que busca en archivo el registro que concuerde con el valor
     * llave y retorna una instancia de tipo cantón
     * @param pIdentificador Valor llave a buscar dentro del archivo
     * @return Instancia de cantón
     */
    public Canton buscarCanton(int pIdentificador) {
        return this.oDivisionTerritorialDAL.buscarCanton(pIdentificador);
    }

    /**
     * Método que busca en archivo el registro que concuerde con el valor
     * llave y retorna una instancia de tipo distrito
     * @param pIdentificador Valor llave a buscar dentro del archivo
     * @return Instancia de distrito
     */
    public Distrito buscarDistrito(int pIdentificador) {
        return this.oDivisionTerritorialDAL.buscarDistrito(pIdentificador);
    }    
}
