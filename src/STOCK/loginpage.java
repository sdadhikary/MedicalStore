package STOCK;


import static java.awt.event.ActionEvent.ACTION_PERFORMED;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class loginpage extends javax.swing.JFrame {
    
    /**
     * Creates new form loginpage
     */
    public loginpage() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);

setVisible(true);
       
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MEDIPOINT-ALL IN ONE PHARMACY 1.0.2");
        setBackground(new java.awt.Color(255, 102, 102));
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });
        getContentPane().setLayout(null);

        log.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        log.setText("LOGIN");
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });
        getContentPane().add(log);
        log.setBounds(950, 640, 130, 38);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("USERNAME");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(790, 460, 184, 41);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 102));
        jLabel2.setText("PASSWORD");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(780, 560, 200, 22);

        usrn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usrnActionPerformed(evt);
            }
        });
        getContentPane().add(usrn);
        usrn.setBounds(950, 460, 294, 41);

        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passKeyTyped(evt);
            }
        });
        getContentPane().add(pass);
        pass.setBounds(950, 560, 294, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel5.setText("MEDIPOINT");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(420, 260, 310, 80);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/STOCK/login_icon.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(950, 140, 290, 270);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/STOCK/original.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowStateChanged

    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
        // TODO add your handling code here:
        //usrn
        String cmd=evt.getActionCommand();
        
        System.out.println("Printing Source:"+evt.getSource());
        String s=pass.getText().toString();
        
        if(usrn.getText().trim().equals("") || pass.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Enter valid details");
        }
        else
        try
        {
            if(usrn.getText().trim().equals("admin") && pass.getText().equals("admin"))
            {
                homee h=new homee();
                h.setVisible(true);
               
                this.dispose();
            }
            else{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","mysql");
                PreparedStatement p=con.prepareStatement("select * from emplog where usr=?");
                p.setString(1, usrn.getText());

                ResultSet rs=p.executeQuery();
               
               if(!rs.next())
                { JOptionPane.showMessageDialog(null,"Enter valid details");}
                else{

                    if(rs.getString("usr").equals(usrn.getText().toString()) && rs.getString("pass").equals(pass.getText()))
                    { 
                        System.out.println(usrn.getText()+" "+s);
                        Class.forName("com.mysql.jdbc.Driver");
                        PreparedStatement ps=con.prepareStatement("select * from emplog where usr=?");
                        ps.setString(1, usrn.getText());

                        ResultSet rrs=ps.executeQuery();
                        if(!rrs.next())
                        { JOptionPane.showMessageDialog(null,"Enter valid details");}
                        else{

                            if(rrs.getString("usr").equals(usrn.getText().toString()) && rrs.getString("pass").equals(pass.getText()))
                            { 
                                System.out.println(usrn.getText()+" "+s);

                                try
                                {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    PreparedStatement pp=con.prepareStatement("insert into login values(?)");
                                    ps.setString(1, usrn.getText().trim().toString());
                                    ps.executeUpdate();

                                    con.close();
                                }
                                catch(SQLException e)
                                { }
                                catch(ClassNotFoundException e)
                                {}
                            }

                            emplogin h=new emplogin();
                            h.setVisible(true);
                            this.dispose();
                        }
                    }else
                    JOptionPane.showMessageDialog(null,"Enter valid details");

                }
            }

        }
        catch(SQLException e)
        {System.out.println("Inside SQL");
            e.printStackTrace();}
        catch(ClassNotFoundException e)
        {System.out.println("Inside ClassNotFound");}
        
    }//GEN-LAST:event_logActionPerformed
/*public static void callog(java.awt.event.ActionEvent evt)
{
    loginpage lp=new loginpage();
    lp.logActionPerformed(evt);
}*/
    private void passKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyTyped
        // TODO add your handling code here:
        char st=evt.getKeyChar();
        String s=pass.getText().toString();

        if(st==KeyEvent.VK_ENTER)

        
        if(usrn.getText().trim().equals("") || pass.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Enter valid details");
        }
        else
        try
        {
            if(usrn.getText().trim().equals("admin") && pass.getText().equals("admin"))
            {

                homee h=new homee();
                h.setVisible(true);
                this.dispose();

            }
            else{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","mysql");
                PreparedStatement p=con.prepareStatement("select * from emplog where usr=?");
                p.setString(1, usrn.getText());

                ResultSet rs=p.executeQuery();
                if(!rs.next())
                { JOptionPane.showMessageDialog(null,"Enter valid details");}
                else{

                    if(rs.getString("usr").equals(usrn.getText().toString()) && rs.getString("pass").equals(pass.getText()))
                    { 
                        System.out.println(usrn.getText()+" "+s);

                        try
                        {
                            Class.forName("com.mysql.jdbc.Driver");
                            PreparedStatement pp=con.prepareStatement("insert into login values(?)");
                            pp.setString(1, usrn.getText().trim().toString());
                            pp.executeUpdate();

                            con.close();
                        }
                        catch(SQLException e)
                        { }
                        catch(ClassNotFoundException e)
                        {}
                        emplogin h=new emplogin();
                        h.setVisible(true);
                        this.dispose();
                    }else
                    JOptionPane.showMessageDialog(null,"Enter valid details");

                }
            }

        }
        catch(SQLException e)
        {System.out.println("Inside SQL");
            e.printStackTrace();}
        catch(ClassNotFoundException e)
        {System.out.println("Inside ClassNotFound");}
    }//GEN-LAST:event_passKeyTyped

    private void usrnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usrnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usrnActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

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
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public static final javax.swing.JButton log = new javax.swing.JButton();
    public static final javax.swing.JPasswordField pass = new javax.swing.JPasswordField();
    public static final javax.swing.JTextField usrn = new javax.swing.JTextField();
    // End of variables declaration//GEN-END:variables
}
