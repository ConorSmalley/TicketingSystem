/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketing.system;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Conor
 */
public class Wireframe1 extends javax.swing.JFrame {

    UserAccountManager uam;
    private static SystemSupervisor s;
    Route currentRoute = null;
    Area currentArea = null;
    Employee currentEmployee;

    public Wireframe1(SystemSupervisor s) {
        this.s = s;
        initComponents();
        jComboBoxRoute.removeAllItems();
        this.s = s;
        for (Area a : s.getAreas()) {
            for (Route r : a.getRoutes()) {
//                System.out.println(r);
                jComboBoxRoute.addItem(r);
            }
        }
        jButtonScan.setVisible(false);
        jButtonLog.setVisible(false);
        jPanelLogInfringement.setVisible(false);
        jPanelScanTicket.setVisible(false);
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
        jButtonLogOut = new javax.swing.JButton();
        jButtonAccount = new javax.swing.JButton();
        jButtonSettings = new javax.swing.JButton();
        jButtonScan = new javax.swing.JButton();
        jButtonLog = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        jButtonFile = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jButtonView = new javax.swing.JButton();
        jButtonHelp = new javax.swing.JButton();
        jLabelActiveUser = new javax.swing.JLabel();
        jPanelSignIn = new javax.swing.JPanel();
        jButtonLogin = new javax.swing.JButton();
        jComboBoxRoute = new javax.swing.JComboBox();
        jLabelRoute = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jTextFieldPassword = new javax.swing.JTextField();
        jTextFieldEmployeeId = new javax.swing.JTextField();
        jLabelEmployeeID = new javax.swing.JLabel();
        jLabelSignIn = new javax.swing.JLabel();
        jPanelScanTicket = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanelLogInfringement = new javax.swing.JPanel();
        jComboBoxInfringementRoutes = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldDate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldTime = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

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

        jButtonScan.setText("Scan Ticket");
        jButtonScan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonScanActionPerformed(evt);
            }
        });

        jButtonLog.setText("Log Infringement");
        jButtonLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonLog, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonScan, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAccount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSettings)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonScan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonLog)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonLogOut)
                .addContainerGap())
        );

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

        jButtonLogin.setText("Confirm");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        jComboBoxRoute.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelRoute.setText("Route");

        jLabelPassword.setText("Password");

        jLabelEmployeeID.setText("Employee ID");

        jLabelSignIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSignIn.setText("Sign In");

        javax.swing.GroupLayout jPanelSignInLayout = new javax.swing.GroupLayout(jPanelSignIn);
        jPanelSignIn.setLayout(jPanelSignInLayout);
        jPanelSignInLayout.setHorizontalGroup(
            jPanelSignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSignInLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSignIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelSignInLayout.createSequentialGroup()
                        .addGroup(jPanelSignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelSignInLayout.createSequentialGroup()
                                .addGroup(jPanelSignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelEmployeeID)
                                    .addComponent(jLabelPassword)
                                    .addComponent(jLabelRoute))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelSignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxRoute, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldPassword)
                                    .addComponent(jTextFieldEmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelSignInLayout.setVerticalGroup(
            jPanelSignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSignInLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSignIn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelSignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmployeeID)
                    .addComponent(jTextFieldEmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelSignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPassword)
                    .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelSignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRoute)
                    .addComponent(jComboBoxRoute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonLogin)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ready For Ticket");

        jScrollPane1.setViewportView(jEditorPane1);

        jButton2.setText("Return");

        jButton3.setText("Log Infringement");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Charge Fair");

        javax.swing.GroupLayout jPanelScanTicketLayout = new javax.swing.GroupLayout(jPanelScanTicket);
        jPanelScanTicket.setLayout(jPanelScanTicketLayout);
        jPanelScanTicketLayout.setHorizontalGroup(
            jPanelScanTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelScanTicketLayout.createSequentialGroup()
                .addGroup(jPanelScanTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelScanTicketLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addGroup(jPanelScanTicketLayout.createSequentialGroup()
                        .addGroup(jPanelScanTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelScanTicketLayout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelScanTicketLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelScanTicketLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(80, 80, 80))
        );
        jPanelScanTicketLayout.setVerticalGroup(
            jPanelScanTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelScanTicketLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelScanTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        jComboBoxInfringementRoutes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Route:");

        jLabel4.setText("Bus Stop");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Date");

        jTextFieldDate.setText("jTextField1");

        jLabel6.setText("Time");

        jTextFieldTime.setText("jTextField2");

        jButton1.setText("Confirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLogInfringementLayout = new javax.swing.GroupLayout(jPanelLogInfringement);
        jPanelLogInfringement.setLayout(jPanelLogInfringementLayout);
        jPanelLogInfringementLayout.setHorizontalGroup(
            jPanelLogInfringementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogInfringementLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLogInfringementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxInfringementRoutes, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(121, 121, 121))
        );
        jPanelLogInfringementLayout.setVerticalGroup(
            jPanelLogInfringementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogInfringementLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxInfringementRoutes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelActiveUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelSignIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelScanTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelLogInfringement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelScanTicket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelSignIn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelLogInfringement, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        // TODO add your handling code here:
        if ((jTextFieldEmployeeId.getText().equals("") ? false
                : EmployeeAccountManager.getInstance().getEmployeeById(Integer.valueOf(jTextFieldEmployeeId.getText())) != null)
                && jTextFieldPassword.getText().equals(EmployeeAccountManager.getInstance().getEmployeeById(Integer.valueOf(jTextFieldEmployeeId.getText())).getPassword())) {
            currentEmployee = EmployeeAccountManager.getInstance().getEmployeeById(Integer.valueOf(jTextFieldEmployeeId.getText()));
            currentRoute = (Route) jComboBoxRoute.getSelectedItem();
            for (Area a : s.getAreas()) {
                if (a.getRoutes().contains(currentRoute)) {
                    currentArea = a;
                }
            }
            jLabelActiveUser.setText(jTextFieldEmployeeId.getText() + ", " + currentRoute.getRouteNo());

            jButtonScan.setVisible(true);
            jButtonLog.setVisible(true);
            jPanelSignIn.setVisible(false);
            jButtonLogOut.setEnabled(true);
            System.out.println(EmployeeAccountManager.getInstance().getEmployeeById(Integer.valueOf(jTextFieldEmployeeId.getText())));
            jTextFieldEmployeeId.setText("");
            jTextFieldPassword.setText("");
            jComboBoxInfringementRoutes.removeAllItems();
            for (Area a : s.getAreas()) {
                for (Route r : a.getRoutes()) {
//                    System.out.println(r);
                    jComboBoxInfringementRoutes.addItem(r);
                }
            }
            jComboBoxInfringementRoutes.setSelectedItem(currentRoute);
        }
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jButtonScanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonScanActionPerformed
        // TODO add your handling code here:
        jPanelScanTicket.setVisible(true);
        jPanelLogInfringement.setVisible(false);
    }//GEN-LAST:event_jButtonScanActionPerformed

    private void jButtonLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogActionPerformed
        // TODO add your handling code here:
        jPanelScanTicket.setVisible(false);
        jPanelLogInfringement.setVisible(true);
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        jTextFieldDate.setText(dateFormat.format(date));
        jTextFieldTime.setText(timeFormat.format(date));
    }//GEN-LAST:event_jButtonLogActionPerformed

    private void jButtonLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogOutActionPerformed
        // TODO add your handling code here:
        jButtonScan.setVisible(false);
        jButtonLog.setVisible(false);
        jPanelSignIn.setVisible(true);
        jPanelScanTicket.setVisible(false);
        jPanelLogInfringement.setVisible(false);
        jButtonLogOut.setEnabled(false);
        jLabelActiveUser.setText("No Active User");


    }//GEN-LAST:event_jButtonLogOutActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            DateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.ENGLISH);
            Date date = format.parse(jTextFieldDate.getText() + " " + jTextFieldTime.getText());
//            System.out.println(date); // Sat Jan 02 00:00:00 GMT 2010
            Route tempRoute =(Route) jComboBoxInfringementRoutes.getSelectedItem();
            currentArea.logInfringement(date, tempRoute, null, currentEmployee.getId());
        } catch (ParseException ex) {
            System.out.println("Fucked upp");
            Logger.getLogger(Wireframe1.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.ENGLISH);
        currentArea.logInfringement(new Date(), currentRoute, null, currentEmployee.getId());
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Wireframe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Wireframe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Wireframe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Wireframe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Wireframe1(s).setVisible(true);
            }
        });
    }

    private void Serialize() throws IOException {
        FileOutputStream out = new FileOutputStream("data.ser");
        ObjectOutputStream oos = new ObjectOutputStream(out);
        oos.writeObject(uam);
        out.close();
    }

    private void Deserialize() throws IOException, ClassNotFoundException {
        FileInputStream in = new FileInputStream("data.ser");
        ObjectInputStream ois = new ObjectInputStream(in);
        uam = (UserAccountManager) ois.readObject();
        in.close();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonAccount;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonFile;
    private javax.swing.JButton jButtonHelp;
    private javax.swing.JButton jButtonLog;
    private javax.swing.JButton jButtonLogOut;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonScan;
    private javax.swing.JButton jButtonSettings;
    private javax.swing.JButton jButtonView;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBoxInfringementRoutes;
    private javax.swing.JComboBox jComboBoxRoute;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelActiveUser;
    private javax.swing.JLabel jLabelEmployeeID;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelRoute;
    private javax.swing.JLabel jLabelSignIn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelLogInfringement;
    private javax.swing.JPanel jPanelScanTicket;
    private javax.swing.JPanel jPanelSignIn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldDate;
    private javax.swing.JTextField jTextFieldEmployeeId;
    private javax.swing.JTextField jTextFieldPassword;
    private javax.swing.JTextField jTextFieldTime;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
