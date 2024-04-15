import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class jTextField extends JFrame {

private ImageIcon icon;
private Container container;
private JTextField tf1,tf2;
private Font font;

      jTextField(){


          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          setBounds(100,50,1400,600);
          setTitle("Text Field");
          setResizable(false);
          initComponents();

      }

      public void initComponents(){

          icon = new ImageIcon(Objects.requireNonNull(getClass().getResource("win.png")));
          container = this.getContentPane();
          container.setLayout(null);
          container.setBackground(Color.RED);
          setIconImage(icon.getImage());
          font = new Font("Aerial",Font.ITALIC+Font.BOLD,20);
          tf1 = new JTextField();
          tf1.setBounds(200,50,250,50);
          tf1.setFont(font);
          tf1.setForeground(Color.YELLOW);
          tf1.setBackground(Color.GREEN);
          //tf1.setHorizontalAlignment(JTextField.CENTER);
          tf1.setHorizontalAlignment(JTextField.RIGHT);

          container.add(tf1);
          tf2 = new JTextField("Ani");
          tf2.setBounds(200,110,250,50);
          tf2.setFont(font);
          container.add(tf2);


      }
    public static void main(String [] args){


        jTextField frame = new jTextField();
        frame.setVisible(true);








    }





}
