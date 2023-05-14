
package hotel.management.system;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.*;

public class CheckOut extends JFrame implements ActionListener{
    Choice ccustomer;
     JButton b1,b2,b3;
     JTextField roomnumbertext;
       JLabel labelcheckintime,labelcheckout,labelRoomnumber ,labelname;
    CheckOut(){
         ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource("icons/frame 6.jpg"));
        Image a2 = a1.getImage().getScaledInstance(790, 490, Image.SCALE_DEFAULT);
        ImageIcon a3 = new ImageIcon(a2);
        JLabel a4 = new JLabel(a3);
        a4.setBounds(5, 5,790 , 490);
        add(a4);
                    JLabel l1 = new JLabel("CHECK-OUT");
        l1.setBounds(310, 10, 350, 22);
        l1.setFont(new Font("Tahoma", Font.BOLD, 25));
        l1.setForeground(Color.WHITE);
        a4.add(l1);
        
        
          JLabel id = new JLabel("CUSTOMER ID");
        id.setFont(new Font("serif", Font.BOLD, 17));
        id.setBounds(70, 100, 152, 20);
        id.setForeground(Color.white);
        a4.add(id);
        
        
        ccustomer=new Choice();
        try {
            Conn c=new Conn();
            String query="select * from customer";
            ResultSet rs=c.s.executeQuery(query);
            while(rs.next()){
                ccustomer.add(rs.getString("number"));
            }
            
        } catch (Exception e) {
            System.err.println(e);
        }
        ccustomer.setBounds(250, 100, 156, 22);
        ccustomer.setFont(new Font("Tahoma", Font.BOLD, 14));
        ccustomer.setForeground(Color.blue);
        ccustomer.setBackground(new Color(34,154,202));
        a4.add(ccustomer);
        
        
        
         JLabel num = new JLabel("ROOM NUMBER");
        num.setFont(new Font("serif", Font.BOLD, 17));
        num.setBounds(70, 180, 152, 20);
        num.setForeground(Color.white);
        a4.add(num);
        
         labelRoomnumber =new JLabel();          
        labelRoomnumber.setBounds(250, 180, 156, 22);
        labelRoomnumber.setFont(new Font("Tahoma", Font.BOLD, 14));
        labelRoomnumber.setForeground(Color.WHITE);
//        labelRoomnumber.setBackground(new Color(34,154,202));
        a4.add(labelRoomnumber);
         JLabel name = new JLabel("NAME ");
        name.setFont(new Font("serif", Font.BOLD, 17));
        name.setBounds(70, 140, 152, 20);
        name.setForeground(Color.white);
        a4.add(name);
        
         labelname =new JLabel();          
        labelname.setBounds(250, 140, 152, 20);
        labelname.setFont(new Font("Tahoma", Font.BOLD, 14));
        labelname.setForeground(Color.WHITE);
//        labelname.setBackground(new Color(34,154,202));
        a4.add(labelname);
        
            JLabel checkintime = new JLabel("CHECK-IN TIME");
        checkintime.setFont(new Font("serif", Font.BOLD, 16));
        checkintime.setBounds(70, 220, 152, 20);
        checkintime.setForeground(Color.white);
        a4.add(checkintime);
        
             labelcheckintime = new JLabel();
        labelcheckintime.setFont(new Font("serif", Font.BOLD, 16));
        labelcheckintime.setBounds(250, 220, 152, 20);
        labelcheckintime.setForeground(Color.white);
        a4.add(labelcheckintime);
        
        
        JLabel checkout = new JLabel("CHECK-OUT TIME");
        checkout.setFont(new Font("serif", Font.BOLD, 16));
        checkout.setBounds(70, 260, 152, 20);
        checkout.setForeground(Color.white);
        a4.add(checkout);
        
        Date date=new Date();
         labelcheckout = new JLabel(""+date);
        labelcheckout.setFont(new Font("serif", Font.BOLD, 16));
        labelcheckout.setBounds(250, 260, 165, 20);
        labelcheckout.setForeground(Color.white);
        a4.add(labelcheckout);
        
        
       
        
        
                b2 = new JButton("BACK");
        b2.setBounds(70, 320, 100, 33);
        b2.setFont(new Font("Tahoma", Font.BOLD, 13));
        b2.addActionListener(this);
        a4.add(b2);
        
         b1 = new JButton("CHECK OUT");
        b1.setBounds(190, 320, 110, 33);
        b1.setFont(new Font("Tahoma", Font.BOLD, 12));
        b1.addActionListener(this);
        a4.add(b1);


        
        b3 = new JButton("CHECK");
        b3.setBounds(320, 320, 100,33);
        b3.setFont(new Font("Tahoma", Font.BOLD, 13));
        b3.addActionListener(this);
        a4.add(b3);
        
        
        
        
        
        
        
        
          setUndecorated(true);
         setLocation(450, 120);
        setLayout(null);
        setSize(800, 500);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new CheckOut();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
      if(ae.getSource()==b2){
        setVisible(false);}
      //checkout
         else if(ae.getSource()==b1){
             try {
                 Conn c=new Conn();
                 c.s.executeUpdate("delete from customer where number = '"+ccustomer.getSelectedItem()+"'");
                 c.s.executeUpdate("update room set availability= 'Available' where roomnumber ='"+labelRoomnumber.getText()+"'  ");
                  JOptionPane.showMessageDialog(null,"check out seccessfully");
                  setVisible(false);

          } catch (Exception e) {
                 System.out.println(e);
          }
         }
         
         
         
         
         
         
         
         
         
         
         //check 
         else if(ae.getSource()==b3){
             Conn c=new Conn();
             try {
               ResultSet rs=c.s.executeQuery("select *from customer where number = '"+ccustomer.getSelectedItem()+"'");
               while(rs.next()){
                   labelRoomnumber.setText(rs.getString("room"));
                   labelcheckintime.setText(rs.getString("checkinTime"));
                   labelname.setText(rs.getString("name"));
               }
          } catch (Exception e) {
                 System.out.println(e);
          }
         }
    }
}
