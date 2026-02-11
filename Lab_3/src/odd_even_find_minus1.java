
import java.util.*;
public class odd_even_find_minus1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numbers;
        int detect = -1;
        int countereven = 0;
        int counterodd = 0;
        do {
            numbers = input.nextInt();
            if (numbers != detect) {
                if (numbers % 2 == 0) {
                    countereven += 1;
                } else {
                    counterodd += 1;
                }
            }
        } while (numbers != detect);
        System.out.print("Odd number = " + counterodd + " and Even number = " + countereven);
    }
}
