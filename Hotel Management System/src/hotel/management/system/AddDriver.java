
package hotel.management.system;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
public class AddDriver  extends JFrame implements ActionListener {
     JButton b1,b2;
      JRadioButton radioButtonM,radioButtonF;
      JTextField agetext, nametext ,carcompanytext ,carnametext,locationtext ;
      JComboBox t6, t5;
    AddDriver(){
              ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource("icons/frame 6.jpg"));
        Image a2 = a1.getImage().getScaledInstance(875, 490, Image.SCALE_DEFAULT);
        ImageIcon a3 = new ImageIcon(a2);
        JLabel a4 = new JLabel(a3);
        a4.setBounds(5, 5, 875, 490);
        add(a4);
        
        
                    JLabel l1 = new JLabel("ADD DRIVERS");
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
        
                t5 = new JComboBox(new String[]{"Male", "Female"});
        t5.setBounds(210, 130, 152, 25);
        t5.setFont(new Font("Tahoma", Font.BOLD, 14));
        t5.setForeground(Color.WHITE);
        t5.setBackground(new Color(34,154,202));
        a4.add(t5);

        JLabel carcompany = new JLabel("CAR COMPANY");
        carcompany.setFont(new Font("serif", Font.BOLD, 16));
        carcompany.setBounds(60, 170, 152, 20);
        carcompany.setForeground(Color.white);
        a4.add(carcompany);


            carcompanytext = new JTextField();
        carcompanytext.setBounds(210,170,155,25);
        carcompanytext.setFont(new Font("Tahoma", Font.BOLD, 14));
        carcompanytext.setForeground(Color.WHITE);
        carcompanytext.setBackground(new Color(34,154,202));
        a4.add(carcompanytext);


          JLabel carname = new JLabel("CAR NAME");
        carname.setFont(new Font("serif", Font.BOLD, 16));
        carname.setBounds(60, 210, 152, 20);
        carname.setForeground(Color.white);
        a4.add(carname);

        carnametext = new JTextField();
        carnametext.setBounds(210, 210, 150, 22);
        carnametext.setFont(new Font("Tahoma", Font.BOLD, 14));
        carnametext.setForeground(Color.WHITE);
        carnametext.setBackground(new Color(34,154,202));
        a4.add(carnametext);
        
        
        
          JLabel available = new JLabel("AVAILABLE");
        available.setFont(new Font("serif", Font.BOLD, 16));
        available.setBounds(60, 250, 152, 20);
        available.setForeground(Color.white);
        a4.add(available);

        
        
        t6 = new JComboBox(new String[]{"Yes", "No"});
        t6.setBounds(210, 250, 150, 22);
        t6.setFont(new Font("Tahoma", Font.BOLD, 14));
        t6.setForeground(Color.WHITE);
        t6.setBackground(new Color(34,154,202));
        a4.add(t6);
       
        
        
        
        
        
         JLabel location = new JLabel("LOCATION");
        location.setFont(new Font("serif", Font.BOLD, 16));
        location.setBounds(60, 290, 152, 20);
        location.setForeground(Color.white);
        a4.add(location);

        locationtext = new JTextField();
        locationtext.setBounds(210, 290, 150, 22);
        locationtext.setFont(new Font("Tahoma", Font.BOLD, 14));
        locationtext.setForeground(Color.WHITE);
        locationtext.setBackground(new Color(34,154,202));
        a4.add(locationtext);
        
        
        
        
        
        
        
        
        
                 ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("icons/eleven.jpg"));
        Image c2 = c1.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon c3 = new ImageIcon(c2);
        JLabel c4 = new JLabel(c3);
        c4.setBounds(500, 60, 300, 300);
        a4.add(c4);
        
        
      b1 = new JButton("ADD");
        b1.setBounds(210, 330, 90, 33);
        b1.setFont(new Font("Tahoma", Font.BOLD, 15));
        b1.addActionListener(this);
        a4.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(60, 330, 90, 33);
        b2.setFont(new Font("Tahoma", Font.BOLD, 15));
        b2.addActionListener(this);
        a4.add(b2);
        
        
        
        
        
        
                      setUndecorated(true);
        setLocation(20, 200);
        setLayout(null);
        setSize(885, 500);
        setVisible(true);
    }
        public static void main(String[] args) {
        new AddDriver();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       if (ae.getSource() == b1){
           String name=nametext.getText();
           String age=agetext.getText();
           String gender=(String)t5.getSelectedItem();
           String Carcompany=carcompanytext.getText();
           String Carname=carnametext.getText();
           String Available=(String)t6.getSelectedItem();
           String Location=locationtext.getText();
           
           try {
               
               
              if(name.equals("")) {
					JOptionPane.showMessageDialog(null, "Name is Mandatory");
				}
               else if(age.equals("")) {
					JOptionPane.showMessageDialog(null, "Age is Mandatory");
				}
              else if(Location.equals("")) {
					JOptionPane.showMessageDialog(null, "Location is Required");
				}
              
              else{
                   Conn c = new Conn();
                        String str = "insert into driver values( '"+name+"', '"+age+"', '"+gender+"','"+Carcompany+"', '"+Carname+"', '"+Available+"','"+Location+"')";
                        
                        c.s.executeUpdate(str);
                        JOptionPane.showMessageDialog(null,"Driver Added Successfully");
                        setVisible(false);
              }
           } catch (Exception e) {
                System.out.println(e);
           }
           
       }
        else if (ae.getSource() == b2) {
            setVisible(false);}

    }
    }
    

