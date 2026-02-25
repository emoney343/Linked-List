import java.util.LinkedList;

public class Manager {
    private LinkedList<Obj> person = new LinkedList<>();
    public Object printIndexMenu;

    public void addEntry(String name, String phone) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");

        }  if (phone == null || phone.isBlank()) {
            throw new IllegalArgumentException("Phone cannot be empty");
        } 
        person.add(new Obj(name, phone));

    }

    public void addFirst(String name1, String phone1) {

        if (name1 == null || name1.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");

        }  if (phone1 == null || phone1.isBlank()) {
            throw new IllegalArgumentException("Phone cannot be empty");
        } 
        person.addFirst(new Obj(name1, phone1));
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

        public void getContact (String nameToGet) {
            for (int i = 0; i < person.size(); i++) {
                Obj o = person.get(i);
                if (o.getName().equalsIgnoreCase(nameToGet)) {
                System.out.println(o);
        }
            }
        }
        

        public void printIndexMenu() {
            if (person.isEmpty()) {
                System.out.println("No Contacts");
                return;
              }
           
              for (int i = 0; i < person.size(); i++) {
                System.out.println(i + ": " + person.get(i).getName());

        }
    }

        public void printContactByIndex(int index) {
            if (index < 0 || index >= person.size()) {
                System.out.println("Invalid index. Choose 0 to" + (person.size() - 1));
                return;
            }
            System.out.println(person.get(index));
        

    }

            

    
    }




