package ui;
import javax.swing.*;
import java.awt.*;

public class WelcomeScreen extends JFrame {

    public WelcomeScreen() {

        // set title and size
        setTitle("Welcome Screen");
        setSize(450, 300);

        // create components
        JLabel welcomeLabel = new JLabel("Welcome to Westminister Skin Consultation!", JLabel.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.PLAIN, 24));
        welcomeLabel.setForeground(new Color(0, 0, 0));

        // add components to the frame
        add(welcomeLabel, BorderLayout.CENTER);

        // set visibility
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    // public static void main(String[] args){
    //     new WelcomeScreen();
    // }
}