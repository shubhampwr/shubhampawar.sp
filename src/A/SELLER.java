/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A;
import java.awt.*;
import javax.swing.*;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class SELLER extends javax.swing.JFrame {
     public Connection conn=null;
    public ResultSet rs=null;
    PreparedStatement pst=null;
     public Connection getConn()//----------------------------------------create method
        {
        
        try {
            Class.forName("org.postgresql.Driver");
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"ClassNotFoundException");
            Logger.getLogger(MILK_SUBMIT.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      try {
        String url="jdbc:postgresql://localhost/postgres";
        String user="postgres";
        String password="shubhampwr";
        
        
            conn=DriverManager.getConnection(url, user, password);
            
        } catch (SQLException ex) {
            Logger.getLogger(MILK_SUBMIT.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return conn;
        
    }
    Connection con;
    /**
     * Creates new form SELLER
     */
    public SELLER() {
        getConn();
        
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

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        cb1 = new javax.swing.JComboBox<>();
        t5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        tf1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setForeground(new java.awt.Color(153, 0, 153));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(400, 560));
        setPreferredSize(new java.awt.Dimension(400, 560));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User id  :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 50, 70, 26);
        getContentPane().add(t1);
        t1.setBounds(190, 50, 120, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("password  :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 90, 90, 22);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name  :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 130, 70, 22);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("City  :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 170, 50, 22);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Animal");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 210, 80, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Reg.Date");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(80, 270, 80, 20);

        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        getContentPane().add(t2);
        t2.setBounds(190, 90, 120, 30);
        getContentPane().add(t3);
        t3.setBounds(190, 130, 120, 30);

        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });
        getContentPane().add(t4);
        t4.setBounds(190, 170, 120, 30);

        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cow", "Buffelow" }));
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });
        getContentPane().add(cb1);
        cb1.setBounds(265, 220, 60, 30);

        t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });
        getContentPane().add(t5);
        t5.setBounds(190, 270, 123, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("(DD/MM/YYYY)");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(190, 310, 117, 17);

        b1.setBackground(new java.awt.Color(255, 255, 0));
        b1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        b1.setText("VIEW");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(110, 410, 90, 30);

        b2.setBackground(new java.awt.Color(255, 255, 0));
        b2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        b2.setText("CLOSE");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(220, 410, 90, 30);

        jLabel8.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText("Enter Seller Details Here...");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 10, 320, 30);

        b3.setBackground(new java.awt.Color(255, 255, 0));
        b3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        b3.setText("UPDATE");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3);
        b3.setBounds(160, 360, 100, 30);

        b4.setBackground(new java.awt.Color(255, 255, 0));
        b4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        b4.setText("DELETE");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4);
        b4.setBounds(270, 360, 80, 30);
        getContentPane().add(tf1);
        tf1.setBounds(190, 220, 62, 30);

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 51));
        jButton1.setText("INSERT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(50, 360, 100, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/A/Screenshot_2018-03-03-13-48-42-1.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, -60, 640, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
        // TODO add your handling code here:
        
       String data=cb1.getItemAt(cb1.getSelectedIndex());
       tf1.setText(data);
      
        
    }//GEN-LAST:event_cb1ActionPerformed

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t5ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t4ActionPerformed

    @SuppressWarnings("empty-statement")
    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
   
    new SELLER_RECORD().setVisible(true);this.dispose();
       
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
          new JFrame3().setVisible(true);this.dispose();  // TODO add your handling code here:
    }//GEN-LAST:event_b2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
        try{
        if(t1.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"user id can not blank");
            t1.requestFocus();
            return;
        }
             if(t2.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"password can not blank");
            t2.requestFocus();
            return;
        }
                if(t3.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"plz enter Full name");
            t3.requestFocus();
            return;
        }
                   if(t4.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Plz enter City");
            t4.requestFocus();
            return;
        }  
                   if(t5.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"enter date");
            t5.requestFocus();
            return;
        }
                   
                    
                
           
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Failed "+ex);
            Logger.getLogger(SELLER.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        try{
         String query="INSERT INTO public.\"Seller1\"(\n" +
"	id, password, \"Name\", \"City\", \"Animal\", \"Reg_date\")\n" +
"	VALUES (?, ?, ?, ?, ?, ?);";
                PreparedStatement pst;
                pst = conn.prepareStatement(query);
                 pst.setInt(1,Integer.valueOf(t1.getText()));
            pst.setString(2,String.valueOf(t2.getText()));
            pst.setString(3,String.valueOf(t3.getText()));
            pst.setString(4,String.valueOf(t4.getText()));
            pst.setString(5,String.valueOf(t5.getText()));
            pst.setString(6,String.valueOf(tf1.getText()));
            
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Seller Added Successfully!!");
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            tf1.setText("");
     }catch(SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"Record not Inserted"+ex);
            
            Logger.getLogger(MILK_SUBMIT.class.getName()).log(Level.SEVERE, null, ex);
        }        
       

        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
 try {
         String idd=t1.getText();
         int ii=Integer.valueOf(idd);
         String pas=t2.getText();
         String nm=t3.getText();
         String ct=t4.getText();
         String ani=tf1.getText();
         String dt=t5.getText();
         
         
         
        
         String query="UPDATE public.\"Seller1\"\n" +
"	SET id='"+idd+"', password='"+pas+"', \"Name\"='"+nm+"', \"City\"='"+ct+"', \"Animal\"='"+ani+"', \"Reg_date\"='"+dt+"'\n" +
"	WHERE id='"+idd+"' ;";
                 pst=conn.prepareStatement(query);
                pst.execute();
                
                JOptionPane.showMessageDialog(null, "Record Update Succesfully...!!!");
            
        
             } catch (SQLException ex) {
             Logger.getLogger(SELLER.class.getName()).log(Level.SEVERE, null, ex);
         }
        // TODO add your handling code here:
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
       
    }//GEN-LAST:event_b4ActionPerformed

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
            java.util.logging.Logger.getLogger(SELLER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SELLER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SELLER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SELLER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SELLER().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField tf1;
    // End of variables declaration//GEN-END:variables
}