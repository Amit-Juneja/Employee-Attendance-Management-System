
package Employee_Management;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;
import javax.swing.*;
  
public class signin extends javax.swing.JFrame {

    public accountant masuk;
  //  public label label;
    public Connection cn;
    public Statement stmt;
     public loginform login;
    public accountant accountant;
    public signin() {
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

        jCalendar1 = new com.toedter.calendar.JCalendar();
        text_user2 = new javax.swing.JLabel();
        text_name1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        text_user1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        text_fname = new javax.swing.JTextField();
        text_mob = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        text_email = new javax.swing.JTextField();
        cb1 = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        cb2 = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        text_address = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        text_user4 = new javax.swing.JLabel();
        text_ID = new javax.swing.JTextField();
        Cat_Box = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        text_user3 = new javax.swing.JLabel();
        text_lname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        but_pre = new javax.swing.JButton();
        but_logout = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();

        text_user2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        text_user2.setText("Name");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        text_user1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        text_user1.setText("First Name");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Mobile phone");

        text_mob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_mobActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText(" Address");

        text_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_emailActionPerformed(evt);
            }
        });

        cb1.setText("Male");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Gender");

        cb2.setText("Female");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Joining date  (dd/mm/yy)  ");

        text_address.setColumns(20);
        text_address.setRows(5);
        jScrollPane1.setViewportView(text_address);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Email address");

        text_user4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        text_user4.setText("ID");

        Cat_Box.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Cat_Box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Beginner", "Medium", "Advance" }));
        Cat_Box.setToolTipText("");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Category");

        text_user3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        text_user3.setText("Last Name");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Birthdate (dd/mm/yyyy)");

        but_pre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        but_pre.setText("<- previous");
        but_pre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_preActionPerformed(evt);
            }
        });

        but_logout.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        but_logout.setText("Log out");
        but_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(text_user1)
                                .addGap(56, 56, 56)
                                .addComponent(text_user3))
                            .addComponent(jLabel15)
                            .addComponent(jLabel12)
                            .addComponent(Cat_Box, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(text_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cb1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb2)
                                    .addComponent(text_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(but_pre)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8)
                                    .addComponent(text_mob)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(text_email)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(70, 70, 70))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(but_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_user4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(276, 276, 276))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(text_user4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_user3)
                    .addComponent(text_user1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(cb1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cb2)))
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addGap(24, 24, 24)
                .addComponent(Cat_Box, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(but_pre))
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_mob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(text_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(but_logout)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String fname=text_fname.getText();
        String lname=text_lname.getText();
        String id=text_ID.getText();
        String user=fname+"_"+id;
        String user1=fname+"@"+id;
        String pass = fname+"@"+id;;
        SimpleDateFormat dcn = new SimpleDateFormat("dd/MM/yyyy");
       
        String mobile=text_mob.getText();
        String email=text_email.getText();
         
         String category=(String)Cat_Box.getSelectedItem();
          String address=text_address.getText();
        String gender=null;
        int cnt=0,cnt1=0;
        String acc=null;
        String acc1=null;
        if(cb1.isSelected()){  
            gender="Male";
            ++cnt;
         }  
         if(cb2.isSelected()){  
              gender="Female";
              ++cnt;
              
         }
        
               acc="employee";
                acc1="emp_details";

        try{
              String birth = dcn.format(jDateChooser1.getDate() );
              String joining=dcn.format(jDateChooser2.getDate() );
            String query=null;
            String query1=null;
            String query2=null;
             query = "insert into "+acc+" values ('"+id+"','"+user1+"','"+pass+"')";
           query1 = "insert into "+acc1+" values ('"+id+"','"+fname+"','"+lname+"','"+gender+"','"+category+"','"+birth+"','"+mobile+"','"+email+"','"+joining+"','"+address+"')"; 
         String sql = "CREATE TABLE " + user + "(Date varchar(256),Time varchar(256),Status varchar(256));";
            Statement b = cn.createStatement();
            stmt.executeUpdate(query);
            stmt.executeUpdate(query1);
            System.out.println(user);
            stmt.execute(sql);
            //a.executequery();
             JOptionPane.showMessageDialog(this, "Saved");
           // }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
        
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void but_preActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_preActionPerformed
        accountant = new accountant();
        accountant.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_but_preActionPerformed

    private void but_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_logoutActionPerformed
        login = new loginform();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_but_logoutActionPerformed

    private void text_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_IDActionPerformed

    private void text_mobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_mobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_mobActionPerformed

    private void text_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_emailActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Cat_Box;
    private javax.swing.JButton but_logout;
    private javax.swing.JButton but_pre;
    private javax.swing.JCheckBox cb1;
    private javax.swing.JCheckBox cb2;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JCalendar jCalendar1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField text_ID;
    private javax.swing.JTextArea text_address;
    private javax.swing.JTextField text_email;
    private javax.swing.JTextField text_fname;
    private javax.swing.JTextField text_lname;
    private javax.swing.JTextField text_mob;
    private javax.swing.JTextField text_name1;
    private javax.swing.JLabel text_user1;
    private javax.swing.JLabel text_user2;
    private javax.swing.JLabel text_user3;
    private javax.swing.JLabel text_user4;
    // End of variables declaration//GEN-END:variables
}
