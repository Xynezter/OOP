
import java.util.*;
public class keedv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert a number : ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            if (i % 5 == 0) {
                System.out.println("|");
            } else {
                System.out.print("|");
            }
        }
        scanner.close();
    }
}
