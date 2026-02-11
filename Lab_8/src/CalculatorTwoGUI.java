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
public class CalculatorTwoGUI {
    public CalculatorTwoGUI(){
        JFrame f = new JFrame("My Calculator");
        JPanel t = new JPanel(new BorderLayout());
        JPanel numPad = new JPanel(new GridLayout(4,4));
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton b0 = new JButton("0");
        JButton bPlus = new JButton("+");
        JButton bMinus = new JButton("-");
        JButton bMultiply = new JButton("X");
        JButton bDivide = new JButton("/");
        JButton bc = new JButton("c");
        JButton beq = new JButton("=");

        t.add(new JTextField(),BorderLayout.NORTH);
        numPad.add(b7);
        numPad.add(b8);
        numPad.add(b9);
        numPad.add(bPlus);
        numPad.add(b4);
        numPad.add(b5);
        numPad.add(b6);
        numPad.add(bMinus);
        numPad.add(b1);
        numPad.add(b2);
        numPad.add(b3);
        numPad.add(bMultiply);
        numPad.add(b0);
        numPad.add(bc);
        numPad.add(beq);
        numPad.add(bDivide);
        
        t.add(numPad, BorderLayout.CENTER);
        f.add(t);
        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
}
}
