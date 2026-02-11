
import java.util.*;
public class find_char {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder validCharacters = new StringBuilder();
        StringBuilder consonantsOnly = new StringBuilder();
        while (true) {
            System.out.print("Enter a character: ");
            String inputLine = scanner.nextLine().trim();
            if (inputLine.isEmpty()) {
                continue;
            }
            char inputChar = inputLine.charAt(0);
            if (inputChar == 'z') {
                break;
            }
            if (inputChar >= 'a' && inputChar <= 'y') {
                validCharacters.append(inputChar);
                if (inputChar == 'a' || inputChar == 'e' || inputChar == 'i' || 
                    inputChar == 'o' || inputChar == 'u') {
                } else {
                    consonantsOnly.append(inputChar);
                }
            } else {
                System.out.println("Invalid input. Only lowercase a-z are allowed.");
            }
        }
        scanner.close();
        System.out.println("\nAll characters entered: " + validCharacters.toString());
        System.out.println("Consonants only: " + consonantsOnly.toString());
    }
}
