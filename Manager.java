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

      public boolean modifyEntry(String nameToModify, String newName, String newPhone) {
            for (int i = 0; i < person.size(); i++) {
                Obj o = person.get(i);

                if (o.getName().equalsIgnoreCase(nameToModify)) {

                    if (newName != null && !newName.isBlank()) {
                        o.setName(newName);

                    }
                    
                    if (newPhone != null && !newPhone.isBlank()) {
                        o.setPhone(newPhone);

                    }

                    return true;

                }
            }
            return false;
        
        }
            

    
    }


