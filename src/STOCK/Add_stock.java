package STOCK;

import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SHUBHAM
 */
public class Add_stock extends javax.swing.JFrame {

    Float total;
    public Add_stock() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        fetch();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("project?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        stockQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT s FROM Stock s");
        stockList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : stockQuery.getResultList();
        jLabel1 = new javax.swing.JLabel();
        item = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        qty = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ppu = new javax.swing.JTextField();
        ad = new javax.swing.JButton();
        rst = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        T1 = new javax.swing.JTable();
        hp = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("Item Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(610, 130, 100, 30);

        item.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemActionPerformed(evt);
            }
        });
        item.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                itemKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                itemKeyTyped(evt);
            }
        });
        getContentPane().add(item);
        item.setBounds(800, 130, 300, 39);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("Quantity");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(620, 200, 90, 25);

        qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyActionPerformed(evt);
            }
        });
        qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qtyKeyTyped(evt);
            }
        });
        getContentPane().add(qty);
        qty.setBounds(800, 190, 110, 39);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel3.setText("ADD  STOCK");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(650, 30, 240, 45);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setText("Price per Unit");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(600, 260, 130, 25);

        ppu.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        ppu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ppuActionPerformed(evt);
            }
        });
        ppu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ppuKeyTyped(evt);
            }
        });
        getContentPane().add(ppu);
        ppu.setBounds(800, 250, 110, 39);

        ad.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        ad.setText("ADD");
        ad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adActionPerformed(evt);
            }
        });
        getContentPane().add(ad);
        ad.setBounds(620, 340, 90, 33);

        rst.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        rst.setText("RESET");
        rst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rstActionPerformed(evt);
            }
        });
        getContentPane().add(rst);
        rst.setBounds(810, 340, 90, 33);

        T1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jScrollPane1.setViewportView(T1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(550, 410, 452, 310);

        hp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/STOCK/homeick.png"))); // NOI18N
        hp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hpActionPerformed(evt);
            }
        });
        getContentPane().add(hp);
        hp.setBounds(50, 30, 80, 70);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/STOCK/bbbccckk.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemActionPerformed

    private void adActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adActionPerformed
        // TODO add your handling code here:
        try 
        {
            if (item.getText().trim().equals("") || qty.getText().trim().equals("") || ppu.getText().trim().equals("") || qty.getText().trim().equals("")) 
            {
                JOptionPane.showMessageDialog(null, "Field cannot be left blank");
            }
        } catch (Exception e) {}
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "mysql");
            PreparedStatement p = con.prepareStatement("select * from stock where name=?");
            p.setString(1, item.getText());
            ResultSet rs = p.executeQuery();
            while (rs.next()) 
            {
                if (rs.getString("name").equals(item.getText())) 
                    JOptionPane.showMessageDialog(null, "medicine already available in stock \n please update");
            }
        } 
        catch (SQLException e) {} 
        catch (ClassNotFoundException e) {}
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "mysql");
            PreparedStatement p = con.prepareStatement("insert into stock(name,qty,price) values(?,?,?)");

            p.setString(1, item.getText());
            p.setInt(2, Integer.parseInt(qty.getText()));
            p.setFloat(3, Float.parseFloat(ppu.getText()));
            p.executeUpdate();

            con.close();
        } 
        catch (SQLException e) {} 
        catch (ClassNotFoundException e) {}

        try 
        {
            DefaultTableModel model = (DefaultTableModel) T1.getModel();
            String a = ppu.getText();
            String b = qty.getText();
            Float a1 = Float.parseFloat(a);
            Float b1 = Float.parseFloat(b);
            fetch(); 
        }
            catch (Exception e) {}
        item.setText("");
        qty.setText("");
        ppu.setText("");
    }//GEN-LAST:event_adActionPerformed

    private void rstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rstActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) T1.getModel();
        item.setText(null);
        qty.setText(null);
        ppu.setText(null);

    }//GEN-LAST:event_rstActionPerformed

    private void qtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtyActionPerformed

    private void qtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtyKeyTyped
        // TODO add your handling code here:
        if (qty.getText().length() < 0) {} 
        else 
        {
            char st = evt.getKeyChar();
            if (Character.isDigit(st)) {} 
            else 
                evt.consume();
        }
        char st = evt.getKeyChar();
        if (st == KeyEvent.VK_ENTER) 
            try {
                if (item.getText().trim().equals("") || qty.getText().trim().equals("") || ppu.getText().trim().equals("") || qty.getText().trim().equals("")) {
                    JOptionPane.showMessageDialog(null, "Field cannot be left blank");
                }
            } catch (Exception e) {}
    }//GEN-LAST:event_qtyKeyTyped

    private void ppuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ppuKeyTyped
        // TODO add your handling code here:
        if (ppu.getText().length() < 0) {}
        else 
        {
            char st = evt.getKeyChar();

            if (Character.isDigit(st) || (st == 46)) {}
            else
                evt.consume();

            if (st == KeyEvent.VK_ENTER) 
            {
                try 
                {
                    if (item.getText().trim().equals("") || qty.getText().trim().equals("") || ppu.getText().trim().equals("") || qty.getText().trim().equals(""))
                        JOptionPane.showMessageDialog(null, "Field cannot be left blank");     
                } catch (Exception e) {}
                try 
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "mysql");
                    PreparedStatement p = con.prepareStatement("insert into stock(name,qty,price) values(?,?,?)");

                    p.setString(1, item.getText());
                    p.setInt(2, Integer.parseInt(qty.getText()));
                    p.setFloat(3, Float.parseFloat(ppu.getText()));
                    p.executeUpdate();

                    con.close();
                } 
                catch (SQLException e) {}
                catch (ClassNotFoundException e) {}

                try 
                {
                    DefaultTableModel model = (DefaultTableModel) T1.getModel();
                    String a = ppu.getText();
                    String b = qty.getText();
                    Float b1 = Float.parseFloat(b);
                    fetch();
                } 
                catch (Exception e) {}
                item.setText("");
                qty.setText("");
                ppu.setText("");
            }
        }
    }//GEN-LAST:event_ppuKeyTyped

    private void itemKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_itemKeyTyped

    private void hpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hpActionPerformed
        // TODO add your handling code here:
        homee h = new homee();
        h.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_hpActionPerformed

    private void itemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemKeyReleased
        // TODO add your handling code here:
        char st = evt.getKeyChar();
        {
            try 
            {
                try 
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "mysql");
                    PreparedStatement p = con.prepareStatement("select * from stock where name=?");
                    p.setString(1, item.getText());
                    ResultSet rs = p.executeQuery();
                    while (rs.next()) 
                    {
                        if (rs.getString("name").equals(item.getText())) {
                            JOptionPane.showMessageDialog(null, "medicine already available in stock...\n please update");
                        }
                    }

                } 
                catch (SQLException e) {
                    System.out.println("Inside SQL");
                    e.printStackTrace();
                } 
                catch (ClassNotFoundException e) {
                    System.out.println("Inside ClassNotFound");
                }
            } catch (Exception e) {
                System.out.println("Inside Exception");
            }

            char ch = evt.getKeyChar();
            if (ch == KeyEvent.VK_BACK_SPACE) 
            {
                qty.setText("");
                ppu.setText("");
            }
        }
    }//GEN-LAST:event_itemKeyReleased

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
        // TODO add your handling code here:

    }//GEN-LAST:event_formComponentAdded

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:


    }//GEN-LAST:event_formComponentShown

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "mysql");
            PreparedStatement ps = con.prepareStatement("select * from stock");
            ResultSet rs = null;
            rs = ps.executeQuery();

            if (rs == null) {
                JOptionPane.showMessageDialog(null, "Medicine not avaiable");
            } 
            else {
                DefaultTableModel model = (DefaultTableModel) T1.getModel();

                while (rs.next()) {
                    model.addRow(new Object[]{rs.getInt("pid"), rs.getString("name"), rs.getInt("qty"), rs.getFloat("ppu")});
                }
            }

        } catch (SQLException e) {
        } catch (ClassNotFoundException e) {
        }
    }//GEN-LAST:event_formWindowOpened

    private void ppuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ppuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ppuActionPerformed
    public void fetch() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "mysql");
            PreparedStatement ps = con.prepareStatement("select * from stock");
            ResultSet rs = null;
            rs = ps.executeQuery();

            T1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
        }
    }

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
            java.util.logging.Logger.getLogger(Add_stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_stock().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable T1;
    private javax.swing.JButton ad;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton hp;
    private javax.swing.JTextField item;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField ppu;
    private javax.swing.JTextField qty;
    private javax.swing.JButton rst;
    private java.util.List<STOCK.Stock> stockList;
    private javax.persistence.Query stockQuery;
    // End of variables declaration//GEN-END:variables

}