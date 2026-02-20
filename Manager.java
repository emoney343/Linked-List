import java.util.LinkedList;

public class Manager {
    private LinkedList<Obj> person = new LinkedList<>();

    public void addEntry(String name, String phone) {
        person.add(new Obj(name, phone));

    }

    public void printAll() {
        for (Obj o: person){
            System.out.println(o);
        }
    }

}
