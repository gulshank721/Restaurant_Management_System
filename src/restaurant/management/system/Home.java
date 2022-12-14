/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package restaurant.management.system;

import javax.swing.JOptionPane;

/**
 *
 * @author Lrnovo
 */
public class Home extends javax.swing.JFrame {

    String email = null;

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }

    public Home(String Useremail) {
        initComponents();
        email = Useremail;
        if (!email.equals("admin@gmail.com")) {
            btnManageCategory.setVisible(false);
            btnNewProduct.setVisible(false);
            btnVerifyUsers.setVisible(false);
            btnViewEditDeleteProduct.setVisible(false);
        } else {
            labelWelcome.setText("WELCOME ADMIN");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogout = new javax.swing.JButton();
        btnPlaceOrder = new javax.swing.JButton();
        btnViewBillOrderDetails = new javax.swing.JButton();
        btnChangePassword = new javax.swing.JButton();
        btnChangeSecurityQuestion = new javax.swing.JButton();
        btnManageCategory = new javax.swing.JButton();
        btnNewProduct = new javax.swing.JButton();
        btnViewEditDeleteProduct = new javax.swing.JButton();
        btnVerifyUsers = new javax.swing.JButton();
        labelWelcome = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        btnPlaceOrder.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPlaceOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/place order.png"))); // NOI18N
        btnPlaceOrder.setText("Place Order");
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlaceOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));

        btnViewBillOrderDetails.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnViewBillOrderDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/View Bills & Order Placed Details.png"))); // NOI18N
        btnViewBillOrderDetails.setText("View Bills & Order Deatils");
        btnViewBillOrderDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewBillOrderDetailsActionPerformed(evt);
            }
        });
        getContentPane().add(btnViewBillOrderDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, -1, -1));

        btnChangePassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnChangePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/change Password.png"))); // NOI18N
        btnChangePassword.setText("Change Password");
        btnChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordActionPerformed(evt);
            }
        });
        getContentPane().add(btnChangePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, -1, -1));

        btnChangeSecurityQuestion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnChangeSecurityQuestion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/change Security Question.png"))); // NOI18N
        btnChangeSecurityQuestion.setText("Change Security Question");
        btnChangeSecurityQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeSecurityQuestionActionPerformed(evt);
            }
        });
        getContentPane().add(btnChangeSecurityQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 50, -1, -1));

        btnManageCategory.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnManageCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/category.png"))); // NOI18N
        btnManageCategory.setText("Manage Category");
        btnManageCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCategoryActionPerformed(evt);
            }
        });
        getContentPane().add(btnManageCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 590, -1, -1));

        btnNewProduct.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNewProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new product.png"))); // NOI18N
        btnNewProduct.setText("New Product");
        btnNewProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewProductActionPerformed(evt);
            }
        });
        getContentPane().add(btnNewProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 590, -1, -1));

        btnViewEditDeleteProduct.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnViewEditDeleteProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view edit delete product.png"))); // NOI18N
        btnViewEditDeleteProduct.setText("View,Edit & Delete Product");
        btnViewEditDeleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewEditDeleteProductActionPerformed(evt);
            }
        });
        getContentPane().add(btnViewEditDeleteProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 590, -1, -1));

        btnVerifyUsers.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVerifyUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/verify users.png"))); // NOI18N
        btnVerifyUsers.setText("Verify Users");
        btnVerifyUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifyUsersActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerifyUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 590, -1, -1));

        labelWelcome.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        labelWelcome.setForeground(new java.awt.Color(0, 204, 204));
        labelWelcome.setText("welcome");
        getContentPane().add(labelWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 290, 30));

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit small.png"))); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 60, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home-background-image.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you Really Want to exit", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0)
            System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnManageCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCategoryActionPerformed
        // TODO add your handling code here:
        new ManageCategory().setVisible(true);
    }//GEN-LAST:event_btnManageCategoryActionPerformed

    private void btnNewProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewProductActionPerformed
        // TODO add your handling code here:
        
        new NewProduct().setVisible(true);
    }//GEN-LAST:event_btnNewProductActionPerformed

    private void btnViewEditDeleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewEditDeleteProductActionPerformed
        // TODO add your handling code here:
        new ViewProductEdit().setVisible(true);
    }//GEN-LAST:event_btnViewEditDeleteProductActionPerformed

    private void btnVerifyUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerifyUsersActionPerformed
        // TODO add your handling code here:
        new Verify().setVisible(true);
    }//GEN-LAST:event_btnVerifyUsersActionPerformed

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
        // TODO add your handling code here:
        new PlaceOrder(email).setVisible(true);
    }//GEN-LAST:event_btnPlaceOrderActionPerformed

    private void btnViewBillOrderDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewBillOrderDetailsActionPerformed
        // TODO add your handling code here:
        new ViewEditPlacedOrder().setVisible(true);
    }//GEN-LAST:event_btnViewBillOrderDetailsActionPerformed

    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordActionPerformed
        // TODO add your handling code here:
        new changePassword(email).setVisible(true);
    }//GEN-LAST:event_btnChangePasswordActionPerformed

    private void btnChangeSecurityQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeSecurityQuestionActionPerformed
        // TODO add your handling code here:
        new ChangeSecurityQuestion(email).setVisible(true);
    }//GEN-LAST:event_btnChangeSecurityQuestionActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JButton btnChangeSecurityQuestion;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnManageCategory;
    private javax.swing.JButton btnNewProduct;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JButton btnVerifyUsers;
    private javax.swing.JButton btnViewBillOrderDetails;
    private javax.swing.JButton btnViewEditDeleteProduct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelWelcome;
    // End of variables declaration//GEN-END:variables
}
