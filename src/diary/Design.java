/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diary;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Chirram
 */
public class Design extends javax.swing.JPanel {

    /**
     * Creates new form Design
     */
    String password,username="Kumar Chirram";
    ImageIcon icon;
    String sql;
    Connection con;
    Statement stmt;
    ResultSet r,rs;
    String ppath,location;
    PreparedStatement prepStmt,updatePrepStmt;
    private String text;
    public Design(String location) {
        this.location=location;        
        getConnection();
        initComponents();
        //jTextArea1.setText(getClass().getResource("/").getPath());
        setICon();
        revalidate();
        
    }
    public void setICon()
    {
        //JOptionPane.showMessageDialog(null,this.ppath+"1.jpg" );     
        ImageIcon icon=new ImageIcon(new ImageIcon(location+"1.jpg").getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH));
        image.setIcon(icon);
        revalidate();
        repaint();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        viewDiary = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        preferences = new javax.swing.JLabel();
        submit = new javax.swing.JLabel();
        clear = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setPreferredSize(new java.awt.Dimension(657, 690));

        jPanel1.setBackground(new java.awt.Color(5, 5, 5));

        jLabel1.setBackground(new java.awt.Color(1, 1, 1));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Diary");

        jLabel2.setBackground(new java.awt.Color(1, 1, 1));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Welcome "+username);

        jLabel3.setBackground(new java.awt.Color(1, 1, 1));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("X");
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(1, 1, 1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(1, 1, 1));

