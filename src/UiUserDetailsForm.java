import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.List;
import java.util.ArrayList;
// import org.jdatepicker.JDatePicker;

public class UiUserDetailsForm extends JFrame implements ActionListener {
    // /name, surname, date of birth, mobile number, id
    JLabel headerLabel, nameLabel, emaileLabel, l4, l5, surnameLabel, dobLabel, mobiLabel, nicLabel, doctorLabel,
            dateLabel;
    JTextField nameField, emailField, tf3, tf4, surnameField, dobField, mobileField, nicField;
    JButton submitButton;
    JComboBox<String> doctorPicker;
//    JDatePicker datePicker = new JDatePicker();


    UiUserDetailsForm(List<Doctor> doctors) {
        setVisible(true);
        setSize(700, 700);
        setLayout(null);
        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Consultaions");
        setLocationRelativeTo(null);

        headerLabel = new JLabel("Consultation Details Form");
        headerLabel.setForeground(Color.blue);
        headerLabel.setFont(new Font("Serif", Font.BOLD, 20));

        nameLabel = new JLabel("Name:");
        surnameLabel = new JLabel("Surname:");
        dobLabel = new JLabel("Date of Birth:");
        mobiLabel = new JLabel("Mobile No.");
        nicLabel = new JLabel("NIC:");
        doctorLabel = new JLabel("Select the Doctor:");
        dateLabel = new JLabel("Select the Date:");

        nameField = new JTextField();
        surnameField = new JTextField();
        dobField = new JTextField();
        mobileField = new JTextField();
        nicField = new JTextField();

        doctorPicker = new JComboBox<>();

        for (Doctor doctor : doctors) {

            if (doctor != null) {
                doctorPicker.addItem(doctor.getName());
            }
        }
        // emaileLabel = new JLabel("Email-ID:");
        // l4 = new JLabel("Create Passowrd:");
        // l5 = new JLabel("Confirm Password:");
        // emailField = new JTextField();
        // p1 = new JPasswordField();
        // tf3 = new JTextField();
        submitButton = new JButton("Submit");

        headerLabel.setBounds(100, 30, 400, 20);
        nameLabel.setBounds(80, 70, 200, 20);
        surnameLabel.setBounds(80, 110, 200, 20);
        dobLabel.setBounds(80, 150, 200, 20);
        mobiLabel.setBounds(80, 190, 200, 20);
        nicLabel.setBounds(80, 230, 200, 20);
        doctorLabel.setBounds(80, 270, 200, 20);
        dateLabel.setBounds(80, 310, 200, 20);

        nameField.setBounds(220, 70, 200, 20);
        surnameField.setBounds(220, 110, 200, 20);
        dobField.setBounds(220, 150, 200, 20);
        mobileField.setBounds(220, 190, 200, 20);
        nicField.setBounds(220, 230, 200, 20);
        doctorPicker.setBounds(220, 270, 200, 20);
        // nameLabel.setBounds(80, 70, 200, 30);
        // emaileLabel.setBounds(80, 110, 200, 30);
        // l4.setBounds(80, 150, 200, 30);
        // l5.setBounds(80, 190, 200, 30);
        // nameField.setBounds(300, 70, 200, 30);
        // emailField.setBounds(300, 110, 200, 30);
        // p1.setBounds(300, 150, 200, 30);
        // tf3.setBounds(300, 190, 200, 30);
        submitButton.setBounds(150, 500, 100, 30);

        add(headerLabel);
        add(nameLabel);
        add(nameField);
        add(surnameLabel);
        add(surnameField);
        add(dobLabel);
        add(dobField);
        add(mobiLabel);
        add(mobileField);
        add(nicLabel);
        add(nicField);
        add(doctorLabel);
        add(doctorPicker);

        add(submitButton);

        submitButton.addActionListener(this);

        // getAllDoctorNames(doctors);
    }

    
    // public static String[] getAllDoctorNames(List<Doctor> doctors) {
    // List<Doctor> names = new ArrayList<>();
    // for (Doctor doc : doctors) {
    // String name = doc.getName().toString();
    // names.add(name);
    // }

    // System.out.println("List "+names);
    // return names.toArray(new String[names.size()]);
    // }

    public void actionPerformed(ActionEvent e) {
        showData();
    }

    public void showData() {
        String name = nameField.getText();
        // String email = emailField.getText();
        // String pass = p1.getText();
        // String cpass = tf3.getText();

        System.out.println("Name: " + name);
        // System.out.println("Email-ID: " + email);
        // System.out.println("Create Password: " + pass);
        // System.out.println("Confirm Password: " + cpass);
    }

    // public static void main(String args[]) {
    // new UiUserDetailsForm();
    // }
}