/*
 * Universidad Técnica Nacional - UTN
 * Carrera de Ingeniería del Software
 * Curso ISW-311 Programación II
 * Prof. Ing. Alexánder Agüero Castillo
 */
package SIFAPIDAL;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import SIFAPIUtilitarios.ManejadorErrorSistema;

/**
 * Clase ManejadorArchivosDAL: Apertura y cierre de archivos
 * Referencia: Material de Curso
 * @author Ing. Alexander Agüero Castillo
 * @version 3.0
 * @since Julio 2019
 */
public class ManejadorArchivosDAL {

    /**
     * Constructor de la clase
     */
    public ManejadorArchivosDAL() {

    }

    /**
     * Abrir un archivo, controla los posibles errores
     * Tipo de Archivo File
     * @param pRutaArchivo Ruta y nombre del archivo
     */
    public File abrirArchivoFile(String pRutaArchivo) {
        //Definir variable tipo File
        File vArchivo = null;

        //Limpiar el control de errores
        ManejadorErrorSistema.limpiarError();

        try {
            //Abrir el archivo
            vArchivo = new File(pRutaArchivo);

        } catch (SecurityException vErrorSeguridadArchivo) {
            ManejadorErrorSistema.registrarError("SP-1001", 
                                                 "Error de seguridad abriendo archivo.",
                                                 vErrorSeguridadArchivo.toString(),
                                                 "ManejadorArchivosDAL", 
                                                 "abrirArchivoFile");
        } catch (Exception vErrorAchivo) {
            ManejadorErrorSistema.registrarError("SP-1002", 
                                                 "Error general abriendo el archivo.",
                                                 vErrorAchivo.toString(), 
                                                 "ManejadorArchivosDAL",
                                                 "abrirArchivoFile");
        }

        return vArchivo;
    }

    /**
     * Abrir un archivo, controla los posibles errores
     * Tipo de Archivo File RandomAccessFile
     * @param pRutaArchivo Ruta y nombre del archivo
     * @return
     */
    public RandomAccessFile abrirArchivoRandomAccessFile(String pRutaArchivo) {
        //Definir archivo tipo RanddomAccessFile
        RandomAccessFile vArchivo = null;
        //Limpiar el control de errores
        ManejadorErrorSistema.limpiarError();

        try {
            //Abrir el archivo de Acceso Aleatorio para lectura y escritura
            vArchivo = new RandomAccessFile(pRutaArchivo, "rw");

        } catch (SecurityException vErrorSeguridadArchivo) {
            ManejadorErrorSistema.registrarError("SP-1003",
                                                 "Error de seguridad abriendo el archivo de " +
                                                 "acceso aleatorio.",
                                                 vErrorSeguridadArchivo.toString(),
                                                 "ManejadorArchivosDAL", 
                                                 "abrirArchivoRandomAccessFile");
        } catch (FileNotFoundException vErrorAchivo) {
            ManejadorErrorSistema.registrarError("SP-1004", "El archivo no existe.",
                                                 vErrorAchivo.toString(), 
                                                 "ManejadorArchivosDAL",
                                                 "abrirArchivoRandomAccessFile");
        } catch (Exception vErrorAchivo) {
            ManejadorErrorSistema.registrarError("SP-1004", "Error general abriendo archivo " +
                                                 "de acceso aleatorio.",
                                                 vErrorAchivo.toString(), 
                                                 "ManejadorArchivosDAL",
                                                 "abrirArchivoRandomAccessFile");
        }
        
        return vArchivo;
    }

    /**
     * Cerrar el objeto archivo tipo File
     * @param pArchivo Objeto archivo
     */
    public void cerrarArchivoFile(File pArchivo) {
        //Limpiar el control de errores
        ManejadorErrorSistema.limpiarError();
        try {
            if (pArchivo != null) {
                pArchivo = null;
            }
        } catch (Exception vError) {
            ManejadorErrorSistema.registrarError("SP-1005", 
                                                 "Error cerrando archivo.",
                                                 vError.toString(),
                                                 "ManejadorArchivosDAL", 
                                                 "cerrarArchivoFile");
        }
    }

    /**
     * Permite cerrar un archivo tipo RandomAccessFile
     * @param pArchivo Nombre y ruta del archivo
     */
    public void cerrarArchivoRandomAccessFile(RandomAccessFile pArchivo) {
        //Limpiar el control de errores
        ManejadorErrorSistema.limpiarError();
        
        try {
            if (pArchivo != null) {
                pArchivo.close();
                pArchivo = null;
            }
        } catch (IOException vError) {
            ManejadorErrorSistema.registrarError("SP-1006", 
                                                 "Error de escritura/lectura en el archivo de acceso aleatorio.",
                                                 vError.toString(), 
                                                 "ManejadorArchivosDAL",
                                                 "cerrarArchivoRandomAccessFile");
        } catch (Exception vError) {
            ManejadorErrorSistema.registrarError("SP-1006", 
                                                 "Error cerrando archivo de acceso aleatorio.",
                                                 vError.toString(), 
                                                 "ManejadorArchivosDAL",
                                                 "cerrarArchivoRandomAccessFile");
        }
    }

    /**
     * Borrar un archivo del sistema de archivo
     * @param pRutaArchivo Nombre y ruta del archivo a borrar
     */
    public void borrarArchivoFile(String pRutaArchivo) {
        //Limpiar el control de errores
        ManejadorErrorSistema.limpiarError();
        try {
            File vArchivo = new File(pRutaArchivo);
            vArchivo.delete();
            vArchivo = null;
        } catch (SecurityException vErrorSeguridadArchivo) {
            ManejadorErrorSistema.registrarError("SP-1007", 
                                                 "Error de seguridad borrando el archivo.",
                                                 vErrorSeguridadArchivo.toString(), 
                                                 "ManejadorArchivosDAL",
                                                 "borrarArchivoFile");
        } catch (Exception vErrorAchivo) {
            ManejadorErrorSistema.registrarError("SP-1008", 
                                                 "Error borrando el archivo.",
                                                 vErrorAchivo.toString(),
                                                 "ManejadorArchivosDAL", 
                                                 "borrarArchivoFile");
        }
    }    
}
