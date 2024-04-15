import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class NewFrame extends JFrame {
  private Container c;
  private JLabel jl;
  private Font f;
  private ImageIcon icon;
           NewFrame(){

               this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
               this.setBounds(100,50,700,700);
               this.setTitle("New Window");
               this.setResizable(false);

               initComponents();





           }
public void initComponents(){

                 c = this.getContentPane();
                 c.setBackground(Color.MAGENTA);
                 c.setLayout(null);
                 jl = new JLabel("Welcome to new Window");
                 f = new Font("Aerial",Font.ITALIC,16);
                 jl.setFont(f);
                 jl.setBounds(200,80,200,50);
                 jl.setForeground(Color.WHITE);
                 c.add(jl);
                 icon = new ImageIcon(Objects.requireNonNull(getClass().getResource("win.png"))) ;
                 this.setIconImage(icon.getImage());



}

  public static void main(String[] args){

      NewFrame frame = new NewFrame();
         frame.setVisible(true);







  }








}
