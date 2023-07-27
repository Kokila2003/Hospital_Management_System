package hospitalmanagement;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Doctor extends javax.swing.JFrame {

    public Doctor() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        docid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        docname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        docexp = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        docpass = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        doctable = new javax.swing.JTable();
        Addbtn = new hospitalmanagement.BtnAnimation();
        updatebtn = new hospitalmanagement.BtnAnimation();
        btndelete = new hospitalmanagement.BtnAnimation();
        btnclear = new hospitalmanagement.BtnAnimation();
        jLabel7 = new javax.swing.JLabel();
        btnAnimation5 = new hospitalmanagement.BtnAnimation();
        jLabel5 = new javax.swing.JLabel();
        btnAnimation6 = new hospitalmanagement.BtnAnimation();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Doctor Information");

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Doctors");
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
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(560, 560, 560))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(557, 557, 557)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ID");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 70, 39));

        docid.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        jPanel2.add(docid, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 210, 38));

        jLabel4.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Name");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 80, 38));

        docname.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        docname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docnameActionPerformed(evt);
            }
        });
        jPanel2.add(docname, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 210, 38));

        jLabel6.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Experience");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, 134, 40));

        docexp.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        jPanel2.add(docexp, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 200, 200, 41));

        jLabel8.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Password");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 120, 134, 36));

        docpass.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        jPanel2.add(docpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 117, 200, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Doctor Information");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 246, -1));

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Doctor List");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel6.setBackground(new java.awt.Color(0, 51, 51));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Doctor List");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(557, 557, 557)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(567, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(557, 557, 557)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 383, 1370, 50));

        doctable.setBackground(new java.awt.Color(0, 51, 51));
        doctable.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        doctable.setForeground(new java.awt.Color(255, 255, 255));
        doctable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doctor_ID", "Doctor_Name", "Password", "Experience"
            }
        ));
        doctable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doctableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(doctable);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 430, 1370, 130));

        Addbtn.setForeground(new java.awt.Color(255, 255, 255));
        Addbtn.setText("ADD");
        Addbtn.setFont(new java.awt.Font("Gabriola", 1, 32)); // NOI18N
        Addbtn.setRadius(15);
        Addbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddbtnMouseClicked(evt);
            }
        });
        jPanel2.add(Addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 301, 148, 47));

        updatebtn.setForeground(new java.awt.Color(255, 255, 255));
        updatebtn.setText("UPDATE");
        updatebtn.setFont(new java.awt.Font("Gabriola", 1, 32)); // NOI18N
        updatebtn.setRadius(15);
        updatebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updatebtnMouseClicked(evt);
            }
        });
        jPanel2.add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 301, 148, 47));

        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setText("DELETE");
        btndelete.setFont(new java.awt.Font("Gabriola", 1, 32)); // NOI18N
        btndelete.setRadius(15);
        btndelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btndeleteMouseClicked(evt);
            }
        });
        jPanel2.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(739, 301, 148, 47));

        btnclear.setForeground(new java.awt.Color(255, 255, 255));
        btnclear.setText("CLEAR");
        btnclear.setFont(new java.awt.Font("Gabriola", 1, 32)); // NOI18N
        btnclear.setRadius(15);
        btnclear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnclearMouseClicked(evt);
            }
        });
        jPanel2.add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(935, 301, 148, 47));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\ELCOT\\Desktop\\java\\nurse.png")); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 30, 204, 312));

        btnAnimation5.setText("<");
        btnAnimation5.setToolTipText("Back\n");
        btnAnimation5.setColor1("#FF0099");
        btnAnimation5.setFont(new java.awt.Font("Sitka Heading", 1, 22)); // NOI18N
        btnAnimation5.setRadius(200);
        btnAnimation5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnimation5ActionPerformed(evt);
            }
        });
        jPanel2.add(btnAnimation5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 50, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\ELCOT\\Desktop\\java\\r.png")); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 220, 300));

        btnAnimation6.setBorder(null);
        btnAnimation6.setColor1("#ffffff");
        btnAnimation6.setColor2("#ec38bc");
        jPanel2.add(btnAnimation6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 1370, 650));

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Doctor List");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel5.setBackground(new java.awt.Color(0, 51, 51));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Doctor List");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(557, 557, 557)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(567, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(557, 557, 557)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 383, 1370, 50));

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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectional() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "kokila", "kokilabca");
            st = con.createStatement();
            String qry = "Select * from doctors;";
            pr = con.prepareStatement(qry);
            rs = pr.executeQuery(qry);
            DefaultTableModel tb = (DefaultTableModel) doctable.getModel();
            while (rs.next()) {
                tb.addRow(new String[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)});
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    private void docnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_docnameActionPerformed

    private void btnAnimation5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnimation5ActionPerformed
        this.setVisible(false);
        new HomePage().setVisible(true);
    }//GEN-LAST:event_btnAnimation5ActionPerformed

    private void AddbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddbtnMouseClicked
        String id = docid.getText();
        String name = docname.getText();
        String pass = docpass.getText();
        String exp = docexp.getText();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "kokila", "kokilabca");
            String qry = "insert into doctors values (?,?,?,?);";
            pr = con.prepareStatement(qry);
            pr.setString(1, id);
            pr.setString(2, name);
            pr.setString(3, pass);
            pr.setString(4, exp);
            pr.execute();

            JOptionPane.showMessageDialog(this, "Doctor Added Successfully");
            con.close();
