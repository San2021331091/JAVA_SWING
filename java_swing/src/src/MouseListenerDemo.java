package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerDemo extends JFrame {
   private Container c;
   private JTextField jt;
   private JTextArea ja;
   private JScrollPane js;
   private Font f;


    MouseListenerDemo(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(450, 30, 660, 750);
        this.setResizable(false);
        this.setTitle("Mouse Listener Demo");
        this.initComponents();
    }

    public void initComponents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        jt = new JTextField();
        jt.setBounds(50,50,300,50);
        c.add(jt);
        f = new Font("Serif", Font.BOLD + Font.ITALIC, 20);
        ja = new JTextArea();
        ja.setForeground(Color.RED);
        ja.setBackground(Color.YELLOW);
        ja.setLineWrap(true);
        ja.setWrapStyleWord(true);
        ja.setFont(f);

        js = new JScrollPane(ja);
        js.setBounds(50,150,550,450);
        c.add(js);

        jt.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            ja.append("Mouse Clicked\n");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                ja.append("Mouse Pressed\n");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                ja.append("Mouse Released\n");

            }

            @Override
            public void mouseEntered(MouseEvent e) {
            ja.append("Mouse Entered\n");
            }

            @Override
            public void mouseExited(MouseEvent e) {
            ja.append("Mouse Exited\n");
            }
        });

    }
    public static void main(String[] args) {

    MouseListenerDemo ms = new MouseListenerDemo();
    ms.setVisible(true);


    }



}
