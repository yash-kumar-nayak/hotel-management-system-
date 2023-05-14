
package hotel.management.system;
import java.util.Date;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
public class AddCustomer   extends JFrame implements ActionListener{
    JButton b1,b2;
    JComboBox comboid ,t5;
    JTextField numbertext ,nametext ,countrytext,deposittext;
    Choice croom;
    JLabel checkintime;
    AddCustomer(){
        ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource("icons/frame 6.jpg"));
        Image a2 = a1.getImage().getScaledInstance(890, 590, Image.SCALE_DEFAULT);
        ImageIcon a3 = new ImageIcon(a2);
        JLabel a4 = new JLabel(a3);
        a4.setBounds(5, 5,890 , 590);
        add(a4);
        
          JLabel l1 = new JLabel("ADD CUSTOMER");
        l1.setBounds(330, 10, 250, 22);
        l1.setFont(new Font("Tahoma", Font.BOLD, 25));
        l1.setForeground(Color.WHITE);
        a4.add(l1);
        
         JLabel id = new JLabel("ID");
        id.setFont(new Font("serif", Font.BOLD, 17));
        id.setBounds(70, 80, 152, 20);
        id.setForeground(Color.white);
        a4.add(id);
        
        
        String options[]={"Passport", "Aadhar Card", "Voter Id", "Driving license"};
            comboid=new JComboBox(options);
           comboid.setBackground(new Color( 34,154,202));
            comboid.setBounds(220, 80, 156, 22);
                    comboid.setForeground(Color.white);
            comboid.setFont(new Font( "Tahoma", Font.BOLD, 12));
            a4.add(comboid);
        
        
         JLabel num = new JLabel("NUMBER");
        num.setFont(new Font("serif", Font.BOLD, 17));
        num.setBounds(70, 120, 152, 20);
        num.setForeground(Color.white);
        a4.add(num);

        numbertext = new JTextField();
        numbertext.setBounds(220, 120, 156, 22);
        numbertext.setFont(new Font("Tahoma", Font.BOLD, 14));
        numbertext.setForeground(Color.WHITE);
        numbertext.setBackground(new Color(34,154,202));
        a4.add(numbertext);

         JLabel name = new JLabel("NAME");
        name.setFont(new Font("serif", Font.BOLD, 16));
        name.setBounds(70, 160, 152, 20);
        name.setForeground(Color.white);
        a4.add(name);

        nametext = new JTextField();
        nametext.setBounds(220,  160, 156, 22);
        nametext.setFont(new Font("Tahoma", Font.BOLD, 14));
        nametext.setForeground(Color.WHITE);
        nametext.setBackground(new Color(34,154,202));
        a4.add(nametext);
        
        
                JLabel gender = new JLabel("GENDER");
        gender.setFont(new Font("serif", Font.BOLD, 16));
        gender.setBounds(70, 200, 152, 20);
        gender.setForeground(Color.white);
        a4.add(gender);
        
                t5 = new JComboBox(new String[]{"Male", "Female"});
        t5.setBounds(220,200,156,25);
        t5.setFont(new Font("Tahoma", Font.BOLD, 12));
        t5.setForeground(Color.WHITE);
        t5.setBackground(new Color(34,154,202));
        a4.add(t5);
        
        
        
          JLabel country = new JLabel("COUNTRY");
        country.setFont(new Font("serif", Font.BOLD, 16));
        country.setBounds(70, 240, 152, 20);
        country.setForeground(Color.white);
        a4.add(country);

        countrytext = new JTextField();
        countrytext.setBounds(220, 240, 156, 22);
        countrytext.setFont(new Font("Tahoma", Font.BOLD, 14));
        countrytext.setForeground(Color.WHITE);
        countrytext.setBackground(new Color(34,154,202));
        a4.add(countrytext);
        
        
   
        
          JLabel lblroom = new JLabel("ROOM NUMBER");
        lblroom.setFont(new Font("serif", Font.BOLD, 16));
        lblroom.setBounds(70, 280, 152, 20);
        lblroom.setForeground(Color.white);
        a4.add(lblroom);
        
        
        croom=new Choice();
        try {
            Conn c=new Conn();
            String query="select * from room where availability = 'Available'";
            ResultSet rs=c.s.executeQuery(query);
            while(rs.next()){
                croom.add(rs.getString("roomnumber"));
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
        croom.setBounds(220, 280, 155, 22);
        croom.setFont(new Font("Tahoma", Font.BOLD, 14));
        croom.setForeground(Color.WHITE);
        croom.setBackground(new Color(34,154,202));
        a4.add(croom);
        
        
        
        
        
        
          JLabel checkin = new JLabel("CHECK-IN TIME");
        checkin.setFont(new Font("serif", Font.BOLD, 16));
        checkin.setBounds(70, 320, 152, 20);
        checkin.setForeground(Color.white);
        a4.add(checkin);
        Date date=new Date();
           checkintime = new JLabel(""+date);
        checkintime.setFont(new Font("serif", Font.BOLD, 16));
        checkintime.setBounds(220, 320, 158, 20);
        checkintime.setForeground(Color.white);
        a4.add(checkintime);
        
        
        
        
        
        
         JLabel deposit = new JLabel("DEPOSIT");
        deposit.setFont(new Font("serif", Font.BOLD, 16));
        deposit.setBounds(70, 360, 152, 20);
        deposit.setForeground(Color.white);
        a4.add(deposit);

        deposittext = new JTextField();
        deposittext.setBounds(220, 360, 156, 22);
        deposittext.setFont(new Font("Tahoma", Font.BOLD, 14));
        deposittext.setForeground(Color.WHITE);
        deposittext.setBackground(new Color(34,154,202));
        a4.add(deposittext);
        
        
        
        
        
        
        
        
        
        
        
                 ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("icons/newcos.jpg"));
        Image c2 = c1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon c3 = new ImageIcon(c2);
        JLabel c4 = new JLabel(c3);
        c4.setBounds(550, 150, 250, 250);
        a4.add(c4);
        
        
        
        
         b1 = new JButton("ADD");
        b1.setBounds(220, 430, 90, 33);
        b1.setFont(new Font("Tahoma", Font.BOLD, 15));
        b1.addActionListener(this);
        a4.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(100, 430, 90, 33);
        b2.setFont(new Font("Tahoma", Font.BOLD, 15));
        b2.addActionListener(this);
        a4.add(b2);
        
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
    }else if(ae.getSource()==b1){
        String id=(String)comboid.getSelectedItem();
        String number=numbertext.getText();
        String name=nametext.getText();
         String gender=(String)t5.getSelectedItem();
         String country=countrytext.getText();
         String room=croom.getSelectedItem();
         String time=checkintime.getText();
         String deposit=deposittext.getText();
            try {
                
                 if(name.equals("")) {
					JOptionPane.showMessageDialog(null, "Name is Mandatory");
				}
                     else if(number.equals("")) {
					JOptionPane.showMessageDialog(null, "Document Number is Mandatory");
				}
                    
                     else{Conn c=new Conn();
                 String str = "insert into customer values( '"+id+"', '"+number+"', '"+name+"','"+gender+"', '"+country+"', '"+room+"','"+time+"', '"+deposit+"')";
                 String str2="update room set availability = 'Occupied' where roomnumber = '"+room+"'";
                 
                        c.s.executeUpdate(str);
                        c.s.executeUpdate(str2);
                        JOptionPane.showMessageDialog(null,"New Customer Added Successfully");
                       setVisible(false);
                       
                        }
            } catch (Exception e) {
                System.out.println(e);
            }
    }
    }
    public static void main(String[] args) {
        new AddCustomer();
    }
    
}
