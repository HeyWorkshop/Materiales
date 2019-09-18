package View;

import javax.swing.JFrame;

/**
 * @author Reynaldo
 */
public class WelcomeForm extends javax.swing.JFrame {
    /**
     * Crea nuevo Formulario Welcome
     */
    public WelcomeForm() {
        initComponents();
        Form.initForm(this);
    }
    
    public void showUserInfo(String[] userInfo) { //Desplegar la informacion del Usuario
        this.jLabelNameFN.setText(userInfo[0]);         //Nombre
        this.jLabelNameLN.setText(userInfo[1]);         //Apellido
        this.jLabelNameUN.setText(userInfo[2]);         //Nombre de Usuario
        this.jLabelNamePswd.setText(userInfo[3]);       //Contraseña
        this.jLabelNameBDate.setText(userInfo[4]);      //Fecha de Nacimiento
        this.jLabelNameAddress.setText(userInfo[5]);    //Domicilio
    }

    /**
     * Este método se llama desde el constructor para inicializar el formulario.
     * ADVERTENCIA: NO modifique este código. El contenido de este método siempre es
     * regenerada por el editor de formularios.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabelClose1 = new javax.swing.JLabel();
        jLabelWelcome = new javax.swing.JLabel();
        jLabelMin1 = new javax.swing.JLabel();
        jLabelBack1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelNameFN = new javax.swing.JLabel();
        jLabelNameLN = new javax.swing.JLabel();
        jLabelNameUN = new javax.swing.JLabel();
        jLabelNamePswd = new javax.swing.JLabel();
        jLabelNameBDate = new javax.swing.JLabel();
        jLabelNameAddress = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(248, 148, 6));

        jLabelClose1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelClose1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose1.setText("X");
        jLabelClose1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelClose1MouseClicked(evt);
            }
        });

        jLabelWelcome.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelWelcome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelWelcome.setText("Welcome!");

        jLabelMin1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelMin1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin1.setText("-");
        jLabelMin1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMin1MouseClicked(evt);
            }
        });

        jLabelBack1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelBack1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBack1.setText("←");
        jLabelBack1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelBack1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBack1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabelBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jLabelWelcome)
                .addGap(59, 59, 59)
                .addComponent(jLabelMin1)
                .addGap(18, 18, 18)
                .addComponent(jLabelClose1)
                .addGap(21, 21, 21))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMin1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabelClose1)
                    .addComponent(jLabelWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabelBack1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        jLabelNameFN.setFont(new java.awt.Font("Tekton Pro", 0, 24)); // NOI18N
        jLabelNameFN.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNameFN.setText("Nombre");

        jLabelNameLN.setFont(new java.awt.Font("Tekton Pro", 0, 24)); // NOI18N
        jLabelNameLN.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNameLN.setText("Apellido");

        jLabelNameUN.setFont(new java.awt.Font("Tekton Pro", 0, 24)); // NOI18N
        jLabelNameUN.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNameUN.setText("Usuario");

        jLabelNamePswd.setFont(new java.awt.Font("Tekton Pro", 0, 24)); // NOI18N
        jLabelNamePswd.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNamePswd.setText("Pswd");

        jLabelNameBDate.setFont(new java.awt.Font("Tekton Pro", 0, 24)); // NOI18N
        jLabelNameBDate.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNameBDate.setText("Fecha");

        jLabelNameAddress.setFont(new java.awt.Font("Tekton Pro", 0, 24)); // NOI18N
        jLabelNameAddress.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNameAddress.setText("Lugar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelNameFN)
                    .addComponent(jLabelNameLN)
                    .addComponent(jLabelNameUN)
                    .addComponent(jLabelNamePswd)
                    .addComponent(jLabelNameBDate)
                    .addComponent(jLabelNameAddress))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabelNameFN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNameLN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNameUN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNamePswd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNameBDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNameAddress)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelClose1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelClose1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelClose1MouseClicked

    private void jLabelMin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMin1MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMin1MouseClicked

    private void jLabelBack1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBack1MouseClicked
        LoginForm loginForm = new LoginForm();
        Form.setupForm(loginForm);
        this.dispose();
    }//GEN-LAST:event_jLabelBack1MouseClicked

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
            java.util.logging.Logger.getLogger(WelcomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Crear y visualizar el formulario */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelBack1;
    private javax.swing.JLabel jLabelClose1;
    private javax.swing.JLabel jLabelMin1;
    private javax.swing.JLabel jLabelNameAddress;
    private javax.swing.JLabel jLabelNameBDate;
    private javax.swing.JLabel jLabelNameFN;
    private javax.swing.JLabel jLabelNameLN;
    private javax.swing.JLabel jLabelNamePswd;
    private javax.swing.JLabel jLabelNameUN;
    private javax.swing.JLabel jLabelWelcome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}