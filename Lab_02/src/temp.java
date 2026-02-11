/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.*;
public class temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temparature (C): ");
        double temp = sc.nextDouble();
        System.out.print("Enter humidity (%): ");
        int humidity = sc.nextInt();
        
        if ( temp > 37.5 ) {
            System.out.println("Warning: High temparature!!");
        } else {
            System.out.println("Temperature normal.");
        }
        
        if ( humidity > 80 ) {
            System.out.println("Humidity is too high.");
        } else {
            System.out.println("Humidity is acceptable.");
        }
    }
}
