import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class LoginFrame extends JFrame {


    private JLabel userLabel,passLabel;
    private JTextField jf1;
    private JPasswordField jp1;
    private JButton btn1,btn2;

    private Cursor cs,cs1;
    private ImageIcon icon;

    private Container c;
    private Font f;


             LoginFrame(){

                 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 this.setBounds(100,50,700,700);
                 this.setTitle("Login Form");
                 this.setResizable(false);
                 initComponents();
             }


             public void initComponents(){

                  c = this.getContentPane();
                  c.setLayout(null);
                  c.setBackground(Color.orange);

                  userLabel = new JLabel("Enter your username:");
                  userLabel.setBounds(50,50,300,50);
                  userLabel.setForeground(Color.BLUE);
                  f = new Font("Aerial",Font.BOLD,20);
                  userLabel.setFont(f);
                  c.add(userLabel);

                 jf1 = new JTextField();
                 jf1.setBounds(300,50,300,50);
                 jf1.setFont(f);
                 jf1.setForeground(Color.GREEN);
                 c.add(jf1);

                 passLabel = new JLabel("Enter your password:");
                 passLabel.setBounds(50,120,300,50);
                 passLabel.setForeground(Color.RED);
                 passLabel.setFont(f);
                 c.add(passLabel);

                 jp1 = new JPasswordField();
                 jp1.setBounds(300,120,300,50);
                 jp1.setFont(f);
                 jp1.setEchoChar('*');
                 jp1.setForeground(Color.GREEN);
                 c.add(jp1);
                 btn1 = new JButton("Login");
                 btn1.setBounds(370,300,100,50);
                 btn1.setFont(f);
                 btn1.setBackground(Color.BLUE);
                 btn1.setForeground(Color.WHITE);
                 cs = new Cursor(Cursor.HAND_CURSOR);
                 btn1.setCursor(cs);
                 c.add(btn1);
                 btn1.addActionListener(new ActionListener() {
                     @Override
                     public void actionPerformed(ActionEvent e) {
                        String userName = jf1.getText();
                         char[] passwordChars = jp1.getPassword();
                         String password = new String(passwordChars);

                        if(userName.equals("porimol") && password.equals("dhd5257#fsgdj")) {
                            JOptionPane.showMessageDialog(null, "You have successfully logged in", "Success", JOptionPane.INFORMATION_MESSAGE);
                            //dispose();
                            NewFrame newFro = new NewFrame();
                            newFro.setVisible(true);
                        }
                        else if(userName.isEmpty() || password.isEmpty())
                            JOptionPane.showMessageDialog(null,"Please enter both username and password","Error",JOptionPane.ERROR_MESSAGE);

                        else
                            JOptionPane.showMessageDialog(null,"Invalid username or password","Error",JOptionPane.ERROR_MESSAGE);

                     }
                 });

                 btn2 = new JButton("Clear");
                 btn2.setBounds(500,300,100,50);
                 btn2.setFont(f);
                 btn2.setBackground(Color.GREEN);
                 btn2.setForeground(Color.WHITE);
                 cs1 = new Cursor(Cursor.CROSSHAIR_CURSOR);
                 btn2.setCursor(cs1);
                 c.add(btn2);
                 btn2.addActionListener(new ActionListener() {
                     @Override
                     public void actionPerformed(ActionEvent e) {
                          jf1.setText("");
                          jp1.setText("");
                     }
                 });

                 icon = new ImageIcon(Objects.requireNonNull(getClass().getResource("win.png")));
                 this.setIconImage(icon.getImage());


             }
    public static void main(String[] args){


        LoginFrame frame = new LoginFrame();
        frame.setVisible(true);



    }








}
