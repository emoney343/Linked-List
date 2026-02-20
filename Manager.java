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

          public boolean removeEntry(String nameToRemove) {
            for (int i = 0; i < person.size(); i++) {
                if (person.get(i).getName().equalsIgnoreCase(nameToRemove)) {
                    person.remove(i);
                    return true;
                }
            }
            return false;
            

    }

    
    }


