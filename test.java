import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager();

        int option = 0;

        while (option != 3) {
        System.out.println("Select an Option");
        System.out.println("1: Add Contact");
        System.out.println("2: Print Contacts");
        System.out.println("3: Quit");
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

        }
    }

    }
}
