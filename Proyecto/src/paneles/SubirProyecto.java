package paneles;

//TODO: Completarla
/**
 *
 * @author davidazullo
 */
public class SubirProyecto extends ContenidoPanel {

    /**
     * Creates new form BuscarChamba
     * @param ventana
     */
    public SubirProyecto(ContenidoJFrame ventana) {
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

        Titulo = new javax.swing.JLabel();
        TDescripcion = new javax.swing.JLabel();
        Instrucciones = new javax.swing.JLabel();
        Enviar = new javax.swing.JButton();
        DescipcionMonto = new javax.swing.JLabel();
        TMonto = new javax.swing.JLabel();
        Monto = new javax.swing.JSpinner();
        Descripcion = new javax.swing.JTextField();
        TEmpresa = new javax.swing.JLabel();
        Empresa = new javax.swing.JCheckBox();

        Titulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Subir proyecto");

        TDescripcion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TDescripcion.setText("Descripción general");

        Instrucciones.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        Instrucciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Instrucciones.setText("Complete los siguientes campos para realizar su búsqueda");

        Enviar.setText("Subir proyecto");

        DescipcionMonto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DescipcionMonto.setText("Monto solicitado para financiar proyecto");

        TMonto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TMonto.setText("Monto");

        TEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TEmpresa.setText("Es una empresa ya constituida, con menos de 2 años de actividad");

        Empresa.setText("Sí");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(427, 427, 427))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addComponent(Enviar))
                            .addComponent(Titulo)
                            .addComponent(Instrucciones))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TMonto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Monto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(DescipcionMonto)
                            .addComponent(Empresa)
                            .addComponent(TEmpresa))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Instrucciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TDescripcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DescipcionMonto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TMonto)
                    .addComponent(Monto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TEmpresa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Empresa)
                .addGap(10, 10, 10)
                .addComponent(Enviar)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DescipcionMonto;
    private javax.swing.JTextField Descripcion;
    private javax.swing.JCheckBox Empresa;
    private javax.swing.JButton Enviar;
    private javax.swing.JLabel Instrucciones;
    private javax.swing.JSpinner Monto;
    private javax.swing.JLabel TDescripcion;
    private javax.swing.JLabel TEmpresa;
    private javax.swing.JLabel TMonto;
    private javax.swing.JLabel Titulo;
    // End of variables declaration//GEN-END:variables
}
