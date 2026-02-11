/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.*;
public class salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Place insert your name: ");
        String name = sc.nextLine();
        System.out.print("Place insert your age: ");
        int age = sc.nextInt();
        System.out.print("Place insert your working days: ");
        int numDay1 = sc.nextInt();
        System.out.print("Place insert your abset days: ");
        int numDay2 = sc.nextInt();
        System.out.print("Place insert your body weight: ");
        double weight = sc.nextDouble();
        System.out.println("Hi, " + name);
        int salary = 0;
        
        if (((21 <= age) && (age <= 30))) {
            salary = (numDay1 * 300) - (numDay2 * 50);
        } else if (((31 <= age) && (age <= 40))) {
            salary = (numDay1 * 500) - (numDay2 * 50);
        } else if (((41 <= age) && (age <= 50))) {
            salary = (numDay1 * 1000) - (numDay2 * 25);
        } else if (((51 <= age) && (age <= 60))) {
            salary = (numDay1 * 3000);
        }
        
        System.out.println("Your salary is " + salary + " Baht");
        
        if (((10 <= weight) && (weight <= 60))) {
            salary += 5000;
        } else if (((61 <= weight) && (weight <= 90))) {
            salary += (5000 - ((weight - 60) * 10));
        }
        
        System.out.println("Your salary and bonus is " + salary + " Baht");
    }
}
