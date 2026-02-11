/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.*;
public class desposit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your money: ");
        int money = sc.nextInt();
        System.out.print("Input your account type( A|B|C|X in uppercase ): ");
        char type = sc.next().charAt(0);
        if (type == 'A' || type == 'C') {
            money += (money * 0.015);
            System.out.println("Your total money in one year: " + money);
        } else if (type == 'B') {
            money += (money * 0.02);
            System.out.println("Your total money in one year: " + money);
        } else if (type == 'X') {
            money += (money * 0.05);
            System.out.println("Your total money in one year: " + money);
        }
    }
}
