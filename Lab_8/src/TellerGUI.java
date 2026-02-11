/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
import javax.swing.*;
import java.awt.*;
public class TellerGUI {
    public TellerGUI(){
        JFrame f = new JFrame("TellerGUI");
        JPanel container1 = new JPanel(new GridLayout(2,2));
        JPanel container2 = new JPanel(new FlowLayout());
        JLabel balance = new JLabel("Balance");
        JTextField input_Balance = new JTextField("6000");
        JLabel amount = new JLabel("Amount");
        JTextField input_Amount = new JTextField();
        JButton b_Deposit = new JButton("Deposit");
        JButton b_Withdraw = new JButton("Withdraw");
        JButton b_Exit = new JButton("Exit");

        balance.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        input_Balance.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        amount.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        input_Amount.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        input_Balance.setEditable(false);
        container1.add(balance);
        container1.add(input_Balance);
        container1.add(amount);
        container1.add(input_Amount);

        container2.add(b_Deposit);
        container2.add(b_Withdraw);
        container2.add(b_Exit);
        f.setLayout(new GridLayout(2, 1));
        f.add(container1);
        f.add(container2);
        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
