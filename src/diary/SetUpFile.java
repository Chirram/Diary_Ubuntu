/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diary;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Chirram
 */
public class SetUpFile {
    
    Statement stmt;
    Connection con;
    String location;
    public SetUpFile(String location) {
        this.location=location;
        getConnection();
    }
    public static void main(String args[])
    {
        //new SetUpFile();
    }
    private void getConnection() {
        try {
            try {
                Class.forName("org.sqlite.JDBC");
            } catch (ClassNotFoundException ex) {
                System.out.println("Sorry, Driver Class is not found");
            }
            con=DriverManager.getConnection("jdbc:sqlite:"+location+"Database.db");
            //JOptionPane.showMessageDialog(null, "database is createdo");
            stmt=con.createStatement();
            System.out.println("Connection is created Successfully.");
            String sql;
            sql="Create table User(username varchar(50),password varchar(50));";
            stmt.executeUpdate(sql);
            sql="create table Diary(sdate date primary key not null,stime time,info text);";
            stmt.executeUpdate(sql);
            System.out.println("Table is created successfully.");
            //ImageIcon icon=new ImageIcon(new ImageIcon(getClass().getResource("/image/1.jpg")).getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH));
            sql="insert into User values('rgukt','kumar');";
            stmt.executeUpdate(sql);
            sql="insert into Diary(sdate,stime,info) values('2015-02-13',time('now'),'Education is divine.');";
            stmt.executeUpdate(sql);
            File imageFile=new File(location+"1.jpg");
            
            if(!imageFile.exists())
            {try{
                FileOutputStream fout=new FileOutputStream(imageFile);
                FileInputStream fis=new FileInputStream(getClass().getResource("/image/1.jpg").getPath());
                byte[] b=new byte[fis.available()];
                fis.read(b);
                fout.write(b);
                fis.close();
                fout.close();}
            catch(Exception e)
            {
                e.printStackTrace();
            }
            }
            //JOptionPane.showMessageDialog(null,"login sample inserted" );
            //sql="delete from Diary;";
            //stmt.executeUpdate(sql);
            /*sql="select * from Diary;";
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next())
            {
                System.out.println(rs.getString("sdate"));
            }
            System.out.println("Values are inserted succesfully.");
            //stmt.executeUpdate("drop table Diary;");*/
            con.clearWarnings();
            con.close();
            
            
        } catch (SQLException ex) {
            
            System.out.println("Error in getting the Connection"+ex.getMessage());
            ex.printStackTrace();
            //JOptionPane.showMessageDialog(null, "error creating datatbase");
        }
    }
}
