import java.util.Date;
public class Patient extends Person{

    private String patientId;

    public Patient(String name, String surname, String mobileNumber, Date dateOfBirth, String patientId){
        super(name, surname, mobileNumber, dateOfBirth);
        this.patientId = patientId;
    }

    private String getId(){
        return patientId;
    }

    private void setId(String id){
        this.patientId = patientId;
    }
}
