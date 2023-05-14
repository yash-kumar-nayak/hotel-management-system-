
package hotel.management.system;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import net.proteanit.sql.*;

public class UpdateCheck extends JFrame implements ActionListener{
    Choice ccustomer;
    JButton b1,b2,b3;
    JTextField roomnumbertext ,nametext ,checkintimetext,amountpaidtext,pendingamounttext;
    UpdateCheck(){
         ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource("icons/frame 6.jpg"));
        Image a2 = a1.getImage().getScaledInstance(890, 540, Image.SCALE_DEFAULT);
        ImageIcon a3 = new ImageIcon(a2);
        JLabel a4 = new JLabel(a3);
        a4.setBounds(5, 5,890 , 540);
        add(a4);
                    JLabel l1 = new JLabel("UPDATE CHECK-IN DETAILS");
        l1.setBounds(300, 10, 350, 22);
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
        num.setBounds(70, 140, 152, 20);
        num.setForeground(Color.white);
        a4.add(num);
        
        
         roomnumbertext = new JTextField();
        roomnumbertext.setBounds(250, 140, 156, 22);
        roomnumbertext.setFont(new Font("Tahoma", Font.BOLD, 14));
        roomnumbertext.setForeground(Color.WHITE);
        roomnumbertext.setBackground(new Color(34,154,202));
        a4.add(roomnumbertext);
        
        
         JLabel name = new JLabel("NAME");
        name.setFont(new Font("serif", Font.BOLD, 16));
        name.setBounds(70, 180, 152, 20);
        name.setForeground(Color.white);
        a4.add(name);

        nametext = new JTextField();
        nametext.setBounds(250,  180, 156, 22);
        nametext.setFont(new Font("Tahoma", Font.BOLD, 14));
        nametext.setForeground(Color.WHITE);
        nametext.setBackground(new Color(34,154,202));
        a4.add(nametext);
        
        
        
        
        
                JLabel checkintimelb = new JLabel("CHECKIN-TIME");
        checkintimelb.setFont(new Font("serif", Font.BOLD, 16));
        checkintimelb.setBounds(70, 220, 152, 20);
        checkintimelb.setForeground(Color.white);
        a4.add(checkintimelb);
        checkintimetext=new JTextField();
       checkintimetext.setBounds(250,220,156,25);
        checkintimetext.setFont(new Font("Tahoma", Font.BOLD, 12));
        checkintimetext.setForeground(Color.WHITE);
        checkintimetext.setBackground(new Color(34,154,202));
        a4.add(checkintimetext);
        
        
        
          JLabel amountpaidlb = new JLabel("AMOUNT PAID)");
        amountpaidlb.setFont(new Font("serif", Font.BOLD, 16));
        amountpaidlb.setBounds(70, 260, 152, 20);
        amountpaidlb.setForeground(Color.white);
        a4.add(amountpaidlb);

        amountpaidtext = new JTextField();
        amountpaidtext.setBounds(250, 260, 156, 22);
        amountpaidtext.setFont(new Font("Tahoma", Font.BOLD, 14));
        amountpaidtext.setForeground(Color.WHITE);
        amountpaidtext.setBackground(new Color(34,154,202));
        a4.add(amountpaidtext);
          JLabel pendingdlb = new JLabel("PENDING AMOUNT");
        pendingdlb.setFont(new Font("serif", Font.BOLD, 16));
        pendingdlb.setBounds(70, 300, 152, 20);
        pendingdlb.setForeground(Color.white);
        a4.add(pendingdlb);

        pendingamounttext = new JTextField();
        pendingamounttext.setBounds(250, 300, 156, 22);
        pendingamounttext.setFont(new Font("Tahoma", Font.BOLD, 14));
        pendingamounttext.setForeground(Color.WHITE);
        pendingamounttext.setBackground(new Color(34,154,202));
        a4.add(pendingamounttext);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
                b2 = new JButton("BACK");
        b2.setBounds(70, 370, 100, 33);
        b2.setFont(new Font("Tahoma", Font.BOLD, 15));
        b2.addActionListener(this);
        a4.add(b2);
        
         b1 = new JButton("UPDATE");
        b1.setBounds(190, 370, 100, 33);
        b1.setFont(new Font("Tahoma", Font.BOLD, 15));
        b1.addActionListener(this);
        a4.add(b1);


        
        b3 = new JButton("CHECK");
        b3.setBounds(310, 370, 100,33);
        b3.setFont(new Font("Tahoma", Font.BOLD, 15));
        b3.addActionListener(this);
        a4.add(b3);
        
        
        
        
        
        
                         ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("icons/updated.png"));
        Image c2 = c1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon c3 = new ImageIcon(c2);
        JLabel c4 = new JLabel(c3);
        c4.setBounds(550, 150, 200, 200);
        a4.add(c4);
        
        
        
         setUndecorated(true);
         setLocation(450, 120);
        setLayout(null);
        setSize(900, 550);
        setVisible(true);
    }
    public static void main(String[] args) {
        new UpdateCheck();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
         if(ae.getSource()==b2){
        setVisible(false);}
         else if(ae.getSource()==b1){
             String number=ccustomer.getSelectedItem();
             String room=roomnumbertext.getText();
             String name=nametext.getText();
             String checkin=checkintimetext.getText();
             String deposit=amountpaidtext.getText();
             try {
                 
                  Conn c=new Conn();
                 c.s.executeUpdate("update customer set room ='"+room+"',name='"+name+"',checkinTime='"+checkin+"',deposit='"+deposit+"' where number = '"+number+"'  ");
                 
                 JOptionPane.showMessageDialog(null, "Data updated successfully");
                 setVisible(false);
                 
             } catch (Exception e) {
                 System.out.println(e);
             }
         }
         else if(ae.getSource()==b3){
             String id=ccustomer.getSelectedItem();
             String query ="select * from customer where number ='"+id+"'";
             try {
                 Conn c=new Conn();
                 ResultSet rs=c.s.executeQuery(query);
                 while(rs.next()){
                     roomnumbertext.setText(rs.getString("room"));
                     nametext.setText(rs.getString("name"));
                     checkintimetext.setText(rs.getString("checkinTime"));
                     amountpaidtext.setText(rs.getString("deposit"));
                 }
                 ResultSet rs2=c.s.executeQuery("select * from room where roomnumber = '"+roomnumbertext.getText()+"'");
                 while(rs2.next()){
                     String price=rs2.getString("price");
                     int amountpaid=Integer.parseInt(price)-Integer.parseInt(amountpaidtext.getText());
                     pendingamounttext.setText(""+amountpaid);
                 }
             } catch (Exception e) {
                 System.out.println(e);
             }
         }
    }
}
