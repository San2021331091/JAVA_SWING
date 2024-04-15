import javax.swing.*;
import java.awt.*;

public class TextAreaDemo extends JFrame {

    private Container c;
    private JTextArea jt;

    private Font f;

    private JScrollPane js;

    TextAreaDemo(){


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,50,900,600);
        this.setTitle("Text Area Demo");
        setResizable(false);
        initComponents();


    }


    public void initComponents(){

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        jt = new JTextArea("What's your comment");
        jt.setBackground(Color.RED);
        jt.setForeground(Color.white);
        f = new Font("Aerial",Font.BOLD|Font.ITALIC,20);
        jt.setLineWrap(true);
        jt.setWrapStyleWord(true);
        js = new JScrollPane(jt,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        js.setBounds(150,50,600,200);
        jt.setFont(f);
        c.add(js);

    }
    public static void main(String [] args){


        TextAreaDemo frame = new TextAreaDemo();
        frame.setVisible(true);






    }







}
