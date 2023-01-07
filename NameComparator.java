import java.util.Comparator;

public class NameComparator implements Comparator<Doctor> {

    @Override
    public int compare(Doctor o1, Doctor o2) {
        System.out.println(o1.getSurname().compareTo(o2.getSurname()));
        return o1.getSurname().compareTo(o2.getSurname());
    }
    
}
