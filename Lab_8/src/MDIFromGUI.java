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
public class MDIFromGUI {
    public MDIFromGUI(){
        JFrame f = new JFrame("SubMenuItem Demo");
        JDesktopPane desktopPane = new JDesktopPane();
        JInternalFrame frame1 = new JInternalFrame("Application 01",true, true, true, true);
        JInternalFrame frame2 = new JInternalFrame("Application 02",true, true, true, true);
        JInternalFrame frame3 = new JInternalFrame("Application 03",true, true, true, true);

        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("File");
        JMenu m2 = new JMenu("Edit");
        JMenu m3 = new JMenu("View");
        JMenu semim1_1 = new JMenu("New");
        JMenuItem semim1_2 = new JMenuItem("Open");
        JMenuItem semim1_3 = new JMenuItem("Save");
        JMenuItem semim1_4 = new JMenuItem("Exit");
        JMenuItem semim1_1_1 = new JMenuItem("Window");
        JMenuItem semim1_1_2 = new JMenuItem("Message");
        semim1_1.add(semim1_1_1);
        semim1_1.addSeparator();
        semim1_1.add(semim1_1_2);
        m1.add(semim1_1);
        m1.add(semim1_2);
        m1.addSeparator();
        m1.add(semim1_3);
        m1.addSeparator();
        m1.add(semim1_4);
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);

        frame1.setSize(200,125);
        frame1.setLocation(75, 275);
        frame1.setVisible(true);
        frame2.setSize(200,150);
        frame2.setLocation(200, 100);
        frame2.setVisible(true);
        frame3.setSize(350, 250);
        frame3.setLocation(500, 150);
        frame3.setVisible(true);
        desktopPane.add(frame1);
        desktopPane.add(frame2);
        desktopPane.add(frame3);
        desktopPane.setBackground(Color.black);

        f.add(desktopPane);
        f.setJMenuBar(mb);
        f.setSize(1000, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
 