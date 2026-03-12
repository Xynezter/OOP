/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_13;

/**
 *
 * @author USER
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
public class MyFrame {
    private JFrame frame;
    private JPanel panel;
    private JButton pause, resume;
    private MyClock clock;
    private Thread t;
    
    public MyFrame(){
        frame = new JFrame();
        panel = new JPanel();
        clock = new MyClock();
        t = new Thread(clock);
        
        t.start();
        
        panel.add(clock);
        frame.add(panel);
        frame.setSize(300,150);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //for sol 3
//        pause = new JButton("Pause");
//        resume = new JButton("Resume");
//        pause.addActionListener((ActionEvent e) -> {
//            clock.pauseClock();
//        });
//        resume.addActionListener((ActionEvent e) -> {
//            clock.resumeClock();
//        });
//        
//        panel.add(pause);
//        panel.add(resume);
    }
    
    public static void main(String[] args) {
        new MyFrame();
    }
}