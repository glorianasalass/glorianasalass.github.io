/*
 * Universidad Técnica Nacional - UTN
 * Carrera de Ingeniería del Software
 * Curso ISW-311 Programación II
 * Prof. Ing. Alexánder Agüero Castillo
 */
package SIFAPIDAL;

import java.util.ArrayList;
import java.util.List;
import SIFAPIEntidades.Canton;
import SIFAPIEntidades.Distrito;
import SIFAPIEntidades.Provincia;

/**
 * Clase DivisionTerritorialDAL: Controla la persistencia de los datos
 * con el archivo físico donde se almacena, actualiza y consulta los registros
 * Referencia: Material de Curso
 * @author Ing. Alexander Agüero Castillo
 * @version 3.0
 * @since Julio 2019
 */
public class DivisionTerritorialDAL extends BaseDAL {
    /**
     * Constructor de la clase
     */
    public DivisionTerritorialDAL(){
        //Rutas para los archivos de datos
        this.rutaArchivoDatos = ".\\src\\ISFAPIDatos\\DivisionTerritorial.dat";

        //Crear la instancia del manejador de archivos
        this.oManejadorArchivosDAL = new ManejadorArchivosDAL();
    }

    /**
     * Método que busca en archivo el registro que concuerde con el valor
     * llave y retorna una instancia de tipo provincia
     * @param pIdentificador Valor llave a buscar dentro del archivo
     * @return Instancia de provincia
     */
    public Provincia buscarProvincia(int pIdentificador){
        Provincia oProvincia;

        //Definir objeto ArrayList para la lista de los Registros en formato String
        String vRegistro = this.buscarLinea(pIdentificador + "", 0);

        //Descompone al linea en una estructura vectorizada
        //donde cada elemento del vector son los datos
        //de la línea separados por ";"
        String[] vDatosRegistro = vRegistro.split(";");
        //Crear la instancia de Provincia
        oProvincia = new Provincia(Integer.parseInt(vDatosRegistro[0]), 
                                   Integer.parseInt(vDatosRegistro[1]), 
                                   vDatosRegistro[4]);
        return oProvincia;
    }

    /**
     * Método que busca en archivo el registro que concuerde con el valor
     * llave y retorna una instancia de tipo cantón
     * @param pIdentificador Valor llave a buscar dentro del archivo
     * @return Instancia de cantón
     */
    public Canton buscarCanton(int pIdentificador) {
        Canton oCanton;

        //Definir objeto ArrayList para la lista de los Registros en formato String
        String vRegistro = this.buscarLinea(pIdentificador + "", 0);

        //Descompone al linea en una estructura vectorizada
        //donde cada elemento del vector son los datos
        //de la línea separados por ";"
        String[] vDatosRegistro = vRegistro.split(";");
        
        //Crear la instancia de Departamento
        oCanton = new Canton(Integer.parseInt(vDatosRegistro[0]), 
                             Integer.parseInt(vDatosRegistro[1]), 
                             Integer.parseInt(vDatosRegistro[2]),
                             vDatosRegistro[4]);
        return oCanton;
    }

    /**
     * Método que busca en archivo el registro que concuerde con el valor
     * llave y retorna una instancia de tipo distrito
     * @param pIdentificador Valor llave a buscar dentro del archivo
     * @return Instancia de distrito
     */
    public Distrito buscarDistrito(int pIdentificador) {
        Distrito oDistrito;

        //Definir objeto ArrayList para la lista de los Registros en formato String
        String vRegistro = this.buscarLinea(pIdentificador + "", 0);

        //Descompone al linea en una estructura vectorizada
        //donde cada elemento del vector son los datos
        //de la línea separados por ";"
        String[] vDatosRegistro = vRegistro.split(";");
        
        //Crear la instancia de Departamento
        oDistrito = new Distrito(Integer.parseInt(vDatosRegistro[0]), 
                                 Integer.parseInt(vDatosRegistro[1]), 
                                 Integer.parseInt(vDatosRegistro[2]),
                                 Integer.parseInt(vDatosRegistro[3]),
                                 vDatosRegistro[4]);
        return oDistrito;
    }
    
