package src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerDemo extends JFrame {

      private Container c;
      private JTextField tf;
      private JTextArea jt;
      private Font f;

    KeyListenerDemo(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(450, 80, 560, 650);
        this.setResizable(false);
        this.setTitle("KeyListener Demo");
        this.initComponents();

    }
    public void initComponents(){
         c = this.getContentPane();
         c.setLayout(null);
         c.setBackground(Color.PINK);
         f = new Font("Serif", Font.BOLD+Font.ITALIC, 20);
         tf = new JTextField();
         tf.setBounds(50,50,180,50);
         tf.setBackground(Color.YELLOW);
         tf.setForeground(Color.RED);
         tf.setFont(f);
         c.add(tf);
         jt = new JTextArea();
         jt.setBounds(50,160,450,430);
         jt.setFont(f);
         jt.setForeground(Color.WHITE);
         jt.setBackground(Color.GREEN);
         c.add(jt);
         /*tf.addKeyListener(new KeyListener(){
             public void keyTyped(KeyEvent e) {
                 jt.append("Key Typed "+e.getKeyChar()+"\n");
             }

             @Override
             public void keyPressed(KeyEvent e) {
                 jt.append("Key Pressed "+e.getKeyChar()+"\n");

             }

             @Override
             public void keyReleased(KeyEvent e) {
                 jt.append("Key Released "+e.getKeyChar()+"\n");

             }
         });*/
         Handle handle = new Handle();
         tf.addKeyListener(handle);

    }

    class Handle implements KeyListener{
        public void keyPressed(KeyEvent e){
            jt.append("Key Pressed "+e.getKeyChar()+"\n");
        }
        public void keyReleased(KeyEvent e){
            jt.append("Key Released "+e.getKeyChar()+"\n");
        }
        public void keyTyped(KeyEvent e){
            jt.append("Key Typed "+e.getKeyChar()+"\n");
        }
    }


    public static void main(String[] args) {

        KeyListenerDemo demo = new KeyListenerDemo();
        demo.setVisible(true);


    }






}
