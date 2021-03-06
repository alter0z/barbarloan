/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package barbarloan.layout;

import barbarloan.connection.ConnectionDB;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author adria
 */
public class Employees extends javax.swing.JInternalFrame {

    /**
     * Creates new form Employees
     */
    public Employees() {
        initComponents();
        this.showTable(employeeTable);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();

        setBackground(java.awt.Color.white);
        setClosable(true);
        setResizable(true);
        setTitle("Data Employees");
        setToolTipText("");

        jPanel1.setBackground(java.awt.Color.white);

        employeeTable.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Username", "Password", "Role Id", "Name", "Phone", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        employeeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeeTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(employeeTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 764, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(61, 61, 61)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                    .addGap(62, 62, 62)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 434, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(31, Short.MAX_VALUE)))
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

    private void employeeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeTableMouseClicked
//        int row = employeeTable.rowAtPoint(evt.getPoint());
//
//        String username = employeeTable.getValueAt(row, 1).toString();
//        String password = employeeTable.getValueAt(row, 2).toString();
//        int roleIndex = Integer.parseInt(employeeTable.getValueAt(row, 3).toString());
//        String name =  employeeTable.getValueAt(row, 4).toString();
//        String phone = employeeTable.getValueAt(row, 5).toString();
//        String address = employeeTable.getValueAt(row, 6).toString();
//
//        this.ID = Integer.parseInt(employeeTable.getValueAt(row, 0).toString());
//
//        etUsername.setText(username);
//        etPassword.setText(password);
//        etRole.setSelectedIndex(roleIndex - 1);
//        etName.setText(name);
//        etPhone.setText(phone);
//        etAddress.setText(address);
    }//GEN-LAST:event_employeeTableMouseClicked

    private void showTable(JTable table) {
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("#");
        tableModel.addColumn("Username");
        tableModel.addColumn("Password");
        tableModel.addColumn("Role");
        tableModel.addColumn("Name");
        tableModel.addColumn("address");
        tableModel.addColumn("Telp");

        try {
            Connection conn = ConnectionDB.conn();
            String sqlQuery = "select b.*, c.name, a.* from user as a inner join detail_user as b on a.id = b.user_id right join role as c on a.role_id = c.id";
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            int no = 0;

            while (resultSet.next()) {
                no++;
                tableModel.addRow(new Object[]{
                        no,
                        resultSet.getString(8),
                        resultSet.getString(9),
                        resultSet.getString(6),
                        resultSet.getString(3),
                        resultSet.getString(5),
                        resultSet.getString(4)
                });
            }

            table.setModel(tableModel);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }

//        employeeTable.removeColumn(employeeTable.getColumnModel().getColumn(6));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable employeeTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
private String ID = "";
}
