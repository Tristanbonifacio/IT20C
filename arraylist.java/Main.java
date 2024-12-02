import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ItemManager itemManager = new ItemManager();
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Welcome to the Item Manager!");
        
        do {
            System.out.print("\nChoose an action (add, remove, display, exit): ");
            command = scanner.nextLine().toLowerCase();

            switch (command) {
                case "add":
                    System.out.print("Enter item name: ");
                    String addItem = scanner.nextLine();
                    itemManager.addItem(addItem);
                    break;

                case "remove":
                    System.out.print("Enter item name to remove: ");
                    String removeItem = scanner.nextLine();
                    itemManager.removeItem(removeItem);
                    break;

                case "display":
                    itemManager.displayItems();
                    break;

                case "exit":
                    System.out.println("Exiting the Item Manager. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid command! Please try again.");
            }
        } while (!command.equals("exit"));

        scanner.close();
    }
}
