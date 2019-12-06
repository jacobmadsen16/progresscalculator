/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progresscalculator;

import java.awt.Color;
import java.awt.HeadlessException;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

/**
 *
 * @author 4400098772
 */
public class ProgressCalculator extends javax.swing.JFrame {

    private static double requiredHours;
    
    /**
     * Creates new form Progress
     */
    public ProgressCalculator() {
        initComponents();
        hoursPerWeek.setEditable(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        weekHoursPanel = new javax.swing.JPanel();
        hoursPerWeek = new javax.swing.JComboBox<>();
        buttonsPanel = new javax.swing.JPanel();
        calculateButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        hours = new progresscalculator.HoursPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Progress Calculator");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        hoursPerWeek.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        hoursPerWeek.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "6", "12", "15", "18", "24", "30" }));
        hoursPerWeek.setToolTipText("Select the amount of hours per week to set required hours");
        hoursPerWeek.setBorder(javax.swing.BorderFactory.createTitledBorder("Hours Per Week"));
        hoursPerWeek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoursPerWeekActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout weekHoursPanelLayout = new javax.swing.GroupLayout(weekHoursPanel);
        weekHoursPanel.setLayout(weekHoursPanelLayout);
        weekHoursPanelLayout.setHorizontalGroup(
            weekHoursPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, weekHoursPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(hoursPerWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        weekHoursPanelLayout.setVerticalGroup(
            weekHoursPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(weekHoursPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hoursPerWeek, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addContainerGap())
        );

        calculateButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        calculateButton.setText("Calculate");
        calculateButton.setToolTipText("Click here to calculate progress");
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });

        exitButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        exitButton.setText("Exit");
        exitButton.setToolTipText("Click here to Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonsPanelLayout = new javax.swing.GroupLayout(buttonsPanel);
        buttonsPanel.setLayout(buttonsPanelLayout);
        buttonsPanelLayout.setHorizontalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(calculateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exitButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buttonsPanelLayout.setVerticalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonsPanelLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calculateButton)
                    .addComponent(exitButton)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(weekHoursPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(weekHoursPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * This creates a timer
     * that will set the required hours
     * error to a blank label with a delay
     * after the creation of the timer
     */
    public void startRequiredHoursTimer() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask(){
        @Override
        public void run()
        {
            hours.setRequiredHoursError("");
        }}, 2*1000);
    }

    /**
     * This creates a timer
     * that sets the completed hours
     * error to a blank label after a delay
     * from when the timer is created
     */
    public void startCompletedHoursTimer() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask(){
        @Override
        public void run()
        {
            hours.setCompletedHoursError("");
        }
        }, 2*1000);
    }
    
    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        // TODO add your handling code here:
        //To check if the user has entered the values properly 
        try
        {
            if(hours.getCompletedHours().equals(""))
            {
                hours.setCompletedHoursError("Enter your completed hours");
                hours.getCompletedHoursError().setForeground(Color.red);
                if(hours.getRequiredHours().equals(""))
                {
                    hours.setRequiredHoursError("Set your required hours");
                    hours.getRequiredHoursError().setForeground(Color.red);
                }
                startCompletedHoursTimer();
                startRequiredHoursTimer();
            }
            else if(hours.getRequiredHours().equals(""))
            {
                hours.setRequiredHoursError("Set your required hours");
                hours.getRequiredHoursError().setForeground(Color.red);
                startRequiredHoursTimer();
            }
            else if(requiredHours == 0)
            {
                JOptionPane.showMessageDialog(null ,"Can't divide by zero!", "Error!", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                double progressPercentage = (Double.parseDouble(hours.getCompletedHours()) / requiredHours) * 100; 

                //Display the progress percentage 
                JOptionPane.showMessageDialog(null, String.format("Your current progress is %.2f", progressPercentage) + 
                                                    "%", "Progress", JOptionPane.INFORMATION_MESSAGE); 
            }
        }
        catch(HeadlessException | NumberFormatException e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_calculateButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void hoursPerWeekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoursPerWeekActionPerformed
        // TODO add your handling code here:
        requiredHours = Double.parseDouble((String)hoursPerWeek.getSelectedItem()) * 4; 
        hours.setRequiredHours(requiredHours); 
    }//GEN-LAST:event_hoursPerWeekActionPerformed

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
            java.util.logging.Logger.getLogger(ProgressCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProgressCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProgressCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProgressCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProgressCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JButton calculateButton;
    private javax.swing.JButton exitButton;
    private progresscalculator.HoursPanel hours;
    private javax.swing.JComboBox<String> hoursPerWeek;
    private javax.swing.JPanel weekHoursPanel;
    // End of variables declaration//GEN-END:variables
}
