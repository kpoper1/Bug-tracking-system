/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;
import java.sql.*;
import javax.swing.*;
import java.util.*;
/**
 *
 * @author Donya
 */
public class Testerview extends javax.swing.JFrame {

    /**
     * Creates new form Testerview
     */
    public Testerview() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        viewbugs = new javax.swing.JButton();
        em = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("E:\\College resources\\Terms\\Third Term\\PL2\\icon\\iconfinder_netvibes-social-media-logo_2215361.png")); // NOI18N
        jButton1.setText("Add new bug");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tester");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 200, 100));

        viewbugs.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        viewbugs.setIcon(new javax.swing.ImageIcon("E:\\College resources\\Terms\\Third Term\\PL2\\icon\\iconfinder_find_370082.png")); // NOI18N
        viewbugs.setText("view bugs");
        viewbugs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbugsActionPerformed(evt);
            }
        });
        getContentPane().add(viewbugs, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, -1, 74));

        em.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        em.setIcon(new javax.swing.ImageIcon("E:\\College resources\\Terms\\Third Term\\PL2\\icon\\iconfinder_letter_291048.png")); // NOI18N
        em.setText("Email");
        em.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emActionPerformed(evt);
            }
        });
        getContentPane().add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 610, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\G\\Desktop\\98d31b35-5d6f-4402-8867-59d66ec53f19.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 1120, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
new Newbug().setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void viewbugsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbugsActionPerformed
new bugtable().setVisible(true);               // TODO add your handling code here:
    }//GEN-LAST:event_viewbugsActionPerformed

    private void emActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emActionPerformed
 new Etodev().setVisible(true);          
    }//GEN-LAST:event_emActionPerformed

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
            java.util.logging.Logger.getLogger(Testerview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Testerview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Testerview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Testerview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Testerview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton em;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton viewbugs;
    // End of variables declaration//GEN-END:variables
}
