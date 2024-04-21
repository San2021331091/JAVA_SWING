package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;


public class FocusListenerDemo extends JFrame {
    private Container container;
    private JButton jb;
    private JTextArea ja;
    private Font f;


    FocusListenerDemo(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(450, 50, 660, 750);
        this.setResizable(false);
        this.setTitle("Mouse Motion Listener Demo");
        this.initComponents();
    }

    public void initComponents(){
        container = this.getContentPane();
        container.setLayout(null);
        container.setBackground(Color.PINK);

        jb = new JButton("Click Me");
        jb.setBounds(50,150,190,50);
        jb.setBackground(Color.RED);
        jb.setForeground(Color.YELLOW);
        f = new Font("Serif", Font.BOLD + Font.ITALIC, 20);
        jb.setFont(f);
        container.add(jb);
        ja = new JTextArea();
        ja.setBounds(270,150,350,350);
        container.add(ja);
        jb.addFocusListener(new FocusListener(){

            @Override
            public void focusGained(FocusEvent e) {
                ja.setText("Focus Gained");
            }

            @Override
            public void focusLost(FocusEvent e) {
                ja.setText("Focus Lost");
            }
        });



    }
    public static void main(String[] args) {

       FocusListenerDemo fs = new FocusListenerDemo();
       fs.setVisible(true);


    }



}
