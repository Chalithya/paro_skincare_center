import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UiUserDetailsForm extends JFrame implements ActionListener {
    // /name, surname, date of birth, mobile number, id
    JLabel headerLabel, nameLabel, emaileLabel, l4, l5, surnameLabel, dobLabel, mobiLabel, nicLabel, doctorLabel,
            dateLabel, feeLabel, noteLabel;
    JTextField nameField, emailField, tf3, tf4, surnameField, dobField, mobileField, nicField, dateField, feeField,
            noteField;
    JButton submitButton;
    JComboBox<String> doctorPicker;
    JCheckBox firsttimeCheck;

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
        feeLabel = new JLabel("Your fees per hour: £");
        noteLabel = new JLabel("Add a note or image:");

        nameField = new JTextField();
        surnameField = new JTextField();
        dobField = new JTextField(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
        mobileField = new JTextField();
        nicField = new JTextField();
        dateField = new JTextField(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
        doctorPicker = new JComboBox<>();
        firsttimeCheck = new JCheckBox("Check this it this is 1st time");
        feeField = new JTextField("25");
        feeField.disable();
        noteField = new JTextField();

        for (Doctor doctor : doctors) {
            if (doctor != null) {
                doctorPicker.addItem(doctor.getName());
            }
        }

        submitButton = new JButton("Submit");

        headerLabel.setBounds(100, 30, 400, 20);
        nameLabel.setBounds(80, 70, 200, 20);
        surnameLabel.setBounds(80, 110, 200, 20);
        dobLabel.setBounds(80, 150, 200, 20);
        mobiLabel.setBounds(80, 190, 200, 20);
        nicLabel.setBounds(80, 230, 200, 20);
        doctorLabel.setBounds(80, 270, 200, 20);
        dateLabel.setBounds(80, 310, 200, 20);
        firsttimeCheck.setBounds(160, 350, 200, 20);
        feeLabel.setBounds(80, 390, 200, 20);
        noteLabel.setBounds(80, 420, 200, 20);

        nameField.setBounds(220, 70, 200, 20);
        surnameField.setBounds(220, 110, 200, 20);
        dobField.setBounds(220, 150, 200, 20);
        mobileField.setBounds(220, 190, 200, 20);
        nicField.setBounds(220, 230, 200, 20);
        doctorPicker.setBounds(220, 270, 200, 20);
        dateField.setBounds(220, 310, 200, 20);
        feeField.setBounds(220, 390, 200, 20);
        noteField.setBounds(220, 420, 200, 20);
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
        add(dateLabel);
        add(dateField);
        add(firsttimeCheck);
        add(feeLabel);
        add(feeField);
        add(noteLabel);
        add(noteField);

        add(submitButton);

        submitButton.addActionListener(this);
        submitButton.setEnabled(false);
        // CheckBoxListener
        firsttimeCheck.addActionListener(this);

        // if(nameField.getText().trim().length() > 0 ){
        // submitButton.setEnabled(true);
        // }
        // ItemListener itemListener = new ItemListener() {
        // public void itemStateChanged(ItemEvent itemEvent) {
        // // handle item state changed event
        // if (itemEvent.getStateChange() == ItemEvent.SELECTED) {
        // JTextField textField = (JTextField) itemEvent.getItem();
        // // check if textfield is empty
        // if (textField.getText().isEmpty()) {
        // // handle empty text field
        // System.out.println("Empty");
        // }
        // }
        // }
        // };

        FocusListener focusListner = new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (!(nameField.getText().isEmpty() ||
                        surnameField.getText().isEmpty() ||
                        dobField.getText().isEmpty() ||
                        mobileField.getText().isEmpty() ||
                        nicField.getText().isEmpty() ||
                        dateField.getText().isEmpty() ||
                        feeField.getText().isEmpty() ||
                        feeField.getText().isEmpty())) {
                    submitButton.setEnabled(true);
                } else {
                    submitButton.setEnabled(false);

                }

            }

            public void focusLost(FocusEvent e) {
            }
        };

        // nameField.getText().isEmpty() &&
        // surnameField.getText().isEmpty() &&
        // dobField.getText().isEmpty() &&
        // mobileField.getText().isEmpty() &&
        // nicField.getText().isEmpty() &&
        // dateField.getText().isEmpty() &&
        // feeField.getText().isEmpty() &&
        // firsttimeCheck.isEmpty()

        nameField.addFocusListener(focusListner);
        surnameField.addFocusListener(focusListner);
        dobField.addFocusListener(focusListner);
        mobileField.addFocusListener(focusListner);
        nicField.addFocusListener(focusListner);
        doctorPicker.addFocusListener(focusListner);
        dateField.addFocusListener(focusListner);
        feeField.addFocusListener(focusListner);
        noteField.addFocusListener(focusListner);
    }

    // public void focusGained(FocusEvent e) {
    // System.out.println("Fo");
    // }
    // public void itemStateChanged(ItemEvent e) {
    // // If the checkbox is checked, set the jTextField's value
    // if (e.getStateChange() == ItemEvent.SELECTED) {
    // feeField.setText("£25");
    // } else {
    // feeField.setText("£15");
    // }
    // }
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
        if (!firsttimeCheck.isSelected()) {
            feeField.setText("25");
        } else {
            feeField.setText("15");
        }
        showData();
    }

    public void showData() {

        UiFunctions uif = new UiFunctions();
        WestminsterSkinConsultationManager wsm = new WestminsterSkinConsultationManager();

        String originalString = "textToEncrypt";
        String secretKey = "SecretKey";

        String name = nameField.getText();
        String surname = surnameField.getText();
        Date dob = new Date(dobField.getText());
        String mobile = mobileField.getText();
        String nic = nicField.getText();
        Date date = new Date(dateField.getText());
        Double fees = Double.parseDouble(feeField.getText());
        Boolean firstTime = firsttimeCheck.isSelected();

        String encryptedString = uif.encrypt(noteField.getText(), secretKey);

        wsm.createConsultation(name, surname, mobile, dob, date, fees, encryptedString);
        wsm.getAllConsultaions();
        System.out.println("Name: " + name);
        System.out.println("surname: " + surname);
        System.out.println("mobile: " + mobile);
        System.out.println("nic: " + nic);
        System.out.println("date: " + date);
        System.out.println("dob: " + dob);
        System.out.println("fees: " + fees);
        System.out.println("note: " + encryptedString);
        System.out.println("firstTime: " + firstTime);
    }

    // public static void main(String args[]) {
    // new UiUserDetailsForm();
    // }
}