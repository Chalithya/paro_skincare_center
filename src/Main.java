import java.util.Date;

import ui.PatientForm;
public class Main {
    public static void main(String[] args) {

        // Date dateOfBirth = new Date("2021/10/11");

        WestminsterSkinConsultationManager wsm = new WestminsterSkinConsultationManager();
        // // wsm.menu();
        wsm.readData();
        // wsm.getAllDoctors();
        // wsm.printDoctors();
        // wsm.printAlphabeticalDoctors();
        
    //    Doctor d = new Doctor("String name","String surname","String mobileNumber",date,"medicalLicenceNumber","specialisation");
    //    wsm.addDoctor();

            // wsm.createDummyDocs(3);
            // wsm.storeData();
            // wsm.readData();
            // wsm.printDoctors();
            // wsm.deleteDoctor();
            // wsm.printDoctors();

            // Frontend only...................................................................................
            new UiWelcomeScreen(wsm.getAllDoctors());
            // new DoctorTable();
            // new DoctorTable(wsm.getAllDoctors());

    }

}
