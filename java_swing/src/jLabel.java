import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class jLabel extends JFrame {

private Container container;
//private JLabel userLabel,passLabel;
//private Font font;
private JLabel imageLabel;
private ImageIcon icon;

    jLabel(){


        initComponents();


    }

    public void initComponents(){

        container = this.getContentPane();
        container.setLayout(null);
        container.setBackground(Color.PINK);
//        font = new Font("Aerial",Font.BOLD,20);
//        userLabel = new JLabel();
//        userLabel.setText("Enter your username:");
//        userLabel.setBounds(50,20,500,50);
//        userLabel.setFont(font);
//        userLabel.setForeground(Color.RED);
//        userLabel.setOpaque(true);
//        userLabel.setBackground(Color.YELLOW);
//        userLabel.setToolTipText("Enter your username");
//        container.add(userLabel);
//        String str = userLabel.getToolTipText();
//        //JOptionPane.showMessageDialog(null,str,"Warning",JOptionPane.WARNING_MESSAGE);
//        passLabel = new JLabel("Enter your password:");
//        passLabel.setBounds(50,70,500,60);
//        passLabel.setFont(font);
//        container.add(passLabel);

        icon = new ImageIcon(Objects.requireNonNull(getClass().getResource("img.png")));

        imageLabel = new JLabel(icon);
        imageLabel.setBounds(50,80, icon.getIconWidth(), icon.getIconHeight());
        container.add(imageLabel);
    }



    public static void main(String [] args){



          jLabel frame = new jLabel();
          frame.setVisible(true);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setBounds(200,60,900,500);
          frame.setTitle("Window");











    }






}
