/*
 * Universidad Técnica Nacional - UTN
 * Carrera de Ingeniería del Software
 * Curso ISW-311 Programación II
 * Prof. Ing. Alexánder Agüero Castillo
 */
package appejerciciolaboratorio;


import SIFAPIUtilitarios.UtilitarioVentana;

/**
 * Clase AppEjercicioLaboratorio: Main() de la Aplicación
 * @author Ing. Alexander Agüero Castillo
 * @version 2.0
 * @since Diciembre 2020
 */
public class AppEjercicioLaboratorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Aplicar el estilo de las ventanas
        UtilitarioVentana.aplicarEstiloVentas(1);

        JFrmVentanaPrincipal oFrmVentanaPrincipal = new JFrmVentanaPrincipal();
                
        //Centrar la ventana principal y mostrar al usuario
        UtilitarioVentana.centrarVentanaJFrame(oFrmVentanaPrincipal, true);
    }
    
}
