/*
 * Universidad Técnica Nacional - UTN
 * Carrera de Ingeniería del Software
 * Curso ISW-311 Programación II
 * Prof. Ing. Alexánder Agüero Castillo
 */
package appejerciciolaboratorio;

/**
 * Clase JFrmVentanaPrincipal: Ventana Principal de la aplicación
 * Referencia: Deitel, P. y Deitel, H., Java Cómo Programar. Pearson Educación, novena edición, 2012
 * @author Ing. Alexander Agüero Castillo
 * @version 2.0
 * @since Mayo 2018
 */
public class JPanAcercaDe extends javax.swing.JPanel {

    /**
     * Creates new form JPanAcercaDe
     */
    public JPanAcercaDe() {
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

        jLblUniversidad = new javax.swing.JLabel();
        jLblCurso = new javax.swing.JLabel();
        jLblDescripcionAplicacion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLblUniversidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLblUniversidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblUniversidad.setText("Universidad Técnica Nacional – UTN");

        jLblCurso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLblCurso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblCurso.setText("Curso: ISW-311 Progamación II");

        jLblDescripcionAplicacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblDescripcionAplicacion.setText("Aplicación de Ejemplos Gráficos con Swgin/AWT en Java v2.0");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Creado por: Ing. Alexander Agüero Castillo.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblUniversidad, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addComponent(jLblCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLblDescripcionAplicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLblUniversidad, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLblCurso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLblDescripcionAplicacion)
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addContainerGap(34, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLblCurso;
    private javax.swing.JLabel jLblDescripcionAplicacion;
    private javax.swing.JLabel jLblUniversidad;
    // End of variables declaration//GEN-END:variables
}
