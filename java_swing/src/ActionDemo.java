import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ActionDemo extends JFrame {
 private Container c;
 private JTextField jf1,jf2;

    ActionDemo(){


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,50,1400,600);
        setTitle("Text Field");
        setResizable(false);
        initComponents();
    }

    public void initComponents(){

     c = this.getContentPane();
     c.setLayout(null);
     c.setBackground(Color.BLUE);
        jf1 = new JTextField();
        jf1.setBounds(50,50,250,50);
        c.add(jf1);
     jf2 = new JTextField();
     jf2.setBounds(50,110,250,50);
     c.add(jf2);
  /*jf1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
     String s1 = jf1.getText();

          if (s1.isEmpty()) {
              JOptionPane.showMessageDialog(null, "Please Enter a text " );
          } else {
              JOptionPane.showMessageDialog(null, "Welcome " + s1);
          }
      }
  });*/
        /* jf2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s2 = jf2.getText();

                if (s2.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please Enter a text " );
                } else {
                    JOptionPane.showMessageDialog(null, "Welcome " + s2);
                }
            }
        }); */

        Handler handle = new Handler();
        jf1.addActionListener(handle);
        jf2.addActionListener(handle);


    }

public class Handler implements  ActionListener{

    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==jf1)
        {
            String s = jf1.getText();
            if (s.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please Enter a text " );
            } else {
                JOptionPane.showMessageDialog(null, "Welcome " + s);
            }



        }
        else{

            String s = jf2.getText();
            if (s.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please Enter a text " );
            } else {
                JOptionPane.showMessageDialog(null, "Welcome " + s);
            }

        }

    }


}
    public static void main(String[] args){


        ActionDemo frame = new ActionDemo();
        frame.setVisible(true);





    }



}
