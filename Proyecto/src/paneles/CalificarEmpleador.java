package paneles;

//TODO: Completarla
/**
 *
 * @author davidazullo
 */
public class CalificarEmpleador extends ContenidoPanel {

    /**
     * Creates new form CalificarEmpleado
     */
    public CalificarEmpleador(ContenidoJFrame ventana) {
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
        Instrucciones = new javax.swing.JLabel();
        TEmpresa = new javax.swing.JLabel();
        Empresa = new javax.swing.JComboBox<>();
        Horario = new javax.swing.JSlider();
        THorario = new javax.swing.JLabel();
        Prestaciones = new javax.swing.JSlider();
        TPrestaciones = new javax.swing.JLabel();
        Vacaciones = new javax.swing.JSlider();
        TVacaciones = new javax.swing.JLabel();
        Enviar = new javax.swing.JButton();

        Titulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Calificar Empleador");

        Instrucciones.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        Instrucciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Instrucciones.setText("Complete los siguientes campos para realizar la calificación");

        TEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TEmpresa.setText("Empresa");

        Empresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Valeo" }));

        THorario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        THorario.setText("Horario");

        TPrestaciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TPrestaciones.setText("Prestaciones");

        TVacaciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TVacaciones.setText("Vacaciones");

        Enviar.setText("Calificar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Instrucciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TEmpresa)
                            .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Horario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(THorario)
                            .addComponent(Prestaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TPrestaciones)
                            .addComponent(Vacaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TVacaciones)
                            .addComponent(Enviar))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Instrucciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TEmpresa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(THorario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Horario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TPrestaciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Prestaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TVacaciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Vacaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(Enviar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Empresa;
    private javax.swing.JButton Enviar;
    private javax.swing.JSlider Horario;
    private javax.swing.JLabel Instrucciones;
    private javax.swing.JSlider Prestaciones;
    private javax.swing.JLabel TEmpresa;
    private javax.swing.JLabel THorario;
    private javax.swing.JLabel TPrestaciones;
    private javax.swing.JLabel TVacaciones;
    private javax.swing.JLabel Titulo;
    private javax.swing.JSlider Vacaciones;
    // End of variables declaration//GEN-END:variables
}
