package hospital;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

 final class RegisteredPatient extends JFrame {
    
    private List<String> registeredPatients;
    private static final String FILE_PATH = "registered_info.txt";
   
    public RegisteredPatient() {
        initComponents();
        registeredPatients = new ArrayList<>();
        showRegisteredPatient();
    }

   public void showRegisteredPatient() {
    try {
        if (Files.exists(Paths.get(FILE_PATH))) {
            registeredPatients = Files.readAllLines(Paths.get(FILE_PATH));
        }
    } catch (NoSuchFileException e) {
    } catch (IOException e) {
    }

    StringBuilder formattedOutput = new StringBuilder();

    int lineCount = 0;

    for (String info : registeredPatients) {
        String[] patientInfo = info.split(":");
        if (patientInfo.length == 3) {
            String label = patientInfo[0].trim();
            String value = patientInfo[1].trim();
            formattedOutput.append(String.format("%-30s: %s%n", label, value));
            lineCount++;
        } else {
            formattedOutput.append(info).append("\n");
            lineCount++;
        }

        if (lineCount % 5 == 0) {
            formattedOutput.append("----------------------------------------------------------\n");
        }
    }

    TextArea.setText(formattedOutput.toString());
    TextArea.setEditable(false);
}

    public void addRegisteredPatient(List<String> infoList) {
        for (String info : infoList) {
        TextArea.append(info + "\n");
        registeredPatients.add(info);
        }
    }
    public void saveRegisteredInformation(List<String> registeredpat) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            for (String info : registeredpat) {
                writer.write(info + System.lineSeparator());
            }
        } catch (IOException e) {
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registered Patients");

        jLabel1.setFont(new java.awt.Font("Beaufort for LOL", 1, 36)); // NOI18N
        jLabel1.setText("REGISTERED PATIENTS");

        TextArea.setColumns(20);
        TextArea.setRows(5);
        jScrollPane2.setViewportView(TextArea);

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(562, 562, 562)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(393, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed
  
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new RegisteredPatient().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TextArea;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
