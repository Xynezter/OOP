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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
public class Poring {
    private JFrame frame;
    private JPanel container;
    private JLabel poring, numofporing;
    private ImageIcon imgPoring;
    private Image scaleImgPoring;
    private int poringCount;
    
    public Poring(){
        this(0);
    }
    
    public Poring(int amount){
        this.poringCount = amount;
        
        frame = new JFrame();
        imgPoring = new ImageIcon(getClass().getResource("poring.png"));
        scaleImgPoring = imgPoring.getImage().getScaledInstance(200, 150, Image.SCALE_SMOOTH);
        poring = new JLabel(new ImageIcon(scaleImgPoring));
        numofporing = new JLabel(String.valueOf(this.poringCount));
        container = new JPanel(new FlowLayout());
        
        poring.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                frame.dispose();
            }
        });
        
        container.add(poring);
        container.add(numofporing);
        frame.add(container);
        frame.setSize(300, 200);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setVisible(true);
    }
}
