package paneles;
import javax.swing.JOptionPane;

/**
 * Clase que se encarga de registrar usuarios
 */
public class RegistrarUsuario extends ContenidoPanel {
    private String nombre;
    private char password[], temporal[];
    private String pregunta;
    private String respuesta;
    private String tipoUsuario;
    
    /**
     * Constructor que inicializa a la interfaz RegistrarUsuario
     * @param ventana
     */
    public RegistrarUsuario(ContenidoJFrame ventana) {
        super(ventana);
        initComponents();
    }
    
    /**
     * Método que se encarga de validar los datos del formulario
     * @param ventana
     */
    private void validaFormulario() {
        nombre = Nombre.getText();
        password = Password.getPassword();
        temporal = RPassword.getPassword();
        pregunta = (String) Preguntas.getSelectedItem();
        respuesta = Respuesta.getText();
        tipoUsuario = (String) TipoUsuario.getSelectedItem();
        if(nombre.equals("") || respuesta.equals("") || password.length == 0 || password.length == 0){
            JOptionPane.showMessageDialog(null, "Ingrese El Campo Faltante", "Error", JOptionPane.WARNING_MESSAGE);        
            Password.setText("");
            RPassword.setText("");
        }
        else{
            if(!Utilerias.comparaPassword(password, temporal)){
                JOptionPane.showMessageDialog(null, "Las Contraseñas No Coinciden", "Error", JOptionPane.WARNING_MESSAGE);        
                Password.setText("");
                RPassword.setText("");
            }
            else{
                Archivo nuevo = new Archivo(nombre);
                if(nuevo.existe()){
                    JOptionPane.showMessageDialog(null, "El Nombre De Usuario Ya Existe", "Error", JOptionPane.WARNING_MESSAGE);        
                    Nombre.setText("");
                }
                else{
                    nuevo = new Archivo(new Usuario(nombre, password, pregunta, respuesta, tipoUsuario));
                    nuevo.escribeArchivo();
                    JOptionPane.showMessageDialog(null, "Usuario Creado Correctamente", "", JOptionPane.INFORMATION_MESSAGE);
                    Utilerias.cambiaComponentePadre(this);
                }
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
        Instrucciones = new javax.swing.JLabel();
        TNombre = new javax.swing.JLabel();
        Enviar = new javax.swing.JButton();
        Nombre = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        TPassword = new javax.swing.JLabel();
        TRPassword = new javax.swing.JLabel();
        RPassword = new javax.swing.JPasswordField();
        TPreguntas = new javax.swing.JLabel();
        Preguntas = new javax.swing.JComboBox<>();
        TRespuesta = new javax.swing.JLabel();
        Respuesta = new javax.swing.JTextField();
        TipoUsuario = new javax.swing.JComboBox<>();
        TTipoUsuario = new javax.swing.JLabel();
        Cancelar = new javax.swing.JButton();

        Titulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Registro");

        Instrucciones.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        Instrucciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Instrucciones.setText("Complete los siguientes campos para realizar su registro");

        TNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TNombre.setText("Nombre");

        Enviar.setText("Aceptar");
        Enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarActionPerformed(evt);
            }
        });

        Nombre.setMinimumSize(new java.awt.Dimension(200, 20));
        Nombre.setPreferredSize(new java.awt.Dimension(200, 20));

        TPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TPassword.setText("Password");

        TRPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TRPassword.setText("Repetir Password");

        TPreguntas.setText("Pregunta De Seguridad");

        Preguntas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre De Tu Primer Mascota", "Lugar De Nacimiento De Tu Madre", "Cancion Favorita", "Nombre De Tu Abuela/o" }));

        TRespuesta.setText("Respuesta");

        TipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Empleado", "Empleador" }));

        TTipoUsuario.setText("Tipo De Usuario");

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Enviar)
                        .addGap(68, 68, 68)
                        .addComponent(Cancelar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Password, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                        .addComponent(TPassword)
                        .addComponent(RPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                        .addComponent(TRPassword)
                        .addComponent(Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Respuesta)
                    .addComponent(TipoUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TTipoUsuario)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TPreguntas)
                            .addComponent(Preguntas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TRespuesta))))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Instrucciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(TNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addGap(415, 415, 415))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(TPreguntas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Preguntas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TPassword)
                    .addComponent(TRespuesta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(Respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TRPassword)
                    .addComponent(TTipoUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RPassword)
                    .addComponent(TipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Enviar)
                    .addComponent(Cancelar))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Titulo)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Instrucciones)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(TNombre)
                    .addContainerGap(169, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Método encargado de ejecutar la acción posterior al oprimir el botón enviar
     * @param evt 
     */
    private void EnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarActionPerformed
        validaFormulario();
    }//GEN-LAST:event_EnviarActionPerformed
    /**
     * Método encargado de ejecutar la acción posterior al oprimir el botón cancelar
     * @param evt 
     */
    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        Utilerias.cambiaComponentePadre(this);
    }//GEN-LAST:event_CancelarActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Enviar;
    private javax.swing.JLabel Instrucciones;
    private javax.swing.JTextField Nombre;
    private javax.swing.JPasswordField Password;
    private javax.swing.JComboBox<String> Preguntas;
    private javax.swing.JPasswordField RPassword;
    private javax.swing.JTextField Respuesta;
    private javax.swing.JLabel TNombre;
    private javax.swing.JLabel TPassword;
    private javax.swing.JLabel TPreguntas;
    private javax.swing.JLabel TRPassword;
    private javax.swing.JLabel TRespuesta;
    private javax.swing.JLabel TTipoUsuario;
    private javax.swing.JComboBox<String> TipoUsuario;
    private javax.swing.JLabel Titulo;
    // End of variables declaration//GEN-END:variables
}
