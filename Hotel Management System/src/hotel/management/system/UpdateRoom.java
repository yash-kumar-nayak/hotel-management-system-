
package hotel.management.system;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;
public class UpdateRoom extends JFrame implements ActionListener{
    
        Choice ccustomer;
    JButton b1,b2,b3;
    JTextField roomnumbertext ,nametext ,cleanstatustext;
    
    UpdateRoom(){
         ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource("icons/frame 6.jpg"));
        Image a2 = a1.getImage().getScaledInstance(890, 540, Image.SCALE_DEFAULT);
        ImageIcon a3 = new ImageIcon(a2);
        JLabel a4 = new JLabel(a3);
        a4.setBounds(5, 5,890 , 540);
        add(a4);
                    JLabel l1 = new JLabel("UPDATE ROOM STATUS");
        l1.setBounds(330, 10, 350, 22);
        l1.setFont(new Font("Tahoma", Font.BOLD, 25));
        l1.setForeground(Color.WHITE);
        a4.add(l1);
        
         JLabel id = new JLabel("CUSTOMER ID");
        id.setFont(new Font("serif", Font.BOLD, 17));
        id.setBounds(70, 120, 152, 20);
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
        ccustomer.setBounds(250, 120, 156, 22);
        ccustomer.setFont(new Font("Tahoma", Font.BOLD, 14));
        ccustomer.setForeground(Color.blue);
        ccustomer.setBackground(new Color(34,154,202));
        a4.add(ccustomer);
        
        
        JLabel num = new JLabel("ROOM NUMBER");
        num.setFont(new Font("serif", Font.BOLD, 17));
        num.setBounds(70, 160, 152, 20);
        num.setForeground(Color.white);
        a4.add(num);
        
        
         roomnumbertext = new JTextField();
        roomnumbertext.setBounds(250, 160, 156, 22);
        roomnumbertext.setFont(new Font("Tahoma", Font.BOLD, 14));
        roomnumbertext.setForeground(Color.WHITE);
        roomnumbertext.setBackground(new Color(34,154,202));
        a4.add(roomnumbertext);
        
     
        
         JLabel name = new JLabel("AVAILABILITY");
        name.setFont(new Font("serif", Font.BOLD, 16));
        name.setBounds(70, 200, 152, 20);
        name.setForeground(Color.white);
        a4.add(name);

        nametext = new JTextField();
        nametext.setBounds(250,  200, 156, 22);
        nametext.setFont(new Font("Tahoma", Font.BOLD, 14));
        nametext.setForeground(Color.WHITE);
        nametext.setBackground(new Color(34,154,202));
        a4.add(nametext);
        
        
        
        
        
                JLabel checkintimelb = new JLabel("CLEAN STATUS");
        checkintimelb.setFont(new Font("serif", Font.BOLD, 16));
        checkintimelb.setBounds(70, 240, 152, 20);
        checkintimelb.setForeground(Color.white);
        a4.add(checkintimelb);
        cleanstatustext=new JTextField();
       cleanstatustext.setBounds(250,240,156,25);
        cleanstatustext.setFont(new Font("Tahoma", Font.BOLD, 12));
        cleanstatustext.setForeground(Color.WHITE);
        cleanstatustext.setBackground(new Color(34,154,202));
        a4.add(cleanstatustext);
        
        
        
       
           
        
        
        
        
        
        
        
        
        
        
        
        
        
        
                b2 = new JButton("BACK");
        b2.setBounds(70, 360, 100, 33);
        b2.setFont(new Font("Tahoma", Font.BOLD, 15));
        b2.addActionListener(this);
        a4.add(b2);
        
         b1 = new JButton("UPDATE");
        b1.setBounds(190, 360, 100, 33);
        b1.setFont(new Font("Tahoma", Font.BOLD, 15));
        b1.addActionListener(this);
        a4.add(b1);


        
        b3 = new JButton("CHECK");
        b3.setBounds(310, 360, 100,33);
        b3.setFont(new Font("Tahoma", Font.BOLD, 15));
        b3.addActionListener(this);
        a4.add(b3);
        
        
        
        
        
        
                         ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("icons/update.png"));
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
        new UpdateRoom();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
      if(ae.getSource()==b2){
        setVisible(false);}
      //update
         else if(ae.getSource()==b1){
            
            
           
             try {
                 
                  Conn c=new Conn();
                   String clean=cleanstatustext.getText();
                 c.s.executeUpdate("update room set cleaning_status ='"+clean+"' where roomnumber = "+ roomnumbertext.getText());
                 
                 JOptionPane.showMessageDialog(null, "Data updated successfully");
                 setVisible(false);
                 
             } catch (Exception e) {
                 System.out.println(e);
             }
         }
         //check
         else if(ae.getSource()==b3){
             String id=ccustomer.getSelectedItem();
             String query ="select * from customer where number ='"+id+"'";
             try {
                 Conn c=new Conn();
                 ResultSet rs=c.s.executeQuery(query);
                 while(rs.next()){
                     roomnumbertext.setText(rs.getString("room"));
                     
                     
                 }
                 ResultSet rs2=c.s.executeQuery("select * from room where roomnumber = '"+roomnumbertext.getText()+"'");
                 while(rs2.next()){
                     nametext.setText(rs2.getString("availability"));
                     cleanstatustext.setText(rs2.getString("cleaning_status"));
                    
                 }
             } catch (Exception e) {
                 System.out.println(e);
             }
         }
    }
}
