
package Employee_Management;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class request_list extends javax.swing.JFrame {
    public Connection cn;
    public Statement st;
    public loginform login;
    public accountant accountant;
   
  
    public request_list() {
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
        show_user();
       
    }
     public ArrayList<User2> userList(String ValToSearch){
        ArrayList<User2> usersList = new ArrayList<>();
        try{
             String searchQuery = "SELECT * FROM `salary_request` WHERE CONCAT(`ID`,`First Name`,`Last Name`,`Type`,`Category`,`Date`) LIKE '%"+ValToSearch+"%'";
            ResultSet rs= st.executeQuery(searchQuery);
            User2 user;
            while(rs.next()){
                user=new User2(rs.getString("ID"),rs.getString("First Name"),rs.getString("Last Name"),rs.getString("Type"),rs.getString("Category"),rs.getString("Date"));
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
        ArrayList<User2> list = userList(text_search.getText());
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"ID","First Name","Last Name","Type","Category","Date"});
        Object[] row = new Object[6];
       for(int i=0;i<list.size();i++){
            row[0]=list.get(i).getid();
            row[1]=list.get(i).getfirst();
            row[2]=list.get(i).getlast();
            row[3]=list.get(i).gettype();
            row[4]=list.get(i).getcat();
            row[5]=list.get(i).getdate();
            
            model.addRow(row);
        }
       jTable1.setModel(model);
    }
       private static final DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        private static final DateFormat sdf1 = new SimpleDateFormat("h:mma");
        Calendar calendar = Calendar.getInstance();
         java.util.Date currentDate = calendar.getTime();
java.sql.Date date = new java.sql.Date(currentDate.getTime());
        String date1=sdf.format(date);
        String time =sdf1.format(date);
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        text_name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        text_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        text_type = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        text_cat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pay_butt = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        pay_box = new javax.swing.JComboBox<>();
        text_search = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        but_logout = new javax.swing.JButton();
        text_base = new javax.swing.JTextField();
        but_pre = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name");

        jLabel2.setText("ID");

        jLabel3.setText("Type");

        jLabel4.setText("Category");

        jLabel5.setText("    Salary");

        pay_butt.setText("Pay Salary");
        pay_butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pay_buttActionPerformed(evt);
            }
        });

        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "First Name", "Last Name", "Type", "Category", "Date"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        pay_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "pay by cash", "pay by cheque" }));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(pay_butt)))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(text_id)
                            .addComponent(text_name, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Cancel)
                                .addComponent(text_type, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(text_cat, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(text_base, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(pay_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(but_pre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(text_search, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(search)
                        .addGap(138, 138, 138)
                        .addComponent(but_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search)
                    .addComponent(but_logout))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(text_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(text_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(text_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text_cat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(text_base, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(pay_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pay_butt)
                            .addComponent(Cancel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(but_pre))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 14, Short.MAX_VALUE))))
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

    private void pay_buttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pay_buttActionPerformed
      try
      {
         int p=JOptionPane.showConfirmDialog(null,"click yes to pay","pay salary",JOptionPane.YES_NO_OPTION);
        if(p==0)
        {
        String name=text_name.getText();
       String id=text_id.getText();
       String amount=text_base.getText();
      String type=text_type.getText();     
       String mode=(String)pay_box.getSelectedItem();
       String query = "insert into salary_paid values ('"+id+"','"+name+"','"+amount+"','"+mode+"','"+date1+"')";
       st.executeUpdate(query);
        int row=jTable1.getSelectedRow();
        String value = (String)jTable1.getModel().getValueAt(row,0).toString();
        String query1="delete from salary_request where ID="+value;
         PreparedStatement pst = cn.prepareStatement(query1);
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
         model.setRowCount(0);
         show_user();
         
            JOptionPane.showMessageDialog(null,"Salary paid");
      }
      }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_pay_buttActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int selectedRowIndex = jTable1.getSelectedRow();
        String cat = (String)jTable1.getModel().getValueAt(selectedRowIndex,4).toString();
        String type = (String)jTable1.getModel().getValueAt(selectedRowIndex,3).toString();
        String base=null;
        if(type.equals("labour"))
        {
            if(cat.equals("Beginner"))
                base="10000";
            if(cat.equals("Medium"))
                base="15000";
            if(cat.equals("Advance"))
                base="20000";                           
        }
         if(type.equals("employee"))
        {
            if(cat.equals("Beginner"))
                base="25000";
            if(cat.equals("Medium"))
                base="30000";
            if(cat.equals("Advance"))
                base="40000";                           
        }
       
      text_id.setText(model.getValueAt(selectedRowIndex, 0).toString());
       text_name.setText(model.getValueAt(selectedRowIndex, 1).toString());
       text_type.setText(model.getValueAt(selectedRowIndex, 3).toString());
       text_cat.setText(model.getValueAt(selectedRowIndex, 4).toString());
        text_base.setText(base);
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void but_preActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_preActionPerformed
        accountant = new accountant();
        accountant.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_but_preActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
          this.dispose();            
               new request_list().setVisible(true);
    }//GEN-LAST:event_CancelActionPerformed
   public static void main(String args[]) {
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new request_list().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JButton but_logout;
    private javax.swing.JButton but_pre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> pay_box;
    private javax.swing.JButton pay_butt;
    private javax.swing.JButton search;
    private javax.swing.JTextField text_base;
    private javax.swing.JTextField text_cat;
    private javax.swing.JTextField text_id;
    private javax.swing.JTextField text_name;
    private javax.swing.JTextField text_search;
    private javax.swing.JTextField text_type;
    // End of variables declaration//GEN-END:variables
}
