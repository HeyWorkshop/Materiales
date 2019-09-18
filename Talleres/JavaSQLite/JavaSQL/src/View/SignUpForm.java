package View;

import Controller.JDBC;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

/**
 * @author Reynaldo
 */
public class SignUpForm extends javax.swing.JFrame {
    
    /**
     * Crea nuevo formulario SignUpForm
     */
    public SignUpForm() {
        initComponents();
        Form.initForm(this);
    }

    /**
     * Este método se llama desde el constructor para inicializar el formulario.
     * ADVERTENCIA: NO modifique este código. El contenido de este método siempre es
     * regenerada por el editor de formularios.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelClose = new javax.swing.JLabel();
        jLabelCreate = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jLabelBack = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelUN = new javax.swing.JLabel();
        jLabelPswd = new javax.swing.JLabel();
        jTextFieldUN = new javax.swing.JTextField();
        jPasswordFieldPswd = new javax.swing.JPasswordField();
        jButtonSignUp = new javax.swing.JButton();
        jLabelFN = new javax.swing.JLabel();
        jTextFieldFN = new javax.swing.JTextField();
        jLabelLN = new javax.swing.JLabel();
        jTextFieldLN = new javax.swing.JTextField();
        jLabelPswd1 = new javax.swing.JLabel();
        jPasswordFieldPswd1 = new javax.swing.JPasswordField();
        jLabelBDate = new javax.swing.JLabel();
        jLabelAddress = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaAddress = new javax.swing.JTextArea();
        jDateChooser = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        jLabelClose.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        jLabelCreate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelCreate.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCreate.setText("Crear Usuario");

        jLabelMin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        jLabelBack.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelBack.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBack.setText("←");
        jLabelBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabelBack, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelCreate)
                .addGap(74, 74, 74)
                .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelClose)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMin, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabelClose)
                    .addComponent(jLabelCreate, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabelBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        jLabelUN.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelUN.setForeground(new java.awt.Color(236, 240, 241));
        jLabelUN.setText("Nombre de Usuario:");

        jLabelPswd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPswd.setForeground(new java.awt.Color(236, 240, 241));
        jLabelPswd.setText("Contraseña:");

        jTextFieldUN.setBackground(new java.awt.Color(108, 122, 137));
        jTextFieldUN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldUN.setForeground(new java.awt.Color(228, 241, 254));

        jPasswordFieldPswd.setBackground(new java.awt.Color(108, 122, 137));
        jPasswordFieldPswd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordFieldPswd.setForeground(new java.awt.Color(228, 241, 254));

        jButtonSignUp.setBackground(new java.awt.Color(34, 167, 240));
        jButtonSignUp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonSignUp.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSignUp.setText("Crear");
        jButtonSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSignUpActionPerformed(evt);
            }
        });

        jLabelFN.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelFN.setForeground(new java.awt.Color(236, 240, 241));
        jLabelFN.setText("Nombre:");

        jTextFieldFN.setBackground(new java.awt.Color(108, 122, 137));
        jTextFieldFN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldFN.setForeground(new java.awt.Color(228, 241, 254));

        jLabelLN.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelLN.setForeground(new java.awt.Color(236, 240, 241));
        jLabelLN.setText("Apellido:");

        jTextFieldLN.setBackground(new java.awt.Color(108, 122, 137));
        jTextFieldLN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldLN.setForeground(new java.awt.Color(228, 241, 254));

        jLabelPswd1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPswd1.setForeground(new java.awt.Color(236, 240, 241));
        jLabelPswd1.setText("Reescribir Contraseña:");

        jPasswordFieldPswd1.setBackground(new java.awt.Color(108, 122, 137));
        jPasswordFieldPswd1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordFieldPswd1.setForeground(new java.awt.Color(228, 241, 254));

        jLabelBDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelBDate.setForeground(new java.awt.Color(236, 240, 241));
        jLabelBDate.setText("Fecha de Nacimiento:");

        jLabelAddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelAddress.setForeground(new java.awt.Color(236, 240, 241));
        jLabelAddress.setText("Domicilio:");

        jTextAreaAddress.setBackground(new java.awt.Color(108, 122, 137));
        jTextAreaAddress.setColumns(20);
        jTextAreaAddress.setForeground(new java.awt.Color(228, 241, 254));
        jTextAreaAddress.setRows(5);
        jScrollPane1.setViewportView(jTextAreaAddress);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelBDate)
                        .addGap(53, 53, 53)
                        .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelPswd)
                                    .addComponent(jLabelUN)
                                    .addComponent(jLabelPswd1)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelLN, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelFN, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jPasswordFieldPswd, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPasswordFieldPswd1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jTextFieldLN, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldFN, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextFieldUN, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelAddress)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(29, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jButtonSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFN)
                    .addComponent(jTextFieldFN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLN)
                    .addComponent(jTextFieldLN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUN)
                    .addComponent(jTextFieldUN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordFieldPswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPswd))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPasswordFieldPswd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPswd1))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelBDate)
                    .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAddress)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jButtonSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
       System.exit(0); //Cerrar
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        this.setState(JFrame.ICONIFIED); //Minimizar
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jLabelBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBackMouseClicked
        MainMenu mainMenu = new MainMenu();
        Form.setupForm(mainMenu);
        this.dispose();
    }//GEN-LAST:event_jLabelBackMouseClicked

    private void jButtonSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSignUpActionPerformed
        String msg = 
            JDBC.newUser( //Verificar datos del Nuevo Usuario
                jTextFieldFN.getText(),    // Nombre
                jTextFieldLN.getText(),    // Apellido
                jTextFieldUN.getText(),    // Nombre de Usuario
                String.valueOf(jPasswordFieldPswd.getPassword()),  // Contraseña
                String.valueOf(jPasswordFieldPswd1.getPassword()), // Contraseña re-introducida
                jDateChooser.getDate(), // Fecha de Nacimiento
                jTextAreaAddress.getText() // Domicilio
            );
        
            if(msg.equals("Nuevo Usuario Añadido")) {
                JOptionPane.showMessageDialog(null, msg);

                LoginForm loginForm = new LoginForm();
                Form.setupForm(loginForm);
                this.dispose();
            }
            else {
                JOptionPane.showMessageDialog(null, msg, "SignUp Failed", WARNING_MESSAGE);
            }
    }//GEN-LAST:event_jButtonSignUpActionPerformed
        
    /**
     * @param args argumentos de linea de comandos
     */
    public static void main(String args[]) {
        /* Establecer como se ve y siente el Nimbus */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Crear y visualizar el formulario */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSignUp;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabelAddress;
    private javax.swing.JLabel jLabelBDate;
    private javax.swing.JLabel jLabelBack;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelCreate;
    private javax.swing.JLabel jLabelFN;
    private javax.swing.JLabel jLabelLN;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLabel jLabelPswd;
    private javax.swing.JLabel jLabelPswd1;
    private javax.swing.JLabel jLabelUN;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordFieldPswd;
    private javax.swing.JPasswordField jPasswordFieldPswd1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaAddress;
    private javax.swing.JTextField jTextFieldFN;
    private javax.swing.JTextField jTextFieldLN;
    private javax.swing.JTextField jTextFieldUN;
    // End of variables declaration//GEN-END:variables
}