/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readwithuslibmansystem;

import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author abans tangalle
 */
public class Login extends javax.swing.JFrame {  
    
    String uname, passw, Type;

    /**
     * Creates new form Login
     */
    public Login() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jMenu3 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnLog = new javax.swing.JButton();
        btnCanc = new javax.swing.JButton();
        txtUnam = new javax.swing.JTextField();
        pxtPass = new javax.swing.JPasswordField();
        checShow = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jRLibrarian = new javax.swing.JRadioButton();
        jRMember = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jexit = new javax.swing.JMenuItem();
        jMenuHelp = new javax.swing.JMenu();
        jMenuHelpContent = new javax.swing.JMenuItem();
        jMenuAbout = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(" Login");

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel1.setText(" Login");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(500, 40, 140, 70);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Username :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(310, 170, 130, 50);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Password :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(310, 260, 130, 30);

        btnLog.setBackground(new java.awt.Color(0, 153, 0));
        btnLog.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LMSImages/loginbutt.jpg"))); // NOI18N
        btnLog.setText("LOGIN");
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
            }
        });
        jPanel1.add(btnLog);
        btnLog.setBounds(310, 430, 150, 48);

        btnCanc.setBackground(new java.awt.Color(0, 153, 0));
        btnCanc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCanc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LMSImages/canclebutton.jpg"))); // NOI18N
        btnCanc.setText("CANCLE");
        btnCanc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancActionPerformed(evt);
            }
        });
        jPanel1.add(btnCanc);
        btnCanc.setBounds(660, 430, 160, 48);

        txtUnam.setBackground(new java.awt.Color(255, 255, 204));
        txtUnam.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtUnam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUnamKeyPressed(evt);
            }
        });
        jPanel1.add(txtUnam);
        txtUnam.setBounds(460, 180, 360, 35);

        pxtPass.setBackground(new java.awt.Color(255, 255, 204));
        pxtPass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pxtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pxtPassKeyPressed(evt);
            }
        });
        jPanel1.add(pxtPass);
        pxtPass.setBounds(460, 260, 360, 35);

        checShow.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        checShow.setText("Show Password");
        checShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checShowActionPerformed(evt);
            }
        });
        jPanel1.add(checShow);
        checShow.setBounds(850, 260, 140, 40);

        jLabel3.setBackground(new java.awt.Color(51, 0, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LMSImages/login-icon.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 20, 260, 260);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Type         :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(310, 340, 110, 30);

        jRLibrarian.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroup1.add(jRLibrarian);
        jRLibrarian.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRLibrarian.setText("Librarian");
        jPanel1.add(jRLibrarian);
        jRLibrarian.setBounds(460, 335, 110, 40);

        jRMember.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroup1.add(jRMember);
        jRMember.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRMember.setText("Member");
        jRMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRMemberActionPerformed(evt);
            }
        });
        jPanel1.add(jRMember);
        jRMember.setBounds(720, 340, 100, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LMSImages/backround6.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1100, 600);
        jLabel2.getAccessibleContext().setAccessibleDescription("");

        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jexit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jexit.setText("Exit");
        jexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jexitActionPerformed(evt);
            }
        });
        jMenu1.add(jexit);

        jMenuBar1.add(jMenu1);

        jMenuHelp.setText("Help");
        jMenuHelp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuHelpActionPerformed(evt);
            }
        });

        jMenuHelpContent.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuHelpContent.setText("Help Contents");
        jMenuHelpContent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuHelpContentActionPerformed(evt);
            }
        });
        jMenuHelp.add(jMenuHelpContent);

        jMenuAbout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuAbout.setText("About Us");
        jMenuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAboutActionPerformed(evt);
            }
        });
        jMenuHelp.add(jMenuAbout);

        jMenuBar1.add(jMenuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancActionPerformed
        Login l = new Login();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancActionPerformed

    private void checShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checShowActionPerformed
        if(this.checShow.isSelected()){
        
            this.pxtPass.setEchoChar((char)0);
               
        }else{
            
            this.pxtPass.setEchoChar('*');
        
        }
    }//GEN-LAST:event_checShowActionPerformed

    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogActionPerformed
    
    if(this.txtUnam.getText().isEmpty()==true){
    
      JOptionPane.showMessageDialog(null, "Username Can't Be Empty", "Warning", JOptionPane.WARNING_MESSAGE);
    
    }else if(this.pxtPass.getText().isEmpty()==true){
    
      JOptionPane.showMessageDialog(null, "Password Can't Be Empty", "Warning", JOptionPane.WARNING_MESSAGE);
        
    }else{
           
        uname = this.txtUnam.getText();
        passw = this.pxtPass.getText();
        
                    
    DBConnection.DBConnection();
            
        try {
                
          if(this.jRLibrarian.isSelected()==true){
              
            UserType.usertype = "Librarian";
            
            Statement s = DBConnection.con.createStatement();
            ResultSet rs = s.executeQuery("SELECT Uname, Pass FROM librarian WHERE Uname = '"+uname+"' and Pass = '"+passw+"'");
                       
                if(rs.next()){
                            
                    setVisible(false);
                    Loarding l = new Loarding();
                    l.setUploading();
                    l.setVisible(true);
                    
                    
                }else{
                    
                    JOptionPane.showMessageDialog(null, "Invalid Username Or Password", "Error", JOptionPane.ERROR_MESSAGE);
                
                }
          }else if(this.jRMember.isSelected()){
            
            UserType.usertype = "Member";
            
            Statement s = DBConnection.con.createStatement();
            ResultSet rs = s.executeQuery("SELECT MemID, Pass FROM member WHERE MemID = '"+uname+"' and Pass = '"+passw+"'");
                       
                if(rs.next()){                   
                                
                     setVisible(false);
                     Loading l = new Loading();
                     l.setUploading();
                     l.setVisible(true);
                    
                }else{
                    
                   JOptionPane.showMessageDialog(null, "Invalid Username Or Password", "Error", JOptionPane.ERROR_MESSAGE);
                }
                
                
          }else{
                    
                  JOptionPane.showMessageDialog(null, "Login Error!", "Error", JOptionPane.ERROR_MESSAGE);
                
                
          }
          
        } catch (Exception ex) {
                
                JOptionPane.showMessageDialog(null, ex.getMessage());
                
        }
                
        }    
    }//GEN-LAST:event_btnLogActionPerformed

    private void txtUnamKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnamKeyPressed
        
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            
            this.pxtPass.grabFocus();
            
        }
    }//GEN-LAST:event_txtUnamKeyPressed

    private void pxtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pxtPassKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_pxtPassKeyPressed

    private void jRMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRMemberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRMemberActionPerformed

    private void jexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jexitActionPerformed
        System.exit(0);
       
    }//GEN-LAST:event_jexitActionPerformed

    private void jMenuHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuHelpActionPerformed
       
    }//GEN-LAST:event_jMenuHelpActionPerformed

    private void jMenuHelpContentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuHelpContentActionPerformed
        try {
            
         Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "
                 + "" + "F:\\New folder\\Semester3 my assignments\\JAVA\\Assignment\\HelpDocumentin Assignement\\Help.pdf");
            
            
            
        } catch (Exception ex) {
            
               JOptionPane.showMessageDialog(null, ex.getMessage());
               
        }
    }//GEN-LAST:event_jMenuHelpContentActionPerformed

    private void jMenuAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAboutActionPerformed
       AboutUs au = new AboutUs();
       au.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jMenuAboutActionPerformed
   
    
    
   
    
    

    

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCanc;
    private javax.swing.JButton btnLog;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox checShow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuAbout;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuHelp;
    private javax.swing.JMenuItem jMenuHelpContent;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRLibrarian;
    private javax.swing.JRadioButton jRMember;
    private javax.swing.JMenuItem jexit;
    private javax.swing.JPasswordField pxtPass;
    private javax.swing.JTextField txtUnam;
    // End of variables declaration//GEN-END:variables
}
