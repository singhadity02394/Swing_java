 import javax.swing.*;
import java.awt.*;

public class Button{
    public static void main(String[] args){
        JFrame frame = new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit button work
      
        frame.setBounds(100,100,1000,500);//set size and location
   
       

        Container c = frame.getContentPane();
        c.setLayout(null);

        JButton btn = new JButton();
        btn.setSize(100,30);
        btn.setLocation(100,100);
        btn.setText("Ok");
        btn.setForeground(Color.RED);
        btn.setBackground(Color.YELLOW);
        c.add(btn);

        Cursor cur = new Cursor(Cursor.HAND_CURSOR);
        btn.setCursor(cur);




        frame.setVisible(true);
    
}
    }

