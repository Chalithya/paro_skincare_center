import java.util.Date;
public class Consultaion extends Person{

    private Date dateTime;
    public double cost;
    public String notes;

    public Consultaion(String name, String surname, String mobileNumber, Date dateOfBirth, Date dateTime, double cost, String notes){
        super(name, surname, mobileNumber, dateOfBirth);
        this.dateTime = dateTime;
        this.cost = cost;
        this.notes = notes;
    }

    private Date getDateTime(){
        return dateTime;
    }

    private void setDateTime(Date dateTime){
        this.dateTime = dateTime;
    }

    public double getCost(){
        return cost;
    }

    public void setCost(double cost){
        this.cost = cost;
    }

    public String getNotes(){
        return notes;
    }

    public void setNotes(String notes){
        this.notes = notes;
    }




}