    /**
     * Obtener la lista completa de las provincias
     * @return Objeto ArrayList con todos los objetos departamentos
     */
    public List<Provincia> getListaProvincias() {
        Provincia oProvincia;

        //Definir objeto ArrayList para cargar los objetos
        List<Provincia> oArrayListProvincias = new ArrayList<>();
        
        //Crear los vectores para los datos e indices
        //para el filtro de registros por valores llave
        String[] vDatos = new String[2];
        
        //Todos los registros donde canton = 0 y distrito = 0
        //son las provincias
        vDatos[0] = "0";
        vDatos[1] = "0";
        
        //Posiciones dentro del archivo de DivisionTerritorial.dat
        //Canton = 2
        //Distrito = 3
        int[] vIndices = new int[2];
        vIndices[0] = 2;
        vIndices[1] = 3;
        
        //Definir objeto ArrayList para la lista de los Registros en formato String
        List<String> oListaRegistros = this.buscarLineasPorLlaves(vDatos, vIndices);

        //Iterar la colección con un foreach de Java
        for (String vRegistro : oListaRegistros) {
            //Descompone al linea en una estructura vectorizada
            //donde cada elemento del vector son los datos
            //de la línea separados por ";"
            String[] vDatosRegistro = vRegistro.split(";");
            
            //Crear la instancia de Departamento
            oProvincia = new Provincia(Integer.parseInt(vDatosRegistro[0]), 
                                       Integer.parseInt(vDatosRegistro[1]),
                                       vDatosRegistro[4]);
            
            //Agregar la instancia a la colección
            oArrayListProvincias.add(oProvincia);
        }

        return oArrayListProvincias;
    }
    
    /**
     * Obtener la lista completa de los cantones de una provincia
     * @param pNumeroProvincia Número de provincia para extraer los cantonoes
     * @return Lista con los cantones de la provincia
     */
    public List<Canton> getListaCantones(int pNumeroProvincia) {
        Canton oCanton;

        //Definir objeto ArrayList para cargar los objetos
        List<Canton> oArrayListCantones = new ArrayList<>();

        //Crear los vectores para los datos e indices
        //para el filtro de registros por valores llave
        String[] vDatos = new String[2];
        
        //Todos los registros donde provincia = pNumeroProvincia y distrito = 0
        //son los cantones de la provincia indicado
        vDatos[0] = pNumeroProvincia + "";
        vDatos[1] = "0";

        //Posiciones dentro del archivo datos
        //provincia = 1
        //distrito = 3
        int[] vIndices = new int[2];
        vIndices[0] = 1;
        vIndices[1] = 3;

        //Definir objeto ArrayList para la lista de los Registros en formato String
        List<String> oListaRegistros = this.buscarLineasPorLlaves(vDatos, vIndices);

        //Iterar la colección con un foreach de Java
        for (String vRegistro : oListaRegistros) {
            //Descompone al linea en una estructura vectorizada
            //donde cada elemento del vector son los datos
            //de la línea separados por ";"
            String[] vDatosRegistro = vRegistro.split(";");
            
            //Crear la instancia de Cantón
            oCanton = new Canton(Integer.parseInt(vDatosRegistro[0]), 
                                 Integer.parseInt(vDatosRegistro[1]), 
                                 Integer.parseInt(vDatosRegistro[2]),
                                 vDatosRegistro[4]);

            //Agregar la instancia a la colección
            oArrayListCantones.add(oCanton);
        }

        return oArrayListCantones;
    }

    /**
     * Obtener la lista completa de los distritos de una provincia y de un cantón particular
     * @param pNumeroProvincia Número de provincia para extraer los distritos
     * @param pNumeroCanton Número de cantón para extraer los distritos
     * @return Lista con los distritos del cantón y provincia dados
     */
    public List<Distrito> getListaDistritos(int pNumeroProvincia, int pNumeroCanton) {
        Distrito oDistrito;

        //Definir objeto ArrayList para cargar los objetos
        List<Distrito> oArrayListDistritos = new ArrayList<>();

        //Crear los vectores para los datos e indices
        //para el filtro de registros por valores llave
        String[] vDatos = new String[2];
        
        //Todos los registros donde provincia = pNumeroProvincia y canton = pNumeroCanton
        //son los distritos de la provincia y cantón indicados
        vDatos[0] = pNumeroProvincia + "";
        vDatos[1] = pNumeroCanton + "";

        //Posiciones dentro del archivo de datos
        //provincia = 1
        //canton = 2
        int[] vIndices = new int[2];
        vIndices[0] = 1;
        vIndices[1] = 2;

        //Definir objeto ArrayList para la lista de los Registros en formato String
        List<String> oListaRegistros = this.buscarLineasPorLlaves(vDatos, vIndices);

        //Iterar la colección con un foreach de Java
        for (String vRegistro : oListaRegistros) {
            //Descompone al linea en una estructura vectorizada
            //donde cada elemento del vector son los datos
            //de la línea separados por ";"
            String[] vDatosRegistro = vRegistro.split(";");
            
            //Crear la instancia de Departamento
            oDistrito = new Distrito(Integer.parseInt(vDatosRegistro[0]), 
                                     Integer.parseInt(vDatosRegistro[1]), 
                                     Integer.parseInt(vDatosRegistro[2]),
                                     Integer.parseInt(vDatosRegistro[3]),
                                     vDatosRegistro[4]);

            //Agregar la instancia a la colección
            oArrayListDistritos.add(oDistrito);
        }

        return oArrayListDistritos;
    }    
    
}
