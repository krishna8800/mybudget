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
        //sumOfThisMonth.setText(sum);
        
       
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
        itemName = new javax.swing.JTextField();
        costLabel = new javax.swing.JLabel();
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
        moneySpendBy = new javax.swing.JComboBox();
        searchKey = new javax.swing.JTextField();
        SearchButton = new javax.swing.JButton();
        Label_Edit_Page_Head = new javax.swing.JLabel();
        newEntryHeader = new javax.swing.JLabel();
        headImage = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        newEntry = new javax.swing.JMenuItem();
        home = new javax.swing.JMenuItem();
        Edit = new javax.swing.JMenu();
        editEntry = new javax.swing.JMenuItem();
        View = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edit Entry");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(null);
        jPanel1.add(itemName);
        itemName.setBounds(940, 220, 189, 30);

        costLabel.setFont(new java.awt.Font("Aller", 1, 14)); // NOI18N
        costLabel.setForeground(new java.awt.Color(255, 255, 255));
        costLabel.setText("Cost");
        jPanel1.add(costLabel);
        costLabel.setBounds(830, 260, 36, 23);

        itenNameLabel.setFont(new java.awt.Font("Aller", 1, 14)); // NOI18N
        itenNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        itenNameLabel.setText("Item Name");
        jPanel1.add(itenNameLabel);
        itenNameLabel.setBounds(830, 220, 89, 23);
        jPanel1.add(cost);
        cost.setBounds(940, 260, 189, 30);

        dateLabel.setFont(new java.awt.Font("Aller", 1, 14)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(255, 255, 255));
        dateLabel.setText("Date");
        jPanel1.add(dateLabel);
        dateLabel.setBounds(830, 300, 30, 18);
        jPanel1.add(date);
        date.setBounds(940, 300, 189, 30);

        itemDescriptionLabel.setFont(new java.awt.Font("Aller", 1, 14)); // NOI18N
        itemDescriptionLabel.setForeground(new java.awt.Color(255, 255, 255));
        itemDescriptionLabel.setText("Item Description");
        jPanel1.add(itemDescriptionLabel);
        itemDescriptionLabel.setBounds(830, 390, 106, 18);

        description.setColumns(20);
        description.setRows(5);
        jScrollPane1.setViewportView(description);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(940, 380, 190, 96);

        Submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Submit  button.png"))); // NOI18N
        Submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubmitMouseClicked(evt);
            }
        });
        jPanel1.add(Submit);
        Submit.setBounds(910, 520, 111, 40);

        Clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clear button.png"))); // NOI18N
        Clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearMouseClicked(evt);
            }
        });
        jPanel1.add(Clear);
        Clear.setBounds(1040, 520, 92, 40);

        moneyspend.setFont(new java.awt.Font("Aller", 1, 14)); // NOI18N
        moneyspend.setForeground(new java.awt.Color(255, 255, 255));
        moneyspend.setText("Money Spend By");
        jPanel1.add(moneyspend);
        moneyspend.setBounds(830, 340, 105, 20);

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(204, 0, 0));
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
        jTable1.setGridColor(new java.awt.Color(102, 255, 102));
        jTable1.setRequestFocusEnabled(false);
        jTable1.setRowHeight(24);
        jTable1.setSelectionBackground(new java.awt.Color(255, 255, 153));
        jTable1.setSelectionForeground(new java.awt.Color(0, 51, 51));
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

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(10, 215, 795, 350);

        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });
        jPanel1.add(refreshButton);
        refreshButton.setBounds(838, 131, 80, 23);

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        jPanel1.add(deleteButton);
        deleteButton.setBounds(940, 131, 70, 23);

        moneySpendBy.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Venki", "Manju" }));
        jPanel1.add(moneySpendBy);
        moneySpendBy.setBounds(940, 340, 189, 30);

        searchKey.setForeground(new java.awt.Color(204, 204, 204));
        searchKey.setText("Search");
        searchKey.setToolTipText("Search Here");
        jPanel1.add(searchKey);
        searchKey.setBounds(10, 140, 190, 20);

        SearchButton.setText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });
        jPanel1.add(SearchButton);
        SearchButton.setBounds(210, 140, 80, 23);

        Label_Edit_Page_Head.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Label_Edit_Page_Head.setForeground(new java.awt.Color(255, 0, 51));
        Label_Edit_Page_Head.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Edit_Page_Head.setText("Edit Page");
        jPanel1.add(Label_Edit_Page_Head);
        Label_Edit_Page_Head.setBounds(10, 180, 790, 30);

        newEntryHeader.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        newEntryHeader.setForeground(new java.awt.Color(255, 255, 0));
        newEntryHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newEntryHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/light-blue-wallpaper-5.jpg"))); // NOI18N
        jPanel1.add(newEntryHeader);
        newEntryHeader.setBounds(0, 120, 1150, 470);

        headImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/head1 (2).jpg"))); // NOI18N
        headImage.setMaximumSize(new java.awt.Dimension(1100, 120));
        headImage.setPreferredSize(new java.awt.Dimension(1100, 120));
        jPanel1.add(headImage);
        headImage.setBounds(0, 0, 1172, 120);

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

        jMenuBar1.add(Edit);

        View.setText("View");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("View");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        View.add(jMenuItem1);

        jMenuBar1.add(View);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1153, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        //sumOfThisMonth.setText(sum);
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
        //sumOfThisMonth.setText(sum);
    
    
    
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
        //sumOfThisMonth.setText(sum);
        
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
        //sumOfThisMonth.setText(sum);
        
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
        //sumOfThisMonth.setText(sum);
        
        
        
    }//GEN-LAST:event_ClearMouseClicked

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        
        DefaultTableModel tablemodel =(DefaultTableModel) jTable1.getModel();
        tablemodel.setNumRows(0);
        try {

            String searchkey = searchKey.getText();
            Session session = new SessFactory().getSessionFactory().openSession();
            session.beginTransaction();
            Query query = session.createQuery("from AddEntry where itemName LIKE '"+searchkey+"%' ORDER BY date DESC");
            List<AddEntry> entries = query.list();
            
            for (AddEntry e : entries) {
                System.out.println(".......................... "+e.getItemName());

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
        
        
        
        
        
        
        
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void newEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newEntryActionPerformed

        this.dispose();
        NewEntry ne = new NewEntry();
        ne.setVisible(true);
    }//GEN-LAST:event_newEntryActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        this.dispose();
        HomePage  hm = new HomePage();
        hm.setVisible(true);
    }//GEN-LAST:event_homeActionPerformed

    private void FileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FileActionPerformed

    private void editEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editEntryActionPerformed

        this.dispose();
        EditEntry ee = new EditEntry();
        ee.setVisible(true);
    }//GEN-LAST:event_editEntryActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.dispose();
        ViewFrame v = new ViewFrame();
        v.setVisible(true);

    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
    private javax.swing.JLabel Label_Edit_Page_Head;
    private javax.swing.JButton SearchButton;
    private javax.swing.JLabel Submit;
    private javax.swing.JMenu View;
    private javax.swing.JTextField cost;
    private javax.swing.JLabel costLabel;
    private javax.swing.JTextField date;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextArea description;
    private javax.swing.JMenuItem editEntry;
    private javax.swing.JLabel headImage;
    private javax.swing.JMenuItem home;
    private javax.swing.JLabel itemDescriptionLabel;
    private javax.swing.JTextField itemName;
    private javax.swing.JLabel itenNameLabel;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox moneySpendBy;
    private javax.swing.JLabel moneyspend;
    private javax.swing.JMenuItem newEntry;
    private javax.swing.JLabel newEntryHeader;
    private javax.swing.JButton refreshButton;
    private javax.swing.JTextField searchKey;
    // End of variables declaration//GEN-END:variables


      
}
