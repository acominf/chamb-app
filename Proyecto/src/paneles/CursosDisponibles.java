package paneles;

//TODO: Completar
/**
 *
 * @author davidazullo
 */
public class CursosDisponibles extends ContenidoPanel {

    /**
     * Creates new form CursosDisponibles
     * @param ventana
     */
    public CursosDisponibles(ContenidoJFrame ventana) {
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
        Enviar = new javax.swing.JButton();
        Intrucciones = new javax.swing.JLabel();
        Intrucciones2 = new javax.swing.JLabel();
        Intrucciones3 = new javax.swing.JLabel();
        Campo1 = new javax.swing.JCheckBox();
        Campo2 = new javax.swing.JCheckBox();
        Campo3 = new javax.swing.JCheckBox();
        Campo4 = new javax.swing.JCheckBox();
        Campo5 = new javax.swing.JCheckBox();
        Campo6 = new javax.swing.JCheckBox();

        Titulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Cursos");

        Enviar.setText("Aceptar");

        Intrucciones.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Intrucciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Intrucciones.setText("Dadas sus preferencias, le recomendamos estos cursos,");

        Intrucciones2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Intrucciones2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Intrucciones2.setText("seleccione uno o más, se le notificará de manera oportuna");

        Intrucciones3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Intrucciones3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Intrucciones3.setText("el costo y las fechas de inicio/terminación.");

        Campo1.setText("Creación de un Modelo Canvas");

        Campo2.setText("Cómo declarar impuestos ante el SAT");

        Campo3.setText("Curso intensivo de Excel");

        Campo4.setText("Curso semi-intensivo de PowerPoint");

        Campo5.setText("Introducción a los sistemas Unix");

        Campo6.setText("Cómo mejorar el SEO en sus portales webs");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Campo6)
                    .addComponent(Campo5)
                    .addComponent(Campo4)
                    .addComponent(Campo3)
                    .addComponent(Campo2)
                    .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Intrucciones)
                    .addComponent(Intrucciones2)
                    .addComponent(Intrucciones3)
                    .addComponent(Campo1))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Intrucciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Intrucciones2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Intrucciones3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Campo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Campo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Campo3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Campo4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Campo5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Campo6)
                .addGap(22, 22, 22)
                .addComponent(Enviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Campo1;
    private javax.swing.JCheckBox Campo2;
    private javax.swing.JCheckBox Campo3;
    private javax.swing.JCheckBox Campo4;
    private javax.swing.JCheckBox Campo5;
    private javax.swing.JCheckBox Campo6;
    private javax.swing.JButton Enviar;
    private javax.swing.JLabel Intrucciones;
    private javax.swing.JLabel Intrucciones2;
    private javax.swing.JLabel Intrucciones3;
    private javax.swing.JLabel Titulo;
    // End of variables declaration//GEN-END:variables
}
