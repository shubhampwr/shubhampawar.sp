/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A;

import javax.swing.JFrame;

/**
 *
 * @author LENOVO
 */
public class JFrame3 extends javax.swing.JFrame {

    JFrame f3;
    /**
     * Creates new form JFrame3
     */
    public JFrame3() {
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

        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        IMAGE = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(600, 400));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.TOOLKIT_EXCLUDE);
        getContentPane().setLayout(null);

        l1.setBackground(new java.awt.Color(255, 255, 102));
        l1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 255, 102));
        l1.setText("°°SHREE MILK HOUSE .Ltd°°");
        getContentPane().add(l1);
        l1.setBounds(20, 10, 500, 52);

        l2.setBackground(new java.awt.Color(255, 255, 102));
        l2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        l2.setForeground(new java.awt.Color(255, 255, 102));
        l2.setText(" HOME ADMIN  :");
        getContentPane().add(l2);
        l2.setBounds(200, 60, 160, 40);

        b1.setBackground(new java.awt.Color(153, 255, 0));
        b1.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        b1.setForeground(new java.awt.Color(50, 199, 10));
        b1.setText("ADD SELLER");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(50, 110, 150, 40);

        b2.setBackground(new java.awt.Color(153, 255, 0));
        b2.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        b2.setForeground(new java.awt.Color(50, 199, 10));
        b2.setText("MILK PURCHASE");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(50, 160, 150, 40);

        b3.setBackground(new java.awt.Color(153, 255, 0));
        b3.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        b3.setForeground(new java.awt.Color(50, 199, 10));
        b3.setText("MILK SELL");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3);
        b3.setBounds(50, 210, 150, 40);

        b4.setBackground(new java.awt.Color(153, 255, 0));
        b4.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        b4.setForeground(new java.awt.Color(50, 199, 10));
        b4.setText("ITEM");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4);
        b4.setBounds(50, 260, 150, 40);

        jButton1.setBackground(new java.awt.Color(153, 255, 0));
        jButton1.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(50, 199, 10));
        jButton1.setText("PRODUCT SELL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(50, 310, 150, 40);

        IMAGE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/A/222.png"))); // NOI18N
        IMAGE.setMinimumSize(new java.awt.Dimension(600, 400));
        getContentPane().add(IMAGE);
        IMAGE.setBounds(-110, -20, 710, 420);

        getAccessibleContext().setAccessibleName("f3");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
new Milk_Sell().setVisible(true);  this.dispose();      // TODO add your handling code here:
    }//GEN-LAST:event_b3ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        new SELLER().setVisible(true);  this.dispose();
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed

        new MILK_SUBMIT().setVisible(true);  this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_b2ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       new Item().setVisible(true);  
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IMAGE;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    // End of variables declaration//GEN-END:variables
}