//            selectional();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_AddbtnMouseClicked

    private void btnclearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnclearMouseClicked
        docid.setText("");
        docname.setText("");
        docpass.setText("");
        docexp.setText("");

    }//GEN-LAST:event_btnclearMouseClicked

    private void doctableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctableMouseClicked
        DefaultTableModel model = (DefaultTableModel) doctable.getModel();
        int index = doctable.getSelectedRow();
        docid.setText(model.getValueAt(index, 0).toString());
        docname.setText(model.getValueAt(index, 1).toString());
        docpass.setText(model.getValueAt(index, 2).toString());
        docexp.setText(model.getValueAt(index, 3).toString());
    }//GEN-LAST:event_doctableMouseClicked

    private void btndeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndeleteMouseClicked
        if (docid.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Deleted");
        } else {
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "kokila", "kokilabca");
                String id = docid.getText();
                String qry = "delete from doctors where doctor_id=" + id;
                Statement del= con.createStatement();
                del.executeUpdate(qry);
                selectional();
                JOptionPane.showMessageDialog(this, "Deleted");

            } catch (SQLException ex) {
                System.out.println(ex);
            }

        }
    }//GEN-LAST:event_btndeleteMouseClicked

    private void updatebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatebtnMouseClicked
        if(docid.getText().isEmpty()||docname.getText().isEmpty()||docpass.getText().isEmpty()||docexp.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Missing Information");
        }
        else{
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "kokila", "kokilabca");
                String qry="update doctors set doctor_name='"+docname.getText()+"'"+",experience='"+docexp.getText()+"'"+",doc_pass='"+docpass.getText()+"'"+" where doctor_id="+docid.getText();
                Statement add=con.createStatement();
                add.executeUpdate(qry);
                JOptionPane.showMessageDialog(this, "Doctor Updated Successfully");
                selectional();
            } catch (SQLException ex) {
                Logger.getLogger(Doctor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_updatebtnMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private hospitalmanagement.BtnAnimation Addbtn;
    private hospitalmanagement.BtnAnimation btnAnimation5;
    private hospitalmanagement.BtnAnimation btnAnimation6;
    private hospitalmanagement.BtnAnimation btnclear;
    private hospitalmanagement.BtnAnimation btndelete;
    private javax.swing.JTextField docexp;
    private javax.swing.JTextField docid;
    private javax.swing.JTextField docname;
    private javax.swing.JTextField docpass;
    private javax.swing.JTable doctable;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private hospitalmanagement.BtnAnimation updatebtn;
    // End of variables declaration//GEN-END:variables
}
