package hotel;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Hotel  {

    public static void main(String[] args) {
    Login frame=new Login();
    frame.setTitle("Hotel");
    frame.setSize(700, 600);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    
    
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int screenWidth = screenSize.width;
    int screenHeight = screenSize.height;

    Dimension frameSize = frame.getSize();
    int x = (screenWidth - frameSize.width) / 2;
    int y = (screenHeight - frameSize.height) / 2;
    

    frame.setLocation(x, y);
    frame.setVisible(true);
    }
    
}
