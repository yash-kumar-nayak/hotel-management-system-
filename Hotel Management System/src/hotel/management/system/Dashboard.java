
package hotel.management.system;

import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener{
    JButton admin,rec;
    Dashboard(){
        
        
//        video
    setTitle("Hotel Management System");
        ImageIcon b1=new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.gif"));
		 Image b2=b1.getImage().getScaledInstance(1950,1090, Image.SCALE_DEFAULT);
		ImageIcon b3=new  ImageIcon(b2);
		 JLabel b4=new JLabel(b3);
		 b4.setBounds(0, 0, 1950,1090);
		add(b4);
      
       
        
        rec= new JButton("RECEPTION");
        rec.setBounds(425, 510, 140, 30);
        rec.setFont(new Font("Tahoma", Font.BOLD,15));
        rec.setForeground(Color.white);
        rec.setBackground(new Color(255,98,0));
          rec.addActionListener(this);
        b4.add(rec);
         ImageIcon r1=new ImageIcon(ClassLoader.getSystemResource("icons/REception.png"));
		 Image r2=r1.getImage().getScaledInstance(200,195, Image.SCALE_DEFAULT);
		ImageIcon r3=new  ImageIcon(r2);
		 JLabel r4=new JLabel(r3);
		 r4.setBounds(390, 300, 200,195);
		b4.add(r4);
        
        admin= new JButton("ADMIN");
        admin.setBounds(880, 510, 140, 30);
        admin.setFont(new Font("Tahoma", Font.BOLD,15));
        admin.setForeground(Color.white);
        admin.setBackground(new Color(255,98,0));
        admin.addActionListener(this);
        b4.add(admin);
        
          ImageIcon a1=new ImageIcon(ClassLoader.getSystemResource("icons/boss.png"));
		 Image a2=a1.getImage().getScaledInstance(200,195, Image.SCALE_DEFAULT);
		ImageIcon a3=new  ImageIcon(a2);
		 JLabel a4=new JLabel(a3);
		 a4.setBounds(850, 300, 200,195);
		b4.add(a4);
        
        
        
        
        
        
        setLayout(null);
        setSize(1950,1090);
      
//        setSize(1550,1000);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Dashboard();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==rec){
//           new class 
            setVisible(false);
            new Reception();
       }
       else{
           setVisible(false);
//            new 
//           new class
                new Login2();
            
       }
    }
}
