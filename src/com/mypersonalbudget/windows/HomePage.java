/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * HomePage.java
 *
 * Created on Jul 2, 2015, 3:12:38 PM
 */

package com.mypersonalbudget.windows;

import com.bean.AddEntry;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Krishna
 */
public class HomePage extends javax.swing.JFrame {

    /** Creates new form HomePage */
    public HomePage() {
        initComponents();
        Double d = new SumOfMonth().getSumOfMonth();
        String sum = d.toString();
        sumOfThisMonth.setText(sum);
        
        Double d1 = new SumOfMonth().getDadSumOfMonth();
        String krishna = d1.toString();
        jLabel7.setText(krishna);
        
        Double d2 = new SumOfMonth().getMomSumOfMonth();
        String mom = d2.toString();
        jLabel8.setText(mom);
        /*
        Double d3 = new SumOfMonth().getDadSumOfMonth();
        String dad = d3.toString();
        jLabel9.setText(dad);*/
        
        DefaultTableModel tablemodel =(DefaultTableModel) jTable1.getModel();
        tablemodel.setNumRows(0);
        
        try{
                
                
            Session session = new SessFactory().getSessionFactory().openSession();
            session.beginTransaction();
            Query query = session.createQuery("from AddEntry ORDER BY Id DESC");
            query.setMaxResults(4);
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
        
    }/*

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        headImage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        sumOfThisMonth = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        backUpButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        newEntry = new javax.swing.JMenuItem();
        home = new javax.swing.JMenuItem();
        Edit = new javax.swing.JMenu();
        editEntry = new javax.swing.JMenuItem();
        View = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home Page");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(null);

        headImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/head1 (2).jpg"))); // NOI18N
        headImage.setMaximumSize(new java.awt.Dimension(1100, 120));
        headImage.setPreferredSize(new java.awt.Dimension(1100, 120));
        jPanel1.add(headImage);
        headImage.setBounds(0, 0, 1152, 120);

        jLabel1.setFont(new java.awt.Font("Bradley Hand ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Last Entries");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(328, 289, 135, 31);

        jTable1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Item Code", "Item Name", "Cost", "Money Spend By", "Date", "Description"
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
        jTable1.setAutoscrolls(false);
        jTable1.setGridColor(new java.awt.Color(0, 153, 153));
        jTable1.setSelectionBackground(new java.awt.Color(255, 0, 0));
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(44, 338, 726, 93);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vector_flower.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(813, 132, 288, 501);

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("This Month Total  :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(44, 237, 168, 25);

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

        jPanel1.add(jPanel2);
        jPanel2.setBounds(230, 240, 159, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 153));
        jLabel3.setText("Venki");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(290, 470, 33, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Manju");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(290, 490, 38, 15);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(360, 470, 44, 15);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(360, 490, 44, 15);

        backUpButton.setText("Back Up Data");
        backUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backUpButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backUpButton);
        backUpButton.setBounds(673, 240, 97, 23);

        jButton1.setText("Export Total Data To Excel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(419, 240, 161, 23);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/light-blue-wallpaper-5.jpg"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 120, 1150, 520);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1168, 703));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void newEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newEntryActionPerformed

        
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

    private void backUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backUpButtonActionPerformed
       
        new BackUpData().Backupdbtosql();
        
    }//GEN-LAST:event_backUpButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        try{
        new MysqlToXls().generateXls("entrys", "D:\\MyBudget\\Budget.xls");
        JOptionPane.showMessageDialog(null,"Excel Created Successfully");
        }catch(Exception e){
          JOptionPane.showMessageDialog(null,"Error while creating excel file.");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Edit;
    private javax.swing.JMenu File;
    private javax.swing.JMenu View;
    private javax.swing.JButton backUpButton;
    private javax.swing.JMenuItem editEntry;
    private javax.swing.JLabel headImage;
    private javax.swing.JMenuItem home;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenuItem newEntry;
    private javax.swing.JLabel sumOfThisMonth;
    // End of variables declaration//GEN-END:variables

}
