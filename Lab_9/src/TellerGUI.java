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
import java.awt.event.*;

public class TellerGUI implements ActionListener {
    private Account acct;
    private JFrame f;
    private JTextField input_Balance, input_Amount, output;
    private JButton b_Deposit, b_Withdraw, b_Exit;

    public TellerGUI() {
        acct = new Account(6000, "User");

        f = new JFrame("Teller GUI");
        JPanel container1 = new JPanel(new GridLayout(2, 2));
        JPanel container2 = new JPanel(new FlowLayout());
        JPanel container3 = new JPanel(new FlowLayout());

        JLabel balanceLabel = new JLabel("Balance");
        input_Balance = new JTextField(String.valueOf(acct.getBalance()));
        input_Balance.setEditable(false);

        JLabel amountLabel = new JLabel("Amount");
        input_Amount = new JTextField();

        output = new JTextField();
        output.setEditable(false);
        b_Deposit = new JButton("Deposit");
        b_Withdraw = new JButton("Withdraw");
        b_Exit = new JButton("Exit");

        //Event Listener
        b_Deposit.addActionListener(this);
        b_Withdraw.addActionListener(this);
        b_Exit.addActionListener(this);

        container1.add(balanceLabel);
        container1.add(input_Balance);
        container1.add(amountLabel);
        container1.add(input_Amount);
        container2.add(b_Deposit);
        container2.add(b_Withdraw);
        container2.add(b_Exit);
        container3.add(output);

        f.setLayout(new GridLayout(3, 1));
        f.add(container1);
        f.add(container2);
        f.add(output);

        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double am = Double.parseDouble(input_Amount.getText());
        if (e.getSource() == b_Exit) {
            System.exit(0);
        }
        if (e.getSource() == b_Deposit) {
            acct.deposit(am);
            input_Balance.setText(String.valueOf(acct.getBalance()));
        } 
        else if (e.getSource() == b_Withdraw) {
            if (acct.getBalance() >= am) {
                acct.withdraw(am);
                input_Balance.setText(String.valueOf(acct.getBalance()));
            }
        }
        input_Amount.setText("");
    }
}