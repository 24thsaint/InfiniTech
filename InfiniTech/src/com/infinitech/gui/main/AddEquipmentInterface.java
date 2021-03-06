/*
 *  ==++++++++++++++++++++++++++++++++++++++++++++++++++++==
 *  |      CENTRAL PHILIPPINE UNIVERSITY                   |
 *  |      Bachelor of Science in Software Engineering     |
 *  |      Jaro, Iloilo City, Philippines                  |
 *  |                                                      |
 *  |          This program is written by Rave, ©2014.     |
 *  |          You are free to use and distribute this.    |
 *  |          Reach me at: admin@blackout.biz.tm          |
 *  |                                                      |
 *  |               ~~~"CODE the FUTURE"~~~                |
 *  ==++++++++++++++++++++++++++++++++++++++++++++++++++++==
 */
package com.infinitech.gui.main;

import com.infinitech.objects.Item;
import javax.persistence.NoResultException;
import javax.swing.JOptionPane;

/**
 *
 * @author Rave Noren Gidor-Sambo Villavicencio-Arevalo
 */
public class AddEquipmentInterface extends javax.swing.JFrame {

    /**
     * Creates new form AddEquipmentInterface
     */
    public AddEquipmentInterface() {
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

        labelEquipName = new javax.swing.JLabel();
        equipmentName = new javax.swing.JTextField();
        labelQuantity = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        actionSave = new javax.swing.JButton();
        actionDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelEquipName.setText("Equipment Name");

        equipmentName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                equipmentNameFocusLost(evt);
            }
        });
        equipmentName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                equipmentNameKeyPressed(evt);
            }
        });

        labelQuantity.setText("Quantity");

        actionSave.setText("Add");
        actionSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionSaveActionPerformed(evt);
            }
        });

        actionDelete.setText("Delete");
        actionDelete.setEnabled(false);
        actionDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelEquipName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(equipmentName)
                            .addComponent(quantity)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 137, Short.MAX_VALUE)
                        .addComponent(actionDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(actionSave)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equipmentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEquipName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelQuantity)
                    .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(actionSave)
                    .addComponent(actionDelete))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private Item item;
    private boolean isItemNew = false;

    private void actionSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionSaveActionPerformed
        if (equipmentName.getText().isEmpty() || quantity.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Invalid details", "Invalid", JOptionPane.ERROR_MESSAGE);
            return;
        }
        item.setItemName(equipmentName.getText());
        item.setQuantity(Integer.parseInt(quantity.getText()));
        if (isItemNew) {
            item.save();
        } else {
            item.update();
        }
        JOptionPane.showMessageDialog(null, "Item Saved!", "Success", JOptionPane.INFORMATION_MESSAGE);
        equipmentName.setText("");
        quantity.setText("");
    }//GEN-LAST:event_actionSaveActionPerformed

    private void equipmentNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_equipmentNameFocusLost
        try {
            item = Item.getFinder().findRecordByField("itemName", equipmentName.getText());
        } catch (NoResultException e) {
            isItemNew = true;
            actionSave.setText("Add");
            actionDelete.setEnabled(false);
            return;
        }
        
        isItemNew = false;
        equipmentName.setText(item.getItemName());
        quantity.setText(String.valueOf(item.getQuantity()));
        actionSave.setText("Update");
        actionDelete.setEnabled(true);

    }//GEN-LAST:event_equipmentNameFocusLost

    private void actionDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionDeleteActionPerformed
        Item.delete(item);
        int confirm = JOptionPane.showConfirmDialog(
                null,
                "Are you sure you want to remove equipment " + equipmentName.getText() + "?",
                "Confirm",
                JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Item Deleted!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            //do nothing
        }
    }//GEN-LAST:event_actionDeleteActionPerformed

    private void equipmentNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_equipmentNameKeyPressed
        actionDelete.setEnabled(false);
        actionSave.setText("Add");
    }//GEN-LAST:event_equipmentNameKeyPressed

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
            java.util.logging.Logger.getLogger(AddEquipmentInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEquipmentInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEquipmentInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEquipmentInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEquipmentInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actionDelete;
    private javax.swing.JButton actionSave;
    private javax.swing.JTextField equipmentName;
    private javax.swing.JLabel labelEquipName;
    private javax.swing.JLabel labelQuantity;
    private javax.swing.JTextField quantity;
    // End of variables declaration//GEN-END:variables
}
