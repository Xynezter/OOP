
import java.util.*;
public class password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password;
        String correctPassword = "PASS2025";
        do {
            System.out.print("Enter password: ");
            password = input.nextLine();
            if (!password.equals(correctPassword)) {
                System.out.println("Try again.");
            }
        } while (!password.equals(correctPassword));{
        System.out.println("Access granted.");
        input.close();
    }
    }
}
