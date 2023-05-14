package hotel.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class AddRoom extends JFrame implements ActionListener {

    JTextField t2, t4;
    JComboBox t6, t3, t5;
    JButton b1, b2;

    AddRoom() {

        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 875, 490);
        panel.setLayout(null);
        add(panel);
        ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource("icons/frame 6.jpg"));
        Image a2 = a1.getImage().getScaledInstance(875, 490, Image.SCALE_DEFAULT);
        ImageIcon a3 = new ImageIcon(a2);
        JLabel a4 = new JLabel(a3);
        a4.setBounds(0, 0, 875, 490);
        panel.add(a4);

        JLabel l1 = new JLabel("ADD ROOMS");
        l1.setBounds(350, 10, 160, 22);
        l1.setFont(new Font("Tahoma", Font.BOLD, 25));
        l1.setForeground(Color.WHITE);
        a4.add(l1);

        JLabel l2 = new JLabel("Room Number");
        l2.setBounds(64, 80, 152, 22);
        l2.setFont(new Font("Tahoma", Font.BOLD, 18));
        l2.setForeground(Color.white);
        a4.add(l2);

        t2 = new JTextField();
        t2.setBounds(220, 80, 156, 23);
        t2.setFont(new Font("Tahoma", Font.PLAIN, 18));
        t2.setForeground(Color.WHITE);
        t2.setBackground(new Color(16, 108, 115));
        a4.add(t2);

        JLabel l3 = new JLabel("Availability");
        l3.setBounds(64, 120, 152, 22);
        l3.setFont(new Font("Tahoma", Font.BOLD, 18));
        l3.setForeground(Color.white);
        a4.add(l3);

        t3 = new JComboBox(new String[]{"Available", "Occupied"});
        t3.setBounds(220, 120, 156, 23);
        t3.setFont(new Font("Tahoma", Font.PLAIN, 18));
        t3.setForeground(Color.WHITE);
        t3.setBackground(new Color(16, 108, 115));
        a4.add(t3);

        JLabel l4 = new JLabel("Price");
        l4.setBounds(64, 160, 152, 22);
        l4.setFont(new Font("Tahoma", Font.BOLD, 18));
        l4.setForeground(Color.white);
        a4.add(l4);

        t4 = new JTextField();
        t4.setBounds(220, 160, 156, 23);
        t4.setFont(new Font("Tahoma", Font.PLAIN, 18));
        t4.setForeground(Color.WHITE);
        t4.setBackground(new Color(16, 108, 115));
        a4.add(t4);

        JLabel l5 = new JLabel("Cleaning Status");
        l5.setBounds(64, 200, 152, 22);
        l5.setFont(new Font("Tahoma", Font.BOLD, 18));
        l5.setForeground(Color.white);
        a4.add(l5);

        t5 = new JComboBox(new String[]{"Cleaned", "Dirty"});
        t5.setBounds(220, 200, 156, 23);
        t5.setFont(new Font("Tahoma", Font.PLAIN, 18));
        t5.setForeground(Color.WHITE);
        t5.setBackground(new Color(16, 108, 115));
        a4.add(t5);

        JLabel l6 = new JLabel("Bed Type");
        l6.setBounds(64, 240, 152, 22);
        l6.setFont(new Font("Tahoma", Font.BOLD, 18));
        l6.setForeground(Color.white);
        a4.add(l6);

        t6 = new JComboBox(new String[]{"Single Bed", "Double Bed"});
        t6.setBounds(220, 240, 156, 23);
        t6.setFont(new Font("Tahoma", Font.PLAIN, 18));
        t6.setForeground(Color.WHITE);
        t6.setBackground(new Color(16, 108, 115));
        a4.add(t6);

        b1 = new JButton("ADD");
        b1.setBounds(150, 330, 80, 33);
        b1.setFont(new Font("Tahoma", Font.BOLD, 15));
        b1.addActionListener(this);
        a4.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(64, 330, 80, 33);
        b2.setFont(new Font("Tahoma", Font.BOLD, 15));
        b2.addActionListener(this);
        a4.add(b2);

//          ImageIcon b1=new ImageIcon(ClassLoader.getSystemResource("icons/roomser.png"));
        ImageIcon b1 = new ImageIcon(ClassLoader.getSystemResource("icons/eight.jpg"));
        Image b2 = b1.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon b3 = new ImageIcon(b2);
        JLabel b4 = new JLabel(b3);
        b4.setBounds(500, 60, 300, 300);
        a4.add(b4);

        setUndecorated(true);
        setLocation(20, 200);
        setLayout(null);
        setSize(885, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AddRoom();
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            try {
                
                
                
                String room = t2.getText();
                String ava = (String) t3.getSelectedItem();
                String status = (String) t5.getSelectedItem();
                String price = t4.getText();
                String type = (String) t6.getSelectedItem();
                if(room.equals("")) {
					JOptionPane.showMessageDialog(null, "Room Number is Mandatory");
				}
                else if(price.equals("")) {
					JOptionPane.showMessageDialog(null, "price is Mandatory");
				}
                else {Conn c = new Conn();
                String q="insert into room values('"+room+"','"+ava+"','"+status+"','"+price+"','"+type+"')";
                c.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null, "Room Successfully Added");
                setVisible(false);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } else if (ae.getSource() == b2) {
            setVisible(false);

        }
    }
}
