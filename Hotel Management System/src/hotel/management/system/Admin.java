package hotel.management.system;

import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin extends JFrame implements ActionListener {

    JButton add_Employee, add_Room, add_Drivers, logout, back;

    Admin() {
        setTitle("ADMIN PAGE");
        add_Employee = new JButton("ADD EMPLOYEE");
        add_Employee.setBounds(250, 230, 200, 30);
        add_Employee.setBackground(Color.WHITE);
        add_Employee.setForeground(Color.BLACK);
        add_Employee.setFont(new Font("Tahoma", Font.BOLD, 15));
        add_Employee.addActionListener(this);
        add(add_Employee);
        
          add_Room = new JButton("ADD ROOM");
        add_Room.setBounds(250, 380, 200, 30);
        add_Room.setBackground(Color.WHITE);
        add_Room.setForeground(Color.BLACK);
        add_Room.setFont(new Font("Tahoma", Font.BOLD, 15));
        add_Room.addActionListener(this);
        add(add_Room);
        
        
        add_Drivers = new JButton("ADD DRIVER");
        add_Drivers.setBounds(250, 530, 200, 30);
        add_Drivers.setBackground(Color.WHITE);
        add_Drivers.setForeground(Color.BLACK);
        add_Drivers.setFont(new Font("Tahoma", Font.BOLD, 15));
        add_Drivers.addActionListener(this);
        add(add_Drivers);
        
        
        
        logout = new JButton("LOGOUT");
        logout.setBounds(10, 800, 95, 30);
        logout.setBackground(Color.WHITE);
        logout.setForeground(Color.red);
        logout.setFont(new Font("Tahoma", Font.BOLD, 14));
        logout.addActionListener(this);
        add(logout);
        back = new JButton("BACK");
        back.setBounds(110, 800, 95, 30);
        back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        back.setFont(new Font("Tahoma", Font.BOLD, 15));
        back.addActionListener(this);
        add(back);
        
        
         ImageIcon a1=new ImageIcon(ClassLoader.getSystemResource("icons/employees.png"));
		 Image a2=a1.getImage().getScaledInstance(120,120, Image.SCALE_DEFAULT);
		ImageIcon a3=new  ImageIcon(a2);
		 JLabel a4=new JLabel(a3);
		 a4.setBounds(70,180, 120,120);
		add(a4);
                    
                ImageIcon b1=new ImageIcon(ClassLoader.getSystemResource("icons/room.png"));
		 Image b2=b1.getImage().getScaledInstance(120,120, Image.SCALE_DEFAULT);
		ImageIcon b3=new  ImageIcon(b2);
		 JLabel b4=new JLabel(b3);
		 b4.setBounds(70,340, 120,120);
		add(b4);
                ImageIcon bb1=new ImageIcon(ClassLoader.getSystemResource("icons/driver.png"));
		 Image bb2=bb1.getImage().getScaledInstance(120,120, Image.SCALE_DEFAULT);
		ImageIcon bb3=new  ImageIcon(bb2);
		 JLabel bb4=new JLabel(bb3);
		 bb4.setBounds(70,500, 120,120);
		add(bb4);
                
                  ImageIcon lb1=new ImageIcon(ClassLoader.getSystemResource("icons/login1.gif"));
		 Image lb2=lb1.getImage().getScaledInstance(400,400, Image.SCALE_DEFAULT);
		ImageIcon lb3=new  ImageIcon(lb2);
		 JLabel lb4=new JLabel(lb3);
		 lb4.setBounds(1000, 250, 400,400);
		add(lb4);
                

        getContentPane().setBackground(new Color(11, 36, 71));
       
        setLayout(null);
        setSize(1950, 1090);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Admin();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
      if(ae.getSource()==add_Employee){
            new AddEmployee();
        }
        else if(ae.getSource()==add_Room){
            new AddRoom();
        }
        else if(ae.getSource()==add_Drivers){
            new AddDriver();
        }
        else if(ae.getSource()==logout){
            System.exit(0);
        }
        else if(ae.getSource()==back){
            new Dashboard();
            setVisible(false);
            
        }
    }
}
