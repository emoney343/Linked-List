import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager();

        int option = 0;

        while (option != 5) {
        System.out.println("Select an Option");
        System.out.println("1: Add Contact");
        System.out.println("2: Print Contacts");
        System.out.println("3: Remove Contact");
        System.out.println("4: Modify Contact");
        System.out.println("5: Quit");
        System.out.print("Choice: ");
        
        option = scanner.nextInt();
        scanner.nextLine();

        switch (option) {
           case 1:
              System.out.print("Enter name: ");
              String name = scanner.nextLine();

            System.out.print("Enter Phone Number: ");
            String phone = scanner.nextLine();

            manager.addEntry(name, phone);
            break;

            case 2:
                System.out.println("Contacts:");
                manager.printAll();
                break;
            
            case 3:
                System.out.println("Enter First Name of Contact: ");
                String nameToRemove = scanner.nextLine();
                if (manager.removeEntry(nameToRemove)) {
                    System.out.println("Removed");
                } else {
                    System.out.println("Not found.");
                }
                break;
            
            case 4:
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

        }
    }

    }
}
