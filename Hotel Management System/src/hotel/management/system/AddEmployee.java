package hotel.management.system;

import java.awt.EventQueue;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class AddEmployee extends JFrame implements ActionListener { //Third Frame

    JButton b1,b2;
     JRadioButton radioButtonM,radioButtonF;
    JTextField emailtext,agetext, nametext ,salarytext ,phonetext ,aadhartext;
    JComboBox c1;

    public AddEmployee() {
        


      
        ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource("icons/frame 6.jpg"));
        Image a2 = a1.getImage().getScaledInstance(875, 490, Image.SCALE_DEFAULT);
        ImageIcon a3 = new ImageIcon(a2);
        JLabel a4 = new JLabel(a3);
        a4.setBounds(5, 5, 875, 490);
        add(a4);

        
                  JLabel l1 = new JLabel("ADD EMPLOYEE");
        l1.setBounds(330, 10, 250, 22);
        l1.setFont(new Font("Tahoma", Font.BOLD, 25));
        l1.setForeground(Color.WHITE);
        a4.add(l1);
        JLabel name = new JLabel("NAME");
        name.setFont(new Font("serif", Font.BOLD, 16));
        name.setBounds(60, 50, 152, 20);
        name.setForeground(Color.white);
        a4.add(name);

        nametext = new JTextField();
        nametext.setBounds(210, 50, 156, 22);
        nametext.setFont(new Font("Tahoma", Font.BOLD, 14));
        nametext.setForeground(Color.WHITE);
        nametext.setBackground(new Color(34,154,202));
        a4.add(nametext);

        JLabel age = new JLabel("AGE");
        age.setFont(new Font("serif", Font.BOLD, 16));
        age.setBounds(60, 90, 152, 20);
        age.setForeground(Color.white);
        a4.add(age);

        agetext = new JTextField();
        agetext.setBounds(210, 90, 156, 22);
        agetext.setFont(new Font("Tahoma", Font.BOLD, 14));
        agetext.setForeground(Color.WHITE);
        agetext.setBackground(new Color(34,154,202));
        a4.add(agetext);

        JLabel gender = new JLabel("GENDER");
        gender.setFont(new Font("serif", Font.BOLD, 16));
        gender.setBounds(60, 130, 152, 20);
        gender.setForeground(Color.white);
        a4.add(gender);
        
        
        radioButtonM = new JRadioButton( "MALE");
        radioButtonM.setBounds(  210,  130, 70, 25);
radioButtonM.setBackground(new Color( 34,154,202));
radioButtonM.setFont(new Font( "Tahoma", Font.BOLD, 12));
radioButtonM.setForeground(Color.WHITE) ;

a4.add(radioButtonM);
        
        radioButtonF = new JRadioButton( "FEMALE");
        radioButtonF.setBounds(  290,  130, 75, 25);
radioButtonF.setBackground(new Color( 34,154,202));
radioButtonF.setFont(new Font( "Tahoma", Font.BOLD, 12));
radioButtonF.setForeground(Color.WHITE) ;

a4.add(radioButtonF);


                 
                 ButtonGroup gen=new ButtonGroup();
		 gen.add(radioButtonM);
		 gen.add(radioButtonF);
        
        
        JLabel job = new JLabel("JOB");
        job.setFont(new Font("serif", Font.BOLD, 16));
        job.setBounds(60, 170, 152, 20);
        job.setForeground(Color.white);
        a4.add(job);
        
           String course[] = {"Front Desk Clerks","Porters","Housekeeping","Kitchen Staff","Room Service","Waiter/Waitress","Manager","Accountant","Chef"};
            c1 = new JComboBox(course);
            c1.setBackground(new Color( 34,154,202));
            c1.setBounds(210,170,155,25);
                    c1.setForeground(Color.white);
            c1.setFont(new Font( "Tahoma", Font.BOLD, 12));
            a4.add(c1);
        
        
        
        
        
        
        
         JLabel salary = new JLabel("SALARY");
        salary.setFont(new Font("serif", Font.BOLD, 16));
        salary.setBounds(60, 210, 152, 20);
        salary.setForeground(Color.white);
        a4.add(salary);

        salarytext = new JTextField();
        salarytext.setBounds(210, 210, 150, 22);
        salarytext.setFont(new Font("Tahoma", Font.BOLD, 14));
        salarytext.setForeground(Color.WHITE);
        salarytext.setBackground(new Color(34,154,202));
        a4.add(salarytext);
        
        
         JLabel phone = new JLabel("PHONE");
        phone.setFont(new Font("serif", Font.BOLD, 16));
        phone.setBounds(60, 250, 152, 20);
        phone.setForeground(Color.white);
        a4.add(phone);

        phonetext = new JTextField();
        phonetext.setBounds(210, 250, 150, 22);
        phonetext.setFont(new Font("Tahoma", Font.BOLD, 14));
        phonetext.setForeground(Color.WHITE);
        phonetext.setBackground(new Color(34,154,202));
        a4.add(phonetext);
        
        
         JLabel aadhar = new JLabel("AADHAR");
        aadhar.setFont(new Font("serif", Font.BOLD, 16));
        aadhar.setBounds(60, 290, 152, 20);
        aadhar.setForeground(Color.white);
        a4.add(aadhar);

        aadhartext = new JTextField();
        aadhartext.setBounds(210, 290, 150, 22);
        aadhartext.setFont(new Font("Tahoma", Font.BOLD, 14));
        aadhartext.setForeground(Color.WHITE);
        aadhartext.setBackground(new Color(34,154,202));
        a4.add(aadhartext);
         JLabel email = new JLabel("E-MAIL");
        email.setFont(new Font("serif", Font.BOLD, 16));
        email.setBounds(60, 330, 152, 20);
        email.setForeground(Color.white);
        a4.add(email);

        emailtext = new JTextField();
        emailtext.setBounds(210, 330, 150, 22);
        emailtext.setFont(new Font("Tahoma", Font.BOLD, 14));
        emailtext.setForeground(Color.WHITE);
        emailtext.setBackground(new Color(34,154,202));
        a4.add(emailtext);
        
        
        
        
        
        
        
        
        
        
        

       b1 = new JButton("ADD");
        b1.setBounds(210, 390, 90, 33);
        b1.setFont(new Font("Tahoma", Font.BOLD, 15));
        b1.addActionListener(this);
        a4.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(60, 390, 90, 33);
        b2.setFont(new Font("Tahoma", Font.BOLD, 15));
        b2.addActionListener(this);
        a4.add(b2);
        
        
         ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("icons/addemp.jpg"));
        Image c2 = c1.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon c3 = new ImageIcon(c2);
        JLabel c4 = new JLabel(c3);
        c4.setBounds(500, 60, 300, 300);
        a4.add(c4);

              setUndecorated(true);
        setLocation(20, 200);
        setLayout(null);
        setSize(885, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AddEmployee();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            
                     String name = nametext.getText();
                    String age = agetext.getText();
                    String salary = salarytext.getText();
                    String phone = phonetext.getText();
                    String aadhar = aadhartext.getText();
                    String email = emailtext.getText();
                   
                    String gender = null;
                    String s6 = (String)c1.getSelectedItem();
                    if(radioButtonM.isSelected()){
                        gender = "male";
                    
                    }else if(radioButtonF.isSelected()){
                        gender = "female";
                    }
                    
                    
                    
                    
                    
                    
                    
            try{
                
                 if(name.equals("")) {
					JOptionPane.showMessageDialog(null, "Name is Mandatory");
				}
                     else if(aadhar.equals("")) {
					JOptionPane.showMessageDialog(null, "Aadhar Number is Mandatory");
				}
                     else if(phone.equals("")) {
					JOptionPane.showMessageDialog(null, "Phone Number is Mandatory");
				}
                     else if(email.equals("")) {
					JOptionPane.showMessageDialog(null, "E-mail is Mandatory");
				}
                     else{ 
                Conn c = new Conn();
                        String str = "insert into employee values( '"+name+"', '"+age+"', '"+gender+"','"+s6+"', '"+salary+"', '"+phone+"','"+aadhar+"', '"+email+"')";
                        
                        c.s.executeUpdate(str);
                        JOptionPane.showMessageDialog(null,"Employee Added");
                        setVisible(false);
                     }
            }        
             catch (Exception e) {
                 System.out.println(e);
            }
            
        }
        else if (ae.getSource() == b2) {
            setVisible(false);}

    }
}
