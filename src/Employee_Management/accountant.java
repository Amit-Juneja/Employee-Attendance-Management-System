
package Employee_Management;
import java.sql.*;
import javax.swing.*;

public class accountant extends javax.swing.JFrame {
     public Connection cn;
    public Statement st;
    public loginform login;
    public emp_table emp_t;
  
    public employee emp;
    public signin signin;
    public request_list req;
    public paid_list paid;
    String username =null;
    public accountant() {
        initComponents();
         try{
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","amit","amit@123");
            st = cn.createStatement();
          //  JOptionPane.showMessageDialog(null, "Connected");
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Not Connected");
        }
    }
    public accountant(String name) {
        initComponents();
         try{
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","");
            st = cn.createStatement();
          //  JOptionPane.showMessageDialog(null, "Connected");
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Not Connected");
        }
         String name1=name+ " login successful";
        jLabel1.setText(name1);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        emp_list = new javax.swing.JButton();
        add_lab = new javax.swing.JButton();
        but_pre = new javax.swing.JButton();
        request_list = new javax.swing.JButton();
        paid_list = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Accountant login succesful");

        emp_list.setBackground(new java.awt.Color(204, 204, 255));
        emp_list.setText("Employee list");
        emp_list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_listActionPerformed(evt);
            }
        });

        add_lab.setBackground(new java.awt.Color(204, 204, 255));
        add_lab.setText("Add Employee");
        add_lab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_labActionPerformed(evt);
            }
        });

        but_pre.setBackground(new java.awt.Color(204, 204, 255));
        but_pre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        but_pre.setText("Log out");
        but_pre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_preActionPerformed(evt);
            }
        });

        request_list.setBackground(new java.awt.Color(204, 204, 255));
        request_list.setText("salary requested list");
        request_list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                request_listActionPerformed(evt);
            }
        });

        paid_list.setBackground(new java.awt.Color(204, 204, 255));
        paid_list.setText("salary paid list");
        paid_list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paid_listActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(emp_list, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(add_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(request_list)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(paid_list)
                .addGap(91, 91, 91))
            .addGroup(layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(but_pre)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emp_list, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(request_list, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paid_list, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(but_pre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emp_listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_listActionPerformed
         emp_t=new emp_table();
              emp_t.setVisible(true);
              this.dispose();
    }//GEN-LAST:event_emp_listActionPerformed

    private void add_labActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_labActionPerformed
        signin = new signin();
             signin.setVisible(true);
             this.dispose();
    }//GEN-LAST:event_add_labActionPerformed

    private void but_preActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_preActionPerformed
        login = new loginform();
             login.setVisible(true);
             this.dispose();
    }//GEN-LAST:event_but_preActionPerformed

    private void request_listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_request_listActionPerformed
      req = new request_list();
             req.setVisible(true);
             this.dispose();
    }//GEN-LAST:event_request_listActionPerformed

    private void paid_listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paid_listActionPerformed
        paid = new paid_list();
             paid.setVisible(true);
             this.dispose();
    }//GEN-LAST:event_paid_listActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new accountant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_lab;
    private javax.swing.JButton but_pre;
    private javax.swing.JButton emp_list;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton paid_list;
    private javax.swing.JButton request_list;
    // End of variables declaration//GEN-END:variables
}
