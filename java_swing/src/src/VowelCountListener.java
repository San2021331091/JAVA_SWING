package src;
import javax.swing.*;
import java.awt.*;

public class VowelCountListener extends JFrame {
    private Container c;
    private Font f;
    private JLabel jlabel,vowelLabel,aLabel,iLabel,eLabel,oLabel,uLabel;
    private JTextArea jf;
    private JScrollPane js;

    VowelCountListener(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(450, 30, 660, 650);
        this.setResizable(false);
        this.setTitle("Vowel Count ");
        this.initComponents();
    }

    public void initComponents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);
        f = new Font("Poppins", Font.BOLD, 20);
        jlabel = new JLabel("Enter the text:");
        jlabel.setBounds(50,50,300,30);
        jlabel.setFont(f);
        jlabel.setForeground(Color.WHITE);
        c.add(jlabel);
        jf = new JTextArea();
        jf.setLineWrap(true);
        jf.setWrapStyleWord(true);
        js = new JScrollPane(jf);
        js.setBounds(200,50,400,100);
        c.add(js);
        vowelLabel = new JLabel();
        vowelLabel.setBounds(150,190,300,30);
        vowelLabel.setFont(f);
        c.add(vowelLabel);
        aLabel = new JLabel();
        aLabel.setBounds(150,270,300,30);
        aLabel.setFont(f);
        c.add(aLabel);
        eLabel = new JLabel();
        eLabel.setBounds(150,360,300,30);
        eLabel.setFont(f);
        c.add(eLabel);
        iLabel = new JLabel();
        iLabel.setBounds(150,450,300,30);
        iLabel.setFont(f);
        c.add(iLabel);
        oLabel = new JLabel();
        oLabel.setBounds(150,540,300,30);
        oLabel.setFont(f);
        c.add(oLabel);
        uLabel = new JLabel();
        uLabel.setBounds(150,640,300,30);
        uLabel.setFont(f);
        c.add(uLabel);
    }
    public static void main(String[] args) {
        VowelCountListener frame = new VowelCountListener();
        frame.setVisible(true);

    }
}
