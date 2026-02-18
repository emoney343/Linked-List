import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager();

        System.out.println("Enter name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Phone Number: ");
        String phone = scanner.nextLine();

        System.out.println(manager.addEntry(name, phone));
    }

}