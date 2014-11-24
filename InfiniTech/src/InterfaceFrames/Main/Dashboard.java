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
package InterfaceFrames.Main;

import Enumerations.LogType;
import InterfaceFrames.LoginSystem.LoginInterface;
import InterfaceFrames.LoginSystem.RegistrationInterface;
import InterfaceFrames.Tools.EventInterface;
import InterfaceFrames.Tools.LogInterface;
import InterfaceFrames.Tools.NukeConfirmInterface;
import Objects.Council;
import Objects.Event;
import Objects.Log;
import Objects.Student;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rave Noren Gidor-Sambo Villavicencio-Arevalo
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
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

        tabs = new javax.swing.JTabbedPane();
        dashboardTab = new javax.swing.JPanel();
        coucilDetailPane = new javax.swing.JPanel();
        labelName = new javax.swing.JLabel();
        infoName = new javax.swing.JTextField();
        labelDepartment = new javax.swing.JLabel();
        infoDepartment = new javax.swing.JTextField();
        labelYearLevel = new javax.swing.JLabel();
        infoYearLevel = new javax.swing.JTextField();
        actionsPane = new javax.swing.JPanel();
        registerNewStudent = new javax.swing.JButton();
        registerNewCouncil = new javax.swing.JButton();
        borrowEquipment = new javax.swing.JButton();
        viewEquipment = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        announcementPane = new javax.swing.JPanel();
        announcementScroller = new javax.swing.JScrollPane();
        announcement = new javax.swing.JTextArea();
        logout = new javax.swing.JButton();
        events = new javax.swing.JPanel();
        filterEventPane = new javax.swing.JPanel();
        labelEvent = new javax.swing.JLabel();
        eventsSelection = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        tools = new javax.swing.JMenuBar();
        showLog = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(650, 500));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        coucilDetailPane.setBorder(javax.swing.BorderFactory.createTitledBorder("Council"));
        coucilDetailPane.setLayout(new java.awt.GridLayout(0, 1));

        labelName.setText("Name");
        coucilDetailPane.add(labelName);
        coucilDetailPane.add(infoName);

        labelDepartment.setText("Department");
        coucilDetailPane.add(labelDepartment);
        coucilDetailPane.add(infoDepartment);

        labelYearLevel.setText("Year Level");
        coucilDetailPane.add(labelYearLevel);
        coucilDetailPane.add(infoYearLevel);

        actionsPane.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        actionsPane.setLayout(new java.awt.GridLayout(0, 2));

        registerNewStudent.setText("Register New Student");
        registerNewStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerNewStudentActionPerformed(evt);
            }
        });
        actionsPane.add(registerNewStudent);

        registerNewCouncil.setText("Register New Council Member");
        registerNewCouncil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerNewCouncilActionPerformed(evt);
            }
        });
        actionsPane.add(registerNewCouncil);

        borrowEquipment.setText("Borrow An Equipment");
        borrowEquipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrowEquipmentActionPerformed(evt);
            }
        });
        actionsPane.add(borrowEquipment);

        viewEquipment.setText("Manage Equipments");
        actionsPane.add(viewEquipment);

        jButton1.setText("View Students with Registered Shirtsizes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        actionsPane.add(jButton1);

        announcementPane.setBorder(javax.swing.BorderFactory.createTitledBorder("Announcements"));

        announcement.setColumns(20);
        announcement.setRows(5);
        announcementScroller.setViewportView(announcement);

        javax.swing.GroupLayout announcementPaneLayout = new javax.swing.GroupLayout(announcementPane);
        announcementPane.setLayout(announcementPaneLayout);
        announcementPaneLayout.setHorizontalGroup(
            announcementPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(announcementPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(announcementScroller)
                .addContainerGap())
        );
        announcementPaneLayout.setVerticalGroup(
            announcementPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(announcementScroller)
        );

        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dashboardTabLayout = new javax.swing.GroupLayout(dashboardTab);
        dashboardTab.setLayout(dashboardTabLayout);
        dashboardTabLayout.setHorizontalGroup(
            dashboardTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dashboardTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dashboardTabLayout.createSequentialGroup()
                        .addComponent(coucilDetailPane, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(announcementPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logout))
                    .addComponent(actionsPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        dashboardTabLayout.setVerticalGroup(
            dashboardTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboardTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dashboardTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dashboardTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(coucilDetailPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(announcementPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(actionsPane, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabs.addTab("Dashboard", dashboardTab);

        labelEvent.setText("Event");
        filterEventPane.add(labelEvent);

        eventsSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventsSelectionActionPerformed(evt);
            }
        });
        filterEventPane.add(eventsSelection);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Student Name", "Department", "Year", "Interest"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(100);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(100);
            jTable1.getColumnModel().getColumn(3).setMinWidth(80);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(80);
        }

        jLabel1.setText("Potential Representatives");

        javax.swing.GroupLayout eventsLayout = new javax.swing.GroupLayout(events);
        events.setLayout(eventsLayout);
        eventsLayout.setHorizontalGroup(
            eventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eventsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(eventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
                    .addGroup(eventsLayout.createSequentialGroup()
                        .addGroup(eventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(filterEventPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        eventsLayout.setVerticalGroup(
            eventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eventsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(filterEventPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabs.addTab("Events", events);

        showLog.setText("Tools");

        jMenuItem1.setText("Show Logs");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        showLog.add(jMenuItem1);

        jMenuItem2.setText("Customize Events");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        showLog.add(jMenuItem2);

        jMenuItem3.setText("Add Equipment");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        showLog.add(jMenuItem3);

        tools.add(showLog);

        jMenu1.setText("Nuke");

        jMenuItem4.setForeground(new java.awt.Color(255, 0, 51));
        jMenuItem4.setText("(WARNING) Nuke Database");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        tools.add(jMenu1);

        setJMenuBar(tools);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        infoName.setText("     " + getCouncil().getFirstName() + " " + getCouncil().getLastName());
        infoDepartment.setText("     " + getCouncil().getDepartment().toString());
        infoYearLevel.setText("     " + getCouncil().getYearLevel().toString());

        List<Event> evts = Event.getFinder().findAll();
        for (Event e : evts) {
            eventsSelection.addItem(e.getEventName());
        }

        eventsSelection.setSelectedIndex(0);
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        LogInterface logInterface = new LogInterface();
        logInterface.setCouncil(council);
        logInterface.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void registerNewCouncilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerNewCouncilActionPerformed
        RegistrationInterface registrationInterface = new RegistrationInterface();
        registrationInterface.activateGodAccount();
        registrationInterface.setVisible(true);
    }//GEN-LAST:event_registerNewCouncilActionPerformed

    private void registerNewStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerNewStudentActionPerformed
        RegistrationInterface registrationInterface = new RegistrationInterface();
        registrationInterface.setCouncil(getCouncil());
        registrationInterface.setVisible(true);
    }//GEN-LAST:event_registerNewStudentActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        logout();
    }//GEN-LAST:event_logoutActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        logout();
    }//GEN-LAST:event_formWindowClosed

    private void eventsSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventsSelectionActionPerformed

        jTable1 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Student ID", "Student Name", "Department", "Year", "Interest"
                }
        ));

        jScrollPane1.setViewportView(jTable1);

        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(100);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(100);
            jTable1.getColumnModel().getColumn(3).setMinWidth(80);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(80);
        }

        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();

        Event event = Event.getFinder().findRecordByField("eventName", (String) eventsSelection.getSelectedItem());
        List<Student> reps = event.getStudents();

        for (Student rep : reps) {
            String data1 = String.valueOf(rep.getId());
            String data2 = rep.getFirstName() + " " + rep.getLastName();
            String data3 = rep.getDepartment().toString();
            String data4 = rep.getYearLevel().toString();
            String data5 = rep.getInterest().replaceAll("\n", ",");

            String[] data = {data1, data2, data3, data4, data5};
            dtm.addRow(data);
        }

    }//GEN-LAST:event_eventsSelectionActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        EventInterface eventInterface = new EventInterface();
        eventInterface.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void borrowEquipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrowEquipmentActionPerformed
        BorrowEquipmentInterface borrowEquipmentInterface = new BorrowEquipmentInterface();
        borrowEquipmentInterface.setVisible(true);
    }//GEN-LAST:event_borrowEquipmentActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        AddEquipmentInterface addEquipmentInterface = new AddEquipmentInterface();
        addEquipmentInterface.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ShirtInterface shirtInterface = new ShirtInterface();
        shirtInterface.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        NukeConfirmInterface nukeConfirmInterface = new NukeConfirmInterface();
        nukeConfirmInterface.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    public void logout() {
        Log log = new Log();
        log.setLogType(LogType.LOGOUT);
        log.setLogDate(new Date());
        log.setDescription(council.getFirstName() + " has logged out.");
        council.getLogs().add(log);
        council.update();
        this.dispose();
        new LoginInterface().setVisible(true);
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    public static Council getCouncil() {
        return council;
    }

    public void setCouncil(Council council) {
        Dashboard.council = council;
    }

    private static Council council;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actionsPane;
    private javax.swing.JTextArea announcement;
    private javax.swing.JPanel announcementPane;
    private javax.swing.JScrollPane announcementScroller;
    private javax.swing.JButton borrowEquipment;
    private javax.swing.JPanel coucilDetailPane;
    private javax.swing.JPanel dashboardTab;
    private javax.swing.JPanel events;
    private javax.swing.JComboBox eventsSelection;
    private javax.swing.JPanel filterEventPane;
    private javax.swing.JTextField infoDepartment;
    private javax.swing.JTextField infoName;
    private javax.swing.JTextField infoYearLevel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelDepartment;
    private javax.swing.JLabel labelEvent;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelYearLevel;
    private javax.swing.JButton logout;
    private javax.swing.JButton registerNewCouncil;
    private javax.swing.JButton registerNewStudent;
    private javax.swing.JMenu showLog;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JMenuBar tools;
    private javax.swing.JButton viewEquipment;
    // End of variables declaration//GEN-END:variables
}
