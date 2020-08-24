
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AnthonyCee
 */
public class Expensesbook extends javax.swing.JInternalFrame {
  Connection con =Server.getConnection();
    PreparedStatement ps;
    ResultSet rs;
    /**
     * Creates new form startpoint
     */
    public Expensesbook() {
        initComponents();
           txtdate.setDate(java.sql.Date.valueOf(java.time.LocalDate.now()));
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
        jLabel1 = new javax.swing.JLabel();
        txtpurp = new javax.swing.JTextField();
        txtdate = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdiscrip = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtamt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("EXPENSES BOOK");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/usedimages/icons8_General_Ledger_16.png"))); // NOI18N

        jLabel1.setText("Purpose");

        txtdiscrip.setColumns(20);
        txtdiscrip.setRows(5);
        jScrollPane1.setViewportView(txtdiscrip);

        jLabel2.setText("Discription");

        jLabel3.setText("Name");

        jLabel4.setText("Amount");

        jLabel5.setText("Date");

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtpurp)
                            .addComponent(txtname)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtamt)
                            .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpurp, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtname, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtamt, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtdate, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed
public void showme(){
        try {
            String date = ((JTextField)txtdate.getDateEditor().getUiComponent()).getText();
            String s = "SELECT * FROM `dailyanalysistable` WHERE Date = '"+date+"'";
            ps = con.prepareStatement(s);
            rs = ps.executeQuery();
            if(rs.next()){
               
         
               
               vendor. ldexp.setText(rs.getString("TotalExpenses"));
               
               
                
            }       } catch (SQLException ex) {
            Logger.getLogger(vendor.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //submit statement
          // try{
             
               if( txtdiscrip.getText().equals("")||txtpurp.getText().equals("")||txtname.getText().equals("")||txtamt.getText().equals("")){
                 JOptionPane.showMessageDialog(this,"Empty field detected, fillin the field to proceed");
               }else{
               try{
                String date2 = ((JTextField)Expensesbook.txtdate.getDateEditor().getUiComponent()).getText();
        int conf = JOptionPane.showConfirmDialog(this,"Do you want to submit this Record?","Confirmation", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        String exp = "INSERT INTO `expensesdetailtable`( `Description`, `Purpose`, `Authorizer`, `Amount`, `Date`) VALUES (?,?,?,?,?)";
ps = con.prepareStatement(exp);
ps.setString(1, txtdiscrip.getText());
ps.setString(2, txtpurp.getText());
ps.setString(3, txtname.getText());
ps.setString(4, txtamt.getText());
ps.setString(5, date2);


 if(conf == JOptionPane.YES_OPTION){
int ok = ps.executeUpdate();

 if(ok>0){
 
   // JOptionPane.showMessageDialog(this,"Submission was Successfulxxxvccvcv");
 
 } 
 
 
 }
               }catch(Exception ex){
               JOptionPane.showMessageDialog(this,"Submission failed");
               
               }      
        
        //this will give feedback to the dailyanlysis table for accountability
        
               try {
            String date = ((JTextField)Expensesbook.txtdate.getDateEditor().getUiComponent()).getText();
            String qry = "select * from  `dailyanalysistable` where Date = '"+date+"'";
            ps = con.prepareStatement(qry);
            rs = ps.executeQuery();

            if(!rs.next()){

               
                    try {

                        // Submiting the b/f,opening balance and the date

                        String sql5 = "INSERT INTO `dailyanalysistable`( `TotalDailySales`, `TotalExpenses`, `NetBalance`, `Date`) VALUES (?,?,?,?)";
                        ps = con.prepareStatement(sql5);
                         ps.setDouble(1, 0);
                        ps.setString(2, txtamt.getText());
                      
                        ps.setDouble (3,0);
                        ps.setString (4,date);
                       
                        
                            int k1 = ps.executeUpdate();
                            if(k1>0){

                           //  JOptionPane.showMessageDialog(this,"Submission was Successfullllllll");
                                showme();
                            }
                       
                    } catch (SQLException ex) {

                        JOptionPane.showMessageDialog(this,"Submission Failed");
                        Logger.getLogger(vendor.class.getName()).log(Level.SEVERE, null, ex);
                    }
                
            }else{
                try{

                    
            String sql12 = "UPDATE `dailyanalysistable` SET `TotalExpenses`= (`TotalExpenses` + '"+txtamt.getText()+"'),`NetBalance`= (`TotalDailySales` - `TotalExpenses`) where Date = '"+date+"'";
            ps = con.prepareStatement(sql12);
            int q = ps.executeUpdate();

            if(q>0){

                 JOptionPane.showMessageDialog(this,"Submission was Successful");
                showme();
                
            }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this,"Update failed");
                    Logger.getLogger(vendor.class.getName()).log(Level.SEVERE, null, ex);
                }
                
               
            
         txtamt.setText("0");
            
            }
  
        } catch (SQLException ex) {
            Logger.getLogger(vendor.class.getName()).log(Level.SEVERE, null, ex);

        }
               }
        
          // }catch(Exception ex){}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       
        

       
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
          this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.hide();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField txtamt;
    public static com.toedter.calendar.JDateChooser txtdate;
    private javax.swing.JTextArea txtdiscrip;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpurp;
    // End of variables declaration//GEN-END:variables
}
