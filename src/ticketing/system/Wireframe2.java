/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketing.system;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Conor
 */
public class Wireframe2 extends javax.swing.JFrame {

    /**
     * Creates new form Wireframe2
     */
    private static SystemSupervisor s;
    boolean loggedIn = false;
    boolean buttonPressed = false;
    Wireframe2Passenger wp;
    List<Vehicle> vehicles;
    Employee activeUser;
    Route activeRoute;

    public Wireframe2(SystemSupervisor s) {
        this.vehicles = new ArrayList();
        initComponents();
        jComboBoxRoute.removeAllItems();
        Wireframe2.s = s;
        for (Area a : s.getAreas()) {
            for (Route r : a.getRoutes()) {
                System.out.println(r);
                jComboBoxRoute.addItem(r);
                vehicles.add(new Vehicle(r));
            }
        }

    }

    public void login() {
        activeRoute = (Route) jComboBoxRoute.getSelectedItem();
        jLabelSignIn.setText("Ready for digital ticket");
        jButtonLogin.setText("Paper Tickets");
        jLabelActiveUser.setText(activeUser.toString() + ", " + activeRoute.getRouteNo());
        jLabelEmployeeId.setVisible(false);
        jLabelPassword.setVisible(false);
        jLabelRoute.setVisible(false);
        jTextFieldEmployeeId.setVisible(false);
        jTextFieldPassword.setVisible(false);
        jComboBoxRoute.setVisible(false);
        loggedIn = true;
        wp = new Wireframe2Passenger();
        wp.setVisible(true);
        jButtonDT.setEnabled(true);
        jButtonBuyDT.setEnabled(true);
        jButtonLogOut.setEnabled(true);
    }

    public void logout() {
        wp.setVisible(false);
        jLabelActiveUser.setText("No Active User");
        jLabelEmployeeId.setVisible(true);
        jLabelPassword.setVisible(true);
        jLabelRoute.setVisible(true);
        jTextFieldEmployeeId.setVisible(true);
        jTextFieldPassword.setVisible(true);
        jComboBoxRoute.setVisible(true);
        jButtonDT.setEnabled(false);
        jButtonBuyDT.setEnabled(false);
        jButtonLogOut.setEnabled(false);
        loggedIn = false;
        jLabelSignIn.setText("Sign in");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jButtonFile = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jButtonView = new javax.swing.JButton();
        jButtonHelp = new javax.swing.JButton();
        jLabelActiveUser = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonLogOut = new javax.swing.JButton();
        jButtonAccount = new javax.swing.JButton();
        jButtonSettings = new javax.swing.JButton();
        jButtonLogin = new javax.swing.JButton();
        jComboBoxRoute = new javax.swing.JComboBox();
        jLabelRoute = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jLabelEmployeeId = new javax.swing.JLabel();
        jLabelSignIn = new javax.swing.JLabel();
        jTextFieldEmployeeId = new javax.swing.JTextField();
        jTextFieldPassword = new javax.swing.JTextField();
        jButtonDT = new javax.swing.JButton();
        jButtonBuyDT = new javax.swing.JButton();

        jToolBar1.setRollover(true);

        jButtonFile.setText("File");
        jButtonFile.setFocusable(false);
        jButtonFile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonFile.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButtonFile);

