
package hotel.management.system;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import net.proteanit.sql.*;


public class Department  extends JFrame implements ActionListener {
    JButton b2;
    JTable table;
    Department(){
        ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource("icons/frame 6.jpg"));
        Image a2 = a1.getImage().getScaledInstance(890, 590, Image.SCALE_DEFAULT);
        ImageIcon a3 = new ImageIcon(a2);
        JLabel a4 = new JLabel(a3);
        a4.setBounds(5, 5,890 , 590);
        add(a4);
        
        
        table=new JTable();
        table.setBounds(10, 80, 873, 400);
        table.setBackground(new Color(34,154,202));
        table.setForeground(Color.white);
        a4.add(table);
                   JLabel l1 = new JLabel("DEPARTMENT INFORMATION");
        l1.setBounds(290, 10, 400, 22);
        l1.setFont(new Font("Tahoma", Font.BOLD, 25));
        l1.setForeground(Color.WHITE);
        a4.add(l1);
        
        JLabel l2 = new JLabel("DEPARTMENT");
        l2.setBounds(10, 61, 110, 22);
        l2.setFont(new Font("Tahoma", Font.BOLD, 13));
        l2.setForeground(Color.white);
        a4.add(l2);
        JLabel l3 = new JLabel("BUDGET");
        l3.setBounds(445, 61, 100, 22);
        l3.setFont(new Font("Tahoma", Font.BOLD, 13));
        l3.setForeground(Color.white);
        a4.add(l3);
        
     
        
        
         b2 = new JButton("BACK");
        b2.setBounds(395, 500, 90, 33);
        b2.setFont(new Font("Tahoma", Font.BOLD, 15));
        b2.addActionListener(this);
        a4.add(b2);
        
        try {
            Conn c=new Conn();
            String Roominfo="select * from department";
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
    }
    public static void main(String[] args) {
        new Department();
    }
    
}
