package system2;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class LoginRiasecFrame extends javax.swing.JFrame {
    public LoginRiasecFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog_register = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        register_btn = new javax.swing.JButton();
        txt_username = new javax.swing.JTextField();
        pf_confirmpassword = new javax.swing.JPasswordField();
        pf_password = new javax.swing.JPasswordField();
        clear_btn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_firstname = new javax.swing.JTextField();
        txt_lastname = new javax.swing.JTextField();
        cancel_btn = new javax.swing.JButton();
        login_btn = new javax.swing.JButton();
        usepass_txt = new javax.swing.JPasswordField();
        username_txt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_register = new javax.swing.JLabel();
        btn_report = new javax.swing.JButton();

        jDialog_register.setTitle("Registration");
        jDialog_register.setLocation(new java.awt.Point(500, 200));
        jDialog_register.setResizable(false);
        jDialog_register.setSize(new java.awt.Dimension(500, 450));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Username :");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("Password :");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setText("Confirm Password :");

        register_btn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        register_btn.setText("Register");
        register_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_btnActionPerformed(evt);
            }
        });

        txt_username.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        pf_confirmpassword.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        pf_password.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        clear_btn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        clear_btn.setText("Clear");
        clear_btn.setToolTipText("");
        clear_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_btnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setText("First Name :");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setText("Last Name :");

        txt_firstname.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        txt_lastname.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        javax.swing.GroupLayout jDialog_registerLayout = new javax.swing.GroupLayout(jDialog_register.getContentPane());
        jDialog_register.getContentPane().setLayout(jDialog_registerLayout);
        jDialog_registerLayout.setHorizontalGroup(
            jDialog_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_registerLayout.createSequentialGroup()
                .addGroup(jDialog_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog_registerLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jDialog_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(jDialog_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6)))
                        .addGap(20, 20, 20)
                        .addGroup(jDialog_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pf_confirmpassword)
                            .addComponent(pf_password, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                            .addComponent(txt_username, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                            .addComponent(txt_firstname)
                            .addComponent(txt_lastname)))
                    .addGroup(jDialog_registerLayout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(register_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clear_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jDialog_registerLayout.setVerticalGroup(
            jDialog_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_registerLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jDialog_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDialog_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDialog_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDialog_registerLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel4))
                    .addGroup(jDialog_registerLayout.createSequentialGroup()
                        .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pf_password, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(jDialog_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(pf_confirmpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDialog_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(register_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);

        cancel_btn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cancel_btn.setText("Cancel");
        cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_btnActionPerformed(evt);
            }
        });

        login_btn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        login_btn.setText("Login");
        login_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_btnActionPerformed(evt);
            }
        });

        usepass_txt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        usepass_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usepass_txtActionPerformed(evt);
            }
        });

        username_txt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        username_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_txtActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Username :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Password  :");

        lbl_register.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbl_register.setForeground(new java.awt.Color(255, 0, 0));
        lbl_register.setText("Register");
        lbl_register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_registerMouseClicked(evt);
            }
        });

        btn_report.setText("REPORT SAMPLE");
        btn_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(login_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(username_txt)
                                    .addComponent(usepass_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_report)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_register)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(username_txt)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usepass_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_register)
                    .addComponent(btn_report))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(login_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_btnActionPerformed
        username_txt.setText("");
        usepass_txt.setText("");
    }//GEN-LAST:event_cancel_btnActionPerformed

    private void login_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_btnActionPerformed
              try{
                  Database db = new Database();
                  Connection con,con2;
                  Statement stmt,stmt2;
                  ResultSet rs,rs1;
                  String query = "SELECT * FROM login WHERE Username = '"+username_txt.getText()+"' AND Password = '"+usepass_txt.getText()+"'";
                  con = db.getConnection();
                  stmt = con.createStatement();
                  rs = stmt.executeQuery(query);
                  if(rs.next()){
                          String query2 = "SELECT FirstName,LastName FROM tblstudent WHERE Username = '"+username_txt.getText()+"'";
                          con2 = db.getConnection();
                          stmt2 = con2.createStatement();
                          rs1 = stmt.executeQuery(query2);
                          if(rs1.next()){
                                String firstname = rs1.getString("FirstName");
                                String lastname = rs1.getString("LastName");
                                JOptionPane.showMessageDialog(null,"WELCOME");
                                RiasecMainFrame _mainframe = new RiasecMainFrame(lastname + ", " + firstname);
                                _mainframe.show();
                                jDialog_register.setVisible(false);
                                this.dispose();
                          }  
                 }else{
                JOptionPane.showMessageDialog(null, "Invalid");
                }
              }catch(Exception ex){
                  System.out.println(ex);
              } 
    }//GEN-LAST:event_login_btnActionPerformed

    private void usepass_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usepass_txtActionPerformed
    
    }//GEN-LAST:event_usepass_txtActionPerformed

    private void username_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_txtActionPerformed
       
    }//GEN-LAST:event_username_txtActionPerformed

    private void lbl_registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_registerMouseClicked
          jDialog_register.setVisible(true);
    }//GEN-LAST:event_lbl_registerMouseClicked

    private void register_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_btnActionPerformed
        RegisterValidation();
    }//GEN-LAST:event_register_btnActionPerformed

    private void clear_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_btnActionPerformed
         txt_firstname.setText("");
         txt_lastname.setText("");
         txt_username.setText("");
         pf_password.setText("");
         pf_confirmpassword.setText("");
    }//GEN-LAST:event_clear_btnActionPerformed

    private void btn_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportActionPerformed
        SearchResultRiasecFrame searchframe = new SearchResultRiasecFrame();
        searchframe.show();
        this.hide();
    }//GEN-LAST:event_btn_reportActionPerformed
    public void RegisterValidation(){
        if("".equals(txt_firstname.getText()) || "".equals(txt_lastname.getText()) || "".equals(txt_username.getText()) || "".equals(pf_password.getText()) || "".equals(pf_confirmpassword.getText())){
            JOptionPane.showMessageDialog(null, "Input Data", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(!pf_password.getText().equals(pf_confirmpassword.getText())){
            JOptionPane.showMessageDialog(null, "Password and Confirmation password is not match","Error",JOptionPane.ERROR_MESSAGE);
        }else{
             try{
                  Database db = new Database();
                  Connection con,con1,con2;
                  Statement stmt,stmt1,stmt2;
                  ResultSet rs;
                  String query = "SELECT * FROM login WHERE Username = '"+txt_username.getText()+"'";
                  con = db.getConnection();
                  stmt = con.createStatement();
                  rs = stmt.executeQuery(query);
                  if(rs.next()){
                JOptionPane.showMessageDialog(null,"Username already used");
                 }else{
                  String query1 = "INSERT INTO  login (Username,Password) VALUES('"+txt_username.getText()+"','"+pf_password.getText()+"')";
                  con1 = db.getConnection();
                  stmt1 = con1.createStatement();
                  stmt1.executeUpdate(query1);
                  String query2 = "INSERT INTO tblstudent(FirstName,LastName,Username) VALUES ('"+txt_firstname.getText()+"','"+txt_lastname.getText()+"','"+txt_username.getText()+"')";
                  con2 = db.getConnection();
                  stmt2 = con2.createStatement();
                  stmt2.executeUpdate(query2);
                  JOptionPane.showMessageDialog(null,"Successfully Created an Account");
                  jDialog_register.setVisible(false);
                  txt_firstname.setText("");
                  txt_lastname.setText("");
                  txt_username.setText("");
                  pf_password.setText("");
                  pf_confirmpassword.setText("");
                }
              }catch(Exception ex){
                  System.out.println(ex);
              }
        }
    }
    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(LoginRiasecFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginRiasecFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginRiasecFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginRiasecFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginRiasecFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_report;
    private javax.swing.JButton cancel_btn;
    private javax.swing.JButton clear_btn;
    private javax.swing.JDialog jDialog_register;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbl_register;
    private javax.swing.JButton login_btn;
    private javax.swing.JPasswordField pf_confirmpassword;
    private javax.swing.JPasswordField pf_password;
    private javax.swing.JButton register_btn;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_lastname;
    private javax.swing.JTextField txt_username;
    private javax.swing.JPasswordField usepass_txt;
    private javax.swing.JTextField username_txt;
    // End of variables declaration//GEN-END:variables
}
