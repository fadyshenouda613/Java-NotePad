import javax.swing.*;
import java.awt.*;

public class About extends JFrame{


    About(){
        setTitle("About NotePad Application");
        setBounds(100, 100, 500, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);
        ImageIcon icon = new ImageIcon(getClass().getResource("notepad.png"));
        setIconImage(icon.getImage());


        JLabel iconLabel= new JLabel(new ImageIcon(getClass().getResource("windows.png")));
        iconLabel.setBounds(150, 40, 400, 80);
        add(iconLabel);

        JLabel textLabel = new JLabel("<html>Notepad<br>Conventional Notepad Version<br> All rights reserved<br><br>This Program was developed by: Fady Shenouda <br></html>");
        textLabel.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
        textLabel.setBounds(150, 130, 500, 300);
        add(textLabel);
    }

    public static void main(String[] args){
        new About().setVisible(true);
    }
}
