package src;
import javax.swing.*;
import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Objects;


public class jCheckBox extends JFrame {
    private Container c;
    private ImageIcon icon;
    private JCheckBox javaCheckBox,cCheckbox,cppCheckbox;
    private ButtonGroup bg;
    private Font font;
    private JLabel jb;

    jCheckBox(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setBounds(450, 30, 560, 650);
        this.setResizable(false);
        this.setTitle("JCheckBox Demo");
        this.initComponents();
    }

    public void initComponents(){
      c = this.getContentPane();
      c.setBackground(Color.YELLOW);
      icon = new ImageIcon(Objects.requireNonNull(getClass().getResource("win.png")));
      this.setIconImage(icon.getImage());
      bg = new ButtonGroup();
      javaCheckBox = new JCheckBox("Java");
      font = new Font("Aerial",Font.BOLD + Font.ITALIC,24);
      javaCheckBox.setBounds(50,100,100,30);
      javaCheckBox.setBackground(Color.YELLOW);
      javaCheckBox.setForeground(Color.GREEN);
      javaCheckBox.setFont(font);
      c.add(javaCheckBox);
       cCheckbox = new JCheckBox("C");
        cCheckbox.setBounds(50,160,100,30);
        cCheckbox.setBackground(Color.YELLOW);
        cCheckbox.setForeground(Color.GREEN);
        cCheckbox.setFont(font);
        //cCheckbox.setSelected(true);
        c.add(cCheckbox);

        cppCheckbox = new JCheckBox("Cpp",true);
        cppCheckbox.setBounds(50,220,100,30);
        cppCheckbox.setBackground(Color.YELLOW);
        cppCheckbox.setFont(font);
        cppCheckbox.setForeground(Color.GREEN);
        c.add(cppCheckbox);
        bg.add(javaCheckBox);
        bg.add(cCheckbox);
        bg.add(cppCheckbox);

        jb = new JLabel("You have not selected anything yet.");
        jb.setForeground(Color.RED);
        jb.setBounds(50,290,300,30);
        c.add(jb);
        Handle handle = new Handle();
        /*-----
       javaCheckBox.addActionListener(handle);

        cCheckbox.addActionListener(handle);
        cppCheckbox.addActionListener(handle);
        ------
         */
        javaCheckBox.addItemListener(handle);
        cCheckbox.addItemListener(handle);
        cppCheckbox.addItemListener(handle);
    }

/*-----------------
    class Handle implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(javaCheckBox.isSelected()){
                jb.setText("You have selected Java.");

            }
            else if(e.getSource()==cCheckbox){
                jb.setText("You have selected C.");
            }
            else{
                jb.setText("You have selected Cpp.");
            }

        }
    }

 -------------------*/

    class Handle implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent ie) {
         if(ie.getSource()==javaCheckBox){
             jb.setText("You have selected Java.");
         }
         else if(ie.getSource()==cCheckbox){
             jb.setText("You have selected C.");
         }
         else{
             jb.setText("You have selected Cpp.");
         }

        }
    }

    public static void main(String[] args) {

      jCheckBox frame = new jCheckBox();
      frame.setVisible(true);

    }

}
