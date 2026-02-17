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
public class CalculatorSample implements ActionListener{
    private JTextField i;
    private double num;
    private String op;
    public CalculatorSample(){
        JFrame f = new JFrame("My Calculator");
        JPanel t = new JPanel(new BorderLayout());
        i = new JTextField();
        i.setHorizontalAlignment(JTextField.RIGHT);
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
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        bPlus.addActionListener(this);
        bMinus.addActionListener(this);
        bMultiply.addActionListener(this);
        bDivide.addActionListener(this);
        bc.addActionListener(this);
        beq.addActionListener(this);

        t.add(i,BorderLayout.NORTH);
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
    @Override
    public void actionPerformed(ActionEvent e){
        String key = e.getActionCommand();
        if (key.equals("+") || key.equals("-") || key.equals("X") || key.equals("/")){
            num = Double.parseDouble(i.getText());
            op = key;
            i.setText("");
        } else if (key.equals("c")){
            i.setText("");
            num = 0;
            op = "";
        } else if (key.equals("=")){
            double num2 = Double.parseDouble(i.getText());
            double result = 0;

            if (op.equals("+")){
                result = num + num2;
            } else if (op.equals("-")){
                result = num - num2;
            } else if (op.equals("X")){
                result = num * num2;
            } else if (op.equals("/")){
                result = num / num2;
            }
        i.setText(String.valueOf(result));
        } else {
            i.setText(i.getText() + key);
        }
    }
}