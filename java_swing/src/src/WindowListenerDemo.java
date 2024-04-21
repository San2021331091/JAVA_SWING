package src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Objects;

public class WindowListenerDemo extends JFrame{

    private ImageIcon icon;
    private Container container;

    WindowListenerDemo(){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,50,800,600);
        setResizable(true);
        setTitle("Window Listener Demo");
        initComponents();

    }

    public void initComponents(){
        container = this.getContentPane();
        container.setBackground(Color.GREEN);

        icon = new ImageIcon(Objects.requireNonNull(getClass().getResource("win.png")));
        this.setIconImage(icon.getImage());

        this.addWindowListener(new WindowListener(){

            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("window opened");
            }

            @Override
            public void windowClosing(WindowEvent e) {
             System.out.println("window closing");
            }

            @Override
            public void windowClosed(WindowEvent e) {
            System.out.println("window closed");
            }

            @Override
            public void windowIconified(WindowEvent e) {
             System.out.println("window iconified");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("window deiconified");
            }

            @Override
            public void windowActivated(WindowEvent e) {
           System.out.println("window activated");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
               System.out.println("window deactivated");

            }
        });


    }

  public static void main(String[]args){

        WindowListenerDemo ws = new WindowListenerDemo();
        ws.setVisible(true);





    }




}
