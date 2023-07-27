
package hospitalmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Diagnosis extends javax.swing.JFrame {

    public Diagnosis() {
        initComponents();
        GetPatient();
        selectional();
    }
    Connection con = null;
    Statement st = null;
    ResultSet rs = null,rs1=null;
    
    PreparedStatement pr;
    private void selectional() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "kokila", "kokilabca");
            st = con.createStatement();
            String qry = "Select * from diagnosis;";
            pr = con.prepareStatement(qry);
            rs = pr.executeQuery(qry);
            DefaultTableModel tb = (DefaultTableModel) table.getModel();
            while (rs.next()) {
                tb.addRow(new String[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getString(6)});
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    private void GetPatient(){
        try{
          con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "kokila", "kokilabca");     
          st=con.createStatement();
          String qry="select*from patients";
          rs=st.executeQuery(qry);
          while(rs.next()){
              String mypatid=rs.getString("patient_id");
//              String mypat=rs.getString("patid");
              patid.addItem(mypatid);
          }
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    private void FetchName(){
        try{
          con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "kokila", "kokilabca");     
          st=con.createStatement();
          String qry="select * from patients where patient_id="+patid.getSelectedItem().toString()+"";
          rs1=st.executeQuery(qry);
          while(rs1.next()){
          String mypatname=rs1.getString("patient_name");
          patname.setText(mypatname);    
          }
          
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        med = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnadd = new hospitalmanagement.BtnAnimation();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnAnimation5 = new hospitalmanagement.BtnAnimation();
        print = new hospitalmanagement.BtnAnimation();
        jLabel5 = new javax.swing.JLabel();
        sym = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        dia = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        patname = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        patid = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        patsummary = new javax.swing.JTextArea();
        btnAnimation1 = new hospitalmanagement.BtnAnimation();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Diagnosis");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("HOSPITAL");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(560, 560, 560))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Diagnosis Information");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(539, 11, 275, -1));

        jLabel3.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ID");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 83, 40, 39));

        id.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        jPanel2.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 84, 210, 38));

        med.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        med.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medActionPerformed(evt);
            }
        });
        jPanel2.add(med, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 200, 210, 38));

        jLabel4.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Patient_ID");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 140, 130, 38));

        btnadd.setForeground(new java.awt.Color(255, 255, 255));
        btnadd.setText("ADD");
        btnadd.setFont(new java.awt.Font("Sitka Heading", 1, 22)); // NOI18N
        btnadd.setRadius(15);
        btnadd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnaddMouseClicked(evt);
            }
        });
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        jPanel2.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 148, 47));

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Diagnosis List");
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

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 379, -1, -1));

        table.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Patiend_id", "Patient_name", "symptoms", "diagnosis", "medicines"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 426, 1370, 100));

        btnAnimation5.setText("<");
        btnAnimation5.setColor1("#FF0099");
        btnAnimation5.setFont(new java.awt.Font("Sitka Heading", 1, 22)); // NOI18N
        btnAnimation5.setRadius(200);
        btnAnimation5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAnimation5MouseClicked(evt);
            }
        });
        btnAnimation5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnimation5ActionPerformed(evt);
            }
        });
        jPanel2.add(btnAnimation5, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 556, -1, 48));

        print.setForeground(new java.awt.Color(255, 255, 255));
        print.setText("PRINT");
        print.setFont(new java.awt.Font("Sitka Heading", 1, 22)); // NOI18N
        print.setRadius(15);
        print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printMouseClicked(evt);
            }
        });
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        jPanel2.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(1051, 291, 148, 47));

        jLabel5.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Symptoms");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 72, 116, 39));

        sym.setFont(new java.awt.Font("Sitka Heading", 1, 22)); // NOI18N
        sym.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                symActionPerformed(evt);
            }
        });
        jPanel2.add(sym, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 73, 210, 38));

        jLabel7.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Diagnosis");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 136, 116, 39));

        dia.setFont(new java.awt.Font("Sitka Heading", 1, 22)); // NOI18N
        jPanel2.add(dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 136, 210, 38));

        jLabel11.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Name");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 217, 70, -1));

        patname.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        patname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patnameActionPerformed(evt);
            }
        });
        jPanel2.add(patname, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 212, 210, 39));

        jLabel12.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Medicines");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 212, 116, 38));

        patid.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        patid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patidMouseClicked(evt);
            }
        });
        patid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patidActionPerformed(evt);
            }
        });
        jPanel2.add(patid, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 142, 210, 38));

        patsummary.setColumns(20);
        patsummary.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        patsummary.setRows(5);
        patsummary.setText("             Patient Summary");
        jScrollPane1.setViewportView(patsummary);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(892, 10, 456, 270));

        btnAnimation1.setColor1("#ffffff");
        btnAnimation1.setColor2("#ec38bc");
        jPanel2.add(btnAnimation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 610));

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
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void medActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medActionPerformed

    private void btnAnimation5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnimation5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAnimation5ActionPerformed

    private void patnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patnameActionPerformed

    private void symActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_symActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_symActionPerformed

    private void patidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patidActionPerformed
       FetchName();
       
    }//GEN-LAST:event_patidActionPerformed

    private void printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseClicked
        try{
            patsummary.print();
        }catch(Exception ex){
            System.out.println(ex);   
        }

    }//GEN-LAST:event_printMouseClicked

    private void patidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patidMouseClicked
        
    }//GEN-LAST:event_patidMouseClicked

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnaddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnaddMouseClicked
         String idl = id.getText();
        Object id2 = patid.getSelectedItem();
        String name = patname.getText();
        String symptoms = sym.getText();
        String diagnosis = dia.getText();
        String medicine = med.getText();
        if(id.getText().isEmpty()||patname.getText().isEmpty()||sym.getText().isEmpty()||dia.getText().isEmpty()||med.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Missing Information");
        }
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "kokila", "kokilabca");
            String qry = "insert into diagnosis values (?,?,?,?,?,?);";
            pr = con.prepareStatement(qry);
            pr.setString(1, idl);           
            pr.setString(2, (String)id2);
            pr.setString(3, name);
            pr.setString(4, symptoms);
            pr.setString(5, diagnosis);
            pr.setString(6, medicine);
            pr.execute();

            JOptionPane.showMessageDialog(this, "Dignosis Added Successfully");
            con.close();
            selectional();
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }//GEN-LAST:event_btnaddMouseClicked

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_printActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
         DefaultTableModel model = (DefaultTableModel) table.getModel();
        int index = table.getSelectedRow();
        String patname=model.getValueAt(index, 2).toString();
        String symptoms=model.getValueAt(index, 3).toString();
        String diagnosis=model.getValueAt(index,4).toString();
        String medicine=model.getValueAt(index,5).toString();
        patsummary.setText(patsummary.getText()+"\n\n"+"patient name "+patname+" "+"\n\nsymptoms"+symptoms+"\n\ndiagnosis"+diagnosis+"\n\nmedicines "+medicine+"\n\tCode Space Hosptial");
 
    }//GEN-LAST:event_tableMouseClicked

    private void btnAnimation5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnimation5MouseClicked
       new HomePage().setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnAnimation5MouseClicked

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
            java.util.logging.Logger.getLogger(Diagnosis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Diagnosis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Diagnosis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Diagnosis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Diagnosis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private hospitalmanagement.BtnAnimation btnAnimation1;
    private hospitalmanagement.BtnAnimation btnAnimation5;
    private hospitalmanagement.BtnAnimation btnadd;
    private javax.swing.JTextField dia;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField med;
    private javax.swing.JComboBox<String> patid;
    private javax.swing.JTextField patname;
    private javax.swing.JTextArea patsummary;
    private hospitalmanagement.BtnAnimation print;
    private javax.swing.JTextField sym;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
