
import java.util.*;
public class money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int count = 0;
        do {
            System.out.print("Enter deposit amount: ");
            int deposit = scanner.nextInt();
            total += deposit;
            count += 1;
        } while ( total < 1000);
        System.out.println("");
        System.out.println("Target reached!");
        System.out.println("Total amount saved = " + total);
        System.out.println("Number of deposits = " + count);
    }
}
