package src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class VowelCountListener extends JFrame {
    private Container c;
    private Font f;
    private JLabel jlabel,vowelLabel,aLabel,iLabel,eLabel,oLabel,uLabel;
    private JTextArea jf;
    private JScrollPane js;
    private int totalVowel = 0;
    private int l_a = 0;
    private int l_e = 0;
    private int l_i = 0;
    private int l_o = 0;
    private int l_u = 0;



    VowelCountListener(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(450, 30, 660, 750);
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
       Handle handle = new Handle();
       jf.addKeyListener(handle);
    }


    class Handle implements KeyListener{


        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {

          if(e.getSource()==jf){


              if(e.VK_A == e.getKeyCode()){

                  l_a++;
                  totalVowel++;
              }
              if(e.VK_E == e.getKeyCode()){
                  l_e++;
                  totalVowel++;
              }
                if(e.VK_I == e.getKeyCode()){
                  l_i++;
                  totalVowel++;
              }
                if(e.VK_O == e.getKeyCode()){
                  l_o++;
                  totalVowel++;
              }
                if(e.VK_U == e.getKeyCode()){
                  l_u++;
                  totalVowel++;
              }
                vowelLabel.setText("Total number of vowels: "+totalVowel);

             aLabel.setText("Total number of a: "+l_a);
             eLabel.setText("Total number of e: "+l_e);
             iLabel.setText("Total number of i: "+l_i);
             oLabel.setText("Total number of o: "+l_o);
             uLabel.setText("Total number of u: "+l_u);

          }
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }
    public static void main(String[] args) {
        VowelCountListener frame = new VowelCountListener();
        frame.setVisible(true);

    }
}
