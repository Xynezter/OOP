/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.*;
public class gpa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter GPA: ");
        double gpa = sc.nextDouble();
        System.out.print("Enter family income: ");
        int income = sc.nextInt();
        
        if ( gpa >= 3.5 ) {
            if ( income <= 15000 ) {
                System.out.println("You are eligible for the scholarship.");
            } else if ( income > 15000 ) {
                System.out.println("You are not eligible for the scholarship.");
            }
        } else {
            System.out.println("You are not eligible for the scholarship.");
        }
    }
}
