/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infinitech.gui.loginsystem;

import com.infinitech.enumerations.Gender;
import com.infinitech.enumerations.LogType;
import com.infinitech.enumerations.Department;
import com.infinitech.enumerations.YearLevel;
import com.infinitech.enumerations.ShirtSize;
import com.infinitech.objects.Council;
import com.infinitech.objects.Event;
import com.infinitech.objects.Log;
import com.infinitech.objects.Shirt;
import com.infinitech.objects.Student;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author violet
 */
public class RegistrationInterface extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public RegistrationInterface() {
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

        jPanel1 = new javax.swing.JPanel();
        labelHeader = new javax.swing.JLabel();
        rootPanel = new javax.swing.JPanel();
        labelIDNumber = new javax.swing.JLabel();
        idNumber = new javax.swing.JFormattedTextField();
        labelPassword = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        labelFirstName = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        labelLastName = new javax.swing.JLabel();
        lastName = new javax.swing.JTextField();
        labelDepartment = new javax.swing.JLabel();
        department = new javax.swing.JComboBox();
        labelYear = new javax.swing.JLabel();
        yearLevel = new javax.swing.JComboBox();
        labelGender = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox();
        labelShirtSize = new javax.swing.JLabel();
        shirtSize = new javax.swing.JComboBox();
        labelCustomSize = new javax.swing.JLabel();
        customSize = new javax.swing.JTextField();
        labelInterest = new javax.swing.JLabel();
        interestScroller = new javax.swing.JScrollPane();
        interests = new javax.swing.JTextArea();
        labelEmail = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        labelContact = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        labelPayment = new javax.swing.JLabel();
        payment = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        coordinatorCheck = new javax.swing.JCheckBox();
        actionRegister = new javax.swing.JButton();
        actionCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        labelHeader.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        labelHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHeader.setText("Register Student");

        rootPanel.setLayout(new java.awt.GridLayout(0, 2));

        labelIDNumber.setText("ID Number");
        rootPanel.add(labelIDNumber);

