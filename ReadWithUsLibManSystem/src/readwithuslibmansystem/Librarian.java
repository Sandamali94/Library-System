/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readwithuslibmansystem;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author abans tangalle
 */
public class Librarian extends javax.swing.JFrame {
    
    String LibID, LibFName, LibLName, Add1, Add2, City, Gender, NIC, DOB, Mobile, Home, UseName, Passw;
    int Age;
    /**
     * Creates new form Librarian
     */
    public Librarian() {
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtLiID = new javax.swing.JTextField();
        txtLiFNa = new javax.swing.JTextField();
        txtLiLNa = new javax.swing.JTextField();
        txtAddli1 = new javax.swing.JTextField();
        txtAddli2 = new javax.swing.JTextField();
        txtNIC = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtMobile = new javax.swing.JTextField();
        txtHome = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        rdbMale = new javax.swing.JRadioButton();
        rdbFemale = new javax.swing.JRadioButton();
        jXDateDOB = new org.jdesktop.swingx.JXDatePicker();
        btnSubm = new javax.swing.JButton();
        btnUpd = new javax.swing.JButton();
        btnDele = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Librarian");

        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 680));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Username     :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(720, 420, 170, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Contacts        :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(720, 120, 180, 40);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("City                            :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(100, 430, 260, 30);

        jLabel5.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel5.setText("Librarian Details");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(480, 40, 390, 50);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Librarian ID              :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(100, 130, 250, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Librarian First Name:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(100, 190, 260, 30);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("Librarian Last Name :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(100, 250, 260, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Address Line1           :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(100, 310, 260, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("Gender           :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(720, 220, 180, 40);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setText("Address Line2           :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(100, 370, 260, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setText("NIC No                      :");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(100, 490, 260, 40);

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("Age                :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(720, 320, 180, 40);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("Password      :");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(720, 380, 170, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setText("Date of Birth :");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(720, 270, 170, 40);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Mobile");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(900, 130, 70, 30);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Home");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(900, 180, 60, 30);

        txtUser.setBackground(new java.awt.Color(255, 255, 204));
        txtUser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(txtUser);
        txtUser.setBounds(900, 430, 330, 30);

        txtAge.setBackground(new java.awt.Color(255, 255, 204));
        txtAge.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAgeKeyPressed(evt);
            }
        });
        jPanel1.add(txtAge);
        txtAge.setBounds(900, 330, 330, 30);

        txtLiID.setBackground(new java.awt.Color(255, 255, 204));
        txtLiID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtLiID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLiIDKeyPressed(evt);
            }
        });
        jPanel1.add(txtLiID);
        txtLiID.setBounds(360, 130, 330, 30);

        txtLiFNa.setBackground(new java.awt.Color(255, 255, 204));
        txtLiFNa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtLiFNa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLiFNaKeyPressed(evt);
            }
        });
        jPanel1.add(txtLiFNa);
        txtLiFNa.setBounds(360, 190, 330, 30);

        txtLiLNa.setBackground(new java.awt.Color(255, 255, 204));
        txtLiLNa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtLiLNa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLiLNaActionPerformed(evt);
            }
        });
        txtLiLNa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLiLNaKeyPressed(evt);
            }
        });
        jPanel1.add(txtLiLNa);
        txtLiLNa.setBounds(360, 250, 330, 30);

        txtAddli1.setBackground(new java.awt.Color(255, 255, 204));
        txtAddli1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtAddli1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddli1KeyPressed(evt);
            }
        });
        jPanel1.add(txtAddli1);
        txtAddli1.setBounds(360, 310, 330, 30);

        txtAddli2.setBackground(new java.awt.Color(255, 255, 204));
        txtAddli2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtAddli2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddli2KeyPressed(evt);
            }
        });
        jPanel1.add(txtAddli2);
        txtAddli2.setBounds(360, 370, 330, 30);

        txtNIC.setBackground(new java.awt.Color(255, 255, 204));
        txtNIC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(txtNIC);
        txtNIC.setBounds(360, 500, 330, 30);

        txtCity.setBackground(new java.awt.Color(255, 255, 204));
        txtCity.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCityKeyPressed(evt);
            }
        });
        jPanel1.add(txtCity);
        txtCity.setBounds(360, 430, 330, 30);

        txtMobile.setBackground(new java.awt.Color(255, 255, 204));
        txtMobile.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtMobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMobileKeyPressed(evt);
            }
        });
        jPanel1.add(txtMobile);
        txtMobile.setBounds(980, 130, 250, 30);

        txtHome.setBackground(new java.awt.Color(255, 255, 204));
        txtHome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(txtHome);
        txtHome.setBounds(980, 180, 250, 30);

        txtPass.setBackground(new java.awt.Color(255, 255, 204));
        txtPass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassKeyPressed(evt);
            }
        });
        jPanel1.add(txtPass);
        txtPass.setBounds(900, 380, 330, 30);

        rdbMale.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroup1.add(rdbMale);
        rdbMale.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rdbMale.setText("Male");
        rdbMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbMaleActionPerformed(evt);
            }
        });
        jPanel1.add(rdbMale);
        rdbMale.setBounds(900, 230, 120, 30);

        rdbFemale.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroup1.add(rdbFemale);
        rdbFemale.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rdbFemale.setText("Female");
        jPanel1.add(rdbFemale);
        rdbFemale.setBounds(1110, 230, 120, 30);

        jXDateDOB.setBackground(new java.awt.Color(255, 255, 204));
        jXDateDOB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jXDateDOB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jXDateDOBKeyPressed(evt);
            }
        });
        jPanel1.add(jXDateDOB);
        jXDateDOB.setBounds(900, 280, 330, 32);

        btnSubm.setBackground(new java.awt.Color(51, 51, 255));
        btnSubm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSubm.setText("SUBMIT");
        btnSubm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubm);
        btnSubm.setBounds(100, 600, 120, 40);

        btnUpd.setBackground(new java.awt.Color(51, 51, 255));
        btnUpd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnUpd.setText("UPDATE");
        btnUpd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpd);
        btnUpd.setBounds(320, 600, 120, 40);

        btnDele.setBackground(new java.awt.Color(51, 51, 255));
        btnDele.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDele.setText("DELETE");
        btnDele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleActionPerformed(evt);
            }
        });
        jPanel1.add(btnDele);
        btnDele.setBounds(570, 600, 120, 40);

        btnClear.setBackground(new java.awt.Color(51, 51, 255));
        btnClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear);
        btnClear.setBounds(860, 600, 110, 40);

        btnBack.setBackground(new java.awt.Color(51, 51, 255));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack);
        btnBack.setBounds(1120, 600, 100, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LMSImages/backround6.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1500, 680);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdbMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbMaleActionPerformed

    private void txtLiLNaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLiLNaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLiLNaActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        LibrarianPanel lp = new LibrarianPanel();
        lp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmActionPerformed
       
       if(this.txtLiID.getText().isEmpty()==true){
    
        JOptionPane.showMessageDialog(null, "Please Insert Librarian ID", "Warning", JOptionPane.WARNING_MESSAGE);
    
       }else if(this.txtLiFNa.getText().isEmpty()==true){
    
        JOptionPane.showMessageDialog(null, "Please Insert Librarian First Name", "Warning", JOptionPane.WARNING_MESSAGE);
           
       }else if(this.txtLiLNa.getText().isEmpty()==true){
    
        JOptionPane.showMessageDialog(null, "Please Insert Librarian Last Name", "Warning", JOptionPane.WARNING_MESSAGE);
    
       }else if(this.txtAddli1.getText().isEmpty()==true){
    
        JOptionPane.showMessageDialog(null, "Please Insert Addrress Line1", "Warning", JOptionPane.WARNING_MESSAGE);
            
       }else if(this.txtAddli2.getText().isEmpty()==true){
    
        JOptionPane.showMessageDialog(null, "Please Insert Addrress Line2", "Warning", JOptionPane.WARNING_MESSAGE);
            
       }else if(this.txtCity.getText().isEmpty()==true){
    
        JOptionPane.showMessageDialog(null, "Please Insert City", "Warning", JOptionPane.WARNING_MESSAGE);
            
       }else if(this.txtNIC.getText().isEmpty()==true){
    
        JOptionPane.showMessageDialog(null, "Please Insert NIC No", "Warning", JOptionPane.WARNING_MESSAGE);
            
       }else if(this.txtMobile.getText().isEmpty()==true){
    
        JOptionPane.showMessageDialog(null, "Please Insert Mobile Nu", "Warning", JOptionPane.WARNING_MESSAGE);
            
       }else if(this.txtHome.getText().isEmpty()==true){
    
        JOptionPane.showMessageDialog(null, "Please Insert Home Nu", "Warning", JOptionPane.WARNING_MESSAGE);
            
       }else if(this.jXDateDOB.getDate()== null){
    
        JOptionPane.showMessageDialog(null, "Please Insert Date of Birth", "Warning", JOptionPane.WARNING_MESSAGE);
            
       }else if(this.txtAge.getText().isEmpty()==true){
    
        JOptionPane.showMessageDialog(null, "Please Insert Age", "Warning", JOptionPane.WARNING_MESSAGE);
            
       }else if(this.txtUser.getText().isEmpty()==true){
    
        JOptionPane.showMessageDialog(null, "Please Insert Username", "Warning", JOptionPane.WARNING_MESSAGE);
            
       }else if(this.txtPass.getText().isEmpty()==true){
    
        JOptionPane.showMessageDialog(null, "Please Insert Password", "Warning", JOptionPane.WARNING_MESSAGE);
            
       }else{
       
           LibID = this.txtLiID.getText();
           LibFName = this.txtLiFNa.getText();
           LibLName = this.txtLiLNa.getText();
           Add1 = this.txtAddli1.getText();
           Add2 = this.txtAddli2.getText();
           City = this.txtCity.getText();
                if(this.rdbFemale.isSelected()==true){
        
                    Gender = "Female";   
                    
                }else if(this.rdbMale.isSelected()==true){
           
                    Gender = "Male";
                    
                }else{
                    
                    Gender = "null";
                    
                    JOptionPane.showMessageDialog(null, "Please Select a Gender", "Warning", JOptionPane.WARNING_MESSAGE);
        
                }
           NIC = this.txtNIC.getText();
           
           SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
           DOB = sdf.format(this.jXDateDOB.getDate());
           
           Age = Integer.parseInt(this.txtAge.getText());
           Mobile = this.txtMobile.getText();
           Home = this.txtHome.getText();
           UseName = this.txtUser.getText();
           Passw = this.txtPass.getText();
           
           DBConnection.DBConnection();
           
           try{
           
               Statement s = DBConnection.con.createStatement();
               s.executeUpdate("INSERT INTO librarian VALUES('"+LibID+"','"+LibFName+"','"+LibLName+"','"+Add1+"','"+Add2+"','"+City+"','"+Gender+"','"+DOB+"','"+Age+"','"+NIC+"','"+UseName+"','"+Passw+"')");
               
               Statement s1 = DBConnection.con.createStatement();
               s1.executeUpdate("INSERT INTO libcontact VALUES('"+LibID+"','"+Mobile+"','"+Home+"')");
               
             
               JOptionPane.showMessageDialog(null, "Librarian Added Successfully", "Successful", JOptionPane.INFORMATION_MESSAGE);
               ClearData();
               DBConnection.con.close();
               
           }catch(SQLException ex){
           
               JOptionPane.showMessageDialog(null, ex.getMessage());
               
           }       
       }
    }//GEN-LAST:event_btnSubmActionPerformed

    private void txtLiIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLiIDKeyPressed
        
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            
        
            LibID = this.txtLiID.getText();
            
            String Query = "SELECT *, Mobile, Home FROM librarian INNER JOIN libcontact ON librarian.LibID = libcontact.LibID WHERE librarian.LibID = '"+LibID+"'";
   
            DBConnection.DBConnection();
            
                try {
                    
                    Statement s = DBConnection.con.createStatement();
                    ResultSet rs = s.executeQuery(Query);
                    while(rs.next()){
                        this.txtLiFNa.setText(rs.getString("LibFName"));
                        this.txtLiLNa.setText(rs.getString("LibLName"));
                        this.txtAddli1.setText(rs.getString("Addline1"));
                        this.txtAddli2.setText(rs.getString("Addline2"));
                        this.txtCity.setText(rs.getString("City"));
                        this.txtMobile.setText(rs.getString("Mobile"));
                        this.txtHome.setText(rs.getString("Home"));
                            if(rs.getString("Gender").equalsIgnoreCase("Male")){
                    
                                this.rdbMale.setSelected(true);
                
                            }else{
                                    
                                this.rdbFemale.setSelected(true);
                    
                            }
                        SimpleDateFormat Date = new SimpleDateFormat("yyyy-MM-dd");
                        this.jXDateDOB.setDate(rs.getDate("DOB"));
                        this.txtAge.setText(rs.getString("Age"));
                        this.txtNIC.setText(rs.getString("NIC"));
                        this.txtUser.setText(rs.getString("Uname"));
                        this.txtPass.setText(rs.getString("Pass"));                   
                    
                    }
                                 
                } catch (Exception ex) {
                    
                     JOptionPane.showMessageDialog(null, ex.getMessage());
                    
                }        
        }
    }//GEN-LAST:event_txtLiIDKeyPressed

    private void btnDeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleActionPerformed
        
        LibID = this.txtLiID.getText();
       
        DBConnection.DBConnection();
        
        try{
            
            Statement st = DBConnection.con.createStatement();
            st.executeUpdate("DELETE FROM `librarian` WHERE `LibID`= '"+LibID+"' ");
            
            JOptionPane.showMessageDialog(null, "Librarian Deleted Successfully", "Successful", JOptionPane.INFORMATION_MESSAGE);
            
            ClearData();
            DBConnection.con.close();
            
        }catch(SQLException ex){
            
            JOptionPane.showMessageDialog(null, ex.getMessage());
            
        }
        
    }//GEN-LAST:event_btnDeleActionPerformed

    private void btnUpdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdActionPerformed
        
           LibID = this.txtLiID.getText();
           LibFName = this.txtLiFNa.getText();
           LibLName = this.txtLiLNa.getText();
           Add1 = this.txtAddli1.getText();
           Add2 = this.txtAddli2.getText();
           City = this.txtCity.getText();
                if(this.rdbFemale.isSelected()==true){        
                    Gender = "Female";                       
                }else if(this.rdbMale.isSelected()==true){           
                    Gender = "Male";                   
                }else{                   
                    Gender = "null";                   
                    JOptionPane.showMessageDialog(null, "Please Select a Gender", "Warning", JOptionPane.WARNING_MESSAGE);       
                }
           NIC = this.txtNIC.getText();
            
           SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
           DOB = sdf.format(this.jXDateDOB.getDate());
           Age = Integer.parseInt(this.txtAge.getText());
           Mobile = this.txtMobile.getText();
           Home = this.txtHome.getText();
           UseName = this.txtUser.getText();
           Passw = this.txtPass.getText();
           
           try {
               
               Statement s = DBConnection.con.createStatement();
               s.executeUpdate("UPDATE `librarian` SET `LibFName`='"+LibFName+"', `LibLName`='"+LibLName+"', `Addline1`='"+Add1+"', `Addline2`='"+Add2+"', `City`='"+City+"', `Gender`='"+Gender+"', `DOB`='"+DOB+"', `Age`='"+Age+"', `NIC`='"+NIC+"', `Uname`='"+UseName+"', `Pass`='"+Passw+"' WHERE `LibID`= '"+LibID+"' ");
               
               JOptionPane.showMessageDialog(null, "Librarian Updated Successfully", "Successful", JOptionPane.INFORMATION_MESSAGE);
               
               ClearData();
               
               DBConnection.con.close();
               
           } catch (SQLException ex) {
               
               JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnUpdActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        
        ClearData();
        
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtLiFNaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLiFNaKeyPressed
        
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            
            this.txtLiLNa.grabFocus();
            
        }
        
    }//GEN-LAST:event_txtLiFNaKeyPressed

    private void txtLiLNaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLiLNaKeyPressed
        
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            
            this.txtAddli1.grabFocus();
            
        }
        
    }//GEN-LAST:event_txtLiLNaKeyPressed

    private void txtAddli1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddli1KeyPressed
        
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            
            this.txtAddli2.grabFocus();
            
        }
        
    }//GEN-LAST:event_txtAddli1KeyPressed

    private void txtAddli2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddli2KeyPressed
        
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            
            this.txtCity.grabFocus();
            
        }
        
    }//GEN-LAST:event_txtAddli2KeyPressed

    private void txtCityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCityKeyPressed
        
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            
            this.txtNIC.grabFocus();
            
        }
        
    }//GEN-LAST:event_txtCityKeyPressed

    private void jXDateDOBKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jXDateDOBKeyPressed
        
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            
            this.txtAge.grabFocus();
            
        }
        
    }//GEN-LAST:event_jXDateDOBKeyPressed

    private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyPressed
        
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            
            this.txtUser.grabFocus();
            
        }
        
    }//GEN-LAST:event_txtPassKeyPressed

    private void txtAgeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyPressed
        
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            
            this.txtPass.grabFocus();
            
        }
        
    }//GEN-LAST:event_txtAgeKeyPressed

    private void txtMobileKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMobileKeyPressed

        if(evt.getKeyCode()== KeyEvent.VK_ENTER){

            this.jXDateDOB.grabFocus();
            
        }
    }//GEN-LAST:event_txtMobileKeyPressed
    
    void ClearData(){
    
         this.txtLiID.setText("");
         this.txtLiFNa.setText("");
         this.txtLiLNa.setText("");
         this.txtAddli1.setText("");
         this.txtAddli2.setText("");
         this.txtCity.setText("");
         this.txtNIC.setText("");
         this.txtMobile.setText("");
         this.txtHome.setText("");
         this.jXDateDOB.setDate(null);//remove value in the field
         this.txtAge.setText("");
         this.txtUser.setText("");
         this.txtPass.setText("");
         this.buttonGroup1.clearSelection();
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
            java.util.logging.Logger.getLogger(Librarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Librarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Librarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Librarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Librarian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDele;
    private javax.swing.JButton btnSubm;
    private javax.swing.JButton btnUpd;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private org.jdesktop.swingx.JXDatePicker jXDateDOB;
    private javax.swing.JRadioButton rdbFemale;
    private javax.swing.JRadioButton rdbMale;
    private javax.swing.JTextField txtAddli1;
    private javax.swing.JTextField txtAddli2;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtHome;
    private javax.swing.JTextField txtLiFNa;
    private javax.swing.JTextField txtLiID;
    private javax.swing.JTextField txtLiLNa;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtNIC;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
