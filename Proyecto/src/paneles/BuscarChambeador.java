package paneles;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Clase que se encarga de buscar candidatos para puestos que soliciten los empleadores.
 */
public class BuscarChambeador extends ContenidoPanel {

    /**
     * Constructor de la interfaz de usuario de BuscarChambeador
     * @param ventana
     */
    public BuscarChambeador(ContenidoJFrame ventana) {
        super(ventana);
        initComponents();
    }

    /**
     * Método que se encarga de validar el formulario
     */
    private void validarFormulario() {
        float minimo = (float)Minimo.getValue();
        float maximo = (float)Maximo.getValue();
        String campo = (String)CamposDeTrabajo.getSelectedItem();
        int experiencia = (int)Experiencia.getValue();
        boolean prestaciones = Prestaciones.isSelected();
        boolean tCompleto = TiempoCompleto.isSelected();
        if(minimo == 0 || maximo == 0){
            JOptionPane.showMessageDialog(null, "Introduzca Un Intervalo De Sueldo", "Error", JOptionPane.WARNING_MESSAGE);
        }
        else{
            ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
            File f = new File(System.getProperty("user.dir"));
            if(f.exists()){
                File[] ficheros = f.listFiles(); 
                for (File fichero : ficheros) {
                    String temp = fichero.getName();
                    if(temp.endsWith(".dat")){
                        String archivo = temp.substring(0, temp.length()-4);
                        Archivo empleador = new Archivo(archivo);
                        Usuario temporal = empleador.leeArchivo();
                        if(temporal.getSueldoMin() <= minimo &&
                        temporal.getSueldoMax() >= maximo &&
                        temporal.getCampo().equals(campo) &&
                        temporal.getExperiencia() <= experiencia &&
                        temporal.getPrestaciones() == prestaciones &&
                        temporal.gettCompleto() == tCompleto &&
                        temporal.getTipo().equals("Empleado"))
                            usuarios.add(temporal);
                    }
                }
            }
            if(usuarios.isEmpty()){
                JOptionPane.showMessageDialog(null, "No hay trabajadores con los paramétros especificados", "", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                String cadena = "Usuarios Que Cumplen Con El Perfil Solicitado: \n";
                for(Usuario user : usuarios){
                    cadena += Utilerias.convierteACadena(user);
                }
                JOptionPane.showMessageDialog(null, cadena, "", JOptionPane.INFORMATION_MESSAGE);
                Utilerias.cambiaComponentePadre(this);
            }
        }
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
        CamposDeTrabajo = new javax.swing.JComboBox<>();
        CampoTrabajo = new javax.swing.JLabel();
        Rango = new javax.swing.JLabel();
        Instrucciones = new javax.swing.JLabel();
        Minimo = new javax.swing.JSpinner();
        TMinimo = new javax.swing.JLabel();
        TMaximo = new javax.swing.JLabel();
        Maximo = new javax.swing.JSpinner();
        Prestaciones = new javax.swing.JCheckBox();
        TPrestaciones = new javax.swing.JLabel();
        TTiempoCompleto = new javax.swing.JLabel();
        TiempoCompleto = new javax.swing.JCheckBox();
        ExperienciaTitulo = new javax.swing.JLabel();
        TExperiencia = new javax.swing.JLabel();
        Comentarios = new javax.swing.JLabel();
        CampoComentarios = new javax.swing.JScrollPane();
        AreaTexto = new javax.swing.JTextArea();
        Enviar = new javax.swing.JButton();
        Experiencia = new javax.swing.JSpinner();
        Regresar = new javax.swing.JButton();

        Titulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Titulo.setText("Buscador de Chambeador");

        CamposDeTrabajo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tecnologías de la información",
            "Mercadotecnía",
            "Industria",
            "Administración de empresas" }));

CampoTrabajo.setText("Campo:");

Rango.setText("Rango de saldo que la empresa/persona física está dispuesto a ofrecerle:");

Instrucciones.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
Instrucciones.setText("Complete los siguientes campos para realizar su búsqueda");

Minimo.setModel(new javax.swing.SpinnerNumberModel(0.0f, 0.0f, null, 1.0f));

TMinimo.setText("Mínimo:");

TMaximo.setText("Máximo:");

Maximo.setModel(new javax.swing.SpinnerNumberModel(0.0f, 0.0f, null, 1.0f));

Prestaciones.setText("Sí");

TPrestaciones.setText("¿Ofrece prestaciones?");

TTiempoCompleto.setText("¿Lo requiere por tiempo completo?");

TiempoCompleto.setText("Sí");

ExperienciaTitulo.setText("Mínimo de años de experiencia solicitado:");

TExperiencia.setText("Años");

Comentarios.setText("Comentarios Adicionales:");

AreaTexto.setColumns(20);
AreaTexto.setRows(5);
CampoComentarios.setViewportView(AreaTexto);

Enviar.setText("Subir solicitud");
Enviar.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        EnviarActionPerformed(evt);
    }
    });

    Experiencia.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

    Regresar.setText("Regresar");
    Regresar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            RegresarActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(CampoComentarios, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                    .addGap(302, 302, 302))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Instrucciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CamposDeTrabajo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Prestaciones)
                                    .addComponent(Titulo)
                                    .addComponent(CampoTrabajo)
                                    .addComponent(Rango)
                                    .addComponent(TPrestaciones)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(TMaximo)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Maximo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(TMinimo)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Minimo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(4, 4, 4)))
                        .addComponent(Comentarios)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(93, 93, 93)
                            .addComponent(Regresar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Enviar))
                        .addComponent(TiempoCompleto)
                        .addComponent(TTiempoCompleto)
                        .addComponent(ExperienciaTitulo)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(TExperiencia)
                            .addGap(33, 33, 33)
                            .addComponent(Experiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(Enviar)
                .addComponent(Regresar))
            .addContainerGap())
    );
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Valida los datos ingresados por el usuario
     * @param evt 
     */
    private void EnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarActionPerformed
        validarFormulario();
    }//GEN-LAST:event_EnviarActionPerformed
    /**
     * Regresa a la ventana anterior
     * @param evt 
     */
    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        Utilerias.cambiaComponentePadre(this);
    }//GEN-LAST:event_RegresarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaTexto;
    private javax.swing.JScrollPane CampoComentarios;
    private javax.swing.JLabel CampoTrabajo;
    private javax.swing.JComboBox<String> CamposDeTrabajo;
    private javax.swing.JLabel Comentarios;
    private javax.swing.JButton Enviar;
    private javax.swing.JSpinner Experiencia;
    private javax.swing.JLabel ExperienciaTitulo;
    private javax.swing.JLabel Instrucciones;
    private javax.swing.JSpinner Maximo;
    private javax.swing.JSpinner Minimo;
    private javax.swing.JCheckBox Prestaciones;
    private javax.swing.JLabel Rango;
    private javax.swing.JButton Regresar;
    private javax.swing.JLabel TExperiencia;
    private javax.swing.JLabel TMaximo;
    private javax.swing.JLabel TMinimo;
    private javax.swing.JLabel TPrestaciones;
    private javax.swing.JLabel TTiempoCompleto;
    private javax.swing.JCheckBox TiempoCompleto;
    private javax.swing.JLabel Titulo;
    // End of variables declaration//GEN-END:variables
}
