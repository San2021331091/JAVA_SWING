import javax.swing.*;

public class WindowHandle {


    public static  void  main(String [] args) {



        int choice = JOptionPane.showConfirmDialog(null,"Do you want to exit","Exit",JOptionPane.YES_NO_CANCEL_OPTION);
        
        if(choice == JOptionPane.YES_OPTION)
            System.exit(0);

      else if(choice == JOptionPane.NO_OPTION)
          JOptionPane.showMessageDialog(null,"You have entered no option","Warning",JOptionPane.WARNING_MESSAGE);
      else
            JOptionPane.showMessageDialog(null,"You have entered cancel option","Warning",JOptionPane.WARNING_MESSAGE);








    }



}
