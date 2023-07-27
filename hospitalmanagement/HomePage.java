
package hospitalmanagement;

public class HomePage extends javax.swing.JFrame {

    public HomePage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnAnimation4 = new hospitalmanagement.BtnAnimation();
        btnAnimation5 = new hospitalmanagement.BtnAnimation();
        btnAnimation2 = new hospitalmanagement.BtnAnimation();
        jLabel4 = new javax.swing.JLabel();
        btnAnimation1 = new hospitalmanagement.BtnAnimation();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HOSPITAL");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 20, 260, 41));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 70));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 704, -1, -1));

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ELCOT\\Desktop\\java\\hom.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 800, 530));

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("LOGOUT");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(558, 558, 558)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 1380, 40));

        btnAnimation4.setForeground(new java.awt.Color(255, 255, 255));
        btnAnimation4.setColor1("#24fe41");
        btnAnimation4.setColor2("#fdeff9");
        btnAnimation4.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        getContentPane().add(btnAnimation4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 70, 340, 40));

        btnAnimation5.setText("Patients");
        btnAnimation5.setColor1("#fdfc47");
        btnAnimation5.setColor2("#24fe41");
        btnAnimation5.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        btnAnimation5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnimation5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAnimation5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 350, 40));

        btnAnimation2.setText("Doctors");
        btnAnimation2.setColor1("#fdfc47");
        btnAnimation2.setColor2("#fdfc47");
        btnAnimation2.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        btnAnimation2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnimation2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAnimation2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 360, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\ELCOT\\Desktop\\java\\images (6).jpg")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1380, 560));

        btnAnimation1.setText("Diagnosis");
        btnAnimation1.setColor1("#24fe41");
        btnAnimation1.setColor2("#24fe41");
        btnAnimation1.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        btnAnimation1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnimation1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAnimation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 330, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnimation5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnimation5ActionPerformed
        new Patient().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAnimation5ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void btnAnimation2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnimation2ActionPerformed
        new Doctor().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAnimation2ActionPerformed

    private void btnAnimation1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnimation1ActionPerformed
        new Diagnosis().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAnimation1ActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private hospitalmanagement.BtnAnimation btnAnimation1;
    private hospitalmanagement.BtnAnimation btnAnimation2;
    private hospitalmanagement.BtnAnimation btnAnimation4;
    private hospitalmanagement.BtnAnimation btnAnimation5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
