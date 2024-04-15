import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class jFrameHandle1 extends JFrame{

    private ImageIcon icon;
    private Container container;

         jFrameHandle1(){

             setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             setBounds(100,50,800,600);
             setResizable(false);
             setTitle("JFrame Window");
             initComponents();

         }

         public void initComponents(){
             container = this.getContentPane();
             container.setBackground(Color.GREEN);

        icon = new ImageIcon(Objects.requireNonNull(getClass().getResource("win.png")));
        this.setIconImage(icon.getImage());



         }

    public static void main(String[]args){

        jFrameHandle1 frame = new jFrameHandle1();
        frame.setVisible(true);





    }




}
