package hospitalmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Patient extends javax.swing.JFrame {

    public Patient() {
        initComponents();
        selectional();
    }
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement pr;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        patid = new javax.swing.JTextField();
        patname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnadd = new hospitalmanagement.BtnAnimation();
        btnupdate = new hospitalmanagement.BtnAnimation();
        btndel = new hospitalmanagement.BtnAnimation();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        pattable = new javax.swing.JTable();
        btnAnimation5 = new hospitalmanagement.BtnAnimation();
        patpath = new javax.swing.JTextField();
        btnclear = new hospitalmanagement.BtnAnimation();
        jLabel5 = new javax.swing.JLabel();
        patph = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        patage = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        patadd = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        patgen = new javax.swing.JComboBox<>();
        patblood = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        btnAnimation1 = new hospitalmanagement.BtnAnimation();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Patient");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel14.setFont(new java.awt.Font("Algerian", 1, 45)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("HOSPITAL");
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(548, 548, 548))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Blood_Group");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 60, -1, 36));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Patient Information");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 0, 246, -1));

        jLabel3.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ID");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, 39));

        patid.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        patid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patidActionPerformed(evt);
            }
        });
        jPanel2.add(patid, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 210, 38));

        patname.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        patname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patnameActionPerformed(evt);
            }
        });
        jPanel2.add(patname, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 210, 38));

        jLabel4.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Name");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, 38));

        btnadd.setForeground(new java.awt.Color(255, 255, 255));
        btnadd.setText("ADD");
        btnadd.setFont(new java.awt.Font("Gabriola", 1, 35)); // NOI18N
        btnadd.setRadius(15);
        btnadd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnaddMouseClicked(evt);
            }
        });
        jPanel2.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 290, 148, 47));

        btnupdate.setForeground(new java.awt.Color(255, 255, 255));
        btnupdate.setText("UPDATE");
        btnupdate.setFont(new java.awt.Font("Gabriola", 1, 35)); // NOI18N
        btnupdate.setRadius(15);
        btnupdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnupdateMouseClicked(evt);
            }
        });
        jPanel2.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 290, 148, 47));

        btndel.setForeground(new java.awt.Color(255, 255, 255));
        btndel.setText("DELETE");
        btndel.setFont(new java.awt.Font("Gabriola", 1, 35)); // NOI18N
        btndel.setRadius(15);
        btndel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btndelMouseClicked(evt);
            }
        });
        jPanel2.add(btndel, new org.netbeans.lib.awtextra.AbsoluteConstraints(751, 290, 148, 47));

        jLabel6.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Pathologies");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 120, -1, 40));

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Patient List");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(557, 557, 557)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(567, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, -1, -1));

        pattable.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        pattable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Address", "Phone", "Age", "Gender", "Blood_Group", "Pathologies"
            }
        ));
        pattable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pattableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(pattable);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 1370, 140));

        btnAnimation5.setText("<");
        btnAnimation5.setToolTipText("Back");
        btnAnimation5.setColor1("#FF0099");
        btnAnimation5.setFont(new java.awt.Font("Sitka Heading", 1, 22)); // NOI18N
        btnAnimation5.setRadius(200);
        btnAnimation5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnimation5ActionPerformed(evt);
            }
        });
        jPanel2.add(btnAnimation5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, -1, 45));

        patpath.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        jPanel2.add(patpath, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 120, 200, 41));

        btnclear.setForeground(new java.awt.Color(255, 255, 255));
        btnclear.setText("CLEAR");
        btnclear.setFont(new java.awt.Font("Gabriola", 1, 35)); // NOI18N
        btnclear.setRadius(15);
        btnclear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnclearMouseClicked(evt);
            }
        });
        jPanel2.add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(947, 290, 148, 47));

        jLabel5.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Phone");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 69, 39));

        patph.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        patph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patphActionPerformed(evt);
            }
        });
        jPanel2.add(patph, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, 220, 38));

        jLabel7.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Age");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, -1, 39));

        patage.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        jPanel2.add(patage, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, 220, 38));

        jLabel11.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Address");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 100, 39));

        patadd.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        patadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pataddActionPerformed(evt);
            }
        });
        jPanel2.add(patadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 210, 38));

        jLabel12.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Gender");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, -1, 38));

        patgen.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        patgen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel2.add(patgen, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, 220, 38));

        patblood.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        patblood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "O+", "B+", "AB+", "A-", "O-", "B-", "AB-" }));
        patblood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patbloodActionPerformed(evt);
            }
        });
        jPanel2.add(patblood, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 60, 200, 37));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\ELCOT\\Desktop\\java\\note.png")); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 260, 280));

        btnAnimation1.setColor1("#ffffff");
        btnAnimation1.setColor2("#ec38bc");
        jPanel2.add(btnAnimation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -7, 1370, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void selectional() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "kokila", "kokilabca");
            st = con.createStatement();
            String qry = "Select * from patients;";
            pr = con.prepareStatement(qry);
            rs = pr.executeQuery(qry);
            DefaultTableModel tb = (DefaultTableModel) pattable.getModel();
            while (rs.next()) {
                tb.addRow(new String[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)});
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    private void patnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patnameActionPerformed

    private void btnAnimation5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnimation5ActionPerformed
        this.setVisible(false);
        new HomePage().setVisible(true);
    }//GEN-LAST:event_btnAnimation5ActionPerformed

    private void pataddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pataddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pataddActionPerformed

    private void patphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patphActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patphActionPerformed

    private void patidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patidActionPerformed

    private void patbloodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patbloodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patbloodActionPerformed

    private void btnclearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnclearMouseClicked
        patid.setText("");
        patname.setText("");
        patadd.setText("");
        patph.setText("");
        patage.setText("");
        patpath.setText("");

    }//GEN-LAST:event_btnclearMouseClicked

    private void btnaddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnaddMouseClicked
        String id = patid.getText();
        String name = patname.getText();
        String address = patadd.getText();
        String phone = patph.getText();
        String age = patage.getText();
        Object gender = patgen.getSelectedItem();
        Object blood = patblood.getSelectedItem();
        String path = patpath.getText();
        if(patid.getText().isEmpty()||patname.getText().isEmpty()||patadd.getText().isEmpty()||patph.getText().isEmpty()||patage.getText().isEmpty()||patpath.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Missing Information");
        }
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "kokila", "kokilabca");
            String qry = "insert into patients values (?,?,?,?,?,?,?,?);";
            pr = con.prepareStatement(qry);
            pr.setString(1, id);
            pr.setString(2, name);
            pr.setString(3, address);
            pr.setString(4, phone);
            pr.setString(5, age);
            pr.setString(6, (String) gender);
            pr.setString(7, (String) blood);
            pr.setString(8, path);
            pr.execute();

            JOptionPane.showMessageDialog(this, "Doctor Added Successfully");
            con.close();
            selectional();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnaddMouseClicked

    private void btndelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndelMouseClicked
        if (patid.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Deleted");
        } else {
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "kokila", "kokilabca");
                String id = patid.getText();
                String qry = "delete from patients where patient_id=" + id;
                Statement del = con.createStatement();
                del.executeUpdate(qry);
                selectional();
                JOptionPane.showMessageDialog(this, "Deleted");

            } catch (SQLException ex) {
                System.out.println(ex);
            }

        }
    }//GEN-LAST:event_btndelMouseClicked

    private void pattableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pattableMouseClicked
        DefaultTableModel model = (DefaultTableModel) pattable.getModel();
        int index = pattable.getSelectedRow();
        patid.setText(model.getValueAt(index, 0).toString());
        patname.setText(model.getValueAt(index, 1).toString());
        patadd.setText(model.getValueAt(index, 2).toString());
        patph.setText(model.getValueAt(index, 3).toString());
        patage.setText(model.getValueAt(index, 4).toString());
        patgen.setSelectedItem(model.getValueAt(index, 5).toString());
        patblood.setSelectedItem(model.getValueAt(index, 6).toString());
        patpath.setText(model.getValueAt(index, 7).toString());

    }//GEN-LAST:event_pattableMouseClicked

    private void btnupdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnupdateMouseClicked
       if(patid.getText().isEmpty()||patname.getText().isEmpty()||patadd.getText().isEmpty()||patph.getText().isEmpty()||patage.getText().isEmpty()||patpath.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Missing Information");
        }
        else{
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "kokila", "kokilabca");
                String qry="update patients set patient_name='"+patname.getText()+"'"+",address='"+patadd.getText()+"'"+",contact_no='"+patph.getText()+"'"+" ,age='"+patage.getText()+"'"+",gender='"+patgen.getSelectedItem()+"'"+",blood_group='"+patblood.getSelectedItem()+"'"+",Pathologies='"+patpath.getText()+"'"+" where patient_id="+patid.getText();
                Statement add=con.createStatement();
                add.executeUpdate(qry);
                JOptionPane.showMessageDialog(this, "Patient Updated Successfully");
                selectional();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_btnupdateMouseClicked

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
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private hospitalmanagement.BtnAnimation btnAnimation1;
    private hospitalmanagement.BtnAnimation btnAnimation5;
    private hospitalmanagement.BtnAnimation btnadd;
    private hospitalmanagement.BtnAnimation btnclear;
    private hospitalmanagement.BtnAnimation btndel;
    private hospitalmanagement.BtnAnimation btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField patadd;
    private javax.swing.JTextField patage;
    private javax.swing.JComboBox<String> patblood;
    private javax.swing.JComboBox<String> patgen;
    private javax.swing.JTextField patid;
    private javax.swing.JTextField patname;
    private javax.swing.JTextField patpath;
    private javax.swing.JTextField patph;
    private javax.swing.JTable pattable;
    // End of variables declaration//GEN-END:variables
}
