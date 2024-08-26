/*
 * Universidad Técnica Nacional - UTN
 * Carrera de Ingeniería del Software
 * Curso ISW-311 Programación II
 * Prof. Ing. Alexánder Agüero Castillo
 */
package appejerciciolaboratorio;

import javax.swing.JOptionPane;
import SIFAPIUtilitarios.UtilitarioVentana;

/**
 * Clase JFrmVentanaPrincipal: Ventana Principal de la aplicación
 * Referencia: https://docs.oracle.com/javase/tutorial/uiswing/components/frame.html
 * @author Ing. Alexander Agüero Castillo
 * @version 3.0
 * @since Diciembre 2020
 */
public class JFrmVentanaPrincipal extends javax.swing.JFrame {

    /**
     * Constructor de la clase
     * Creación de los componentes de Swing
     * en el JFrame
     */
    public JFrmVentanaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDepAdministradorEscritorio = new javax.swing.JDesktopPane();
        jMnuMenuPrincipal = new javax.swing.JMenuBar();
        jMnuSistema = new javax.swing.JMenu();
        jMnuSistemaImpresoras = new javax.swing.JMenuItem();
        jMnuSistemaParametros = new javax.swing.JMenuItem();
        jSeparatorSistema = new javax.swing.JPopupMenu.Separator();
        jMnuSistemaSalir = new javax.swing.JMenuItem();
        jMnuEjercicios = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMnuAyuda = new javax.swing.JMenu();
        jMnuAyudaAyudaUsuario = new javax.swing.JMenuItem();
        jSeparatorAyuda = new javax.swing.JPopupMenu.Separator();
        jMnuAyudaAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        javax.swing.GroupLayout jDepAdministradorEscritorioLayout = new javax.swing.GroupLayout(jDepAdministradorEscritorio);
        jDepAdministradorEscritorio.setLayout(jDepAdministradorEscritorioLayout);
        jDepAdministradorEscritorioLayout.setHorizontalGroup(
            jDepAdministradorEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDepAdministradorEscritorioLayout.setVerticalGroup(
            jDepAdministradorEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jMnuSistema.setText("Sistema");

        jMnuSistemaImpresoras.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMnuSistemaImpresoras.setText("Impresoras");
        jMnuSistema.add(jMnuSistemaImpresoras);

        jMnuSistemaParametros.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMnuSistemaParametros.setText("Parámetros");
        jMnuSistema.add(jMnuSistemaParametros);
        jMnuSistema.add(jSeparatorSistema);

        jMnuSistemaSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMnuSistemaSalir.setText("Salir");
        jMnuSistemaSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuSistemaSalirActionPerformed(evt);
            }
        });
        jMnuSistema.add(jMnuSistemaSalir);

        jMnuMenuPrincipal.add(jMnuSistema);

        jMnuEjercicios.setText("Ejercicios");

        jMenuItem1.setText("jMenuItem1");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMnuEjercicios.add(jMenuItem1);

        jMnuMenuPrincipal.add(jMnuEjercicios);

        jMnuAyuda.setText("Ayuda");

        jMnuAyudaAyudaUsuario.setText("Ayuda al usuario");
        jMnuAyuda.add(jMnuAyudaAyudaUsuario);
        jMnuAyuda.add(jSeparatorAyuda);

        jMnuAyudaAcercaDe.setText("Acerca de...");
        jMnuAyudaAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuAyudaAcercaDeActionPerformed(evt);
            }
        });
        jMnuAyuda.add(jMnuAyudaAcercaDe);

        jMnuMenuPrincipal.add(jMnuAyuda);

        setJMenuBar(jMnuMenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDepAdministradorEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 800, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDepAdministradorEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 378, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int vResultado = 0;
        
        //Mostar un ConfirmDialog personalizado
        vResultado = JOptionPane.showConfirmDialog(null, 
                                                   "¿Está seguro que desea cerrar la aplicación?",
                                                   "Confirmación",
                                                   JOptionPane.YES_NO_OPTION);
        
        //Evaluar si la respuesta del usuario fue Sí
        if (vResultado == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        this.jDepAdministradorEscritorio.setSize( this.getSize() );
    }//GEN-LAST:event_formComponentResized

    private void jMnuSistemaSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuSistemaSalirActionPerformed
        //Esto es una forma de llamar al evento de un JFrame
        //Pasando como parámetro una nueva instancia del evento WindowEvent, con ID = 0
        formWindowClosing(new java.awt.event.WindowEvent(this,0));
    }//GEN-LAST:event_jMnuSistemaSalirActionPerformed

    private void jMnuAyudaAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuAyudaAcercaDeActionPerformed
        JOptionPane.showMessageDialog(this, 
                                      new JPanAcercaDe(), 
                                      "Acerca de...",
                                      JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jMnuAyudaAcercaDeActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JPanPrueba oPanPrueba = new JPanPrueba();
        
        UtilitarioVentana.centrarVentanaJPanel(this, "", oPanPrueba, jDepAdministradorEscritorio);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDepAdministradorEscritorio;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jMnuAyuda;
    private javax.swing.JMenuItem jMnuAyudaAcercaDe;
    private javax.swing.JMenuItem jMnuAyudaAyudaUsuario;
    private javax.swing.JMenu jMnuEjercicios;
    private javax.swing.JMenuBar jMnuMenuPrincipal;
    private javax.swing.JMenu jMnuSistema;
    private javax.swing.JMenuItem jMnuSistemaImpresoras;
    private javax.swing.JMenuItem jMnuSistemaParametros;
    private javax.swing.JMenuItem jMnuSistemaSalir;
    private javax.swing.JPopupMenu.Separator jSeparatorAyuda;
    private javax.swing.JPopupMenu.Separator jSeparatorSistema;
    // End of variables declaration//GEN-END:variables
}
