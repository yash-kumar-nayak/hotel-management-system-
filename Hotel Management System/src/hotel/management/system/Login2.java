
package hotel.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.sql.*;
import javax.swing.JOptionPane;

public class Login2 extends JFrame implements ActionListener {
        JButton login,Cancel;
	JTextField username;
	JPasswordField password;
    Login2(){
        setTitle(" Admin Login");
        
        
        ImageIcon b1=new ImageIcon(ClassLoader.getSystemResource("icons/1.gif"));
		 Image b2=b1.getImage().getScaledInstance(600,300, Image.SCALE_DEFAULT);
		ImageIcon b3=new  ImageIcon(b2);
		 JLabel b4=new JLabel(b3);
		 b4.setBounds(0, 0, 600,300);
		add(b4);
        JLabel label1=new JLabel("User name:");
                 label1.setForeground(Color.white);
		 label1.setFont(new Font("Tahoma", Font.BOLD,16));
		 label1.setBounds(40, 20, 100, 30);
		 b4.add(label1);
		 
		 username=new JTextField();
		 username.setBounds(150, 20,150 ,30);
		 username.setFont(new Font("Arial",Font.BOLD,16));
		 b4.add(username);
		 
		 JLabel label2=new JLabel("Password:");
                  label2.setForeground(Color.white);
		 label2.setFont(new Font("Tahoma", Font.BOLD,16));
		 label2.setBounds(40, 70, 100, 30);
		 b4.add(label2);
		 
		 
		 password=new JPasswordField();
		 password.setBounds(150, 70,150 ,30);
		 password.setFont(new Font("Arial",Font.BOLD,16));
		 b4.add(password);
		 
		 
		 login=new JButton("Login");
		 login.setBounds(40,140,120,30);
                  login.setFont(new Font("serif",Font.BOLD,16));
		 login.setBackground(Color.BLACK);
		 login.setForeground(Color.WHITE);
		 login.addActionListener(this);
		 b4.add(login);
		 
		 
		 
		 Cancel=new JButton("Cancel");
		 Cancel.setBounds(170,140,120,30);
                 Cancel.setFont(new Font("serif",Font.BOLD,16));
		 Cancel.setBackground(Color.BLACK);
		 Cancel.setForeground(Color.WHITE);
		 Cancel.addActionListener(this);
		 b4.add(Cancel);
		 
		
                
                 ImageIcon a1=new ImageIcon(ClassLoader.getSystemResource("icons/login1.gif"));
		 Image a2=a1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
		ImageIcon a3=new  ImageIcon(a2);
		 JLabel a4=new JLabel(a3);
		 a4.setBounds(320, -30, 255, 300);
		b4.add(a4);
		 

		
		setLayout(null);
		setSize(600,300);
		setVisible(true);
		setLocation(400,270);
    }
    public static void main(String[] args) {
        new Login2();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource()==login){
        String user=username.getText();
        String pass=password.getText();
        
        try {
            Conn c=new Conn();
            
            String query="select * from login2 where username = '"+user+"' and password = '"+pass+"'";
           ResultSet rs= c.s.executeQuery(query);
            
            if(rs.next()){
                setVisible(false);
//                next page calling dashboard
                new Admin();
            }
            else{
                JOptionPane.showMessageDialog(null,"Wrong Credentials");
//                setVisible(false);
//                new Dashboard();
//for closing the current frame 
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    else if(ae.getSource()==Cancel){
        setVisible(false);
        new Dashboard();
    }
    
    
    }
    }

