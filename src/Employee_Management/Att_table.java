
package Employee_Management;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
   

public class Att_table extends javax.swing.JFrame {
     public Connection cn;
    public Statement st;
    public loginform login;
    public accountant accountant;
   String username=null;
    public Att_table() {
        initComponents();
        show_user();
    }
    public Att_table(String name) {
        initComponents();        
        username=name;       
        show_user();
        
    }
    
    public ArrayList<User1> userList(String ValToSearch){
        ArrayList<User1> usersList = new ArrayList<>();
        try{
              Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","amit","amit@123");
           
             String searchQuery = "SELECT * FROM "+username+" WHERE CONCAT(Date,Time,Status) LIKE '%"+ValToSearch+"%'";
            Statement st= cn.createStatement();
            ResultSet rs= st.executeQuery(searchQuery);
            User1 user;
            while(rs.next()){
                user=new User1(rs.getString("Date"),rs.getString("Time"),rs.getString("Status"));
                usersList.add(user);
            }
         }
         catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return usersList;
     }
     public void show_user(){
        ArrayList<User1> list = userList(text_search.getText());
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"Date","Time","Status"});
        Object[] row = new Object[3];
       for(int i=0;i<list.size();i++){
            row[0]=list.get(i).getdate();
            row[1]=list.get(i).gettime();
            row[2]=list.get(i).getstatus();
            model.addRow(row);
        }
       jTable1.setModel(model);
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        text_search = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        but_logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setBackground(new java.awt.Color(255, 255, 153));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Date", "Time", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        search.setText("search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
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
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(text_search, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(search)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(but_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search)
                    .addComponent(but_logout))
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
       show_user();
    }//GEN-LAST:event_searchActionPerformed

    private void but_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_logoutActionPerformed
        login = new loginform();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_but_logoutActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Att_table().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton but_logout;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton search;
    private javax.swing.JTextField text_search;
    // End of variables declaration//GEN-END:variables
}
