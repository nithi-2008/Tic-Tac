import java.util.Scanner;

public class uc3 {

    // Method to read slot number
    public static int getSlotInput() {
        Scanner scanner = new Scanner(System.in);
        int slot;

        while (true) {
            System.out.print("Enter a slot number (1-9): ");
            
            if (scanner.hasNextInt()) {
                slot = scanner.nextInt();
                
                if (slot >= 1 && slot <= 9) {
                    return slot; // valid input
                } else {
                    System.out.println("Invalid input! Please enter a number between 1 and 9.");
                }
            } else {
                System.out.println("Invalid input! Please enter an integer.");
                scanner.next(); // clear invalid input
            }
        }
    }

    // Main method (for testing)
    public static void main(String[] args) {
        int slot = getSlotInput();
        System.out.println("You selected slot: " + slot);
    }
}