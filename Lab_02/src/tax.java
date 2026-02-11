/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.*;
public class tax {
    public static void main(String[] args) {
        double x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a money: ");
        x = sc.nextDouble();
        if ( x > 50000 ) {
            double tax = (x * 0.1);
            System.out.print(tax);
        } else if ( x <= 50000 ) {
            double tax = (x * 0.05);
            System.out.print(tax);
        }
    }
}
