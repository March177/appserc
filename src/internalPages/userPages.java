/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalPages;

import config.connection;
import config.dbconnector;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import myApp.customerForm;
import net.proteanit.sql.DbUtils;


public class userPages extends javax.swing.JInternalFrame {

    /**
     * Creates new form userPage
     */
    public userPages() {
        initComponents();
         displaydata();
         reset();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
        search.setOpaque(false);
        search.setBackground(new Color(0,0,0,0));
    }
    
     
    public void displaydata(){
        
     try{   
         dbconnector dbc = new dbconnector();
         ResultSet rs = dbc.getData("SELECT*FROM tbl_student");
         jTable2.setModel(DbUtils.resultSetToTableModel(rs));
         
         
     }catch(SQLException ex){
         System.out.println("Error Message"+ex);
         
         
         
     }
        
    }
     
    public void reset(){
        sname.setText("");
        sage.setText("");
        saddress.setText("");
        scontact.setText("");
        sage.setText("");
    
    }
    public void Displaydata()
    {
       try {
                connection dbc = new connection();
                Connection conn = dbc.getConnection();
                Statement stmt = conn.createStatement();
                String qry = "SELECT * FROM tbl_student";
                ResultSet rs = stmt.executeQuery(qry);
                while (rs.next()){
                    String col1 = rs.getString("st_name");
                    String col2 = rs.getString("st_address");                    
                    String col3 = rs.getString("st_contact");
                    String col4 = rs.getString("st_status");
                    DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
                    model.addRow(new Object[]{col1, col2, col3});
                }
                    rs.close();
                    stmt.close();
                    conn.close();
                }catch (SQLException ex){
                    System.out.println("Error: " + ex);
                }
    }
    
    
    
    
  
           
    Color navcolor = new Color(204,204,204); 
    Color headcolor = new Color(204,204,255);
    Color bodycolor = new Color(41,53,86);

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ress = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        edit = new javax.swing.JPanel();
        sadd = new javax.swing.JLabel();
        delete = new javax.swing.JPanel();
        sdelete = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        search_button = new javax.swing.JPanel();
        ssearch = new javax.swing.JLabel();
        edit1 = new javax.swing.JPanel();
        sedit = new javax.swing.JLabel();
        sage = new javax.swing.JTextField();
        sid = new javax.swing.JTextField();
        sname = new javax.swing.JTextField();
        saddress = new javax.swing.JTextField();
        scontact = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        sstatus1 = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(760, 420));

        ress.setBackground(new java.awt.Color(204, 204, 204));
        ress.setPreferredSize(new java.awt.Dimension(760, 420));
        ress.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(62, 96, 193));
        jPanel2.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(62, 96, 193));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setText("CUSTOMER");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(310, 0, 130, 40);

        ress.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 40));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable2);

        ress.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 530, 210));

        edit.setBackground(new java.awt.Color(204, 204, 204));
        edit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editMouseExited(evt);
            }
        });
        edit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sadd.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        sadd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sadd.setText("ADD");
        sadd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saddMouseClicked(evt);
            }
        });
        edit.add(sadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        ress.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 100, 30));

        delete.setBackground(new java.awt.Color(204, 204, 204));
        delete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
        });
        delete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sdelete.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        sdelete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sdelete.setText("DELETE");
        delete.add(sdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        ress.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 100, 30));

        search.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        search.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search.setAutoscrolls(false);
        search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        search.setOpaque(false);
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        ress.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 210, 40));

        search_button.setBackground(new java.awt.Color(204, 204, 204));
        search_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        search_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                search_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                search_buttonMouseExited(evt);
            }
        });
        search_button.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ssearch.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        ssearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ssearch.setText("SEARCH");
        search_button.add(ssearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 40));

        ress.add(search_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 90, 40));

        edit1.setBackground(new java.awt.Color(204, 204, 204));
        edit1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        edit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                edit1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                edit1MouseExited(evt);
            }
        });
        edit1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sedit.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        sedit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sedit.setText("EDIT");
        edit1.add(sedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        ress.add(edit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 100, 30));
        ress.add(sage, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 160, 30));
        ress.add(sid, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 160, 30));
        ress.add(sname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 160, 30));
        ress.add(saddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 160, 30));
        ress.add(scontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 160, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Reset");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        ress.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("DELETE");
        ress.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("Display");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        ress.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, -1, -1));
        ress.add(sstatus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 160, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(ress, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ress, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseEntered
     edit.setBackground(bodycolor);    
    }//GEN-LAST:event_editMouseEntered

    private void editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseExited
     edit.setBackground(navcolor); 
    }//GEN-LAST:event_editMouseExited

    private void search_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_buttonMouseEntered
     search_button.setBackground(bodycolor);    
    }//GEN-LAST:event_search_buttonMouseEntered

    private void search_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_buttonMouseExited
     search_button.setBackground(navcolor); 
    }//GEN-LAST:event_search_buttonMouseExited

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void edit1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit1MouseEntered
    edit1.setBackground(bodycolor);    
    }//GEN-LAST:event_edit1MouseEntered

    private void edit1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit1MouseExited
     edit1.setBackground(navcolor); 
    }//GEN-LAST:event_edit1MouseExited

    private void saddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saddMouseClicked
       JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
    mainFrame.dispose();
       customerForm cf = new customerForm();
   cf.setVisible(true);
    }//GEN-LAST:event_saddMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
     /// dbconnector dbc = new dbconnector();

     //   dbc.insertData("INSERT INTO tbl_student (st_name, st_status, st_address, st_contact) "

        //        + "VALUES ('"+sname.getText()+"', '"+saddress.getText()+"','"+scontact.getText()+"','"+sstatus.getText()+" ')");
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    reset();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        delete.setBackground(navcolor);
    }//GEN-LAST:event_deleteMouseExited

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        delete.setBackground(bodycolor);
    }//GEN-LAST:event_deleteMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel delete;
    private javax.swing.JPanel edit;
    private javax.swing.JPanel edit1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JPanel ress;
    private javax.swing.JLabel sadd;
    private javax.swing.JTextField saddress;
    private javax.swing.JTextField sage;
    private javax.swing.JTextField scontact;
    private javax.swing.JLabel sdelete;
    private javax.swing.JTextField search;
    private javax.swing.JPanel search_button;
    private javax.swing.JLabel sedit;
    private javax.swing.JTextField sid;
    private javax.swing.JTextField sname;
    private javax.swing.JLabel ssearch;
    private javax.swing.JTextField sstatus1;
    // End of variables declaration//GEN-END:variables
}
