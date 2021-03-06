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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author abans tangalle
 */
public class BorrowBook extends javax.swing.JFrame {

    public String BookID, MemID, LibID, BorrDate, DueDate, ReturnDate, NoCopy, NoDay, Available;
    public int  CharAmunt, total;
    /**
     * Creates new form IssueBook
     */
    public BorrowBook() {
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

        jPanel1 = new javax.swing.JPanel();
        jLBorrow = new javax.swing.JLabel();
        jLBI = new javax.swing.JLabel();
        jLMI = new javax.swing.JLabel();
        jLLI = new javax.swing.JLabel();
        jLBoDat = new javax.swing.JLabel();
        jAvailable = new javax.swing.JLabel();
        jLNoDay = new javax.swing.JLabel();
        jLNoCopies = new javax.swing.JLabel();
        jLCharPer = new javax.swing.JLabel();
        jLTota = new javax.swing.JLabel();
        jDueDat = new javax.swing.JLabel();
        jTBI = new javax.swing.JTextField();
        jTMemId = new javax.swing.JTextField();
        jTLiId = new javax.swing.JTextField();
        jTNoDay = new javax.swing.JTextField();
        jTNoCopies = new javax.swing.JTextField();
        jTCharPer = new javax.swing.JTextField();
        jTTot = new javax.swing.JTextField();
        jTAvailable = new javax.swing.JTextField();
        jBSubm = new javax.swing.JButton();
        jBUpda = new javax.swing.JButton();
        jBReturn = new javax.swing.JButton();
        jBClear = new javax.swing.JButton();
        jBGetAmo = new javax.swing.JButton();
        btnCheckreser = new javax.swing.JButton();
        jBBac = new javax.swing.JButton();
        jXDateDue = new org.jdesktop.swingx.JXDatePicker();
        jXDateBorrow = new org.jdesktop.swingx.JXDatePicker();
        jXReturnDate = new org.jdesktop.swingx.JXDatePicker();
        jReturnDate = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Borrow Book");

        jPanel1.setLayout(null);

        jLBorrow.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLBorrow.setText("BORROW BOOK");
        jPanel1.add(jLBorrow);
        jLBorrow.setBounds(510, 20, 280, 50);

        jLBI.setBackground(new java.awt.Color(255, 255, 255));
        jLBI.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLBI.setText("Book ID             :");
        jPanel1.add(jLBI);
        jLBI.setBounds(60, 110, 200, 30);

        jLMI.setBackground(new java.awt.Color(255, 255, 255));
        jLMI.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLMI.setText("Member ID        :");
        jPanel1.add(jLMI);
        jLMI.setBounds(60, 160, 200, 40);

        jLLI.setBackground(new java.awt.Color(255, 255, 255));
        jLLI.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLLI.setText("Librarian ID       :");
        jPanel1.add(jLLI);
        jLLI.setBounds(60, 230, 210, 30);

        jLBoDat.setBackground(new java.awt.Color(255, 255, 255));
        jLBoDat.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLBoDat.setText("Borrow Date      :");
        jPanel1.add(jLBoDat);
        jLBoDat.setBounds(60, 289, 210, 40);

        jAvailable.setBackground(new java.awt.Color(255, 255, 255));
        jAvailable.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jAvailable.setText("Available            :");
        jPanel1.add(jAvailable);
        jAvailable.setBounds(60, 420, 210, 30);

        jLNoDay.setBackground(new java.awt.Color(255, 255, 255));
        jLNoDay.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLNoDay.setText("No.Of.Days        :");
        jPanel1.add(jLNoDay);
        jLNoDay.setBounds(660, 170, 210, 29);

        jLNoCopies.setBackground(new java.awt.Color(255, 255, 255));
        jLNoCopies.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLNoCopies.setText("No.Of.Copies     :");
        jPanel1.add(jLNoCopies);
        jLNoCopies.setBounds(60, 480, 210, 29);

        jLCharPer.setBackground(new java.awt.Color(255, 255, 255));
        jLCharPer.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLCharPer.setText("Charge Per Day :");
        jPanel1.add(jLCharPer);
        jLCharPer.setBounds(660, 230, 200, 29);

        jLTota.setBackground(new java.awt.Color(255, 255, 255));
        jLTota.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLTota.setText("Total                   :");
        jPanel1.add(jLTota);
        jLTota.setBounds(660, 290, 210, 29);

        jDueDat.setBackground(new java.awt.Color(255, 255, 255));
        jDueDat.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jDueDat.setText("Due Date            :");
        jPanel1.add(jDueDat);
        jDueDat.setBounds(60, 360, 210, 30);

        jTBI.setBackground(new java.awt.Color(255, 255, 204));
        jTBI.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTBI.setToolTipText("");
        jTBI.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTBI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTBIKeyPressed(evt);
            }
        });
        jPanel1.add(jTBI);
        jTBI.setBounds(270, 110, 300, 32);

        jTMemId.setBackground(new java.awt.Color(255, 255, 204));
        jTMemId.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTMemId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTMemIdKeyPressed(evt);
            }
        });
        jPanel1.add(jTMemId);
        jTMemId.setBounds(270, 170, 300, 32);

        jTLiId.setBackground(new java.awt.Color(255, 255, 204));
        jTLiId.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(jTLiId);
        jTLiId.setBounds(270, 230, 300, 32);

        jTNoDay.setBackground(new java.awt.Color(255, 255, 204));
        jTNoDay.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTNoDay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTNoDayMouseClicked(evt);
            }
        });
        jTNoDay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTNoDayKeyPressed(evt);
            }
        });
        jPanel1.add(jTNoDay);
        jTNoDay.setBounds(870, 170, 300, 32);

        jTNoCopies.setBackground(new java.awt.Color(255, 255, 204));
        jTNoCopies.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTNoCopies.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTNoCopiesMouseClicked(evt);
            }
        });
        jPanel1.add(jTNoCopies);
        jTNoCopies.setBounds(270, 480, 300, 32);

        jTCharPer.setEditable(false);
        jTCharPer.setBackground(new java.awt.Color(255, 255, 204));
        jTCharPer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTCharPer.setText("5");
        jPanel1.add(jTCharPer);
        jTCharPer.setBounds(870, 230, 300, 32);

        jTTot.setBackground(new java.awt.Color(255, 255, 204));
        jTTot.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(jTTot);
        jTTot.setBounds(870, 290, 300, 32);

        jTAvailable.setBackground(new java.awt.Color(255, 255, 204));
        jTAvailable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTAvailable.setToolTipText("Press Enter Key to Update Available Book when Returning");
        jTAvailable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTAvailableMouseClicked(evt);
            }
        });
        jTAvailable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTAvailableKeyPressed(evt);
            }
        });
        jPanel1.add(jTAvailable);
        jTAvailable.setBounds(270, 420, 300, 32);

        jBSubm.setBackground(new java.awt.Color(51, 51, 255));
        jBSubm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBSubm.setText("BORROW");
        jBSubm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSubmActionPerformed(evt);
            }
        });
        jPanel1.add(jBSubm);
        jBSubm.setBounds(60, 570, 120, 40);

        jBUpda.setBackground(new java.awt.Color(51, 51, 255));
        jBUpda.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBUpda.setText("UPDATE");
        jBUpda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBUpdaActionPerformed(evt);
            }
        });
        jPanel1.add(jBUpda);
        jBUpda.setBounds(250, 570, 120, 40);

        jBReturn.setBackground(new java.awt.Color(51, 51, 255));
        jBReturn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBReturn.setText("RETURN");
        jBReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBReturnActionPerformed(evt);
            }
        });
        jPanel1.add(jBReturn);
        jBReturn.setBounds(660, 380, 120, 40);

        jBClear.setBackground(new java.awt.Color(51, 51, 255));
        jBClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBClear.setText("CLEAR");
        jBClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBClearActionPerformed(evt);
            }
        });
        jPanel1.add(jBClear);
        jBClear.setBounds(440, 570, 120, 40);

        jBGetAmo.setBackground(new java.awt.Color(51, 51, 255));
        jBGetAmo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBGetAmo.setText("GET AMOUNT");
        jBGetAmo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGetAmoActionPerformed(evt);
            }
        });
        jPanel1.add(jBGetAmo);
        jBGetAmo.setBounds(1000, 380, 160, 40);

        btnCheckreser.setBackground(new java.awt.Color(51, 51, 255));
        btnCheckreser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCheckreser.setText("CHECK RESERVED");
        btnCheckreser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckreserActionPerformed(evt);
            }
        });
        jPanel1.add(btnCheckreser);
        btnCheckreser.setBounds(790, 380, 200, 40);

        jBBac.setBackground(new java.awt.Color(51, 51, 255));
        jBBac.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBBac.setText("BACK");
        jBBac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBacActionPerformed(evt);
            }
        });
        jPanel1.add(jBBac);
        jBBac.setBounds(620, 570, 120, 40);

        jXDateDue.setBackground(new java.awt.Color(255, 255, 204));
        jXDateDue.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jXDateDue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jXDateDueMouseClicked(evt);
            }
        });
        jPanel1.add(jXDateDue);
        jXDateDue.setBounds(270, 360, 300, 32);

        jXDateBorrow.setBackground(new java.awt.Color(255, 255, 204));
        jXDateBorrow.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(jXDateBorrow);
        jXDateBorrow.setBounds(270, 300, 300, 32);

        jXReturnDate.setBackground(new java.awt.Color(255, 255, 204));
        jXReturnDate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jXReturnDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jXReturnDateMouseClicked(evt);
            }
        });
        jPanel1.add(jXReturnDate);
        jXReturnDate.setBounds(870, 110, 300, 32);

        jReturnDate.setBackground(new java.awt.Color(255, 255, 255));
        jReturnDate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jReturnDate.setText("Return Date       :");
        jPanel1.add(jReturnDate);
        jReturnDate.setBounds(660, 110, 210, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LMSImages/backround6.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1500, 680);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSubmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSubmActionPerformed
        
       if(this.jTBI.getText().isEmpty()==true){
    
        JOptionPane.showMessageDialog(null, "Please Insert Book ID", "Warning", JOptionPane.WARNING_MESSAGE);
    
       }else if(this.jTMemId.getText().isEmpty()==true){
    
        JOptionPane.showMessageDialog(null, "Please Insert Member ID", "Warning", JOptionPane.WARNING_MESSAGE);
           
       }else if(this.jTLiId.getText().isEmpty()==true){
    
        JOptionPane.showMessageDialog(null, "Please Insert Librarian ID", "Warning", JOptionPane.WARNING_MESSAGE);
           
       }else if(this.jXDateBorrow.getDate()==null){
    
        JOptionPane.showMessageDialog(null, "Please Insert Borrow Date", "Warning", JOptionPane.WARNING_MESSAGE);
    
       }else if(this.jXDateDue.getDate()==null){
    
        JOptionPane.showMessageDialog(null, "Please Insert Due Date", "Warning", JOptionPane.WARNING_MESSAGE);
    
       }else if(this.jTNoCopies.getText().isEmpty()==true){
    
        JOptionPane.showMessageDialog(null, "Please Insert No Of Copies", "Warning", JOptionPane.WARNING_MESSAGE);
            
       }else{
       
           BookID = this.jTBI.getText();
           MemID = this.jTMemId.getText();
           LibID = this.jTLiId.getText();
           SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
           BorrDate = sdf.format(this.jXDateBorrow.getDate());
           DueDate = sdf.format(this.jXDateDue.getDate());
           NoCopy = this.jTNoCopies.getText();
           
           DBConnection.DBConnection();
           
           try{
           
              Statement s = DBConnection.con.createStatement();
              s.executeUpdate("INSERT INTO borrow VALUES('"+BookID+"','"+MemID+"','"+LibID+"','"+BorrDate+"','"+DueDate+"','"+NoCopy+"',null,null,null,null)");
               
               deletereserve();
               
               JOptionPane.showMessageDialog(null, "Book is Borrowed Successfully", "Successful", JOptionPane.INFORMATION_MESSAGE);                  
               
               DBConnection.con.close();
               
           }catch(SQLException ex){
           
               JOptionPane.showMessageDialog(null, ex.getMessage());
               
           }       
       }                                    
    }//GEN-LAST:event_jBSubmActionPerformed

    private void jBGetAmoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGetAmoActionPerformed
       
                fine();
        
    }//GEN-LAST:event_jBGetAmoActionPerformed

    private void jTNoDayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTNoDayMouseClicked
          
                calculateDays();                  
      
    }//GEN-LAST:event_jTNoDayMouseClicked

    private void jBClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBClearActionPerformed
        
                ClearData();
        
    }//GEN-LAST:event_jBClearActionPerformed

    private void jTAvailableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTAvailableKeyPressed
    
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){ 
        
        //add book after returning     
                int avail, copies;
        
                avail = Integer.parseInt(this.jTAvailable.getText());
                copies = Integer.parseInt(this.jTNoCopies.getText()) ;
            
                    int Total = ((avail) + (copies));
                    String available = String.valueOf(Total);
                    
                    this.jTAvailable.setText(available);
        }
        
                UpdateBookQuantity(); 
    }//GEN-LAST:event_jTAvailableKeyPressed

    private void jTNoCopiesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTNoCopiesMouseClicked
              
            int avail, copies;
        
                 avail = Integer.parseInt(this.jTAvailable.getText());
                 copies = Integer.parseInt(this.jTNoCopies.getText()) ;
            
                    if(avail >= 5   ){
                    
                        int Total = ((avail) - (copies));
                        String available = String.valueOf(Total);
                    
                        this.jTAvailable.setText(available);
                    }              
                    else{
                    
                        JOptionPane.showMessageDialog(null, "No Books Available");
            
                    }
            UpdateBookQuantity();
       
    }//GEN-LAST:event_jTNoCopiesMouseClicked

    private void jTAvailableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTAvailableMouseClicked
        
        
        
            BookID = this.jTBI.getText();
            
            String Query = "SELECT  Available FROM book WHERE BookID = '"+BookID+"'";
            
            DBConnection.DBConnection();
            
                try {
                    
                    Statement s = DBConnection.con.createStatement();
                    ResultSet rs = s.executeQuery(Query);
                    while(rs.next()){
                        
                        this.jTAvailable.setText(rs.getString("Available"));
                                                               
                    }
                              
                } catch (Exception ex) {
                    
                     JOptionPane.showMessageDialog(null, ex.getMessage());
                    
                }        
        
    }//GEN-LAST:event_jTAvailableMouseClicked

    private void jBReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBReturnActionPerformed
           
           MemID = this.jTMemId.getText();
           BookID = this.jTBI.getText();
           SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
           ReturnDate = sdf.format(this.jXReturnDate.getDate());
           NoCopy = this.jTNoCopies.getText();
           NoDay = this.jTNoDay.getText();
           CharAmunt = Integer.parseInt(this.jTCharPer.getText());
           total = Integer.parseInt(this.jTTot.getText());
           
           try {
               
               Statement s = DBConnection.con.createStatement();
               s.executeUpdate("UPDATE `borrow` SET `MemID`='"+MemID+"',`ReturnDate`='"+ReturnDate+"', `"
                       + "NoOfDays`='"+NoDay+"', `ChargeAmount`='"+CharAmunt+"', `Total`='"+total+"' "
                               + "WHERE `BookID`= '"+BookID+"'");
               
               JOptionPane.showMessageDialog(null, "Book is Returned", "Successful", JOptionPane.INFORMATION_MESSAGE);
                             
               ClearData(); 
         
               DBConnection.con.close();
               
          }catch (SQLException ex) {
               
               JOptionPane.showMessageDialog(null, ex.getMessage());
          }
         
    }//GEN-LAST:event_jBReturnActionPerformed

    private void jTBIKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBIKeyPressed
        
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){ 
           
            BookID = this.jTBI.getText();
            
            String Query = "SELECT * FROM borrow WHERE BookID = '"+BookID+"'";
            
            DBConnection.DBConnection();
            
                try {
                    
                    Statement s = DBConnection.con.createStatement();
                    ResultSet rs = s.executeQuery(Query);
                    while(rs.next()){
                        
                        this.jTMemId.setText(rs.getString("MemID"));
                        this.jTLiId.setText(rs.getString("LibID"));
                        this.jXDateBorrow.setDate(rs.getDate("BorrowDate"));
                        this.jXDateDue.setDate(rs.getDate("DueDate"));
                        this.jTNoCopies.setText(rs.getString("NoOfCopies"));
                                                              
                    }
                              
                } catch (Exception ex) {
                    
                     JOptionPane.showMessageDialog(null, ex.getMessage());
                    
                }    
    }//GEN-LAST:event_jTBIKeyPressed
    
    }
    private void jBUpdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUpdaActionPerformed
        
           BookID = this.jTBI.getText();
           MemID = this.jTMemId.getText();
           LibID = this.jTLiId.getText();
           SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
           BorrDate = sdf.format(this.jXDateBorrow.getDate());
           DueDate = sdf.format(this.jXDateDue.getDate());
           NoCopy = this.jTNoCopies.getText();
           
           try {
               
               Statement s = DBConnection.con.createStatement();
               s.executeUpdate("UPDATE `borrow` SET `BookID`='"+BookID+"', `BorrowDate`='"+BorrDate+"', "
                       + "`DueDate`='"+DueDate+"', `NoOfCopies`='"+NoCopy+"' WHERE `BookID`= '"+BookID+"'");
               
               JOptionPane.showMessageDialog(null,"Borrowing Updated Successfully","Successful",JOptionPane.INFORMATION_MESSAGE);
               
               ClearData();
               
               DBConnection.con.close();
               
           } catch (SQLException ex) {
               
               JOptionPane.showMessageDialog(null, ex.getMessage());
               
           }
    }//GEN-LAST:event_jBUpdaActionPerformed

    private void jBBacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBacActionPerformed

        LibrarianPanel lp = new LibrarianPanel();
        lp.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jBBacActionPerformed

    private void jXDateDueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXDateDueMouseClicked
           
    }//GEN-LAST:event_jXDateDueMouseClicked

    private void jXReturnDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXReturnDateMouseClicked

    }//GEN-LAST:event_jXReturnDateMouseClicked

    private void jTMemIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTMemIdKeyPressed

    }//GEN-LAST:event_jTMemIdKeyPressed

    private void jTNoDayKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNoDayKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNoDayKeyPressed

    private void btnCheckreserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckreserActionPerformed
       CheckReservedBook crb = new CheckReservedBook();
       crb.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnCheckreserActionPerformed

    void ClearData(){
    
         this.jTBI.setText("");
         this.jTMemId.setText("");
         this.jTLiId.setText("");
         this.jXDateBorrow.setDate(null);//remove value in the field
         this.jXDateDue.setDate(null);
         this.jXReturnDate.setDate(null);
         this.jTNoCopies.setText("");
         this.jTAvailable.setText("");
         this.jTNoDay.setText("");
         this.jTTot.setText("");
         this.jTNoCopies.setText("");
         this.jTNoDay.setText("");
    }
    void fine(){
    
        int total, charge_amount, nocopies, nodays;
     
        
            charge_amount  = Integer.parseInt(this.jTCharPer.getText());
            nocopies =  Integer.parseInt(this.jTNoCopies.getText());
            nodays =  Integer.parseInt(this.jTNoDay.getText());
        
            total = charge_amount * nocopies * nodays;
         
        this.jTTot.setText(""+total);
          
    }
    void calculateDays(){
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
        String DueDate = sdf.format(this.jXDateDue.getDate());
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime ldt = LocalDateTime.now();
        String CurrentDate = dtf.format(ldt);
        
            try{
            
                java.util.Date date1 = sdf. parse (DueDate);
                java.util.Date date2 = sdf. parse (CurrentDate);
        
                long days = (date2.getTime()- date1.getTime())/(24*60*60*1000);
        
                this.jTNoDay.setText(""+days);
     
            }    
        
            catch (ParseException pe){
        
                JOptionPane.showMessageDialog(null, pe.getMessage());
        
            } 
    }
    
    void UpdateBookQuantity(){
        
           int Quantity;
           
           Available = this.jTAvailable.getText();
           
           try {
               
               Statement s = DBConnection.con.createStatement();
               s.executeUpdate("UPDATE `book` SET `Available`='"+Available+"' WHERE `BookID`= '"+BookID+"'");
               
               JOptionPane.showMessageDialog(null, "Book Quantity is Updated", "Successful", JOptionPane.INFORMATION_MESSAGE);
             
               
               
           } catch (SQLException ex) {
               
               JOptionPane.showMessageDialog(null, ex.getMessage());
               
           }  
    }
    
    void deletereserve(){
            
                BookID = this.jTBI.getText();
       
                DBConnection.DBConnection();
        
                try{
            
                    Statement st = DBConnection.con.createStatement();
                    st.executeUpdate("DELETE FROM `reserve` WHERE `BookID`= '"+BookID+"' ");
          
        
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
            java.util.logging.Logger.getLogger(BorrowBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BorrowBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BorrowBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BorrowBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BorrowBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheckreser;
    private javax.swing.JLabel jAvailable;
    private javax.swing.JButton jBBac;
    private javax.swing.JButton jBClear;
    private javax.swing.JButton jBGetAmo;
    private javax.swing.JButton jBReturn;
    private javax.swing.JButton jBSubm;
    private javax.swing.JButton jBUpda;
    private javax.swing.JLabel jDueDat;
    private javax.swing.JLabel jLBI;
    private javax.swing.JLabel jLBoDat;
    private javax.swing.JLabel jLBorrow;
    private javax.swing.JLabel jLCharPer;
    private javax.swing.JLabel jLLI;
    private javax.swing.JLabel jLMI;
    private javax.swing.JLabel jLNoCopies;
    private javax.swing.JLabel jLNoDay;
    private javax.swing.JLabel jLTota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jReturnDate;
    private javax.swing.JTextField jTAvailable;
    private javax.swing.JTextField jTBI;
    private javax.swing.JTextField jTCharPer;
    private javax.swing.JTextField jTLiId;
    private javax.swing.JTextField jTMemId;
    private javax.swing.JTextField jTNoCopies;
    private javax.swing.JTextField jTNoDay;
    private javax.swing.JTextField jTTot;
    private org.jdesktop.swingx.JXDatePicker jXDateBorrow;
    private org.jdesktop.swingx.JXDatePicker jXDateDue;
    private org.jdesktop.swingx.JXDatePicker jXReturnDate;
    // End of variables declaration//GEN-END:variables
}
