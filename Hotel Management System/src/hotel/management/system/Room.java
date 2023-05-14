
package hotel.management.system;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import net.proteanit.sql.*;


public class Room  extends JFrame implements ActionListener {
    JButton b2;
    JTable table;
    Room(){
        ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource("icons/frame 6.jpg"));
        Image a2 = a1.getImage().getScaledInstance(890, 590, Image.SCALE_DEFAULT);
        ImageIcon a3 = new ImageIcon(a2);
        JLabel a4 = new JLabel(a3);
        a4.setBounds(5, 5,890 , 590);
        add(a4);
            JLabel l1 = new JLabel("ROOM INFORMATION");
        l1.setBounds(300, 10, 350, 22);
        l1.setFont(new Font("Tahoma", Font.BOLD, 25));
        l1.setForeground(Color.WHITE);
        a4.add(l1);
        
        table=new JTable();
        table.setBounds(10, 80, 570, 450);
        table.setBackground(new Color(34,154,202));
        table.setForeground(Color.white);
        a4.add(table);
        
        JLabel l2 = new JLabel("Room No");
        l2.setBounds(35, 61, 110, 22);
        l2.setFont(new Font("Tahoma", Font.BOLD, 13));
        l2.setForeground(Color.white);
        a4.add(l2);
        JLabel l3 = new JLabel("Availability");
        l3.setBounds(145, 61, 100, 22);
        l3.setFont(new Font("Tahoma", Font.BOLD, 13));
        l3.setForeground(Color.white);
        a4.add(l3);
        
         JLabel l4 = new JLabel("Status");
        l4.setBounds(279, 61, 152, 22);
        l4.setFont(new Font("Tahoma", Font.BOLD, 13));
        l4.setForeground(Color.white);
        a4.add(l4);
         JLabel l5 = new JLabel("Price");
        l5.setBounds(390, 61, 152, 22);
        l5.setFont(new Font("Tahoma", Font.BOLD, 13));
        l5.setForeground(Color.white);
        a4.add(l5);
         JLabel l6 = new JLabel("Bed");
        l6.setBounds(500, 63, 152, 22);
        l6.setFont(new Font("Tahoma", Font.BOLD, 13));
        l6.setForeground(Color.white);
        a4.add(l6);
        
        
         b2 = new JButton("BACK");
        b2.setBounds(250, 540, 90, 33);
        b2.setFont(new Font("Tahoma", Font.BOLD, 15));
        b2.addActionListener(this);
        a4.add(b2);
        
        try {
            Conn c=new Conn();
            String Roominfo="select * from room";
            ResultSet resultset=c.s.executeQuery(Roominfo);
            table.setModel(DbUtils.resultSetToTableModel(resultset));
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
                 ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("icons/roomm.png"));
        Image c2 = c1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon c3 = new ImageIcon(c2);
        JLabel c4 = new JLabel(c3);
        c4.setBounds(650, 200, 200, 200);
        a4.add(c4);
        
        
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
    }
    public static void main(String[] args) {
        new Room();
    }
    
}
