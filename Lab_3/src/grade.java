
import java.util.*;
public class grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int excellentCount = 0;
        int goodCount = 0;
        int fairCount = 0;
        int poorCount = 0;
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();
        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.print("Enter score for student " + i + ": ");
            if (input.hasNextInt()) {
                int score = input.nextInt();
                if (score >= 80) {
                    System.out.println("Excellent");
                    excellentCount++;
                } else if (score >= 60) {
                    System.out.println("Good");
                    goodCount++;
                } else if (score >= 50) {
                    System.out.println("Fair");
                    fairCount++;
                } else {
                    System.out.println("Poor");
                    poorCount++;
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer score.");
                input.next(); 
            }
        }
        System.out.println("\nSummary:");
        System.out.println("Excellent: " + excellentCount);
        System.out.println("Good: " + goodCount);
        System.out.println("Fair: " + fairCount);
        System.out.println("Poor: " + poorCount);
        }
    }