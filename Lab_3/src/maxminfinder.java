
import java.util.*;
public class maxminfinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        boolean numbersEntered = false;
        while (true) {
            System.out.print("Enter a number (-1 to stop): ");
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next();
                continue;
            }
            int number = scanner.nextInt();
            if (number == -1) {
                break;
            }
            numbersEntered = true;
            if (number > maximum) {
                maximum = number;
            }
            if (number < minimum) {
                minimum = number;
            }
        }
        scanner.close();
        System.out.println("");
        if (numbersEntered) {
            System.out.println("Maximum = " + maximum);
            System.out.println("Minimum = " + minimum);
        } else {
            // Case where -1 was entered immediately
            System.out.println("No numbers were entered.");
    }
}
}
