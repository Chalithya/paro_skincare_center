package ui;
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.border.Border;


public class WelcomeScreen extends JFrame {

    public WelcomeScreen() {

        // set title and size
        setTitle("Hello");
        setSize(600, 600);

        JFrame frame = new JFrame();
        frame.add(new JButton("Enter"));

        Border border = BorderFactory.createLineBorder(new Color(94, 224, 241));

//        ImageIcon image = new ImageIcon("logo.jpg");
//        frame.setIconImage(image.getImage());



        // create components
        JLabel welcomeLabel = new JLabel("Welcome to Skin Consultation Centre!", JLabel.CENTER);
        welcomeLabel.setFont(new Font("Bree Serif", Font.BOLD, 28));
        welcomeLabel.setForeground(new Color(4, 133, 150));
        welcomeLabel.setBackground(new Color(175, 183, 183));
        welcomeLabel.setOpaque(true);
        welcomeLabel.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, new Color(4, 133, 150)));

//        JFrame frame = new JFrame();

        JButton button = new JButton();
//        button.setBounds(200,100,50,30);
        button.setText("Enter");
        button.setBounds(300, 330, 100, 30);
        button.setFocusable(false);

//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setLayout(null);
//        this.setSize(500,500);
//        this.setVisible(true);
        this.add(button);

//        frame.add(button);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(400,400);
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);

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