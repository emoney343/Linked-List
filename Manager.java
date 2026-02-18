import java.util.LinkedList;

public class Manager {
    private LinkedList<Obj> person = new LinkedList<>();

    public LinkedList<Obj> addEntry(String name, String phone) {
        person.add(new Obj(name, phone));

         return person;
    }

}
