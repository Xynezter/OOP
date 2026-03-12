/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_13;

/**
 *
 * @author USER
 */
import java.awt.event.*;
import javax.swing.*;
public class PoringConstructor implements ActionListener{
    private JFrame frame;
    private JButton button;
    private JPanel panel;
    private int poringcount = 1;
    public PoringConstructor(){
        frame = new JFrame();
        button = new JButton("Add");
        panel = new JPanel();
        
        button.addActionListener(this);
        
        panel.add(button);
        frame.add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Poring poring = new Poring(poringcount);
        poringcount++;
    }
    
    public static void main(String[] args) {
        new PoringConstructor();
    }
}
