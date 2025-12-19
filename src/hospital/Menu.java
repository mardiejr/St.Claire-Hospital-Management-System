
package hospital;

public class Menu extends javax.swing.JFrame {
    
    public Menu() {
        initComponents();
        registeredPatientInstance = new RegisteredPatient();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuImage = new javax.swing.JLabel();
        Greetings = new javax.swing.JLabel();
        Register = new javax.swing.JButton();
        searchpatient = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MenuImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/Saint Claire Hospital.png"))); // NOI18N
        MenuImage.setText("jLabel1");

        Greetings.setFont(new java.awt.Font("Beaufort for LOL", 1, 18)); // NOI18N
        Greetings.setText("Greetings Doctor, what shall we do for today?");

        Register.setText("Register New Patient");
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });

        searchpatient.setText("See Registered Patients");
        searchpatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchpatientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(MenuImage, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(222, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Greetings)
                        .addGap(234, 234, 234))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchpatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(353, 353, 353))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MenuImage, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Greetings)
                .addGap(28, 28, 28)
                .addComponent(Register)
                .addGap(28, 28, 28)
                .addComponent(searchpatient)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private final RegisteredPatient registeredPatientInstance;
    
    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
        Register reg = new Register(registeredPatientInstance); 
        reg.setVisible(true);
        dispose();
    }//GEN-LAST:event_RegisterActionPerformed

    private void searchpatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchpatientActionPerformed
        registeredPatientInstance.setVisible(true);
        dispose();
    }//GEN-LAST:event_searchpatientActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Menu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Greetings;
    private javax.swing.JLabel MenuImage;
    private javax.swing.JButton Register;
    private javax.swing.JButton searchpatient;
    // End of variables declaration//GEN-END:variables
}
