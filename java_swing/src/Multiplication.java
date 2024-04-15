import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class  Multiplication extends JFrame {
    private ImageIcon img;
    private Container container;
    private JLabel imgLabel, textLabel;
    private JTextArea jt;
    private JTextField jf;
    private JButton jb;
    private Font f;
    private Cursor cs;

    Multiplication() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setBounds(450, 30, 500, 810);
        this.setResizable(false);
        this.setTitle("Multiplication Table");
        this.initComponents();


    }


    public void initComponents() {

        container = this.getContentPane();
        container.setBackground(Color.PINK);


        img = new ImageIcon(Objects.requireNonNull(getClass().getResource("img1.png")));
        imgLabel = new JLabel(img);
        imgLabel.setBounds(85, 20, img.getIconWidth(), img.getIconHeight());
        container.add(imgLabel);

        textLabel = new JLabel("Enter any number:");
        textLabel.setBounds(20, 305, 250, 20);
        textLabel.setForeground(Color.MAGENTA);
        f = new Font("Roboto", Font.BOLD, 20);
        textLabel.setFont(f);
        container.add(textLabel);
        jf = new JTextField();
        jf.setBounds(230, 290, 120, 50);
        jf.setBackground(Color.YELLOW);
        jf.setFont(f);
        jf.setForeground(Color.RED);
        jf.setHorizontalAlignment(JTextField.CENTER);
        container.add(jf);
        cs = new Cursor(Cursor.HAND_CURSOR);
        jb = new JButton("Clear");
        jb.setBounds(240, 350, 90, 50);
        jb.setBackground(Color.BLUE);
        jb.setFont(f);
        jb.setForeground(Color.WHITE);
        jb.setCursor(cs);
        container.add(jb);
        jt = new JTextArea();
        jt.setBounds(55, 420, 380, 340);
        jt.setBackground(Color.RED);
        jt.setFont(f);
        jt.setForeground(Color.YELLOW);
        container.add(jt);
        jf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value = jf.getText();
                if (value.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter a number");
                } else {
                    jt.setText(" ");
                    int num = Integer.parseInt(jf.getText());
                    for (int i = 1; i <= 10; i++) {
                        int result = num * i;
                        String r = String.valueOf(result);
                        String n = String.valueOf(num);
                        String integer = String.valueOf(i);
                        jt.append(n + " X " + integer + " = " + r + "\n");

                    }
                }


            }
        });
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jt.setText("");
            }
        });

    }

    public static void main(String[] args) {


        Multiplication mt = new Multiplication();
        mt.setVisible(true);


    }


}
