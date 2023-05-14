
package hotel.management.system;

import java.awt.Image;
import javax.swing.*;
public class Splash extends JFrame{
    Splash(){
        
        
        
        ImageIcon a1=new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
		 Image a2=a1.getImage().getScaledInstance(1366, 565, Image.SCALE_DEFAULT);
		ImageIcon a3=new  ImageIcon(a2);
		 JLabel a4=new JLabel(a3);
		 a4.setBounds(0, 0, 1366, 565);
		add(a4);
        
        
        
        

        
        
        setLayout(null);
        setSize(1366,565);
        setLocation(100,80);
        setVisible(true);
        
        try {
            Thread.sleep(2000);
            setVisible(false);
//            next class new object
                new Login().setVisible(true);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    
    public static void main(String[] args) {
        new Splash();
    }
}
