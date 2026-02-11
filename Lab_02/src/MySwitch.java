import java.util.*;
public class MySwitch {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        x = sc.nextInt();
        
        switch (x){
            case 1, 2 -> System.out.print("Green");
            case 3, 4, 5 -> System.out.print("Blue");
            default -> System.out.print("numbers 1-5 only");
        }
        System.out.print("Red");
    }
}
