import java.util.Date;

public class Doctor extends Person{

    private String medicalLicenceNumber, specialisation;

    public Doctor(String name, String surname, String mobileNumber, Date dateOfBirth, String medicalLicenceNumber, String specialisation ){
        super(name, surname, mobileNumber, dateOfBirth);
        this.medicalLicenceNumber = medicalLicenceNumber;
        this.specialisation = specialisation;
    }

    public String getMedicalLicenceNumber(){
        return medicalLicenceNumber;
    }

    public void setMedicalLicenceNumber(String medicalLicenceNumber){
        this.medicalLicenceNumber = medicalLicenceNumber;
    }

    public String getSpecialisation(){
        return specialisation;
    }

    public void setSpecialisation(String specialisation){
        this.specialisation = specialisation;
    }
}
