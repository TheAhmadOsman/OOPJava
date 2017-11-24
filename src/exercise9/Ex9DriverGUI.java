/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise9;

import javax.swing.JOptionPane;

/**
 * 
 * Class Ex9DriverGUI
 * @author Ahmad M. Osman
 * @assignment Week 6: Exercise 9
 * 
**/

public class Ex9DriverGUI extends javax.swing.JFrame {

    /**
     * Creates new form Ex9DriverGUI
     */
    public Ex9DriverGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldEnteredTemp = new javax.swing.JTextField();
        jComboBoxFromTemp = new javax.swing.JComboBox<>();
        jButtonConvert = new javax.swing.JButton();
        jComboBoxToTemp = new javax.swing.JComboBox<>();
        jLabelConvertedTemp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Unit Converter");

        jTextFieldEnteredTemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEnteredTempActionPerformed(evt);
            }
        });

        jComboBoxFromTemp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius", "Fahrenheit", "Kelvin" }));
        jComboBoxFromTemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFromTempActionPerformed(evt);
            }
        });

        jButtonConvert.setText("Convert");
        jButtonConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConvertActionPerformed(evt);
            }
        });

        jComboBoxToTemp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius", "Fahrenheit", "Kelvin" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonConvert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldEnteredTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jComboBoxFromTemp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabelConvertedTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jComboBoxToTemp, 0, 127, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxFromTemp)
                    .addComponent(jTextFieldEnteredTemp))
                .addGap(18, 18, 18)
                .addComponent(jButtonConvert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelConvertedTemp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxToTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jComboBoxToTemp, jLabelConvertedTemp});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jComboBoxFromTemp, jTextFieldEnteredTemp});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldEnteredTempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEnteredTempActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEnteredTempActionPerformed

    private void jButtonConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConvertActionPerformed
        
        double temp;
        
        try {
            temp = Double.parseDouble(jTextFieldEnteredTemp.getText());
        } catch (Exception ex) {
            // System.out.println("Error: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, String.format(("Error: " + ex.getMessage() + ". Please enter a valid numerical value!")));
            // This throw is needed for no further processing to be done.
            throw new RuntimeException(ex);
        }
        
        Ex9Converter converting = new Ex9Converter();
        double converted;
        
        if(jComboBoxFromTemp.getSelectedItem() == jComboBoxToTemp.getSelectedItem()) {
            jLabelConvertedTemp.setText(String.format("%.2f", temp));
        }
        else if(jComboBoxFromTemp.getSelectedItem() == "Celsius") {
            if(jComboBoxToTemp.getSelectedItem() == "Fahrenheit") {
                converted = converting.c2f(temp);
                jLabelConvertedTemp.setText(String.format("%.2f", converted));            
            }
            else {
                converted = converting.c2k(temp);
                jLabelConvertedTemp.setText(String.format("%.2f", converted));
            }
        }
        else if(jComboBoxFromTemp.getSelectedItem() == "Fahrenheit") {
            if(jComboBoxToTemp.getSelectedItem() == "Celsius") {
                converted = converting.f2c(temp);
                jLabelConvertedTemp.setText(String.format("%.2f", converted));            
            }
            else {
                converted = converting.f2k(temp);
                jLabelConvertedTemp.setText(String.format("%.2f", converted));
            }
        }
        else {
            if(jComboBoxToTemp.getSelectedItem() == "Celsius") {
                converted = converting.k2c(temp);
                jLabelConvertedTemp.setText(String.format("%.2f", converted));            
            }
            else {
                converted = converting.k2f(temp);
                jLabelConvertedTemp.setText(String.format("%.2f", converted));
        }
    }//GEN-LAST:event_jButtonConvertActionPerformed
}
    private void jComboBoxFromTempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFromTempActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxFromTempActionPerformed

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
            java.util.logging.Logger.getLogger(Ex9DriverGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ex9DriverGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ex9DriverGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ex9DriverGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ex9DriverGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConvert;
    private javax.swing.JComboBox<String> jComboBoxFromTemp;
    private javax.swing.JComboBox<String> jComboBoxToTemp;
    private javax.swing.JLabel jLabelConvertedTemp;
    private javax.swing.JTextField jTextFieldEnteredTemp;
    // End of variables declaration//GEN-END:variables
}