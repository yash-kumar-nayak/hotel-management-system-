

package hotel.management.system;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import net.proteanit.sql.*;


public class SearchRoom  extends JFrame implements ActionListener {
    JButton b2, submit;
    JTable table;
    JComboBox t6;
    JCheckBox available;
    SearchRoom(){
        ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource("icons/frame 6.jpg"));
        Image a2 = a1.getImage().getScaledInstance(890, 590, Image.SCALE_DEFAULT);
        ImageIcon a3 = new ImageIcon(a2);
        JLabel a4 = new JLabel(a3);
        a4.setBounds(5, 5,890 , 590);
        add(a4);
        
        
        table=new JTable();
        table.setBounds(10, 130, 873, 400);
        table.setBackground(new Color(34,154,202));
        table.setForeground(Color.white);
        a4.add(table);
        
                  JLabel l1 = new JLabel("SEARCH ROOM");
        l1.setBounds(360, 10, 250, 22);
        l1.setFont(new Font("Tahoma", Font.BOLD, 25));
        l1.setForeground(Color.WHITE);
        a4.add(l1);
                  JLabel ls = new JLabel("Bed Type");
        ls.setBounds(50, 50, 150, 20);
        ls.setFont(new Font("Tahoma", Font.BOLD, 15));
        ls.setForeground(Color.WHITE);
        a4.add(ls);
          t6 = new JComboBox(new String[]{"Single Bed", "Double Bed"});
        t6.setBounds(150, 52, 150, 20);
        t6.setFont(new Font("Tahoma", Font.BOLD, 13));
        t6.setForeground(Color.WHITE);
        t6.setBackground(new Color(16, 108, 115));
        a4.add(t6);
        
        available =new JCheckBox("Only Display Available");
        available.setBounds(650, 52, 180, 20);
        available.setFont(new Font("Tahoma", Font.BOLD, 13));
        available.setForeground(Color.WHITE);
        available.setBackground(new Color(93, 205, 243));
        a4.add(available);
        JLabel l2 = new JLabel("Room No");
        l2.setBounds(13, 111, 110, 22);
        l2.setFont(new Font("Tahoma", Font.BOLD, 13));
        l2.setForeground(Color.white);
        a4.add(l2);
        JLabel l3 = new JLabel("Availability");
        l3.setBounds(190, 111, 100, 22);
        l3.setFont(new Font("Tahoma", Font.BOLD, 13));
        l3.setForeground(Color.white);
        a4.add(l3);
        
         JLabel l4 = new JLabel("Status");
        l4.setBounds(363, 111, 152, 22);
        l4.setFont(new Font("Tahoma", Font.BOLD, 13));
        l4.setForeground(Color.white);
        a4.add(l4);
         JLabel l5 = new JLabel("Price");
        l5.setBounds(538, 111, 152, 22);
        l5.setFont(new Font("Tahoma", Font.BOLD, 13));
        l5.setForeground(Color.white);
        a4.add(l5);
         JLabel l6 = new JLabel("Bed");
        l6.setBounds(710, 111, 152, 22);
        l6.setFont(new Font("Tahoma", Font.BOLD, 13));
        l6.setForeground(Color.white);
        a4.add(l6);
        
        
         b2 = new JButton("BACK");
        b2.setBounds(300, 550, 100, 33);
        b2.setFont(new Font("Tahoma", Font.BOLD, 15));
        b2.addActionListener(this);
        a4.add(b2);
         submit = new JButton("SEARCH");
        submit.setBounds(460, 550, 100, 33);
        submit.setFont(new Font("Tahoma", Font.BOLD, 15));
        submit.addActionListener(this);
        a4.add(submit);
        
        try {
            Conn c=new Conn();
            String Roominfo="select * from room";
            ResultSet resultset=c.s.executeQuery(Roominfo);
            table.setModel(DbUtils.resultSetToTableModel(resultset));
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
   
        
        
         setUndecorated(true);
         setLocation(450, 120);
        setLayout(null);
        setSize(900, 600);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
    if(ae.getSource()==b2){
        setVisible(false);
    }
    else if (ae.getSource()==submit){
        try {
             String q1="select * from room where bed_type ='"+t6.getSelectedItem()+"'";
              String q2="select * from room where availability ='Available' AND bed_type ='"+t6.getSelectedItem()+"' ";
            Conn c=new Conn();
            ResultSet rs;
            if(available.isSelected()){
                rs=c.s.executeQuery(q2);
            }
            else{
                rs=c.s.executeQuery(q2);
            }
            table.setModel(DbUtils.resultSetToTableModel (rs) ) ;

            
        } catch (Exception e) {
        }
    }
    }
    public static void main(String[] args) {
        new SearchRoom();
    }
    
}
