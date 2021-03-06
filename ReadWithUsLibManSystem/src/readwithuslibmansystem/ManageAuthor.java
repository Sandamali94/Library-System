/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readwithuslibmansystem;

    import java.awt.event.KeyEvent;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.sql.Statement;
    import java.text.SimpleDateFormat;
    import javax.swing.JOptionPane;
    import javax.swing.table.DefaultTableModel;

/**
 *
 * @author abans tangalle
 */
public class ManageAuthor extends javax.swing.JFrame {

    String AuthID, AuthFName, AuthLName, AuthCategory;
    
    /**
     * Creates new form Author
     */
    public ManageAuthor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLManAut = new javax.swing.JLabel();
        jLAI = new javax.swing.JLabel();
        jLAuthfn = new javax.swing.JLabel();
        jLAuthln = new javax.swing.JLabel();
        jLAuthCat = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTAId = new javax.swing.JTextField();
        jTAufn = new javax.swing.JTextField();
        jTAutln = new javax.swing.JTextField();
        jTAuCat = new javax.swing.JTextField();
        jBBac = new javax.swing.JButton();
        jBSubm = new javax.swing.JButton();
        jBUpda = new javax.swing.JButton();
        jBClear = new javax.swing.JButton();
        jBDele1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manage Author");
        setAutoRequestFocus(false);

        jPanel2.setLayout(null);

        jLManAut.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLManAut.setText("MANAGE AUTHOR");
        jPanel2.add(jLManAut);
        jLManAut.setBounds(470, 40, 350, 50);

        jLAI.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLAI.setForeground(new java.awt.Color(51, 51, 51));
        jLAI.setText("Author ID               :");
        jPanel2.add(jLAI);
        jLAI.setBounds(70, 140, 240, 30);

        jLAuthfn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLAuthfn.setForeground(new java.awt.Color(51, 51, 51));
        jLAuthfn.setText("Author First Name :");
        jPanel2.add(jLAuthfn);
        jLAuthfn.setBounds(70, 230, 240, 30);

        jLAuthln.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLAuthln.setForeground(new java.awt.Color(51, 51, 51));
        jLAuthln.setText("Author Last Name :");
        jPanel2.add(jLAuthln);
        jLAuthln.setBounds(70, 310, 240, 30);

        jLAuthCat.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLAuthCat.setForeground(new java.awt.Color(51, 51, 51));
        jLAuthCat.setText("AuthCategory        :");
        jPanel2.add(jLAuthCat);
        jLAuthCat.setBounds(70, 390, 240, 30);

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Author ID", "Author First Name", "Author Last Name", "Author Category"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(770, 140, 560, 330);

