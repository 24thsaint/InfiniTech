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
package com.infinitech.gui.tools;

import com.infinitech.enumerations.LogType;
import com.infinitech.gui.main.Dashboard;
import com.infinitech.objects.Council;
import com.infinitech.objects.Log;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rave Noren Gidor-Sambo Villavicencio-Arevalo
 */
public class LogInterface extends javax.swing.JFrame {

    /**
     * Creates new form LogInterface
     */
    public LogInterface() {
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

        filterPane = new javax.swing.JPanel();
        labelFilter = new javax.swing.JLabel();
        logType = new javax.swing.JComboBox();
        logsScroller = new javax.swing.JScrollPane();
        logs = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        filterPane.setLayout(new java.awt.GridLayout(1, 2));

        labelFilter.setText("Filter by:");
        filterPane.add(labelFilter);

        for (LogType l : LogType.values()) {
            logType.addItem(l.toString());
        }
        filterPane.add(logType);

        logs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Log Type", "Log Date", "Log Description"
            }
        ));
        logsScroller.setViewportView(logs);
        if (logs.getColumnModel().getColumnCount() > 0) {
            logs.getColumnModel().getColumn(0).setMinWidth(100);
            logs.getColumnModel().getColumn(0).setPreferredWidth(100);
            logs.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(filterPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 471, Short.MAX_VALUE))
                    .addComponent(logsScroller))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(filterPane, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logsScroller, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        resetTable();
        dtm = (DefaultTableModel) logs.getModel();

        for (Log l : council.getLogs()) {
            String data1 = l.getLogType().toString();
            String data2 = l.getLogDate().toString();
            String data3 = l.getDescription();
            System.out.println(data1);
            String[] data = {data1, data2, data3};
            dtm.addRow(data);
        }
    }//GEN-LAST:event_formWindowOpened

    private void resetTable() {
        logs.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Log Type", "Log Date", "Log Description"
                }
        ));
        logsScroller.setViewportView(logs);
        if (logs.getColumnModel().getColumnCount() > 0) {
            logs.getColumnModel().getColumn(0).setMinWidth(100);
            logs.getColumnModel().getColumn(0).setPreferredWidth(100);
            logs.getColumnModel().getColumn(0).setMaxWidth(100);
        }
    }

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
            java.util.logging.Logger.getLogger(LogInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogInterface().setVisible(true);
            }
        });
    }

    private DefaultTableModel dtm;
    private Council council;

    public void setCouncil(Council council) {
        this.council = council;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel filterPane;
    private javax.swing.JLabel labelFilter;
    private javax.swing.JComboBox logType;
    private javax.swing.JTable logs;
    private javax.swing.JScrollPane logsScroller;
    // End of variables declaration//GEN-END:variables
}
