
package hotel.management.system;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import net.proteanit.sql.*;

public class Pickup extends JFrame implements ActionListener{
        JTable table;
            JButton b2, display;
        Choice c;
    Pickup(){
        ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource("icons/frame 6.jpg"));
        Image a2 = a1.getImage().getScaledInstance(890, 590, Image.SCALE_DEFAULT);
        ImageIcon a3 = new ImageIcon(a2);
        JLabel a4 = new JLabel(a3);
        a4.setBounds(5, 5,890 , 590);
        add(a4);
        
        
        
        
                  JLabel l1 = new JLabel("PICK-UP SERVICE");
        l1.setBounds(325, 10, 250, 22);
        l1.setFont(new Font("Tahoma", Font.BOLD, 25));
        l1.setForeground(Color.WHITE);
        a4.add(l1);
        
        
        
        
         JLabel toc = new JLabel("TYPE OF CAR");
        toc.setFont(new Font("serif", Font.BOLD, 14));
        toc.setBounds(10, 80, 125, 20);
        toc.setForeground(Color.white);
        a4.add(toc);
        
        c=new Choice();
        c.setBounds(150, 80, 152, 12);
         c.setFont(new Font("serif", Font.BOLD, 14));
         c.setBackground(new Color(34,154,202));
        c.setForeground(Color.white);
        a4.add(c);
        
        try {
            Conn C=new Conn();
            String query="select * from driver";
            ResultSet rs=C.s.executeQuery(query);
            while(rs.next()){
                c.add(rs.getString("carname"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        
          table=new JTable();
        table.setBounds(10, 140, 873, 400);
        table.setBackground(new Color(34,154,202));
        table.setForeground(Color.white);
        a4.add(table);
        
        try {
             Conn C=new Conn();
             String q = "select * from driver";
             ResultSet resultSet = C.s.executeQuery(q);
               table.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (Exception e) {
            System.out.println(e);
        }
        

        JLabel l2 = new JLabel("NAME");
        l2.setBounds(10, 120, 110, 22);
        l2.setFont(new Font("Tahoma", Font.BOLD, 12));
        l2.setForeground(Color.white);
        a4.add(l2);
        JLabel l3 = new JLabel("AGE");
        l3.setBounds(135, 120, 100, 22);
        l3.setFont(new Font("Tahoma", Font.BOLD, 12));
        l3.setForeground(Color.white);
        a4.add(l3);
        
         JLabel l4 = new JLabel("GENDER");
        l4.setBounds(260, 120, 152, 22);
        l4.setFont(new Font("Tahoma", Font.BOLD, 12));
        l4.setForeground(Color.white);
        a4.add(l4);
         JLabel l5 = new JLabel("CAR COMPANY");
        l5.setBounds(385, 120, 152, 22);
        l5.setFont(new Font("Tahoma", Font.BOLD, 12));
        l5.setForeground(Color.white);
        a4.add(l5);
         JLabel l6 = new JLabel("CAR NAME");
        l6.setBounds(510, 120, 152, 22);
        l6.setFont(new Font("Tahoma", Font.BOLD, 12));
        l6.setForeground(Color.white);
        a4.add(l6);
         JLabel l7 = new JLabel("AVAILABLE");
        l7.setBounds(635, 120, 152, 22);
        l7.setFont(new Font("Tahoma", Font.BOLD, 12));
        l7.setForeground(Color.white);
        a4.add(l7);
         JLabel l8 = new JLabel("LOCATION");
        l8.setBounds(760, 120, 152, 22);
        l8.setFont(new Font("Tahoma", Font.BOLD, 12));
        l8.setForeground(Color.white);
        a4.add(l8);
       
        
        
        
 b2 = new JButton("BACK");
        b2.setBounds(300, 550, 100, 33);
        b2.setFont(new Font("Tahoma", Font.BOLD, 15));
        b2.addActionListener(this);
        a4.add(b2);
         display = new JButton("DISPLAY");
        display.setBounds(460, 550, 100, 33);
        display.setFont(new Font("Tahoma", Font.BOLD, 14));
        display.addActionListener(this);
        a4.add(display);


        
          setUndecorated(true);
         setLocation(450, 120);
        setLayout(null);
        setSize(900, 600);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Pickup();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource()==b2){
        setVisible(false);
    }
       else if(ae.getSource()==display){
           String q = "select * from driver where carname = '"+c.getSelectedItem()+"'";
           try {
               Conn c = new Conn();

                ResultSet rs = c.s.executeQuery(q);
                table.setModel(DbUtils.resultSetToTableModel (rs) ); 

           } catch (Exception e) {
               System.out.println(e);
           }
       }
    }
}
