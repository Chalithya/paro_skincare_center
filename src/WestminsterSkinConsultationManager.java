import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class WestminsterSkinConsultationManager implements SkinConsultationManager {

    Doctor[] doctor = new Doctor[10];

    Scanner in = new Scanner(System.in);

    public void menu() {

        String userInput = "";
        System.out.println("Reading doctor data");
        readData();

        do {
            System.out.println("Welcome to WestminsterSkinConsultationManager");
            System.out.println("Place your requirement");
            System.out.println("Add a new doctor: a");
            System.out.println("Delete a doctor: d");
            System.out.println("Print the list of doctors: p");
            System.out.println("Save data in a file: s");
            System.out.println("Exit the menu: e");
            System.out.println("Enter the relevant letter and press enter: ");

            userInput = in.next();
            // in.nextInt();

            switch (userInput) {
                case "a":
                    addDoctor();
                    break;
                case "d":
                    deleteDoctor();
                    break;
                case "p":
                    printDoctors();
                    break;
                case "s":
                    saveDoctors();
                    break;
                case "q":
                    System.out.println("Exiting.....");
                    break;
                default:
                    System.out.println(">>>>>>>>Wrong input<<<<<<<<");

            }

        } while (!userInput.equals("q"));

    }

    public void addDoctor() {

        String name, surname, mobileNumber, medicalLicenceNumber, specialisation;

        System.out.println("..........Enter doctor's details..........>>>");
        System.out.println("Enter doctor's name: ");
        in.nextLine();
        name = in.nextLine();

        System.out.println("Enter doctor's surname: ");
        surname = in.nextLine();
        // surname = "sname";

        System.out.println("Enter doctor's mobile number: ");
        mobileNumber = in.nextLine();
        // mobileNumber = "07175663422";

        while (true) {

            System.out.println("Enter doctor's date of birth (yyyy/MM/DD): ");
            // Date dateOfBirth = new Date(in.nextLine());
            try {
                Date dateOfBirth = new Date(in.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Invalid date. Please try again.");
            }
        }
        // Date dateOfBirth = new Date("2021/12/12");

        System.out.println("Enter doctor's medical licence number: ");
        medicalLicenceNumber = in.nextLine();

        System.out.println("Enter doctor's specialisation: ");
        specialisation = in.nextLine();

        specialisation = "";
        for (int i = 0; i < doctor.length; i++) {
            if (doctor[i] == null) {
                Date dateOfBirth = null;
                doctor[i] = new Doctor(name, surname, mobileNumber, dateOfBirth, medicalLicenceNumber, specialisation);
                System.out.println("Doctor " + doctor[i].getName() + " added successfully");
                break;

            }
        }

    }

    public void deleteDoctor() {

        String medicalLicenceNumber = "";
        int availableDoctorsCount = 0;
        in.nextLine();
        System.out.println("Enter doctor's medical licence number: ");
        medicalLicenceNumber = in.nextLine();
        for (int i = 0; i < doctor.length; i++) {
            if (!(doctor[i] == null) && (doctor[i].getMedicalLicenceNumber().equals(medicalLicenceNumber))) {
                System.out.println("\n name: " + doctor[i].getName()
                        + "\n surname: " + doctor[i].getSurname()
                        + "\n mobile number: " + doctor[i].getMobileNumber()
                        + "\n medical licence number: " + doctor[i].getMedicalLicenceNumber()
                        + "\n specialisation: " + doctor[i].getSpecialisation()
                        + "\n is removed successfully...");
                doctor[i] = null;
                break;
            }
        }
        for (int i = 0; i < doctor.length; i++) {
            if (!(doctor[i] == null)) {
                availableDoctorsCount += 1;

            }
        }
        System.out.println("Available doctor count is:" + availableDoctorsCount);
    }

    // public void printAlphabeticalDoctors() {

    //     // Collections.sort(Arrays.asList(doctor), new Comparator<Doctor>() {

    //     Comparator<Doctor> nameAgeComparator = new NameComparator();
    //     Collections.sort(Arrays.asList(doctor), nameAgeComparator);

    //     System.out.println("Sorted people:");
    //     for (Person person : doctor) {
    //         System.out.println(person);
    //     }

    // }

    public void printDoctors() {

        for (int i = 0; i < doctor.length; i++) {
            if (!(doctor[i] == null))
                System.out.println(doctor[i].getFullName());
        }

    }

    public void saveDoctors() {
        try {
            FileWriter writer = new FileWriter("DoctorInfo.txt");

            writer.write("Doctors' information" + System.lineSeparator());
            writer.write(System.lineSeparator());

            for (int i = 0; i < doctor.length; i++) {
                if (!(doctor[i] == null)) {
                    writer.write("Name: " + doctor[i].getName()
                            + ", Surname: " + doctor[i].getSurname()
                            + ", Mobile Number: " + doctor[i].getMobileNumber()
                            + ", Date of Birth: "
                            + ", Medical Licence Number: " + doctor[i].getMedicalLicenceNumber()
                            + ", Specialization: " + doctor[i].getSpecialisation() + System.lineSeparator());
                }
            }

            writer.close();
            System.out.println("Data stored successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    ////////////////// this class is used to crerate dummy doctos

    public void createDummyDocs(int count) {

        Date dateOfBirth = new Date("2022/12/12");
        for (int i = 0; i < count; i++) {
            doctor[i] = new Doctor("Doctor " + i, "surname " + i, "0000" + i, dateOfBirth, "0000" + i,
                    "specialisation " + i);
        }

        System.out.println("Created doctors");

        for (int i = 0; i < count; i++) {
            System.out.println(doctor[i].getFullName());
        }

    }

    public void readData() {

        try {
            FileReader fr = new FileReader("DoctorInfo.txt");
            BufferedReader br = new BufferedReader(fr);

            // Read the data from the file
            br.readLine();
            br.readLine();
            String userInput;
            int count = 0;
            Date dob = new Date();
            while ((userInput = br.readLine()) != null) {
                String[] userInputParts = userInput.replaceAll("\\s", "").split(",|:");

                // set dob if the date is null in the file
                if (userInputParts[7] == null) {
                    dob = new Date("0000/00/00");
                }
                doctor[count] = new Doctor(userInputParts[1], userInputParts[3], userInputParts[5], dob,
                        userInputParts[9], userInputParts[11]);
                count += 1;
            }

            br.close();
            System.out.println("Data reading completed...");
        } catch (IOException e) {
            System.out.println("Unnable to read file: DoctorInfo.txt");
            e.printStackTrace();
        }

    }

}
