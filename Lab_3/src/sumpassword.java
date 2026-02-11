
import java.util.*;
public class sumpassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String finalCode = "";
        System.out.print("Enter number of digits: ");
        int numberOfDigits = input.nextInt();

        for (int i = 1; i <= numberOfDigits; i++) {
            System.out.print("Enter digit " + i + ": ");
            int digit = input.nextInt();
            finalCode += digit;
        }
        System.out.println("");
        System.out.println("Final Code = " + finalCode);
        input.close();
    }
}
