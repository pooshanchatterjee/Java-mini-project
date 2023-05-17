package university.management.system;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {

    About() {
        setSize(700, 500);
        setLocation(400, 150);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/about.jpg"));
        Image i2 = i1.getImage().getScaledInstance(210, 280, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(420, 100, 210, 280);
        add(image);
        
//        JLabel heading = new JLabel("<html>University<br/>Management System</html>");
        JLabel heading = new JLabel("University Management System");
        heading.setBounds(90, 10, 700, 50);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(heading);
        
        JLabel name1 = new JLabel("Developed By:");
        name1.setBounds(70, 130, 550, 40);
        name1.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(name1);
        
        JLabel name2 = new JLabel("Bhaswati Bardhan");
        name2.setBounds(70, 190, 550, 40);
        name2.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(name2);
        
        JLabel rollno1 = new JLabel("Roll number: 22122113");
        rollno1.setBounds(70, 230, 550, 40);
        rollno1.setFont(new Font("Tahoma", Font.PLAIN, 30));
        add(rollno1);
        
        JLabel name3 = new JLabel("Pooshan Chatterjee");
        name3.setBounds(70, 290, 550, 40);
        name3.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(name3);
        
        JLabel rollno2 = new JLabel("Roll number: 22122139");
        rollno2.setBounds(70, 330, 550, 40);
        rollno2.setFont(new Font("Tahoma", Font.PLAIN, 30));
        add(rollno2);
        
        
        
//        JLabel contact = new JLabel("Contact: bhaswati.bardhan@msds.christuniversity.in");
//        contact.setBounds(70, 340, 550, 40);
//        contact.setFont(new Font("Tahoma", Font.PLAIN, 20));
//        add(contact);
        
        setLayout(null);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new About();
    }
}
