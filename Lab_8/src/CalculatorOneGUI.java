/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
import java.awt.*;
import javax.swing.*;
public class CalculatorOneGUI {
        public CalculatorOneGUI(){
        JFrame f = new JFrame("เครื่องคิดเลข");
        JPanel symbolP = new JPanel();
        JPanel inputP = new JPanel(new GridLayout(2, 1));
        JPanel outputP = new JPanel(new GridLayout(1, 1));
        
        JTextField input1 = new JTextField(30);
        JTextField input2 = new JTextField(30);
        JTextField output1 = new JTextField(30);
        output1.setEditable(false);
        JButton plus = new JButton("plus");
        JButton minus = new JButton("minus");
        JButton multiply = new JButton("multiply");
        JButton divide = new JButton("divide");
        
        f.setLayout(new BorderLayout());

        symbolP.add(plus);
        symbolP.add(minus);
        symbolP.add(multiply);
        symbolP.add(divide);

        inputP.add(input1);
        inputP.add(input2);
        outputP.add(output1);
        
        f.add(inputP, BorderLayout.NORTH);
        f.add(symbolP , BorderLayout.CENTER);
        f.add(outputP , BorderLayout.SOUTH);
        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
