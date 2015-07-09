/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mypersonalbudget.windows;

import com.bean.AddEntry;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import java.util.List;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Krishna
 */
public class EditEntry extends javax.swing.JFrame {

    /**
     * Creates new form EditEntry
     */
    public EditEntry() {
        initComponents();
       DefaultTableModel tablemodel =(DefaultTableModel) jTable1.getModel();
       tablemodel.setNumRows(0);
        
        try{
                
                
            Session session = new SessFactory().getSessionFactory().openSession();
            session.beginTransaction();
            Query query = session.createQuery("from AddEntry ORDER BY Id DESC");
            List<AddEntry> entries = query.list();
            for (AddEntry e : entries) {

                tablemodel.addRow(new Object[]{
                    e.getId(),e.getItemName(), e.getItemCost(), e.getMoneySpendBy(), e.getDate(), e.getItemDesc()
                });

            }
            session.getTransaction().commit();
            session.close();
            
           /* Session session2 = new SessFactory().getSessionFactory().openSession();
            session2.beginTransaction();
            AddEntry ae = new AddEntry();
            Query query1= session2.createQuery("select sum(itemCost) from AddEntry");
            List sum = query1.list();
            System.out.println("...................." + sum.get(0));
            session2.getTransaction().commit();
            session2.close();*/
                
            
            
            
        }catch(Exception e){
            
        JOptionPane.showMessageDialog(this,"Error while loading table.");
        e.printStackTrace();
        
        }
        
        Double d = new SumOfMonth().getSumOfMonth();
        String sum = d.toString();
        sumOfThisMonth.setText(sum);
        
       
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
        headImage = new javax.swing.JLabel();
        newEntryHeader = new javax.swing.JLabel();
        costLabel = new javax.swing.JLabel();
        itemName = new javax.swing.JTextField();
        itenNameLabel = new javax.swing.JLabel();
        cost = new javax.swing.JTextField();
        dateLabel = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        itemDescriptionLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();
        Submit = new javax.swing.JLabel();
        Clear = new javax.swing.JLabel();
        moneyspend = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        refreshButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        sumOfThisMonth = new javax.swing.JLabel();
        moneySpendBy = new javax.swing.JComboBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        newEntry = new javax.swing.JMenuItem();
        home = new javax.swing.JMenuItem();
        Edit = new javax.swing.JMenu();
        editEntry = new javax.swing.JMenuItem();
        deleteEntry = new javax.swing.JMenuItem();
        View = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edit Entry");

        jPanel1.setBackground(new java.awt.Color(255, 153, 204));

        headImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/head1.jpg"))); // NOI18N
        headImage.setMaximumSize(new java.awt.Dimension(1100, 120));
        headImage.setPreferredSize(new java.awt.Dimension(1100, 120));

        newEntryHeader.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        newEntryHeader.setForeground(new java.awt.Color(255, 255, 0));
        newEntryHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newEntryHeader.setText("Edit Entry");

        costLabel.setFont(new java.awt.Font("Aller", 1, 18)); // NOI18N
        costLabel.setForeground(new java.awt.Color(255, 255, 255));
        costLabel.setText("Cost");

        itenNameLabel.setFont(new java.awt.Font("Aller", 1, 18)); // NOI18N
        itenNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        itenNameLabel.setText("Item Name");

        dateLabel.setFont(new java.awt.Font("Aller", 1, 18)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(255, 255, 255));
        dateLabel.setText("Date");

        itemDescriptionLabel.setFont(new java.awt.Font("Aller", 1, 18)); // NOI18N
        itemDescriptionLabel.setForeground(new java.awt.Color(255, 255, 255));
        itemDescriptionLabel.setText("Item Description");

        description.setColumns(20);
        description.setRows(5);
        jScrollPane1.setViewportView(description);

        Submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Submit  button.png"))); // NOI18N
        Submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubmitMouseClicked(evt);
            }
        });

        Clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clear button.png"))); // NOI18N
        Clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearMouseClicked(evt);
            }
        });

        moneyspend.setFont(new java.awt.Font("Aller", 1, 18)); // NOI18N
        moneyspend.setForeground(new java.awt.Color(255, 255, 255));
        moneyspend.setText("Money Spend By");

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(204, 255, 255));
        jTable1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 51, 51));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Item Name", "Cost", "Money Spend By", "Date", "Description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(0, 153, 153));
        jTable1.setSelectionBackground(new java.awt.Color(255, 0, 0));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(4);
        }

        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("This Month Total  :");

        sumOfThisMonth.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        sumOfThisMonth.setForeground(new java.awt.Color(204, 0, 0));
        sumOfThisMonth.setText("jLabel2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(sumOfThisMonth)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sumOfThisMonth, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        moneySpendBy.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "             ", "Self", "Mom", "Dad", "Others" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(newEntryHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Submit)
                                .addGap(18, 18, 18)
                                .addComponent(Clear))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(itemDescriptionLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(moneyspend)
                                    .addComponent(dateLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                    .addComponent(moneySpendBy, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(costLabel)
                                    .addComponent(itenNameLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(itemName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cost, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(refreshButton)
                        .addGap(31, 31, 31)
                        .addComponent(deleteButton)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(headImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newEntryHeader)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(refreshButton)
                        .addComponent(deleteButton))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(itemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itenNameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(costLabel)
                            .addComponent(cost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateLabel)
                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(moneyspend)
                            .addComponent(moneySpendBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Submit)
                                    .addComponent(Clear)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(itemDescriptionLabel))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(-14336,true));
        jMenuBar1.setAutoscrolls(true);
        jMenuBar1.setFont(new java.awt.Font("Dialog", 1, 18));

        File.setText("File");
        File.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileActionPerformed(evt);
            }
        });

        newEntry.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newEntry.setText("New Entry");
        newEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newEntryActionPerformed(evt);
            }
        });
        File.add(newEntry);

        home.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        File.add(home);

        jMenuBar1.add(File);

        Edit.setText("Edit");

        editEntry.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        editEntry.setText("Edit Entry");
        editEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editEntryActionPerformed(evt);
            }
        });
        Edit.add(editEntry);

        deleteEntry.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        deleteEntry.setText("Delete Entry");
        Edit.add(deleteEntry);

        jMenuBar1.add(Edit);

        View.setText("View");

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("View Items By Date");
        View.add(jMenuItem5);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("View Items By Month");
        View.add(jMenuItem4);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("View Items By Week");
        View.add(jMenuItem6);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setText("View Items By Year");
        View.add(jMenuItem7);

        jMenuBar1.add(View);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitMouseClicked
        int table_row = jTable1.getSelectedRow();
        String selectedRowId = jTable1.getModel().getValueAt(table_row, 0).toString();
        
        try{
            SessFactory sessfactory = new SessFactory();
            Session session = sessfactory.getSessionFactory().openSession();
            session.beginTransaction();
            Query query = session.createQuery("update AddEntry set itemName=:name,itemCost=:cost,date=:d,itemDesc=:desc,moneySpendBy=:money where Id = "+selectedRowId);
            query.setParameter("name",itemName.getText());
            query.setParameter("cost",Double.parseDouble(cost.getText()));
            query.setParameter("d", date.getText());
            query.setParameter("desc",description.getText());
            query.setParameter("money",moneySpendBy.getSelectedItem());
            int i = query.executeUpdate();
            if(i>0){
            JOptionPane.showMessageDialog(this,"Updated Successfully.");
            }
            else
            {
            JOptionPane.showMessageDialog(this,"Not Updated.");
            }
            
            session.getTransaction().commit();
            session.close();
          }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,"Oops! Something entered wrong.");

          }
        updateTable();
        ClearMouseClicked(evt);
        Double d = new SumOfMonth().getSumOfMonth();
        String sum = d.toString();
        sumOfThisMonth.setText(sum);
    }//GEN-LAST:event_SubmitMouseClicked

    public void updateTable(){
       DefaultTableModel tablemodel =(DefaultTableModel) jTable1.getModel();
       tablemodel.setNumRows(0);
        
        try{              
            Session session = new SessFactory().getSessionFactory().openSession();
            session.beginTransaction();
            Query query = session.createQuery("from AddEntry ORDER BY Id DESC");
            List<AddEntry> entries = query.list();
            for (AddEntry e : entries) {

                tablemodel.addRow(new Object[]{
                    e.getId(),e.getItemName(), e.getItemCost(), e.getMoneySpendBy(), e.getDate(), e.getItemDesc()
                });

            }
            session.getTransaction().commit();
            session.close();
                     
        }catch(Exception e){
            
        JOptionPane.showMessageDialog(this,"Error while loading table.");
        e.printStackTrace();
        
        }  
        
        Double d = new SumOfMonth().getSumOfMonth();
        String sum = d.toString();
        sumOfThisMonth.setText(sum);
    
    
    
    }
    
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        try {
            
            
            int table_row = jTable1.getSelectedRow();
            String selectedRowId = jTable1.getModel().getValueAt(table_row, 0).toString();

            Session session = new SessFactory().getSessionFactory().openSession();
            session.beginTransaction();
            Query query = session.createQuery("from AddEntry where Id=" + selectedRowId);
            List<AddEntry> selectedList = query.list();
            for (AddEntry e : selectedList) {

                itemName.setText(e.getItemName());
                cost.setText(e.getItemCost().toString());
                date.setText(e.getDate());
                moneySpendBy.setSelectedItem(e.getMoneySpendBy());
                description.setText(e.getItemDesc());

            }
            session.getTransaction().commit();
            session.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_jTable1MouseClicked

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        
        updateTable();
        ClearMouseClicked(null);
        Double d = new SumOfMonth().getSumOfMonth();
        String sum = d.toString();
        sumOfThisMonth.setText(sum);
        
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
      
       try {

            int table_row = jTable1.getSelectedRow();
            String selectedRowId = jTable1.getModel().getValueAt(table_row, 0).toString();

            Session session = new SessFactory().getSessionFactory().openSession();
            session.beginTransaction();
            Query query = session.createQuery("DELETE AddEntry where Id=" + selectedRowId);
            int i= query.executeUpdate();
            
            System.out.println(" ............... "+i);
            if(i>0){
            JOptionPane.showMessageDialog(this,"Deleted Successfully.");            
            }            
            else{
            JOptionPane.showMessageDialog(this,"Oops! Not Deleted!!");
            
            }
            
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
 
        updateTable();
        ClearMouseClicked(null);
        Double d = new SumOfMonth().getSumOfMonth();
        String sum = d.toString();
        sumOfThisMonth.setText(sum);
        
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void ClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearMouseClicked
       
        itemName.setText(null);
        cost.setText(null);
        /*Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("dd/M/YYYY");
        String entryDate = ft.format(dNow);*/
        date.setText(null);
        moneySpendBy.setSelectedItem("     ");
        description.setText(null);
        updateTable();
        Double d = new SumOfMonth().getSumOfMonth();
        String sum = d.toString();
        sumOfThisMonth.setText(sum);
        
        
        
    }//GEN-LAST:event_ClearMouseClicked

    private void newEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newEntryActionPerformed

        this.dispose();
        NewEntry ne = new NewEntry();
        ne.setVisible(true);

    }//GEN-LAST:event_newEntryActionPerformed

    private void FileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FileActionPerformed

    private void editEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editEntryActionPerformed

        this.dispose();
        EditEntry ee = new EditEntry();
        ee.setVisible(true);

    }//GEN-LAST:event_editEntryActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        this.dispose();
        HomePage  hm = new HomePage();
        hm.setVisible(true);
    }//GEN-LAST:event_homeActionPerformed

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
            java.util.logging.Logger.getLogger(EditEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditEntry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Clear;
    private javax.swing.JMenu Edit;
    private javax.swing.JMenu File;
    private javax.swing.JLabel Submit;
    private javax.swing.JMenu View;
    private javax.swing.JTextField cost;
    private javax.swing.JLabel costLabel;
    private javax.swing.JTextField date;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JMenuItem deleteEntry;
    private javax.swing.JTextArea description;
    private javax.swing.JMenuItem editEntry;
    private javax.swing.JLabel headImage;
    private javax.swing.JMenuItem home;
    private javax.swing.JLabel itemDescriptionLabel;
    private javax.swing.JTextField itemName;
    private javax.swing.JLabel itenNameLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox moneySpendBy;
    private javax.swing.JLabel moneyspend;
    private javax.swing.JMenuItem newEntry;
    private javax.swing.JLabel newEntryHeader;
    private javax.swing.JButton refreshButton;
    private javax.swing.JLabel sumOfThisMonth;
    // End of variables declaration//GEN-END:variables


      
}
