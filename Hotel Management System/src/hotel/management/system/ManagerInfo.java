
package hotel.management.system;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import net.proteanit.sql.*;


public class ManagerInfo  extends JFrame implements ActionListener {
    JButton b2;
    JTable table;
    ManagerInfo(){
        ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource("icons/frame 6.jpg"));
        Image a2 = a1.getImage().getScaledInstance(890, 590, Image.SCALE_DEFAULT);
        ImageIcon a3 = new ImageIcon(a2);
        JLabel a4 = new JLabel(a3);
        a4.setBounds(5, 5,890 , 590);
        add(a4);
        
        
        table=new JTable();
        table.setBounds(10, 80, 873, 430);
        table.setBackground(new Color(34,154,202));
        table.setForeground(Color.white);
        a4.add(table);
        
              JLabel l1 = new JLabel("MANAGER INFORMATION");
        l1.setBounds(300, 10, 350, 22);
        l1.setFont(new Font("Tahoma", Font.BOLD, 25));
        l1.setForeground(Color.WHITE);
        a4.add(l1);
        JLabel l2 = new JLabel("NAME");
        l2.setBounds(15, 61, 110, 22);
        l2.setFont(new Font("Tahoma", Font.BOLD, 13));
        l2.setForeground(Color.white);
        a4.add(l2);
        JLabel l3 = new JLabel("AGE");
        l3.setBounds(122, 61, 100, 22);
        l3.setFont(new Font("Tahoma", Font.BOLD, 13));
        l3.setForeground(Color.white);
        a4.add(l3);
        
         JLabel l4 = new JLabel("GENDER");
        l4.setBounds(230, 61, 152, 22);
        l4.setFont(new Font("Tahoma", Font.BOLD, 13));
        l4.setForeground(Color.white);
        a4.add(l4);
         JLabel l5 = new JLabel("JOB");
        l5.setBounds(340, 61, 152, 22);
        l5.setFont(new Font("Tahoma", Font.BOLD, 13));
        l5.setForeground(Color.white);
        a4.add(l5);
         JLabel l6 = new JLabel("SALARY");
        l6.setBounds(447, 61, 152, 22);
        l6.setFont(new Font("Tahoma", Font.BOLD, 13));
        l6.setForeground(Color.white);
        a4.add(l6);
         JLabel l7 = new JLabel("PHONE NO.");
        l7.setBounds(555, 61, 152, 22);
        l7.setFont(new Font("Tahoma", Font.BOLD, 13));
        l7.setForeground(Color.white);
        a4.add(l7);
         JLabel l8 = new JLabel("AADHAR NO.");
        l8.setBounds(665, 61, 152, 22);
        l8.setFont(new Font("Tahoma", Font.BOLD, 13));
        l8.setForeground(Color.white);
        a4.add(l8);
         JLabel l9 = new JLabel("E-MAIL");
        l9.setBounds(775, 61, 152, 22);
        l9.setFont(new Font("Tahoma", Font.BOLD, 13));
        l9.setForeground(Color.white);
        a4.add(l9);
        
        
         b2 = new JButton("BACK");
        b2.setBounds(395, 530, 90, 33);
        b2.setFont(new Font("Tahoma", Font.BOLD, 15));
        b2.addActionListener(this);
        a4.add(b2);
        
        try {
            Conn c=new Conn();
            String Roominfo="select * from employee where job='Manager'";
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
        new ManagerInfo();
    }
    
}
