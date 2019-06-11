
package Employee_Management;
import java.sql.*;
import java.util.regex.Pattern;
import javax.swing.*;

public class forget_pass extends javax.swing.JFrame {

     public Connection cn;
    public Statement stmt;
   public loginform login;
    public forget_pass() {
        initComponents();
         try{
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","amit","amit@123");
             stmt = cn.createStatement();
             
           // JOptionPane.showMessageDialog(null, "Connected");
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Not Connected");
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        acc_check = new javax.swing.JCheckBox();
        emp_check = new javax.swing.JCheckBox();
        lab_check = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        text_user = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pass_old = new javax.swing.JPasswordField();
        sub_button = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        pass_new = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        pass_conf = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        acc_check.setText("Accountant");

        emp_check.setText("Employee");

        lab_check.setText("Labourer");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("username");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("old password");

        sub_button.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sub_button.setText("Submit");
        sub_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_buttonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("New password");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Confirm password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(acc_check)
                        .addGap(43, 43, 43)
                        .addComponent(emp_check)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addComponent(lab_check))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_user, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pass_old, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pass_conf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pass_new, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(sub_button, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acc_check)
                    .addComponent(emp_check)
                    .addComponent(lab_check))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pass_old, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pass_new, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(pass_conf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(sub_button, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sub_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_buttonActionPerformed
        try{
            String sql=null;
            String acc=null;
            if(acc_check.isSelected()){
                acc="accountant";
            }
            else if(emp_check.isSelected()){
                acc="employee";
            }
            else if(lab_check.isSelected()){
                acc="labourer";
            }
              sql = "select * from "+acc+" where username=?";
             PreparedStatement pst=cn.prepareStatement(sql);
             String user=text_user.getText();
              pst.setString(1, user); // jtextfields name

           ResultSet rst=pst.executeQuery();
             if(rst.next()){
                    String old = rst.getString("password");
                    String oldpass = String.valueOf(pass_old.getPassword());
                    String newpass = String.valueOf(pass_new.getPassword());
                    String conpass = String.valueOf(pass_conf.getPassword());
                    if(old.equals(oldpass))
                    {
                        if (newpass.length()>6) 
                         {
                            
                           if(newpass.equals(conpass))
                           {
                            sql = "update "+acc+" set password='"+newpass+"' where username='"+user+"'";
                             pst=cn.prepareStatement(sql);
                             pst.execute();
                             JOptionPane.showMessageDialog(null,"password change successful");
                             login = new loginform();
                             login.setVisible(true);
                              this.dispose();
                           }
                           else
                           {
                            JOptionPane.showMessageDialog(null,"password is not matching");
                           }
                         }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "password length should be greater than 6", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"password is incorrect");
                    }
                }
             else{
                    JOptionPane.showMessageDialog(null,"username does not exist");
                }
            
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"not possible");
        }

    }//GEN-LAST:event_sub_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(forget_pass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(forget_pass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(forget_pass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(forget_pass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new forget_pass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox acc_check;
    private javax.swing.JCheckBox emp_check;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JCheckBox lab_check;
    private javax.swing.JPasswordField pass_conf;
    private javax.swing.JPasswordField pass_new;
    private javax.swing.JPasswordField pass_old;
    private javax.swing.JButton sub_button;
    private javax.swing.JTextField text_user;
    // End of variables declaration//GEN-END:variables
}
