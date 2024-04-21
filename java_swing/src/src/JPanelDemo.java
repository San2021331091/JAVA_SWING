package src;
import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class JPanelDemo extends JFrame {
    private Container c;
    private ImageIcon icon;
    private JPanel jp1,jp2;
    private JButton jb1,jb2,jb3;
    private Font f;
    private JLabel jl;
    JPanelDemo(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,50,800,600);
        this.setResizable(false);
        this.setTitle("JPanel Demo");
        this.initComponents();
    }

    public void initComponents(){

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);
        icon = new ImageIcon(Objects.requireNonNull(getClass().getResource("win.png")));
        this.setIconImage(icon.getImage());
        jp1 = new JPanel();
        jp1.setBounds(100,100,350,300);
        jp1.setBackground(Color.RED);
        c.add(jp1);

        jp2 = new JPanel();
        jp2.setBounds(400,100,350,300);
        jp2.setBackground(Color.BLUE);
        c.add(jp2);

         jb1 = new JButton("Button1");
         jb2 = new JButton("Button2");
         jb3 = new JButton("Button3");

         f = new Font("Roboto", Font.BOLD, 20);
         jb1.setFont(f);
         jb2.setFont(f);
         jb3.setFont(f);
         jb1.setForeground(Color.WHITE);
         jb2.setForeground(Color.WHITE);
         jb3.setForeground(Color.WHITE);
         jb1.setBackground(Color.BLUE);
         jb2.setBackground(Color.RED);
         jb3.setBackground(Color.GREEN);

         jp1.add(jb1);
         jp2.add(jb2);
         jp1.add(jb3);

         jl = new JLabel("Panel JPanel");
         jl.setForeground(Color.WHITE);
         jl.setFont(f);
         jl.setBounds(300,400,200,30);
         c.add(jl);



    }


    public static void main(String[] args) {
      JPanelDemo jp = new JPanelDemo();
      jp.setVisible(true);
    }





}
