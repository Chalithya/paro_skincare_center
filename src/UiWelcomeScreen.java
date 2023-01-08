import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;

public class UiWelcomeScreen extends JFrame {

    public UiWelcomeScreen(List<Doctor> doctors) {

        // set title and size
        setTitle("Welcome Screen");
        setSize(600, 600);
        setLocationRelativeTo(null);


        // create components
        // welcome label
        JLabel welcomeLabel = new JLabel("Welcome to Skin Consultation Centre!", JLabel.CENTER);
        welcomeLabel.setFont(new Font("Bree Serif", Font.BOLD, 28));
        welcomeLabel.setForeground(new Color(4, 133, 150));
        welcomeLabel.setBackground(new Color(175, 183, 183));
        welcomeLabel.setOpaque(true);
        welcomeLabel.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, new Color(4, 133, 150)));

        // Create a new GridLayout with 4 rows and 1 column
        GridLayout layout = new GridLayout(3, 1);

        // Set the layout of the frame to the GridLayout
        setLayout(layout);;

        // doctor table button
        // create a JButton
        JButton docTablebutton = new JButton("Doctors List");
        JButton docBookingbutton = new JButton("Patient Form");

        docTablebutton.setBounds(300, 330, 100, 30);

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