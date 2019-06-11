package Employee_Management;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class emp_table extends javax.swing.JFrame {
    public Connection cn;
    public Statement st;
    public loginform login;
    public accountant accountant;
   
  
    public emp_table() {
        initComponents();
        show_user();
       
    }
     public ArrayList<User> userList(String ValToSearch){
        ArrayList<User> usersList = new ArrayList<>();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","amit","amit@123");
            String searchQuery = "SELECT * FROM `emp_details` WHERE CONCAT(`ID`,`First Name`,`Last Name`,`Gender`,`Category`,`Birthdate`,`Mobile phone`,`Email address`,`Joining Date`,`Address`) LIKE '%"+ValToSearch+"%'";
            Statement st= cn.createStatement();
            ResultSet rs= st.executeQuery(searchQuery);
            User user;
            while(rs.next()){
                 user=new User(rs.getString("ID"),rs.getString("First Name"),rs.getString("Last Name"),rs.getString("Gender"),rs.getString("Category"), rs.getString("Birthdate"),rs.getString("Mobile phone"), rs.getString("Email address"),rs.getString("Joining Date"),rs.getString("Address"));
               usersList.add(user);
            }
         }
         catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Not Connected");
        }
        return usersList;
     }
     public void show_user(){
        ArrayList<User> list = userList(text_search.getText());
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"ID","First Name","Last Name","Gender","Category","Birthdate","Mobile phone","Email address","Joining Date","Address"});
       Object[] row = new Object[10];
       for(int i=0;i<list.size();i++){
            row[0]=list.get(i).getid();
            row[1]=list.get(i).getfname();
            row[2]=list.get(i).getlname();
            row[3]=list.get(i).getgender();
            row[4]=list.get(i).getcategory();
            row[5]=list.get(i).getbirthdate();
            row[6]=list.get(i).getmobile();
            row[7]=list.get(i).getemail();
            row[8]=list.get(i).getjoining();
            row[9]=list.get(i).getaddress();
            model.addRow(row);
        }
       jTable_Display_User.setModel(model);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        text_search = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Display_User = new javax.swing.JTable();
        but_logout = new javax.swing.JButton();
        but_pre = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable_Display_User.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable_Display_User.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Gender", "Category", "Birthdate", "Mobile phone", "Email address", "Joining Date", "Address"
            }
        ));
        jTable_Display_User.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTable_Display_User);

        but_logout.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        but_logout.setText("Log out");
        but_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_logoutActionPerformed(evt);
            }
        });

        but_pre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        but_pre.setText("<- previous");
        but_pre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_preActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(text_search, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton1)
                .addGap(40, 40, 40)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(but_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(but_pre)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(but_logout))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(but_pre))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        show_user();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
             int p=JOptionPane.showConfirmDialog(null,"Do you really want to delete","Delete",JOptionPane.YES_NO_OPTION);
        if(p==0)
        {
            int row=jTable_Display_User.getSelectedRow();
            String value = (String)jTable_Display_User.getModel().getValueAt(row,0).toString();
            String name = (String)jTable_Display_User.getModel().getValueAt(row,1).toString();
            String username=name+"_"+value;
            String query="delete from emp_details where ID="+value ;
            String query1="delete from employee where ID="+value ;
             String sql = "DROP TABLE "+username+"";
            PreparedStatement pst = cn.prepareStatement(query);
             PreparedStatement pst1 = cn.prepareStatement(query1);
             PreparedStatement pst2 = cn.prepareStatement(sql);
            pst.executeUpdate();
            pst1.executeUpdate();
            pst2.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)jTable_Display_User.getModel();
            model.setRowCount(0);
            show_user();
            JOptionPane.showMessageDialog(null, "successfully deleted");

        }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void but_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_logoutActionPerformed
        login = new loginform();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_but_logoutActionPerformed

    private void but_preActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_preActionPerformed
        accountant = new accountant();
        accountant.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_but_preActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new emp_table().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton but_logout;
    private javax.swing.JButton but_pre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Display_User;
    private javax.swing.JTextField text_search;
    // End of variables declaration//GEN-END:variables
}
