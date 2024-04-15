import javax.swing.*;

public class jFrameHandle extends JFrame{



    public static void main(String[] args){


        jFrameHandle frame = new jFrameHandle();

        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       // frame.setSize(600,800);

        //frame.setLocationRelativeTo(null);
        //frame.setLocation(200,50);
        frame.setBounds(200,50,600,300);

        String str = "My new window";
        frame.setTitle(str);
        frame.setResizable(false);








    }








}
