import java.util.Date;

public class Person {

        private String name, surname, mobileNumber;
        private Date dateOfBirth;

        //Defalt constructor
        public Person(String name, String surname, String mobileNumber, Date dateOfBirth){
            this.name = name;
            this.surname = surname;
            this.mobileNumber = mobileNumber;
            this.dateOfBirth = dateOfBirth;
        }

        public String getName(){
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname(){
            return surname;
        }

        public void setSurname(String surname){
            this.surname = surname;
        }

        public String getMobileNumber(){
            return mobileNumber;
        }

        public void setMobileNumber(String mobileNumber){
            this.mobileNumber = mobileNumber;
        }

        public Date getDateOfBirth(){
            return dateOfBirth;
        }

        public void setDateOfBirth(Date dateOfBirth){
            this.dateOfBirth = dateOfBirth;
        }

        //Additional methods
        public String getFullName(){
            return name + " " + surname;
        }

//        public Date getAge(){
//            return dateOfBirth;
//        }
}

