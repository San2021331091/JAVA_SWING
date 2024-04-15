package src;
import javax.swing.*;
import java.awt.*;
/*import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;*/
import java.util.Objects;

public class jComboBox extends JFrame {
   private JComboBox comboBox;
   private ImageIcon icon;
   private Container c;
   private String [] programming_languages = {"Java", "C#", "Python", "C++","Pascal", "JavaScript","PHP","Kotlin","Groovy","Ruby","Dart","Prolog"};
   private JLabel jLabel;
   private Font f;
   private JButton jb;

    jComboBox(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(450, 80, 560, 650);
        this.setResizable(false);
        this.setTitle("JComboBox Demo");
        this.initComponents();

    }

     public void initComponents(){

        c = this.getContentPane();
        c.setBackground(Color.PINK);
        c.setLayout(null);
        icon = new ImageIcon(Objects.requireNonNull(getClass().getResource("win.png")));
        this.setIconImage(icon.getImage());
        f = new Font("Serif", Font.BOLD + Font.ITALIC, 20);
        comboBox = new JComboBox(programming_languages);
        comboBox.setBounds(50,100,150,50);
        comboBox.setEditable(true);
        c.add(comboBox);
        jLabel = new JLabel();
        jLabel.setBounds(50,230,400,50);
        jLabel.setFont(f);
        jLabel.setForeground(Color.BLUE);
      //  comboBox.setSelectedIndex(5);
         //comboBox.setSelectedItem("Python");
         comboBox.addItem("Fortran");
         comboBox.addItem("Go");
         comboBox.addItem("Visual Basic");
        // comboBox.removeItem("C++");
         //comboBox.removeItemAt(4);
         //comboBox.removeAllItems();
         //jLabel.setText("Total Items: "+comboBox.getItemCount());
           c.add(jLabel);
           jb = new JButton("Show Me: ");
           jb.setBounds(50,200,150,30);
           jb.setFont(f);
           jb.setForeground(Color.WHITE);
           jb.setBackground(Color.BLUE);
           c.add(jb);
           /*--jb.addActionListener(new ActionListener(){
               @Override
               public void actionPerformed(ActionEvent e) {
               String s = comboBox.getSelectedItem().toString();
                 jLabel.setText("You have selected "+s);
               }
           });--*/
         comboBox.addItemListener(e -> {
             String s = comboBox.getSelectedItem().toString();
             jLabel.setText("You have selected "+s);
         });
     }

    public static void main(String[] args) {

        jComboBox frame = new jComboBox();
        frame.setVisible(true);

    }

}
