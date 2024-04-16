import javax.swing.*;
import java.awt.*;
public class MyLable {

    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setVisible(true);//screen visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit button work
       /*  frame.setSize(700,500);//set size
        frame.setLocation(100,50);//frame location
        */
        frame.setBounds(100,50,1000,500);//set size and location
   
        frame.setTitle( "Lable");

        Container c = frame.getContentPane();
        c.setLayout(null);
        // JLabel label = new JLabel("user name");
        // label.setBounds(100,50,130,30);
        // Font font = new Font("Arial",Font.BOLD,20);
        // label.setFont(font);
        //c.add(label);

        //imageset on label
        // ImageIcon icon = new ImageIcon("img.jpg");
        // JLabel label = new JLabel(icon);
        //  label.setBounds(100,50,icon.getIconWidth(),icon.getIconHeight());
        //  c.add(label);

        ImageIcon icon = new ImageIcon("img.jpg");
         JLabel label = new JLabel("Text",icon,JLabel.CENTER);
         label.setBounds(0,100,200,100);
         c.add(label);

         




    
}
}
