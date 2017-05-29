package paneles;

//TODO: Esta se queda opcional
/**
 *
 * @author davidazullo
 */
public class EmpleadoCV extends ContenidoPanel {

    /**
     * Creates new form EmpleadoCV
     * @param ventana
     */
    public EmpleadoCV(ContenidoJFrame ventana) {
        super(ventana);
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

        Archivo = new javax.swing.JFileChooser();
        Titulo1 = new javax.swing.JLabel();
        Instrucciones = new javax.swing.JLabel();
        Enviar = new javax.swing.JButton();

        Titulo1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo1.setText("Empleado");

        Instrucciones.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        Instrucciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Instrucciones.setText("Suba su Curriculum Vitae en formato PDF de preferencia");

        Enviar.setText("Aceptar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Instrucciones, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Archivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Enviar)
                .addGap(245, 245, 245))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Instrucciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Archivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Enviar)
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser Archivo;
    private javax.swing.JButton Enviar;
    private javax.swing.JLabel Instrucciones;
    private javax.swing.JLabel Titulo1;
    // End of variables declaration//GEN-END:variables
}
