package View;

import Controller.JDBC;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

/**
 * @author Reynaldo
 */
public class UpdateForm extends javax.swing.JFrame {

    /**
     * Crea nuevo formulario UpdateForm
     */
    public UpdateForm() {
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
        jLabelUpdate = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jLabelBack = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelOldUN = new javax.swing.JLabel();
        jLabelNewPswd = new javax.swing.JLabel();
        jTextFieldOldUN = new javax.swing.JTextField();
        jPasswordFieldNewPswd = new javax.swing.JPasswordField();
        jLabelFN = new javax.swing.JLabel();
        jTextFieldFN = new javax.swing.JTextField();
        jLabelLN = new javax.swing.JLabel();
        jTextFieldLN = new javax.swing.JTextField();
        jLabelNewPswd1 = new javax.swing.JLabel();
        jPasswordFieldNewPswd1 = new javax.swing.JPasswordField();
        jLabelBDate = new javax.swing.JLabel();
        jLabelAddress = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaAddress = new javax.swing.JTextArea();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        jLabelDatos = new javax.swing.JLabel();
        jButtonUpdate = new javax.swing.JButton();
        jLabelNewUN = new javax.swing.JLabel();
        jTextFieldNewUN = new javax.swing.JTextField();
        jLabelOldPswd = new javax.swing.JLabel();
        jPasswordFieldOldPswd = new javax.swing.JPasswordField();

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

        jLabelUpdate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelUpdate.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUpdate.setText("Actualizar Datos");

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
                .addGap(15, 15, 15)
                .addComponent(jLabelBack, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelUpdate)
                .addGap(91, 91, 91)
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
                    .addComponent(jLabelUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabelBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        jLabelOldUN.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelOldUN.setForeground(new java.awt.Color(236, 240, 241));
        jLabelOldUN.setText("Nombre de Usuario:");

        jLabelNewPswd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNewPswd.setForeground(new java.awt.Color(236, 240, 241));
        jLabelNewPswd.setText("Nueva Contraseña:");

        jTextFieldOldUN.setBackground(new java.awt.Color(108, 122, 137));
        jTextFieldOldUN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldOldUN.setForeground(new java.awt.Color(228, 241, 254));

        jPasswordFieldNewPswd.setBackground(new java.awt.Color(108, 122, 137));
        jPasswordFieldNewPswd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordFieldNewPswd.setForeground(new java.awt.Color(228, 241, 254));

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

        jLabelNewPswd1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNewPswd1.setForeground(new java.awt.Color(236, 240, 241));
        jLabelNewPswd1.setText("Reescribir Contraseña:");

        jPasswordFieldNewPswd1.setBackground(new java.awt.Color(108, 122, 137));
        jPasswordFieldNewPswd1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordFieldNewPswd1.setForeground(new java.awt.Color(228, 241, 254));

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

        jLabelDatos.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDatos.setText("Introduce Datos del Usuario que quieres actualizar.");

        jButtonUpdate.setBackground(new java.awt.Color(34, 167, 240));
        jButtonUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonUpdate.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUpdate.setText("Actualizar");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jLabelNewUN.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNewUN.setForeground(new java.awt.Color(236, 240, 241));
        jLabelNewUN.setText("Nuevo Nombre de Usuario:");

        jTextFieldNewUN.setBackground(new java.awt.Color(108, 122, 137));
        jTextFieldNewUN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldNewUN.setForeground(new java.awt.Color(228, 241, 254));

        jLabelOldPswd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelOldPswd.setForeground(new java.awt.Color(236, 240, 241));
        jLabelOldPswd.setText("Contraseña:");

        jPasswordFieldOldPswd.setBackground(new java.awt.Color(108, 122, 137));
        jPasswordFieldOldPswd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordFieldOldPswd.setForeground(new java.awt.Color(228, 241, 254));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelBDate)
                                .addGap(61, 61, 61)
                                .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelNewPswd1)
                            .addComponent(jLabelNewPswd)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabelOldPswd)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPasswordFieldOldPswd, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelLN, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelFN, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(137, 137, 137)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldLN, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldFN, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPasswordFieldNewPswd, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPasswordFieldNewPswd1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabelOldUN)
                                        .addGap(71, 71, 71)
                                        .addComponent(jTextFieldOldUN, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabelNewUN)
                                        .addGap(15, 15, 15)
                                        .addComponent(jTextFieldNewUN, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabelAddress)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabelDatos)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabelDatos)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelOldUN)
                    .addComponent(jTextFieldOldUN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordFieldOldPswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOldPswd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNewUN)
                    .addComponent(jTextFieldNewUN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelFN)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelLN)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelNewPswd)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelNewPswd1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldFN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldLN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPasswordFieldNewPswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPasswordFieldNewPswd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelBDate)
                    .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelAddress)
                        .addGap(50, 50, 50))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        String msg = 
            JDBC.updateUser( //Validar datos para Actualizar el Usuario
                jTextFieldFN.getText(),    // Nombre
                jTextFieldLN.getText(),    // Apellido
                jTextFieldOldUN.getText(),    // Antiguo Nombre de Usuario
                jTextFieldNewUN.getText(),    // Nuevo Nombre de Usuario
                String.valueOf(jPasswordFieldOldPswd.getPassword()),  // Antigua Contraseña
                String.valueOf(jPasswordFieldNewPswd.getPassword()),  // Nueva Contraseña
                String.valueOf(jPasswordFieldNewPswd1.getPassword()), // Nueva Contraseña re-introducida
                jDateChooser.getDate(), // Fecha de Nacimiento
                jTextAreaAddress.getText() // Domicilio
            );
        
            if(msg.equals("Usuario Actualizado")) {
                JOptionPane.showMessageDialog(null, msg);

                MainMenu mainMenu = new MainMenu();
                Form.setupForm(mainMenu);
                this.dispose(); //Liberar memoria (Cerrar ventana)
            }
            else {
                JOptionPane.showMessageDialog(null, msg, "Update Failed", WARNING_MESSAGE);
            }
    }//GEN-LAST:event_jButtonUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Crear y visualizar el formulario */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonUpdate;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabelAddress;
    private javax.swing.JLabel jLabelBDate;
    private javax.swing.JLabel jLabelBack;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelDatos;
    private javax.swing.JLabel jLabelFN;
    private javax.swing.JLabel jLabelLN;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLabel jLabelNewPswd;
    private javax.swing.JLabel jLabelNewPswd1;
    private javax.swing.JLabel jLabelNewUN;
    private javax.swing.JLabel jLabelOldPswd;
    private javax.swing.JLabel jLabelOldUN;
    private javax.swing.JLabel jLabelUpdate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordFieldNewPswd;
    private javax.swing.JPasswordField jPasswordFieldNewPswd1;
    private javax.swing.JPasswordField jPasswordFieldOldPswd;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaAddress;
    private javax.swing.JTextField jTextFieldFN;
    private javax.swing.JTextField jTextFieldLN;
    private javax.swing.JTextField jTextFieldNewUN;
    private javax.swing.JTextField jTextFieldOldUN;
    // End of variables declaration//GEN-END:variables
}