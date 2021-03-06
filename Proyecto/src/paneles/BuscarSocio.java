package paneles;

/**
 *
 */
public class BuscarSocio extends ContenidoPanel {

    /**
     * Creates new form BuscarChamba
     */
    public BuscarSocio(ContenidoJFrame ventana) {
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
        ListaEspecialidad = new javax.swing.JComboBox<>();
        TEspecialidad = new javax.swing.JLabel();
        Instrucciones = new javax.swing.JLabel();
        Empresario = new javax.swing.JCheckBox();
        TEmpresario = new javax.swing.JLabel();
        Enviar = new javax.swing.JButton();
        TCapital = new javax.swing.JLabel();
        TMonto = new javax.swing.JLabel();
        Monto = new javax.swing.JSpinner();

        Titulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Buscador de Socios");

        ListaEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tecnologías de la información",
            "Mercadotecnía",
            "Industria",
            "Administración de empresas" }));

TEspecialidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
TEspecialidad.setText("Especialidad");

Instrucciones.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
Instrucciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
Instrucciones.setText("Complete los siguientes campos para realizar su búsqueda");

Empresario.setText("Sí");

TEmpresario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
TEmpresario.setText("¿Empresario?");

Enviar.setText("Subir solicitud");

TCapital.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
TCapital.setText("Cantidad de capital que está dispuesto a invertir");

TMonto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
TMonto.setText("Monto");

javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
this.setLayout(layout);
layout.setHorizontalGroup(
    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(255, 255, 255))
            .addGroup(layout.createSequentialGroup()
                .addComponent(TEspecialidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(415, 415, 415))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Instrucciones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ListaEspecialidad, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(176, 176, 176)
                            .addComponent(Enviar))
                        .addComponent(Empresario, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(TEmpresario, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TCapital, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TMonto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Monto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(Titulo)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(Instrucciones)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(TEspecialidad)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(ListaEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(TEmpresario)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(Empresario)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(TCapital)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(TMonto)
                .addComponent(Monto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(10, 10, 10)
            .addComponent(Enviar)
            .addContainerGap())
    );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Empresario;
    private javax.swing.JButton Enviar;
    private javax.swing.JLabel Instrucciones;
    private javax.swing.JComboBox<String> ListaEspecialidad;
    private javax.swing.JSpinner Monto;
    private javax.swing.JLabel TCapital;
    private javax.swing.JLabel TEmpresario;
    private javax.swing.JLabel TEspecialidad;
    private javax.swing.JLabel TMonto;
    private javax.swing.JLabel Titulo;
    // End of variables declaration//GEN-END:variables
}
