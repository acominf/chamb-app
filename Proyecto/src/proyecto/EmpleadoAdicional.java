/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author davidazullo
 */
public class EmpleadoAdicional extends javax.swing.JPanel {

    /**
     * Creates new form EmpleadoAdicional
     */
    public EmpleadoAdicional() {
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
        CampoTrabajo = new javax.swing.JLabel();
        CamposDeTrabajo = new javax.swing.JComboBox<>();
        Rango = new javax.swing.JLabel();
        TMinimo = new javax.swing.JLabel();
        Minimo = new javax.swing.JSpinner();
        Maximo = new javax.swing.JSpinner();
        TMaximo = new javax.swing.JLabel();
        TPrestaciones = new javax.swing.JLabel();
        Prestaciones = new javax.swing.JCheckBox();
        TTiempoCompleto = new javax.swing.JLabel();
        TiempoCompleto = new javax.swing.JCheckBox();
        TExperiencia = new javax.swing.JLabel();
        ExperienciaTitulo = new javax.swing.JLabel();
        Experiencia = new javax.swing.JSpinner();
        Comentarios = new javax.swing.JLabel();
        CampoComentarios = new javax.swing.JScrollPane();
        AreaTexto = new javax.swing.JTextArea();
        Enviar = new javax.swing.JButton();
        Enviar1 = new javax.swing.JButton();

        Titulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Empleado");

        Instrucciones.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        Instrucciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Instrucciones.setText("Complete los siguientes campos para completar su perfil");

        CampoTrabajo.setText("Campo:");

        CamposDeTrabajo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tecnologías de la información",
            "Mercadotecnía",
            "Industria",
            "Administración de empresas" }));

Rango.setText("Rango de saldo que considera justos para usted");

TMinimo.setText("Mínimo:");

TMaximo.setText("Máximo:");

TPrestaciones.setText("Necesita prestaciones");

Prestaciones.setText("Sí");
Prestaciones.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        PrestacionesActionPerformed(evt);
    }
    });

    TTiempoCompleto.setText("Quiere trabajar tiempo completo");

    TiempoCompleto.setText("Sí");
    TiempoCompleto.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            TiempoCompletoActionPerformed(evt);
        }
    });

    TExperiencia.setText("Años");

    ExperienciaTitulo.setText("Cantidad de años de experiencia en su campo");

    Comentarios.setText("Comentarios Adicionales:");

    AreaTexto.setColumns(20);
    AreaTexto.setRows(5);
    CampoComentarios.setViewportView(AreaTexto);

    Enviar.setText("Subir CV");

    Enviar1.setText("Actualizar información");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(CampoComentarios)
                    .addGap(278, 278, 278))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Instrucciones, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Prestaciones)
                        .addComponent(CampoTrabajo)
                        .addComponent(Rango)
                        .addComponent(CamposDeTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TPrestaciones)
                        .addComponent(Comentarios)
                        .addComponent(TiempoCompleto)
                        .addComponent(TTiempoCompleto)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ExperienciaTitulo)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Enviar)
                                .addGap(23, 23, 23)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TMaximo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Maximo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TMinimo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Minimo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(TExperiencia)
                                    .addGap(33, 33, 33)
                                    .addComponent(Experiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addContainerGap())))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Enviar1)
            .addGap(178, 178, 178))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(Titulo)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(Instrucciones)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(CampoTrabajo)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(CamposDeTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(Rango)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(TMinimo)
                .addComponent(Minimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(TMaximo)
                .addComponent(Maximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(TPrestaciones)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(Prestaciones)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(TTiempoCompleto)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(TiempoCompleto)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(ExperienciaTitulo)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(TExperiencia)
                .addComponent(Experiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(Comentarios)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(CampoComentarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
            .addComponent(Enviar)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(Enviar1)
            .addContainerGap())
    );
    }// </editor-fold>//GEN-END:initComponents

    private void PrestacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrestacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrestacionesActionPerformed

    private void TiempoCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TiempoCompletoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TiempoCompletoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaTexto;
    private javax.swing.JScrollPane CampoComentarios;
    private javax.swing.JLabel CampoTrabajo;
    private javax.swing.JComboBox<String> CamposDeTrabajo;
    private javax.swing.JLabel Comentarios;
    private javax.swing.JButton Enviar;
    private javax.swing.JButton Enviar1;
    private javax.swing.JSpinner Experiencia;
    private javax.swing.JLabel ExperienciaTitulo;
    private javax.swing.JLabel Instrucciones;
    private javax.swing.JSpinner Maximo;
    private javax.swing.JSpinner Minimo;
    private javax.swing.JCheckBox Prestaciones;
    private javax.swing.JLabel Rango;
    private javax.swing.JLabel TExperiencia;
    private javax.swing.JLabel TMaximo;
    private javax.swing.JLabel TMinimo;
    private javax.swing.JLabel TPrestaciones;
    private javax.swing.JLabel TTiempoCompleto;
    private javax.swing.JCheckBox TiempoCompleto;
    private javax.swing.JLabel Titulo;
    // End of variables declaration//GEN-END:variables
}
