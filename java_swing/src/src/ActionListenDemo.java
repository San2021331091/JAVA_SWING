package src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class ActionListenDemo extends JFrame implements ActionListener{
    private Container c;
    private ImageIcon icon;
    private JButton jb1,jb2,jb3;

    ActionListenDemo(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(450, 30, 560, 650);
        this.setResizable(false);
        this.setTitle("JCheckBox Demo");
        this.initComponents();
    }

    public void initComponents(){

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.YELLOW);
        icon = new ImageIcon(Objects.requireNonNull(getClass().getResource("win.png")));
        this.setIconImage(icon.getImage());
        jb1 = new JButton("Red");
        jb2 = new JButton("Green");
        jb3 = new JButton("Blue");

        jb1.setBackground(Color.RED);
        jb2.setBackground(Color.GREEN);
        jb3.setBackground(Color.BLUE);

        jb1.setForeground(Color.WHITE);
        jb2.setForeground(Color.WHITE);
        jb3.setForeground(Color.WHITE);

        jb1.setBounds(50,90,150,40);
        jb2.setBounds(50,180,150,40);
        jb3.setBounds(50,270,150,40);
        c.add(jb1);
        c.add(jb2);
        c.add(jb3);
        /*Handle handle = new Handle();
        jb1.addActionListener(handle);
        jb2.addActionListener(handle);
        jb3.addActionListener(handle);*/
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
    }


   /*-- class Handle implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==jb1){
                c.setBackground(Color.RED);
            }
            else if(e.getSource()==jb2){
                c.setBackground(Color.GREEN);
            }
            else{
                c.setBackground(Color.BLUE);
            }
        }
    }

--*/


    @Override
    public void actionPerformed(ActionEvent e) {
          if(e.getSource() == jb1){
              c.setBackground(Color.RED);
          }
          else if(e.getSource() == jb2){
              c.setBackground(Color.GREEN);
          }
          else{
              c.setBackground(Color.BLUE);
          }
    }

    public static void main(String[] args) {

        ActionListenDemo frame = new ActionListenDemo();
        frame.setVisible(true);

    }



}
