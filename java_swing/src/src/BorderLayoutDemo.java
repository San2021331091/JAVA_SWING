package src;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo extends JFrame {
     private Container c;
     private JButton jb1,jb2,jb3,jb4,jb5;
     private BorderLayout bl;
    BorderLayoutDemo(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,50,800,600);
        this.setResizable(true);
        this.setTitle("Border  layout Demo");
        this.initComponents();


    }

   public void initComponents(){
        c = this.getContentPane();
        bl = new BorderLayout();
        c.setLayout(bl);
        jb1 = new JButton("1");
        jb2 = new JButton("2");
        jb3 = new JButton("3");
        jb4 = new JButton("4");
        jb5 = new JButton("5");
        bl.setHgap(10);
        bl.setVgap(10);
       c.add(jb1,BorderLayout.NORTH);
       c.add(jb2,BorderLayout.WEST);
       c.add(jb3,BorderLayout.CENTER);
       c.add(jb4,BorderLayout.EAST);
       c.add(jb5,BorderLayout.SOUTH);


   }
    public static void main(String[] args) {

        BorderLayoutDemo bl = new BorderLayoutDemo();
        bl.setVisible(true);


    }




}
