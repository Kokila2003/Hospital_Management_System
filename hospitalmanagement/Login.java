
package hospitalmanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        con=Db.mycon();
    }
    Statement sm;
    public Connection con;
    ResultSet rs;
    PreparedStatement pr;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jname = new javax.swing.JTextField();
        jpass = new javax.swing.JPasswordField();
        jlogin = new hospitalmanagement.BtnAnimation();
        jclear = new hospitalmanagement.BtnAnimation();
        jshow = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        btnAnimation1 = new hospitalmanagement.BtnAnimation();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HEALTH CARE");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\ELCOT\\Desktop\\java\\png.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 45)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("HOSPITAL");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 246, 41));

        jLabel3.setFont(new java.awt.Font("Gabriola", 1, 33)); // NOI18N
        jLabel3.setText("UserName");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 139, 48));

        jLabel4.setFont(new java.awt.Font("Gabriola", 1, 33)); // NOI18N
        jLabel4.setText("Password");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 138, 48));

        jname.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        jname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnameActionPerformed(evt);
            }
        });
        jPanel2.add(jname, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 303, 46));

        jpass.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        jPanel2.add(jpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 306, 45));

        jlogin.setForeground(new java.awt.Color(255, 255, 255));
        jlogin.setText("LOGIN");
        jlogin.setColor1("#ee0979");
        jlogin.setColor2("#ff6a00");
        jlogin.setFont(new java.awt.Font("Gabriola", 1, 35)); // NOI18N
        jlogin.setRadius(10);
        jlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jloginActionPerformed(evt);
            }
        });
        jPanel2.add(jlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 530, 130, 40));

        jclear.setForeground(new java.awt.Color(255, 255, 255));
        jclear.setText("CLEAR");
        jclear.setColor1("#ff6a00");
        jclear.setColor2("#ee0979");
        jclear.setFont(new java.awt.Font("Gabriola", 1, 35)); // NOI18N
        jclear.setRadius(10);
        jclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jclearActionPerformed(evt);
            }
        });
        jPanel2.add(jclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 530, 130, 40));

        jshow.setBackground(new java.awt.Color(255, 51, 204));
        jshow.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jshow.setText("Show Password");
        jshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jshowActionPerformed(evt);
            }
        });
        jPanel2.add(jshow, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, -1, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\ELCOT\\Desktop\\java\\heart.png")); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 240, 180));

        btnAnimation1.setColor1("#ffffff");
        btnAnimation1.setColor2("#ec38bc");
        jPanel2.add(btnAnimation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 630));

        jLabel7.setText("jLabel7");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 580, 80, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jnameActionPerformed

    private void jloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jloginActionPerformed
        String un = jname.getText();
        String ps = jpass.getText();

        try {
            String qry = "Select * from doctors where doctor_name=? and doc_pass=?;";
            pr = con.prepareStatement(qry);
            pr.setString(1, un);
            pr.setString(2, ps);
            rs = pr.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Login Successfully");
                new HomePage().setVisible(true);
                this.setVisible(false);
            }
            else if (jname.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please Fill Out UserName");
            } 
            else if (jpass.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please Fill Out Password");
            }
            else {
                JOptionPane.showMessageDialog(this, "Username or Password Wrong");
            }
        } catch (Exception e) {
             System.out.println(e);
        }
    }//GEN-LAST:event_jloginActionPerformed

    private void jshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jshowActionPerformed
        if (jshow.isSelected()) {
            jpass.setEchoChar((char) 0);
        } else {
            jpass.setEchoChar('*');

        }
    }//GEN-LAST:event_jshowActionPerformed

    private void jclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jclearActionPerformed
       jname.setText("");
       jpass.setText("");
    }//GEN-LAST:event_jclearActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private hospitalmanagement.BtnAnimation btnAnimation1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private hospitalmanagement.BtnAnimation jclear;
    private hospitalmanagement.BtnAnimation jlogin;
    private javax.swing.JTextField jname;
    private javax.swing.JPasswordField jpass;
    private javax.swing.JCheckBox jshow;
    // End of variables declaration//GEN-END:variables
}
