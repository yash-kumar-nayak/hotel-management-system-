
package hotel.management.system;


import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception  extends JFrame implements ActionListener{
     JButton btnNCF,btnROOM,btnDepartment,btnAEI,btnCI,btnMI,btnCOUT,btnUS,btnURS,btnPS,btnSR,logout,back;
    Reception(){
         setTitle("RECEPTION PAGE");
        JPanel panel=new JPanel();
        panel.setLayout(null);
        panel.setBounds(280, 5, 1238, 820);
        panel.setBackground(new Color(3,45,48));
        add(panel);
        
        JPanel panel1=new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5, 5, 270, 820);
        panel1.setBackground(new Color(3,45,48));
        add(panel1);
        
        
        
        
           ImageIcon a1=new ImageIcon(ClassLoader.getSystemResource("icons/background.gif"));
		 Image a2=a1.getImage().getScaledInstance(1250,820, Image.SCALE_DEFAULT);
		ImageIcon a3=new  ImageIcon(a2);
		 JLabel a4=new JLabel(a3);
		 a4.setBounds(0,0, 1250,820);
		panel.add(a4);
        
           ImageIcon b1=new ImageIcon(ClassLoader.getSystemResource("icons/login1.gif"));
		 Image b2=b1.getImage().getScaledInstance(250,250, Image.SCALE_DEFAULT);
		ImageIcon b3=new  ImageIcon(b2);
		 JLabel b4=new JLabel(b3);
		 b4.setBounds(5,530, 250,250);
		panel1.add(b4);
        
         btnNCF=new JButton("New Customer Form");
        btnNCF.setBounds(30, 30, 200, 30);
        btnNCF.setBackground(Color.black);
        btnNCF.setForeground(Color.white);
        btnNCF.addActionListener(this);
        panel1.add(btnNCF);
         btnROOM=new JButton("Room");
        btnROOM.setBounds(30, 70, 200, 30);
        btnROOM.setBackground(Color.black);
        btnROOM.setForeground(Color.white);
        btnROOM.addActionListener(this);
        panel1.add(btnROOM);
         btnDepartment=new JButton("Department");
        btnDepartment.setBounds(30, 110, 200, 30);
        btnDepartment.setBackground(Color.black);
        btnDepartment.setForeground(Color.white);
        btnDepartment.addActionListener(this);
        panel1.add(btnDepartment);
         btnAEI=new JButton("All Employee Info");
        btnAEI.setBounds(30, 150, 200, 30);
        btnAEI.setBackground(Color.black);
        btnAEI.setForeground(Color.white);
        btnAEI.addActionListener(this);
        panel1.add(btnAEI);
         btnCI=new JButton("Customer Info");
        btnCI.setBounds(30, 190, 200, 30);
        btnCI.setBackground(Color.black);
        btnCI.setForeground(Color.white);
        btnCI.addActionListener(this);
        panel1.add(btnCI);
         btnMI=new JButton("Manager Info");
        btnMI.setBounds(30, 230, 200, 30);
        btnMI.setBackground(Color.black);
        btnMI.setForeground(Color.white);
        btnMI.addActionListener(this);
        panel1.add(btnMI);
         btnCOUT=new JButton("Check Out");
        btnCOUT.setBounds(30, 270, 200, 30);
        btnCOUT.setBackground(Color.black);
        btnCOUT.setForeground(Color.white);
        btnCOUT.addActionListener(this);
        panel1.add(btnCOUT);
         btnUS=new JButton("Update Check-In Details");
        btnUS.setBounds(30, 310, 200, 30);
        btnUS.setBackground(Color.black);
        btnUS.setForeground(Color.white);
        btnUS.addActionListener(this);
        panel1.add(btnUS);
         btnURS=new JButton("Update Room Status");
        btnURS.setBounds(30, 350, 200, 30);
        btnURS.setBackground(Color.black);
        btnURS.setForeground(Color.white);
        btnURS.addActionListener(this);
        panel1.add(btnURS);
         btnPS=new JButton("Pick Up Service");
        btnPS.setBounds(30, 390, 200, 30);
        btnPS.setBackground(Color.black);
        btnPS.setForeground(Color.white);
        btnPS.addActionListener(this);
        panel1.add(btnPS);
         btnSR=new JButton("Search Room");
        btnSR.setBounds(30, 430, 200, 30);
        btnSR.setBackground(Color.black);
        btnSR.setForeground(Color.white);
        btnSR.addActionListener(this);
        panel1.add(btnSR);
         logout=new JButton("Logout");
        logout.setBounds(30, 470, 95, 30);
        logout.setBackground(Color.black);
        logout.setForeground(Color.white);
        logout.addActionListener(this);
        panel1.add(logout);
        
        back = new JButton("BACK");
        back.setBounds(135, 470, 95, 30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.addActionListener(this);
        panel1.add(back);
        
        setLayout(null);
        setSize(1950,1090);

        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==btnNCF){
            new AddCustomer();
        }
        else if(ae.getSource()==btnROOM){
            new Room();
            
        }
        else if(ae.getSource()==btnDepartment){
            new Department();
        }
        else if(ae.getSource()==btnAEI){
            new EmployeeInfo();
        }
        else if(ae.getSource()==btnCI){
            new CustomerInfo();
        }
        else if(ae.getSource()==btnMI){
            new ManagerInfo();
        }
        else if(ae.getSource()==btnCOUT){
            new CheckOut();
        }
        else if(ae.getSource()==btnUS){
            new UpdateCheck();
        }
        else if(ae.getSource()==btnURS){
            new UpdateRoom();
        }
        else if(ae.getSource()==btnPS){
            new Pickup();
        }
        else if(ae.getSource()==btnSR){
            new SearchRoom();
        }
        else if(ae.getSource()==logout){
            System.exit(0);
        }
        else if(ae.getSource()==back){
            new Dashboard();
            setVisible(false);
        }
        
    }
      public static void main(String[] args) {
        new Reception();
    }
}
