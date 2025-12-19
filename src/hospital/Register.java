package hospital;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.util.*;
import javax.swing.SwingUtilities;

public class Register extends javax.swing.JFrame {
    private static final String FILE_PATH = "registered_info.txt";
    private final RegisteredPatient registeredPatientInstance;
    
    //Constructor = initializes everything that is inside of it.
    public Register(RegisteredPatient registeredPatientInstance) {
        initComponents();
        this.registeredPatientInstance = registeredPatientInstance;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        patientformtitle = new javax.swing.JLabel();
        enterdetails = new javax.swing.JLabel();
        patientname = new javax.swing.JLabel();
        fullname = new javax.swing.JTextField();
        Relate = new javax.swing.JLabel();
        relative = new javax.swing.JTextField();
        diag = new javax.swing.JLabel();
        stagesbox = new javax.swing.JComboBox<>();
        diagnosis = new javax.swing.JTextField();
        edadtitle = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        sextitle = new javax.swing.JLabel();
        sexbox = new javax.swing.JComboBox<>();
        doctortitle = new javax.swing.JLabel();
        doctorbox = new javax.swing.JComboBox<>();
        BT = new javax.swing.JLabel();
        BloodType = new javax.swing.JComboBox<>();
        questiontitle = new javax.swing.JLabel();
        regibtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Register");
        setPreferredSize(new java.awt.Dimension(870, 570));

        patientformtitle.setFont(new java.awt.Font("Beaufort for LOL", 1, 48)); // NOI18N
        patientformtitle.setText("PATIENT FORM");

        enterdetails.setFont(new java.awt.Font("Beaufort for LOL", 1, 18)); // NOI18N
        enterdetails.setText("Enter Patient's Details:");

        patientname.setText("Patient's Name:");

        Relate.setText("Relative's Name:");

        diag.setText("Diagnosis:");

        stagesbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Stage I", "Stage II", "Stage III", "Stage IV", "Stage V" }));

        edadtitle.setText("Age:");

        sextitle.setText("Sex:");

        sexbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Male", "Female" }));

        doctortitle.setText("Doctor:");

        doctorbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Dr. Who", "Dr. Eggman", "Dr. Phil", "Dr. Doctor", "Dokutah" }));

        BT.setText("Blood Type:");

        BloodType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));

        questiontitle.setText("Who Is The Patient's Doctor?");

        regibtn.setText("Register");
        regibtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regibtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(257, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterdetails)
                    .addComponent(patientformtitle)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(edadtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(questiontitle, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(doctortitle)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                            .addComponent(doctorbox, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(regibtn)
                            .addGap(2, 2, 2))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(patientname)
                                .addComponent(Relate)
                                .addComponent(diag))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(relative)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(sextitle, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(sexbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(BT)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(BloodType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(stagesbox, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(diagnosis))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(fullname))))))
                .addGap(229, 229, 229))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(regibtn)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(patientformtitle)
                        .addGap(18, 18, 18)
                        .addComponent(enterdetails)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patientname)
                            .addComponent(fullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Relate)
                            .addComponent(relative, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edadtitle)
                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sextitle)
                            .addComponent(sexbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BT)
                            .addComponent(BloodType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stagesbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(diagnosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(diag))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(questiontitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(doctortitle)
                            .addComponent(doctorbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(214, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Functions that should happen when the "Register" button was clicked.
    private void regibtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regibtnActionPerformed
    String name = fullname.getText();
    String relats = relative.getText();
    String edad = age.getText();
    String sakit = diagnosis.getText();

    if (!name.isEmpty() && !relats.isEmpty() && !edad.isEmpty() && !sakit.isEmpty()) {
         List<String> registeredPatientInfo = List.of(
                    "Patient's Name: " + name,
                    "Relative's Name: " + relats,
                    "Patient's Age: " + edad + " Sex: " + sexbox.getSelectedItem() + " Blood Type: " + BloodType.getSelectedItem(),
                    "Diagnosis: " + sakit + " " + stagesbox.getSelectedItem(),
                    "The Doctor Overseeing The Patient: " + doctorbox.getSelectedItem() 
            );

        registeredPatientInstance.addRegisteredPatient(registeredPatientInfo);
        registeredPatientInstance.saveRegisteredInformation(registeredPatientInfo);
        JOptionPane.showMessageDialog(rootPane, "Registration Successful!");

        fullname.setText("");
        relative.setText("");
        age.setText("");
        sexbox.setSelectedIndex(0);
        BloodType.setSelectedIndex(0);
        diagnosis.setText("");
        stagesbox.setSelectedIndex(0);
        doctorbox.setSelectedIndex(0);

        Menu men = new Menu();
        men.setVisible(true);
        dispose();

    } else {
        JOptionPane.showMessageDialog(rootPane, "Please fill in all fields!");
      }

    }//GEN-LAST:event_regibtnActionPerformed
    
    //This acts as a BufferedWriter that saves the details of the patient
    public void saveRegisteredInformation(List<String> registeredpat) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            for (String info : registeredpat) {
                writer.write(info + System.lineSeparator());
            }
        } catch (IOException e) {
        }
    }
    
    //Call Back Mechanism - Swing Utilities
    public static void main(String args[]) {
         SwingUtilities.invokeLater(() -> {
         });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BT;
    private javax.swing.JComboBox<String> BloodType;
    private javax.swing.JLabel Relate;
    private javax.swing.JTextField age;
    private javax.swing.JLabel diag;
    private javax.swing.JTextField diagnosis;
    private javax.swing.JComboBox<String> doctorbox;
    private javax.swing.JLabel doctortitle;
    private javax.swing.JLabel edadtitle;
    private javax.swing.JLabel enterdetails;
    private javax.swing.JTextField fullname;
    private javax.swing.JLabel patientformtitle;
    private javax.swing.JLabel patientname;
    private javax.swing.JLabel questiontitle;
    private javax.swing.JButton regibtn;
    private javax.swing.JTextField relative;
    private javax.swing.JComboBox<String> sexbox;
    private javax.swing.JLabel sextitle;
    private javax.swing.JComboBox<String> stagesbox;
    // End of variables declaration//GEN-END:variables
}
