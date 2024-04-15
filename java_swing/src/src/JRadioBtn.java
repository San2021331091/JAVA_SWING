package src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JRadioBtn extends JFrame {
    private Container c;
    private JRadioButton male , female;
    private Font f;
    private ButtonGroup bg;
    private JTextArea jt;

    JRadioBtn(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setBounds(450, 30, 560, 650);
        this.setResizable(false);
        this.setTitle("JRadioButton");
        this.initComponents();
    }

    public void initComponents(){
        c = this.getContentPane();
        c.setBackground(Color.ORANGE);
        bg = new ButtonGroup();

        male = new JRadioButton("Male");
        f = new Font("Roboto", Font.BOLD|Font.ITALIC, 20);

        male.setBounds(50,50,100,50);
        male.setBackground(Color.ORANGE);
        male.setForeground(Color.RED);
        male.setFont(f);
        male.setSelected(true);
        c.add(male);
        female = new JRadioButton("Female");
        female.setBounds(180,50,100,50);
        female.setBackground(Color.ORANGE);
        female.setForeground(Color.RED);
        female.setFont(f);
        //female.setEnabled(false);
        c.add(female);
        bg.add(male);
        bg.add(female);

     jt = new JTextArea();
     jt.setBounds(20,140,500,200);
     jt.setFont(f);
     jt.setBackground(Color.BLUE);
     jt.setForeground(Color.RED);
     c.add(jt);

     Handler handle = new Handler();
     male.addActionListener(handle);
     female.addActionListener(handle);
    }

    class Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(male.isSelected()){
                jt.setText("");
               jt.append("You have selected Male.\n");
            }
            else{
                jt.setText("");
                jt.append("You have selected Female.\n");
            }

        }
    }


    public static void main(String[] args) {

        JRadioBtn jr = new JRadioBtn();
        jr.setVisible(true);
    }


}
