public class Manager {

    private MyLinkedList person = new MyLinkedList();


    public void addEntry(String name, String phone, String street, String city, String zip) {
        validateNamePhone(name, phone, street, city, zip);
        person.addLast(new Obj(name, phone, street, city, zip));

    }

    public void addFirst(String name, String phone, String street, String city, String zip) {
        validateNamePhone(name, phone, street, city, zip);
        person.addFirst(new Obj(name, phone, street, city, zip));

    }

     public void addAtIndex (int index, String name, String phone, String street, String city, String zip) {
        validateNamePhone(name, phone, street, city, zip);

        if (index < 0 || index > person.size()) {
            throw new IndexOutOfBoundsException("Index must be between 0 and " + person.size());
        }

        person.add(index, new Obj(name, phone, street, city, zip));
    }

    public void printAll() {
        if (person.isEmpty()) {
            System.out.println("No Contacts");
            return;
        } else {
            System.out.println(person);
        }

    }
            
    public boolean removeEntry(String nameToRemove) {
        for (int i = 0; i < person.size(); i++) {
            Obj o = person.get(i);
            if (o.getName().equalsIgnoreCase(nameToRemove)) {
                person.removeAt(i);
                return true;
            }
        }
        return false;
        
    }

    public boolean modifyEntry(String nameToModify, String newName, String newPhone, String newStreet, String newCity, String newZip) {
        for (int i = 0; i < person.size(); i++) {
            Obj o = person.get(i);

            if (o.getName().equalsIgnoreCase(nameToModify)) {
          if (newName != null && !newName.isBlank()) o.setName(newName);
            if (newPhone != null && !newPhone.isBlank()) o.setPhone(newPhone);
            if (newStreet != null && !newStreet.isBlank()) o.setStreet(newStreet);
            if (newCity != null && !newCity.isBlank()) o.setCity(newCity);
            if (newZip != null && !newZip.isBlank()) o.setZip(newZip);
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
                return;
           }
       }
       System.out.println("Contact not found.");
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
            System.out.println("Invalid index. Choose 0 to " + (person.size() - 1));
            return;

        }
        System.out.println(person.get(index));
          
    }


        private void validateNamePhone(String name, String phone, String street, String city, String zip) {
             if (name == null || name.isBlank()) throw new IllegalArgumentException("Name cannot be empty");
    if (phone == null || phone.isBlank()) throw new IllegalArgumentException("Phone cannot be empty");
    if (street == null || street.isBlank()) throw new IllegalArgumentException("Street cannot be empty");
    if (city == null || city.isBlank()) throw new IllegalArgumentException("City cannot be empty");
    if (zip == null || zip.isBlank()) throw new IllegalArgumentException("Zip cannot be empty");
        }

  }




