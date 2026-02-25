import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager();

        int option = 0;

        // Menu
        while (option != 9) {
        System.out.println("Select an Option");
        System.out.println("1: Add Add Contact to End of List");
        System.out.println("2: Add Contact to Beginning of List");
        System.out.println("3: Add at Index");
        System.out.println("4: Get contact");
        System.out.println("5: Print Contacts");
        System.out.println("6: Print contact at Index");
        System.out.println("7: Remove Contact");
        System.out.println("8: Modify Contact");
        System.out.println("9: Quit");
        System.out.print("Choice: ");
        
        // Stores choice
        option = scanner.nextInt();
        scanner.nextLine();
    try { 
    
        // Menu actions
        switch (option) {
            // Add name to end of list
           case 1:
              System.out.print("Enter name: ");
              String name = scanner.nextLine();

            System.out.print("Enter Phone Number: ");
            String phone = scanner.nextLine();

            manager.addEntry(name, phone);
            break;

            // Add name to beginnng of list
            case 2:
              System.out.print("Enter name: ");
              String name1 = scanner.nextLine();

              System.out.print("Enter Phone Number: ");
              String phone1 = scanner.nextLine();
              
              manager.addFirst(name1, phone1);
              break;

            case 3: 
                manager.printIndexMenu();

                System.out.print("Enter index to insert at: ");
                int idx = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter name: ");
                String nameAt = scanner.nextLine();

                System.out.print("Enter phone: ");
                String phoneAt = scanner.nextLine();

                manager.addAtIndex(idx, nameAt, phoneAt);
                System.out.println("Contact added at index " + idx);
                break;


            case 4:
                System.out.print("Enter Name of Contact to Get: ");
                String nameToGet = scanner.nextLine();

                manager.getContact(nameToGet);
                break;
                
            // Print all contacts
            case 5:
                System.out.println("Contacts:");
                manager.printAll();
                break;
            
            case 6:
                manager.printIndexMenu();

                System.out.print("Enter Index of Contact: ");
                int index = scanner.nextInt();
                scanner.nextLine();
                manager.printContactByIndex(index);
                break;


            
            // Remove a contact
            case 7:
                System.out.println("Enter First Name of Contact: ");
                String nameToRemove = scanner.nextLine();
                if (manager.removeEntry(nameToRemove)) {
                    System.out.println("Removed");
                } else {
                    System.out.println("Not found.");
                }
                break;
            
            // Modify a contact
            case 8:
                System.out.println("Enter Contact to Change");
                String nameToModify = scanner.nextLine();

                System.out.print("Enter New Name: ");
                String newName = scanner.nextLine();

                System.out.print("Enter New Phone: ");
                String newPhone = scanner.nextLine();

                if (manager.modifyEntry(nameToModify, newName, newPhone)) {
                    System.out.println("Updated");
                } else {
                    System.out.println("Contact not found");
                }
                break;

                case 9:
                    System.out.println("Goodbye!");
                    break;
            
            

                default:
                    System.out.println("Invalid option. Please choose 1-9");
                
            

        }

    } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
        System.out.println("Error: " + e.getMessage());
    }

    }
    scanner.close();
}

}
