import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;

public class UiWelcomeScreen extends JFrame {

    public UiWelcomeScreen(List<Doctor> doctors) {

        // set title and size
        setTitle("Welcome Screen");
        setSize(600, 300);
        setLocationRelativeTo(null);
        // create components
        // welcome label
        JLabel welcomeLabel = new JLabel("Welcome to Westminister Skin Consultation!", JLabel.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.PLAIN, 24));
        welcomeLabel.setForeground(new Color(0, 0, 0));

        // Create a new GridLayout with 4 rows and 1 column
        GridLayout layout = new GridLayout(4, 1);
    
        // Set the layout of the frame to the GridLayout
        setLayout(layout);

        // doctor table button
        // create a JButton
        JButton docTablebutton = new JButton("Doctors List");
        JButton docBookingbutton = new JButton("Consultaion");

        // ActionListener for the docTablebutton button to load table
        docTablebutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new UiDoctorTable(doctors);
                // myTable.setVisible(true);
            }
        });

          // ActionListener for the docBookingbutton button to load table
          docBookingbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new UiUserDetailsForm(doctors);
                // myTable.setVisible(true);
            }
        });

        // add components to the frame
        add(welcomeLabel, BorderLayout.NORTH);
        add(docTablebutton);
        add(docBookingbutton);

        // set visibility
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    // public static void main(String[] args){
    // new WelcomeScreen();
    // }
}