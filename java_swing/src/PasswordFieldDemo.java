import javax.swing.*;
import java.awt.*;

public class PasswordFieldDemo extends JFrame {

private Container container;
private JPasswordField passwordField;

    PasswordFieldDemo(){


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,50,1400,600);
        setTitle("Window");
        setResizable(false);
        initComponents();




    }

    public void initComponents(){


     container = this.getContentPane();
     container.setLayout(null);
     container.setBackground(Color.GREEN);
     passwordField = new JPasswordField();
     passwordField.setBounds(50,50,250,50);
     passwordField.setEchoChar('#');
     container.add(passwordField);


    }

    public static void main(String[] args){


    PasswordFieldDemo frame = new PasswordFieldDemo();
    frame.setVisible(true);







    }





}
