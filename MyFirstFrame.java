import javax.swing.*;
import java.awt.*;//import color 
class MyFirstFrame{
public static void main(String[] args){
     JFrame frame = new JFrame();
     frame.setVisible(true);//screen visible
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit button work
    /*  frame.setSize(700,500);//set size
     frame.setLocation(100,50);//frame location
     */
     frame.setBounds(100,50,1000,500);//set size and location

     frame.setTitle( "First Frame");
     //image icon set
     ImageIcon icon = new ImageIcon("img.jpg");
     frame.setIconImage(icon.getImage());

     //background color set

     Container c = frame.getContentPane();
     //Color cl = new Color(255,0,0);
     c.setBackground(Color.RED);

     frame.setResizable(false);




}


}