package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseMotionListenerDemo extends JFrame {
    private Container container;
    private JTextField jt;
    private JTextArea ja;
    private Font f;


    MouseMotionListenerDemo(){
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

        ja = new JTextArea();
        ja.setBounds(50,150,350,350);
        container.add(ja);
        jt = new JTextField();
        jt.setBounds(430,150,190,50);
        f = new Font("Serif", Font.BOLD + Font.ITALIC, 20);
        jt.setFont(f);
        container.add(jt);
        ja.addMouseMotionListener(new MouseMotionListener(){

            @Override
            public void mouseDragged(MouseEvent e) {
              jt.setText("Mouse Dragged "+e.getX()+":"+e.getY());
            }

            @Override
            public void mouseMoved(MouseEvent e) {
              jt.setText("Mouse Moved "+e.getX()+":"+e.getY());
            }
        });





    }
    public static void main(String[] args) {

    MouseMotionListenerDemo ms = new MouseMotionListenerDemo();
    ms.setVisible(true);


    }



}
