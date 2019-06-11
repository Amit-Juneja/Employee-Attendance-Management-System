
package Employee_Management;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.*;
public class employee extends javax.swing.JFrame {
      public Connection cn;
    public Statement st;
     public loginform login;
     public Att_table att;
     String username;
    public employee() {
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
    public employee(String name) {
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
          username=name;
         String name1=name+ " login successful";
        jLabel1.setText(name1);
    }
    private static final DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        private static final DateFormat sdf1 = new SimpleDateFormat("h:mma");
        Calendar calendar = Calendar.getInstance();
         java.util.Date currentDate = calendar.getTime();
java.sql.Date date = new java.sql.Date(currentDate.getTime());
        String date1=sdf.format(date);
        String time =sdf1.format(date);
        String status="present";
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        but_pre = new javax.swing.JButton();
        give_att = new javax.swing.JButton();
        view_att = new javax.swing.JButton();
        req_salary = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Employee login succesful");

        but_pre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        but_pre.setText("Log out");
        but_pre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_preActionPerformed(evt);
            }
        });

        give_att.setText("give Attendence");
        give_att.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                give_attActionPerformed(evt);
            }
        });

        view_att.setText("view Attendence");
        view_att.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_attActionPerformed(evt);
            }
        });

        req_salary.setText("request salary");
        req_salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                req_salaryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(view_att, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(give_att)
                            .addComponent(req_salary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(but_pre)))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(86, 86, 86)
                .addComponent(give_att)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(view_att)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(req_salary)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(but_pre)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void but_preActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_preActionPerformed
        login = new loginform();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_but_preActionPerformed

    private void give_attActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_give_attActionPerformed
         try
        {
           String username1=username.replace('@','_');
          String sql="select *from "+username1+" where Date = '"+date1+"'";
              ResultSet rss = st.executeQuery(sql);
            if(rss.next()){
                    JOptionPane.showMessageDialog(null,"Attendence already given");                    
             }
            else
            {
                String query;   
            query = "insert into "+username1+" values ('"+date1+"','"+time+"','"+status+"')";
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Attendence saved");            
            }    
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_give_attActionPerformed

    private void view_attActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_attActionPerformed
         String s=username.replace('@','_');
        att=new Att_table(s);
        att.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_view_attActionPerformed

    private void req_salaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_req_salaryActionPerformed
      try{
        int l=username.length();
        String value = username.substring(l-1);
        String sql = "SELECT * FROM emp_details where ID="+value;
           ResultSet rs = st.executeQuery(sql);
            if(rs.next()) { 
                  String id = rs.getString("ID"); 
                   String fname = rs.getString("First Name");
                   String lname = rs.getString("Last Name");
                   String type = "employee";
                   String cat = rs.getString("Category");
                   String q="select *from salary_request where Date = '"+id+"'";
              ResultSet rss = st.executeQuery(sql);
            if(rss.next()){
           //         JOptionPane.showMessageDialog(null,"Attendence already given");                    
             }
          
                     String query;   
                      query = "insert into salary_request values('"+id+"','"+fname+"','"+lname+"','"+type+"','"+cat+"','"+date1+"')";
                        st.executeUpdate(query);
                      JOptionPane.showMessageDialog(null,"Salary Requested");
        
                  }
       }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_req_salaryActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton but_pre;
    private javax.swing.JButton give_att;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton req_salary;
    private javax.swing.JButton view_att;
    // End of variables declaration//GEN-END:variables
}