        jTAId.setBackground(new java.awt.Color(255, 255, 204));
        jTAId.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTAId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTAIdKeyPressed(evt);
            }
        });
        jPanel2.add(jTAId);
        jTAId.setBounds(340, 140, 400, 32);

        jTAufn.setBackground(new java.awt.Color(255, 255, 204));
        jTAufn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTAufn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTAufnKeyPressed(evt);
            }
        });
        jPanel2.add(jTAufn);
        jTAufn.setBounds(340, 230, 400, 32);

        jTAutln.setBackground(new java.awt.Color(255, 255, 204));
        jTAutln.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTAutln.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTAutlnKeyPressed(evt);
            }
        });
        jPanel2.add(jTAutln);
        jTAutln.setBounds(340, 310, 400, 32);

        jTAuCat.setBackground(new java.awt.Color(255, 255, 204));
        jTAuCat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTAuCat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTAuCatKeyPressed(evt);
            }
        });
        jPanel2.add(jTAuCat);
        jTAuCat.setBounds(340, 390, 400, 32);

        jBBac.setBackground(new java.awt.Color(51, 51, 255));
        jBBac.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBBac.setText("BACK");
        jBBac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBacActionPerformed(evt);
            }
        });
        jPanel2.add(jBBac);
        jBBac.setBounds(1200, 510, 110, 40);

        jBSubm.setBackground(new java.awt.Color(51, 51, 255));
        jBSubm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBSubm.setText("SUBMIT");
        jBSubm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSubmActionPerformed(evt);
            }
        });
        jPanel2.add(jBSubm);
        jBSubm.setBounds(60, 520, 110, 40);

        jBUpda.setBackground(new java.awt.Color(51, 51, 255));
        jBUpda.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBUpda.setText("UPDATE");
        jBUpda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBUpdaActionPerformed(evt);
            }
        });
        jPanel2.add(jBUpda);
        jBUpda.setBounds(250, 520, 110, 40);

        jBClear.setBackground(new java.awt.Color(51, 51, 255));
        jBClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBClear.setText("CLEAR");
        jBClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBClearActionPerformed(evt);
            }
        });
        jPanel2.add(jBClear);
        jBClear.setBounds(630, 520, 110, 40);

        jBDele1.setBackground(new java.awt.Color(51, 51, 255));
        jBDele1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBDele1.setText("DELETE");
        jBDele1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDele1ActionPerformed(evt);
            }
        });
        jPanel2.add(jBDele1);
        jBDele1.setBounds(440, 520, 110, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LMSImages/backround6.jpg"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 1500, 680);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBBacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBacActionPerformed
        LibrarianPanel lp = new LibrarianPanel();
        lp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBBacActionPerformed

    private void jBSubmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSubmActionPerformed
       if(this.jTAId.getText().isEmpty()==true){
    
        JOptionPane.showMessageDialog(null, "Please Insert Author ID", "Warning", JOptionPane.WARNING_MESSAGE);
    
       }else if(this.jTAufn.getText().isEmpty()==true){
    
        JOptionPane.showMessageDialog(null, "Please Insert Author First Name", "Warning", JOptionPane.WARNING_MESSAGE);
           
       }else if(this.jTAutln.getText().isEmpty()==true){
    
        JOptionPane.showMessageDialog(null, "Please Insert Author Last Name", "Warning", JOptionPane.WARNING_MESSAGE);
    
       }else if(this.jTAuCat.getText().isEmpty()==true){
    
        JOptionPane.showMessageDialog(null, "Please Insert Category", "Warning", JOptionPane.WARNING_MESSAGE);
            
       }else{
       
           AuthID = this.jTAId.getText();
           AuthFName = this.jTAufn.getText();
           AuthLName = this.jTAutln.getText();
           AuthCategory = this.jTAuCat.getText();
           
           DBConnection.DBConnection();
           
           try{
           
               Statement s = DBConnection.con.createStatement();
               s.executeUpdate("INSERT INTO author VALUES('"+AuthID+"','"+AuthFName+"','"+AuthLName+"','"+AuthCategory+"')");
               
               JOptionPane.showMessageDialog(null, "Author Added Successfully", "Successful", JOptionPane.INFORMATION_MESSAGE);
               
               LoadTable ();
               ClearData();
               DBConnection.con.close();
               
           }catch(SQLException ex){
           
               JOptionPane.showMessageDialog(null, ex.getMessage());
               
           }       
       }
    }//GEN-LAST:event_jBSubmActionPerformed

    private void jBDele1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDele1ActionPerformed
        
        AuthID = this.jTAId.getText();
       
        DBConnection.DBConnection();
        
        try{
            
            Statement st = DBConnection.con.createStatement();
            st.executeUpdate("DELETE FROM `author` WHERE `AuthID`= '"+AuthID+"'");
            
            JOptionPane.showMessageDialog(null, "Author Deleted Successfully", "Successful", JOptionPane.INFORMATION_MESSAGE);
            
            LoadTable ();
            ClearData();
            DBConnection.con.close();
            
        }catch(SQLException ex){
            
            JOptionPane.showMessageDialog(null, ex.getMessage());
            
        }
        
    }//GEN-LAST:event_jBDele1ActionPerformed

    private void jTAIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTAIdKeyPressed
        
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            
            this.jTAufn.grabFocus();
        
            AuthID = this.jTAId.getText();
            
            String Query = "SELECT * FROM author  WHERE author.AuthID = '"+AuthID+"'";
            
            DBConnection.DBConnection();
            
                try {
                    
                    Statement s = DBConnection.con.createStatement();
                    ResultSet rs = s.executeQuery(Query);
                    while(rs.next()){
                        this.jTAufn.setText(rs.getString("AuthFName"));
                        this.jTAutln.setText(rs.getString("AuthLName"));
                        this.jTAuCat.setText(rs.getString("AuthCategory"));
                            
                    }
                              
                } catch (Exception ex) {
                    
                     JOptionPane.showMessageDialog(null, ex.getMessage());
                    
                }        
        }
    }//GEN-LAST:event_jTAIdKeyPressed

    private void jBUpdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUpdaActionPerformed
           
           AuthID = this.jTAId.getText();
           AuthFName = this.jTAufn.getText();
           AuthLName = this.jTAutln.getText();
           AuthCategory = this.jTAuCat.getText();
           
           try {
               
               Statement s = DBConnection.con.createStatement();
               s.executeUpdate("UPDATE `author` SET `AuthFName`='"+AuthFName+"', `AuthLName`='"+AuthLName+"', `AuthCategory`='"+AuthCategory+"' WHERE `AuthID`= '"+AuthID+"'");
               
               
               JOptionPane.showMessageDialog(null, "Author Updated Successfully", "Successful", JOptionPane.INFORMATION_MESSAGE);
               
               LoadTable ();
               ClearData();
               
               DBConnection.con.close();
               
           } catch (SQLException ex) {
               
               JOptionPane.showMessageDialog(null, ex.getMessage());
               
        }
    }//GEN-LAST:event_jBUpdaActionPerformed

    private void jBClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBClearActionPerformed
        ClearData();
    }//GEN-LAST:event_jBClearActionPerformed

    private void jTAufnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTAufnKeyPressed
        
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            
            this.jTAutln.grabFocus();
        }
    }//GEN-LAST:event_jTAufnKeyPressed

    private void jTAutlnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTAutlnKeyPressed
        
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            
            this.jTAuCat.grabFocus();
        }
    }//GEN-LAST:event_jTAutlnKeyPressed

    private void jTAuCatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTAuCatKeyPressed
  
    }//GEN-LAST:event_jTAuCatKeyPressed

    void ClearData(){
    
         this.jTAId.setText("");
         this.jTAufn.setText("");
         this.jTAutln.setText("");
         this.jTAuCat.setText("");
         
    }
    void LoadTable (){
        
         DefaultTableModel dtm = new DefaultTableModel();
         
            dtm.addColumn("AuthID");
            dtm.addColumn("AuthFName");
            dtm.addColumn("AuthLName");
            dtm.addColumn("AuthCategory");
         
         String Query = "SELECT * FROM author ";
         
         DBConnection.DBConnection();
         
         try{
             Statement st = DBConnection.con.prepareStatement(Query);
             ResultSet rs = st.executeQuery(Query);
             while(rs.next()){
                 
                String AuthID = rs.getString("AuthID");
                String AuthFName = rs.getString("AuthFName");
                String AuthLName = rs.getString("AuthLName");
                String AuthCategory = rs.getString("AuthCategory");
 
                
                 dtm.addRow(new String[]{AuthID, AuthFName, AuthLName, AuthCategory});
             
         }
             
             this.jTable1.setModel(dtm);
             
             DBConnection.con.close();
             
         
         }catch(SQLException ex){
             
            JOptionPane.showMessageDialog(null, ex.getMessage());
            
        }
    }
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
            java.util.logging.Logger.getLogger(ManageAuthor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageAuthor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageAuthor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageAuthor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageAuthor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBac;
    private javax.swing.JButton jBClear;
    private javax.swing.JButton jBDele1;
    private javax.swing.JButton jBSubm;
    private javax.swing.JButton jBUpda;
    private javax.swing.JLabel jLAI;
    private javax.swing.JLabel jLAuthCat;
    private javax.swing.JLabel jLAuthfn;
    private javax.swing.JLabel jLAuthln;
    private javax.swing.JLabel jLManAut;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTAId;
    private javax.swing.JTextField jTAuCat;
    private javax.swing.JTextField jTAufn;
    private javax.swing.JTextField jTAutln;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
