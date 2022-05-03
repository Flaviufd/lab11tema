import java.util.ArrayList;
import java.util.List;

public class Company {
    List<Person> persons = new ArrayList<>();

    public Object getManager() {
        for (Person p : persons) {
            if (p.getPosition().equals("manager")) {
                return p;
            }
        }
        return null;
    }
}
