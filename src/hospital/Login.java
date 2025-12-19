package hospital;
import javax.swing.JOptionPane;

//Abst
public class Login extends javax.swing.JFrame {
    public Login() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Iconimage = new javax.swing.JLabel();
        un = new javax.swing.JLabel();
        pass = new javax.swing.JLabel();
        usernametext = new javax.swing.JTextField();
        passwordtext = new javax.swing.JPasswordField();
        loginbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Page");
        setPreferredSize(new java.awt.Dimension(870, 570));

        Iconimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/Saint Claire Hospital.png"))); // NOI18N

        un.setText("Username:");

        pass.setText("Password:");

        loginbtn.setText("Login");
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(Iconimage, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pass)
                            .addComponent(un))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernametext)
                            .addComponent(passwordtext, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(211, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(loginbtn)
                .addGap(403, 403, 403))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Iconimage, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(un)
                    .addComponent(usernametext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass)
                    .addComponent(passwordtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(loginbtn)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //This is the code block that contains the ACCOUNTS of the ONLY ALLOWED personnels
    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
        String username = usernametext.getText();
        String password = passwordtext.getText();
        
        if(username.equalsIgnoreCase("Dr. Eggman") && password.equals("123")) {
            Menu men = new Menu();
            men.setVisible(true);
            dispose();
        } else if(username.equalsIgnoreCase("Dokutah") && password.equals("123")) {
            Menu men = new Menu();
            men.setVisible(true);
            dispose();
        } else if(username.equalsIgnoreCase("Dr. Who") && password.equals("123")) {
            Menu men = new Menu();
            men.setVisible(true);
            dispose();
        } else if(username.equalsIgnoreCase("Dr. Doctor") && password.equals("123")) {
            Menu men = new Menu();
            men.setVisible(true);
            dispose();
        } else if(username.equalsIgnoreCase("Dr. Phil") && password.equals("123")) {
            Menu men = new Menu();
            men.setVisible(true);
            dispose();
        } else if(username.equalsIgnoreCase("Nurse") && password.equals("123")) {
            Menu men = new Menu();
            men.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Username or Password is incorrect!");
        }
    }//GEN-LAST:event_loginbtnActionPerformed
    
    //After the entering the details, the Login JFrame will be dispose() and the Menu JFrame should pop up
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Iconimage;
    private javax.swing.JButton loginbtn;
    private javax.swing.JLabel pass;
    private javax.swing.JPasswordField passwordtext;
    private javax.swing.JLabel un;
    private javax.swing.JTextField usernametext;
    // End of variables declaration//GEN-END:variables
}

