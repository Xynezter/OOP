
import java.util.*;
public class howmuchprice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        System.out.print("Enter number of items: ");
        int range = input.nextInt();
        for (int i = 1 ;i <= range ;i++){
            System.out.print("Enter price for item " + i + ": ");
            int price = input.nextInt();
            total += price;
        }
        System.out.println("Total = " + total);
        System.out.println("");
        System.out.print("Enter amount paid: ");
        int amountPaid = input.nextInt();
        int change = amountPaid - total;
        System.out.println("Change = " + change);
        input.close();
    }
}
