
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AnthonyCee
 */
public class test extends javax.swing.JFrame {
//  String billNO = "";
    Double totalAmount = 0.0;
    Double balance = 0.0;
    Double bHeight = 0.0;
    
    ArrayList<String> itemName = new ArrayList<>();
    ArrayList<String> Quantity = new ArrayList<>();
ArrayList<String> itemPrice = new ArrayList<>();
ArrayList<String> subtotal = new ArrayList<>();

JLabel pic;
Timer tm;
int x = 0;
String[] list ={

"C:\\Users\\AnthonyCee\\Documents\\NetBeansProjects\\QUICKSTOCKER\\src\\usedimages\\brain3.png",
    "C:\\Users\\AnthonyCee\\Documents\\NetBeansProjects\\QUICKSTOCKER\\src\\usedimages\\res.png",
    "C:\\Users\\AnthonyCee\\Documents\\NetBeansProjects\\QUICKSTOCKER\\src\\usedimages\\mn.png",
    "C:\\Users\\AnthonyCee\\Documents\\NetBeansProjects\\QUICKSTOCKER\\src\\usedimages\\bmf.png",
    "C:\\Users\\AnthonyCee\\Documents\\NetBeansProjects\\QUICKSTOCKER\\src\\usedimages\\quk.png"
       
      
};



    /**
    /**
     * Creates new form test
     */
    public test() {
      initComponents();
       //super ("Java SlideShow");
       pic2.setBounds(10, 8, 100, 50);
      setImageSize(4);
      
      tm = new Timer(10000,new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
          setImageSize(x);
          x +=1;
          if(x>= list.length)
          
          x= 0;
                  
          
           
           
           }
       });
     tm.start();
    
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
        txtiname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtqty = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtsub = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtcash = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtbal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        pic2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("item name");

        jLabel2.setText("qty");

        jLabel3.setText("price");

        jLabel4.setText("subtotal");

        jLabel5.setText("total");

        jLabel6.setText("cash");

        jLabel7.setText("bal");

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("print");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        pic2.setText("jLabel8");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(txtiname, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(txtqty, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(txtsub, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(txtcash, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(txtbal, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(10, 10, 10))
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(44, 44, 44)
                        .addComponent(pic2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtiname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtqty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pic2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtsub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(55, 55, 55)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtbal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
          itemName.add(txtiname.getText());
        Quantity.add(txtqty.getText());
        itemPrice.add(txtprice.getText());
        subtotal.add(txtsub.getText());
        totalAmount = totalAmount + Double.valueOf(txtsub.getText());
        txttotal.setText (totalAmount +"" );
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        bHeight = Double.valueOf(itemName.size());
//JOptionPane.showMessageDialog(rootPane,bHeight);

PrinterJob pj = PrinterJob.getPrinterJob();
pj.setPrintable(new BillPrintable(),getPageFormat(pj));

try{
pj.print();



}catch(Exception ex){
ex.printStackTrace();
}
    }//GEN-LAST:event_jButton2ActionPerformed
public PageFormat getPageFormat(PrinterJob pj){
       PageFormat pf = pj.defaultPage();
       Paper paper = pf.getPaper();
       
       double bodyHeight = bHeight;
       double headerHeight = 5.0;
       double footerHeight = 5.0;
       double width = cm_to_pp(8);
       double height = cm_to_pp(headerHeight + bodyHeight + footerHeight);
       paper.setSize(width, height);
       paper.setImageableArea(0,10,width,height - cm_to_pp (1));
       
  pf.setOrientation(PageFormat.PORTRAIT);
  pf.setPaper(paper);
  
  return pf;
  }
  protected static double cm_to_pp(double cm){
  return toPP1 (cm * 0.393400787);
  } 
  protected static double toPP1(double inch){
  
  return inch *72d;
  }
  
  public class BillPrintable implements Printable{

  
        public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
            
        
        int r = itemName.size();
       ImageIcon icon = new ImageIcon("C:\\Users\\AnthonyCee\\Documents\\NetBeansProjects\\QUICKSTOCKER\\src\\fastest.png") ; 
       int result = NO_SUCH_PAGE;
       if (pageIndex ==0){
       
       Graphics2D g2d = (Graphics2D) graphics;
       double width = pageFormat.getImageableWidth();
       g2d.translate((int) pageFormat.getImageableX(),(int) pageFormat.getImageableY());
       
       //fontmetrice metrice 2d.getformat
       try{
       
       int y = 20;
       int yshift = 10;
       int headerRectHeight = 15;
       
       g2d.setFont(new Font("Monospaced",Font.PLAIN,9));
       g2d.drawImage(icon.getImage(),50,20,90,30,rootPane);y  += yshift + 30;
       g2d.drawString(".......................................",12,y);y += yshift;
       g2d.drawString("Jeacosoft Software Company",12, y); y +=yshift;
       g2d.drawString(" Email:jeacsoft@gmail.com ", 12, y); y +=yshift;
       g2d.drawString(" Tel:+2348085189422/+2347034965611 ", 12, y); y +=yshift;
       g2d.drawString(" WhatsApp:+2347034965611 ", 12, y); y +=yshift;
       g2d.drawString("....................................", 12, y); y+=headerRectHeight;

       g2d.drawString("Item Name              Price", 10, y); y +=yshift;
       
       g2d.drawString("....................................", 10, y); y+=headerRectHeight;
       
       for(int s = 0; s<r; s++){
       
        g2d.drawString(" "+itemName.get(s)+"         ", 10, y); y+=yshift;
        g2d.drawString(" "+Quantity.get(s)+"*"+ itemPrice.get(s)      , 10, y); g2d.drawString(subtotal.get(s),140,y); y+=yshift;
        
              }
       
  g2d.drawString("....................................", 10, y); y+=yshift;
 g2d.drawString(" Total Amout :          "+ txttotal.getText()+"  ", 10, y); y+=yshift;
  g2d.drawString("....................................", 10, y); y+=yshift;
  g2d.drawString("Cash         :", 10, y); y+=yshift;
  g2d.drawString("....................................", 10, y); y+=yshift;
  g2d.drawString("Balance      :", 10, y); y+=yshift;

      
  g2d.drawString("....................................", 10, y); y+=yshift;
 g2d.drawString(" Thanks for your patronage, see you soon", 10, y); y+=yshift;
  g2d.drawString("....................................", 10, y); y+=yshift;
  g2d.drawString("Softwar Powered by : Jeacosoft", 10, y); y+=yshift;
  g2d.drawString("....................................", 10, y); y+=yshift;
  g2d.drawString("Your satisfaction is our gain", 10, y); y+=yshift;

  
       }catch(Exception e){
       e.printStackTrace();
       }
       result = PAGE_EXISTS;
       }


        return result;
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
  
  public void setImageSize(int i){
  ImageIcon icon = new ImageIcon(list[i]);
  Image img = icon.getImage();
  Image newimg = img.getScaledInstance(pic2.getWidth(),pic2.getHeight(),Image.SCALE_SMOOTH);
  ImageIcon newImc = new ImageIcon(newimg);
  pic2.setIcon(newImc);
  }
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
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pic2;
    private javax.swing.JTextField txtbal;
    private javax.swing.JTextField txtcash;
    private javax.swing.JTextField txtiname;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtqty;
    private javax.swing.JTextField txtsub;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