        jButtonEdit.setText("Edit");
        jButtonEdit.setFocusable(false);
        jButtonEdit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonEdit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButtonEdit);

        jButtonView.setText("View");
        jButtonView.setFocusable(false);
        jButtonView.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonView.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButtonView);

        jButtonHelp.setText("Help");
        jButtonHelp.setFocusable(false);
        jButtonHelp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonHelp.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButtonHelp);

        jLabelActiveUser.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelActiveUser.setText("No Active User");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonLogOut.setText("Log Out");
        jButtonLogOut.setEnabled(false);
        jButtonLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogOutActionPerformed(evt);
            }
        });

        jButtonAccount.setText("Account");

        jButtonSettings.setText("Settings");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAccount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSettings)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonLogOut)
                .addContainerGap())
        );

        jButtonLogin.setText("Confirm");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        jComboBoxRoute.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelRoute.setText("Route");

        jLabelPassword.setText("Password");

        jLabelEmployeeId.setText("Employee ID");

        jLabelSignIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSignIn.setText("Sign In");

        jTextFieldEmployeeId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmployeeIdActionPerformed(evt);
            }
        });

        jButtonDT.setText("DT");
        jButtonDT.setEnabled(false);
        jButtonDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDTActionPerformed(evt);
            }
        });

        jButtonBuyDT.setText("Buy DT");
        jButtonBuyDT.setToolTipText("");
        jButtonBuyDT.setEnabled(false);
        jButtonBuyDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuyDTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(93, 93, 93)
                                        .addComponent(jButtonLogin))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelEmployeeId)
                                            .addComponent(jLabelPassword)
                                            .addComponent(jLabelRoute))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jComboBoxRoute, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextFieldPassword)
                                            .addComponent(jTextFieldEmployeeId))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonDT)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonBuyDT)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jLabelSignIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelActiveUser, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jLabelActiveUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelSignIn)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelEmployeeId)
                            .addComponent(jTextFieldEmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPassword)
                            .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelRoute)
                            .addComponent(jComboBoxRoute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(jButtonLogin)
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonDT)
                            .addComponent(jButtonBuyDT))
                        .addContainerGap())
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        // TODO add your handling code here:
        if (!loggedIn) {
            if (jTextFieldEmployeeId.getText().isEmpty() || jTextFieldPassword.getText().isEmpty()) {
                // inset message here
            } else {
                activeUser = EmployeeAccountManager.getInstance().getEmployeeById(Integer.valueOf(jTextFieldEmployeeId.getText()));
                if (activeUser != null && jTextFieldPassword.getText().equals(activeUser.getPassword())) {
                    login();
                } else {
                    //insert incorrect message here 
                }
            }
        } else {
            if (buttonPressed) {
                jButtonLogin.setText("Paper Tickets");
                wp.changeLine1("Please Scan Your Digital Ticket");
                wp.changeLine2("Line ticket bar code up with camera to scan, or alternativly hold digital ticket near device");
                wp.changeLine3("");
                wp.changeLine4("");
                buttonPressed = false;
                wp.hidePaperTicket();
            } else {
                wp.changeLine1("Paper Ticket Options");
                wp.changeLine2("");
                wp.changeLine3("");
                wp.changeLine4("");
                wp.showPaperTicket();
            }
        }
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jButtonDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDTActionPerformed
        // TODO add your handling code here:
        Vehicle vehicle = null;
        for(Vehicle v : vehicles){
            if(v.getRoute().equals(activeRoute)){
                vehicle = v;
            }
        }
        vehicle.getGateway().handleToken(vehicle.getGateway().getReader().scanToken());
        buttonPressed = true;
        jButtonLogin.setText("Return");
        wp.changeLine1("Your MegaRider Pass Has Been Accepted");
        wp.changeLine2("");
        wp.changeLine3("");
        wp.changeLine4("We hope you have a safe and enjoyable trip");
    }//GEN-LAST:event_jButtonDTActionPerformed

    private void jButtonBuyDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuyDTActionPerformed
        // TODO add your handling code here:
        buttonPressed = true;
        jButtonLogin.setText("Return");
        wp.changeLine1("Would You Like To Purchase A Digital Ticket?");
        wp.changeLine3("Fare is £3.00");
        wp.changeLine2("Half Fare discount will be applied if you scan off within two stops");
        wp.changeLine4("");
    }//GEN-LAST:event_jButtonBuyDTActionPerformed

    private void jTextFieldEmployeeIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmployeeIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmployeeIdActionPerformed

    private void jButtonLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogOutActionPerformed
        // TODO add your handling code here:
        logout();
    }//GEN-LAST:event_jButtonLogOutActionPerformed

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
            java.util.logging.Logger.getLogger(Wireframe2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Wireframe2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Wireframe2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Wireframe2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Wireframe2(s).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAccount;
    private javax.swing.JButton jButtonBuyDT;
    private javax.swing.JButton jButtonDT;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonFile;
    private javax.swing.JButton jButtonHelp;
    private javax.swing.JButton jButtonLogOut;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonSettings;
    private javax.swing.JButton jButtonView;
    private javax.swing.JComboBox jComboBoxRoute;
    private javax.swing.JLabel jLabelActiveUser;
    private javax.swing.JLabel jLabelEmployeeId;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelRoute;
    private javax.swing.JLabel jLabelSignIn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldEmployeeId;
    private javax.swing.JTextField jTextFieldPassword;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
