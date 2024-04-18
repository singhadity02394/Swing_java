import javax.swing.*;
import java.awt.*;


public class TextBox {
public static void main(String[] args){
        JFrame frame = new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit button work
       /*  frame.setSize(700,500);//set size
        frame.setLocation(100,50);//frame location
        */
        frame.setBounds(100,50,1000,500);//set size and location
   
        frame.setTitle( "TextBoox");

        Container c = frame.getContentPane();
        c.setLayout(null);
    

        //text field
        JTextField t1 = new JTextField();
        t1.setBounds(100,50,120,30);
        c.add(t1);


        t1.setText("Aditya");

        Font font = new Font("Arial",Font.BOLD,25);
        t1.setFont(font);

        t1.setForeground(Color.BLUE);
        t1.setBackground(Color.CYAN);

        frame.setVisible(true);//screen visible

} 
}
