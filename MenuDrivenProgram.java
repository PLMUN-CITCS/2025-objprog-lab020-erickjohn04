import java.util.Scanner;

public class MenuDrivenProgram {

    // Method to greet the user
    public static void greetUser() {
        System.out.println("Hello! Welcome!");
    }

    // Method to check if a number is even or odd
    public static void checkEvenOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }
    }

    // Method to display the menu and process user choices
    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            // Display menu options
            System.out.println("\nMenu:");
            System.out.println("1. Greet User");
            System.out.println("2. Check Even/Odd");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            choice = scanner.nextInt();

            // Process user choice
            switch (choice) {
                case 1:
                    greetUser();
                    break;
                case 2:
                    checkEvenOdd();
                    break;
                case 3:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            }
        } while (choice != 3); // Keep showing the menu until the user chooses to exit
    }

    public static void main(String[] args) {
        // Start the menu-driven program
        displayMenu();
    }
}
