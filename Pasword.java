import javax.swing.*;
import java.awt.*;

public class Pasword{
    public static void main(String[] args){
        JFrame frame = new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit button work
      
        frame.setBounds(100,100,1000,500);//set size and location
   
        frame.setTitle( "pass");

        Container c = frame.getContentPane();
        c.setLayout(null);

        JPasswordField pass = new JPasswordField();
        pass.setBounds(100,50,120,30);
        c.add(pass);


        pass.setEchoChar('*');
        //password show
        pass.setEchoChar((char)0);



        



        
        



        frame.setVisible(true);
    

    
      }
}
