/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package barbarloan.layout;

import barbarloan.connection.ConnectionDB;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.sql.*;

/**
 *
 * @author adria
 */
public class BorrowTools extends javax.swing.JInternalFrame {

    /**
     * Creates new form Employees
     */
    public BorrowTools(String username) {
        initComponents(username);
        showTable(tools);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents(String username) {

        jPanel1 = new javax.swing.JPanel();
        clear = new javax.swing.JButton();
        doBorrow = new javax.swing.JButton();
        Tstock = new javax.swing.JTextField();
        Tname = new javax.swing.JTextField();
        LName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tools = new javax.swing.JTable();
        stock = new javax.swing.JLabel();

        setBackground(java.awt.Color.white);
        setClosable(true);
        setResizable(true);
        setTitle("Borrow Tools");
        setToolTipText("");

        jPanel1.setBackground(java.awt.Color.white);

        clear.setBackground(new java.awt.Color(220, 220, 220));
        clear.setFont(new java.awt.Font("Product Sans", 1, 12)); // NOI18N
        clear.setForeground(new java.awt.Color(33, 150, 243));
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        doBorrow.setBackground(new java.awt.Color(33, 150, 243));
        doBorrow.setFont(new java.awt.Font("Product Sans", 1, 12)); // NOI18N
        doBorrow.setForeground(java.awt.Color.white);
        doBorrow.setText("Save");
        doBorrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doBorrowActionPerformed(evt,username);
            }
        });

        Tstock.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N

        Tname.setEditable(false);
        Tname.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N

        LName.setFont(new java.awt.Font("Product Sans", 1, 14)); // NOI18N
        LName.setText("Name");

        tools.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        tools.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "#", "Name", "Stock", "id"
            }
        ));
        tools.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toolsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tools);

        stock.setFont(new java.awt.Font("Product Sans", 1, 14)); // NOI18N
        stock.setText("Stock");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(doBorrow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(549, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(LName)
                        .addComponent(stock))
                    .addGap(37, 37, 37)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Tstock, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                        .addComponent(Tname, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doBorrow)
                    .addComponent(clear))
                .addContainerGap(332, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(LName)
                                .addComponent(Tname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(stock)
                                .addComponent(Tstock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(107, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void doBorrowActionPerformed(ActionEvent evt, String username) {//GEN-FIRST:event_doBorrowActionPerformed
        String name = Tname.getText();
        String stock = Tstock.getText();

        if (name.isEmpty() || stock.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Fill The Data!");
        } else {
            try {
                Connection conn = ConnectionDB.conn();
                String selectQuery = "select b.id from user as a inner join detail_user as b on a.id = b.user_id where a.username = '"+username+"'";
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(selectQuery);
                int detailUserID = 0;
                while (resultSet.next()) {
                    detailUserID = Integer.parseInt(resultSet.getString(1));
                }
                int getToolsID = Integer.parseInt(ID);
                int getToolsStock = Integer.parseInt(stock);
                int getCompareStock = Integer.parseInt(getStock);
                if (getToolsStock > getCompareStock) {
                    JOptionPane.showMessageDialog(null, "Your quantity exceed of tool's stock");
                } else {
                    String insertQuery = "insert into request values (null, "+detailUserID+","+getToolsID+","+getToolsStock+",'Borrow',now(),now())";
                    PreparedStatement preparedStatement = conn.prepareStatement(insertQuery);
                    preparedStatement.execute();
                    JOptionPane.showMessageDialog(null, "You have request borrow");
                    DashboardEmployee dashboardEmployee = new DashboardEmployee(username);
                    dashboardEmployee.showTable(dashboardEmployee.getReqTable(),username);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Stock Must Number!");
                JOptionPane.showMessageDialog(null, ex.toString());
            }

            new DashboardEmployee(username).showTable(new DashboardEmployee(username).getReqTable(),username);
            showTable(tools);
            Tname.setText("");
            Tstock.setText("");
        }
    }//GEN-LAST:event_doBorrowActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        Tname.setText("");
        Tstock.setText("");
        this.ID = "";
    }//GEN-LAST:event_clearActionPerformed

    private void toolsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toolsMouseClicked
        int row = tools.rowAtPoint(evt.getPoint());

        String name = tools.getValueAt(row, 1).toString();
        getStock = tools.getValueAt(row, 2).toString();

        ID = tools.getModel().getValueAt(tools.getSelectedRow(), 3).toString();
//        JOptionPane.showMessageDialog(null, ID);
        Tname.setText(name);
        Tstock.setText(getStock);
    }//GEN-LAST:event_toolsMouseClicked

    private void showTable(JTable table) {
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("#");
        tableModel.addColumn("Name");
        tableModel.addColumn("Stock");
        tableModel.addColumn("");

        try {
            Connection conn = ConnectionDB.conn();
            String sqlQuery = "select*from tool";
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            int no = 0;

            while (resultSet.next()) {
                no++;
                tableModel.addRow(new Object[]{
                    no,
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getString(1)
                });
            }

            table.setModel(tableModel);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }

        tools.removeColumn(tools.getColumnModel().getColumn(3));
    }

//    private void queryExecute(String query) throws SQLException {
//        Connection conn = ConnectionDB.conn();
//        PreparedStatement preparedStatement = conn.prepareStatement(query);
//        preparedStatement.execute();
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LName;
    private javax.swing.JTextField Tname;
    private javax.swing.JTextField Tstock;
    private javax.swing.JButton clear;
    private javax.swing.JButton doBorrow;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel stock;
    private javax.swing.JTable tools;
    // End of variables declaration//GEN-END:variables
private String ID = "";
private String getStock = null;
}