        try {
            idNumber.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        idNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rootPanel.add(idNumber);

        labelPassword.setText("Password");
        rootPanel.add(labelPassword);

        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rootPanel.add(password);

        labelFirstName.setText("First Name");
        rootPanel.add(labelFirstName);
        rootPanel.add(firstName);

        labelLastName.setText("Last Name");
        rootPanel.add(labelLastName);
        rootPanel.add(lastName);

        labelDepartment.setText("Department");
        rootPanel.add(labelDepartment);

        for(Department d : Department.values()) {
            department.addItem(d);
        }
        rootPanel.add(department);

        labelYear.setText("Year");
        rootPanel.add(labelYear);

        for(YearLevel y: YearLevel.values()) {
            yearLevel.addItem(y);
        }
        rootPanel.add(yearLevel);

        labelGender.setText("Gender");
        rootPanel.add(labelGender);

        for(Gender g : Gender.values()) {
            gender.addItem(g);
        }
        rootPanel.add(gender);

        labelShirtSize.setText("Shirtsize");
        rootPanel.add(labelShirtSize);

        for(ShirtSize s : ShirtSize.values()) {
            shirtSize.addItem(s);
        }
        shirtSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shirtSizeActionPerformed(evt);
            }
        });
        rootPanel.add(shirtSize);

        labelCustomSize.setText("Custom Size:");
        rootPanel.add(labelCustomSize);
        rootPanel.add(customSize);

        labelInterest.setText("Interests (1 interest per line)");
        rootPanel.add(labelInterest);

        interests.setColumns(20);
        interests.setLineWrap(true);
        interests.setRows(5);
        interests.setWrapStyleWord(true);
        interestScroller.setViewportView(interests);

        rootPanel.add(interestScroller);

        labelEmail.setText("Email");
        rootPanel.add(labelEmail);
        rootPanel.add(email);

        labelContact.setText("Contact");
        rootPanel.add(labelContact);
        rootPanel.add(contact);

        labelPayment.setText("Payment");
        rootPanel.add(labelPayment);

        payment.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        payment.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rootPanel.add(payment);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 196, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        rootPanel.add(jPanel2);

        coordinatorCheck.setText("Coordinator");
        rootPanel.add(coordinatorCheck);

        actionRegister.setText("Register");
        actionRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionRegisterActionPerformed(evt);
            }
        });

        actionCancel.setText("Cancel");
        actionCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rootPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(actionRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(actionCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rootPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(actionRegister, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(actionCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void actionCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_actionCancelActionPerformed

    private void actionRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionRegisterActionPerformed
        String id = idNumber.getText().replaceAll("-", "");

        Shirt shirt = new Shirt();
        shirt.setClaimed(false);
        shirt.setShirtSize(
                customSize.isVisible() ? customSize.getText()
                        : shirtSize.getSelectedItem().toString()
        );

        System.out.println(shirt.getShirtSize());
        System.out.println(shirt.hasClaimed());

        if (councilAccounRegistration) {
            Council regCouncil = new Council();
            regCouncil.setId(Long.parseLong(id));
            regCouncil.setFirstName(firstName.getText());
            regCouncil.setLastName(lastName.getText());
            regCouncil.setPassword(String.valueOf(password.getPassword()));
            regCouncil.setDepartment(Department.values()[department.getSelectedIndex()]);
            regCouncil.setGender(Gender.values()[gender.getSelectedIndex()]);
            regCouncil.setYearLevel(YearLevel.values()[yearLevel.getSelectedIndex()]);

            regCouncil.setShirt(shirt);
            regCouncil.setInterest(interests.getText().toUpperCase());
            regCouncil.setEmail(email.getText());
            regCouncil.setContact(contact.getText());
            regCouncil.setPayment(Double.parseDouble(payment.getText()));
            regCouncil.setCoordinator(coordinatorCheck.isSelected());
            regCouncil.save();
        } else {
            Student student = new Student();
            student.setId(Long.parseLong(id));
            student.setFirstName(firstName.getText());
            student.setLastName(lastName.getText());
            student.setDepartment(Department.values()[department.getSelectedIndex()]);
            student.setGender(Gender.values()[gender.getSelectedIndex()]);
            student.setYearLevel(YearLevel.values()[yearLevel.getSelectedIndex()]);
            student.setShirt(shirt);
            student.setInterest(interests.getText().toUpperCase());
            student.setEmail(email.getText());
            student.setContact(contact.getText());
            student.setPayment(Double.parseDouble(payment.getText()));
            student.setCoordinator(coordinatorCheck.isSelected());
            student.save();

            Log log = new Log();
            log.setLogDate(new Date());
            log.setLogType(LogType.REGISTRATION);
            log.setDescription(idNumber.getText() + " has been registered by " + getCouncil().getFirstName());
            council.addLog(log);
            council.update();
        }

        Student student = Student.getStudentFinder().findRecordById(Long.parseLong(id));
        List<String> interestList = Arrays.asList(interests.getText().split("\n"));

        List<Event> events = Event.getFinder().findAll();

        for (Event event : events) {
            for (Student s2 : event.getStudents()) {
                System.out.println(event.getEventName() + " " + s2.getFirstName());
            }
        }

        for (Event event : events) {
            for (String i : interestList) {
                event.categorizeStudentByKeyword(student, i);
                try {
                    event.update();
                } catch (Exception e) {
                    System.out.println("Student already exists for event!");
                }
            }
        }
        JOptionPane.showMessageDialog(
                null, "Registration successful!", "Success!", JOptionPane.INFORMATION_MESSAGE);

        this.dispose();
    }//GEN-LAST:event_actionRegisterActionPerformed

    private void shirtSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shirtSizeActionPerformed
        customSize.setVisible(shirtSize.getSelectedIndex() == ShirtSize.values().length - 1);
        labelCustomSize.setVisible(shirtSize.getSelectedIndex() == ShirtSize.values().length - 1);
        revalidate();
        repaint();
    }//GEN-LAST:event_shirtSizeActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        labelPassword.setVisible(councilAccounRegistration);
        password.setVisible(councilAccounRegistration);
        labelHeader.setText(councilAccounRegistration
                ? "Council Registration" : "Student Registration");
        customSize.setVisible(false);
        labelCustomSize.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(RegistrationInterface.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationInterface.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationInterface.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationInterface.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationInterface().setVisible(true);
            }
        });
    }

    public void activateCouncilRegistration() {
        councilAccounRegistration = true;
    }

    public Council getCouncil() {
        return council;
    }

    public void setCouncil(Council council) {
        this.council = council;
    }

    private boolean councilAccounRegistration = false;
    private Council council;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actionCancel;
    private javax.swing.JButton actionRegister;
    private javax.swing.JTextField contact;
    private javax.swing.JCheckBox coordinatorCheck;
    private javax.swing.JTextField customSize;
    private javax.swing.JComboBox department;
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstName;
    private javax.swing.JComboBox gender;
    private javax.swing.JFormattedTextField idNumber;
    private javax.swing.JScrollPane interestScroller;
    private javax.swing.JTextArea interests;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelContact;
    private javax.swing.JLabel labelCustomSize;
    private javax.swing.JLabel labelDepartment;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelFirstName;
    private javax.swing.JLabel labelGender;
    private javax.swing.JLabel labelHeader;
    private javax.swing.JLabel labelIDNumber;
    private javax.swing.JLabel labelInterest;
    private javax.swing.JLabel labelLastName;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelPayment;
    private javax.swing.JLabel labelShirtSize;
    private javax.swing.JLabel labelYear;
    private javax.swing.JTextField lastName;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField payment;
    private javax.swing.JPanel rootPanel;
    private javax.swing.JComboBox shirtSize;
    private javax.swing.JComboBox yearLevel;
    // End of variables declaration//GEN-END:variables
}