        jLabel4.setBackground(new java.awt.Color(1, 1, 1));
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("All rights reserved.   copyrights@Kumar Chirram");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 286, Short.MAX_VALUE)
                .addGap(131, 131, 131))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel5.setBackground(new java.awt.Color(1, 1, 1));

        image.setBackground(new java.awt.Color(0, 0, 0));
        image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(236, 23, 23), 2, true));
        image.setOpaque(true);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel6.setBackground(new java.awt.Color(1, 1, 1));

        viewDiary.setBackground(new java.awt.Color(1, 1, 1));
        viewDiary.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        viewDiary.setForeground(new java.awt.Color(240, 240, 240));
        viewDiary.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewDiary.setText("View Diary");
        viewDiary.setOpaque(true);
        viewDiary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewDiaryMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewDiaryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewDiaryMouseExited(evt);
            }
        });

        userName.setBackground(new java.awt.Color(1, 1, 1));
        userName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userName.setForeground(new java.awt.Color(240, 240, 240));
        userName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userName.setText("Username : "+username);
        userName.setOpaque(true);
        userName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userNameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userNameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userNameMouseExited(evt);
            }
        });

        preferences.setBackground(new java.awt.Color(1, 1, 1));
        preferences.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        preferences.setForeground(new java.awt.Color(240, 240, 240));
        preferences.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        preferences.setText("Preferences");
        preferences.setOpaque(true);
        preferences.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                preferencesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                preferencesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                preferencesMouseExited(evt);
            }
        });

        submit.setBackground(new java.awt.Color(1, 1, 1));
        submit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        submit.setForeground(new java.awt.Color(240, 240, 240));
        submit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        submit.setText("Submit Now!!");
        submit.setOpaque(true);
        submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                submitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                submitMouseExited(evt);
            }
        });

        clear.setBackground(new java.awt.Color(1, 1, 1));
        clear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        clear.setForeground(new java.awt.Color(240, 240, 240));
        clear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clear.setText("Clear Text");
        clear.setOpaque(true);
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(preferences, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewDiary, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(preferences, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewDiary, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE))
                        .addGap(0, 0, 0)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
    }// </editor-fold>//GEN-END:initComponents
    private synchronized void getConnection() {
        try {
            
            try {
                Class.forName("org.sqlite.JDBC");
            } catch (ClassNotFoundException ex) {
                System.out.println("Sorry, Driver Class is not found");
            }
            
            con=DriverManager.getConnection("jdbc:sqlite:"+location+"Database.db");
            ////JOptionPane.showMessageDialog(null, "start up info1");
            stmt=con.createStatement();
            sql="insert into Diary values(?,?,?);";
            prepStmt=con.prepareStatement(sql);
            sql="insert into Diary values(?,?,?);";
            prepStmt=con.prepareStatement(sql);
            sql="update Diary set info=? where sdate=date('now');";
            updatePrepStmt=con.prepareStatement(sql);
            System.out.println("Connection is created Successfully.");
            getCredentials();
            ////JOptionPane.showMessageDialog(null, "start up info");
            
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null,"login getcon 1.jpgyeahh" );
            System.out.println("Error in getting the Connection");
        }
    } 
    public void getCredentials()
     {
        try {
            String sql="select * from User;";
            //stmt=con.createStatement();
            r=stmt.executeQuery(sql);
            if(r.next())
            {
                username=r.getString("username");
                password=r.getString("password");
                //icon=(ImageIcon) r.getBlob("image");
                //System.out.println(username+" dfdslf "+password);
            }
        } catch (SQLException ex) {
            System.out.println("Error");
            System.out.println(ex.getCause());
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        try {
            // TODO add your handling code here:
            stmt.close();
            con.close();
            
            System.exit(0);
        } catch (SQLException ex) {
            Logger.getLogger(Design.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void viewDiaryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewDiaryMouseClicked
        // TODO add your handling code here:
        getInfo();
    }//GEN-LAST:event_viewDiaryMouseClicked
    private void getInfo()
    {
        
            String s=JOptionPane.showInputDialog("Enter the date(yyyy-mm-dd) :");
            if(s!=null){try {
            sql="select info from Diary where sdate='"+s+"';";
            ResultSet rs=stmt.executeQuery(sql);
            text="";
            while(rs.next())
            {
                text+=rs.getString("info");
            }
            rs.close();
            //text.replaceAll("`", "'");
            jTextArea1.setText(text);
        } catch (SQLException ex) {
            getInfo();
        }}
            else{}
    }
    private void viewDiaryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewDiaryMouseEntered
        // TODO add your handling code here:
        viewDiary.setBackground(Color.red);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_viewDiaryMouseEntered

    private void viewDiaryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewDiaryMouseExited
        // TODO add your handling code here:
        viewDiary.setBackground(Color.black);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_viewDiaryMouseExited

    private void userNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userNameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameMouseClicked

    private void userNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userNameMouseEntered
        // TODO add your handling code here:
        userName.setBackground(Color.red);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_userNameMouseEntered

    private void userNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userNameMouseExited
        // TODO add your handling code here:
        userName.setBackground(Color.black);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_userNameMouseExited

    private void preferencesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_preferencesMouseClicked
        // TODO add your handling code here:
        new Preferences(this);
    }//GEN-LAST:event_preferencesMouseClicked

    private void preferencesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_preferencesMouseEntered
        // TODO add your handling code here:
        preferences.setBackground(Color.red);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_preferencesMouseEntered

    private void preferencesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_preferencesMouseExited
        // TODO add your handling code here:
        preferences.setBackground(Color.black);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_preferencesMouseExited

    private void submitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitMouseClicked
        try {
            // TODO add your handling code here:
            text=jTextArea1.getText();
            jTextArea1.setText("");
            text.replaceAll("'", "~");
            //sql="insert into Diary values(date('now'),time('now'),'"+text+"');";
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Calendar calobj = Calendar.getInstance();
            String dateTime[]=df.format(calobj.getTime()).split(" ");
            prepStmt.setString(1, dateTime[0]);
            prepStmt.setString(2, dateTime[1]);
            prepStmt.setString(3, text);
            prepStmt.executeUpdate();
            //con.commit();
            
            
        }
        catch(Exception e)
        {   //e.printStackTrace();
            try {
                sql="select info from Diary where sdate=date('now');";
                ResultSet rs=stmt.executeQuery(sql);
                String st="";
                if(rs.next()){
                    st=rs.getString("info");
                }                
                System.out.println(text);
                updatePrepStmt.setString(1, st+text);
                updatePrepStmt.executeUpdate();
                
                //sql="update Diary set info='"+st+text+"' where sdate=date('now');";                
                updatePrepStmt.executeUpdate();
                //con.commit();
                
            } catch (SQLException ex) {
                System.out.println("Unable to write Diary"+ex.getMessage());
                Logger.getLogger(Design.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_submitMouseClicked

    private void submitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitMouseEntered
        // TODO add your handling code here:
        submit.setBackground(Color.red);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_submitMouseEntered

    private void submitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitMouseExited
        // TODO add your handling code here:
        submit.setBackground(Color.black);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_submitMouseExited

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
        jLabel3.setBackground(Color.orange);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        // TODO add your handling code here:
        jLabel3.setBackground(Color.black);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jLabel3MouseExited

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
        // TODO add your handling code here:
        jTextArea1.setText("");
    }//GEN-LAST:event_clearMouseClicked

    private void clearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseEntered
        // TODO add your handling code here:
        clear.setBackground(Color.red);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_clearMouseEntered

    private void clearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseExited
        // TODO add your handling code here:
        clear.setBackground(Color.black);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_clearMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel clear;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel preferences;
    private javax.swing.JLabel submit;
    public javax.swing.JLabel userName;
    private javax.swing.JLabel viewDiary;
    // End of variables declaration//GEN-END:variables
}
