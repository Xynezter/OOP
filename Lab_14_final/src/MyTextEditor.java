/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
import javax.swing.*;
import java.awt.event.*;
import java.io.File;
public class MyTextEditor implements ActionListener{
    private JFrame frame;
    private JPanel container;
    private JMenuBar mb;
    private JMenuItem m1, m2, m3, m4;
    private JMenu menu;
    private JTextArea tarea;
    private JFileChooser fc;
    
    public MyTextEditor(){
        frame = new JFrame("MyTextEditor");
        container = new JPanel();
        mb = new JMenuBar();
        menu = new JMenu("File");
        m1 = new JMenuItem("New");
        m2 = new JMenuItem("Open");
        m3 = new JMenuItem("Save");
        m4 = new JMenuItem("Close");
        tarea = new JTextArea(20,50);
        fc = new JFileChooser();
        
        menu.setMnemonic('F');
        mb.add(menu);
        menu.add(m1);
        menu.add(m2);
        menu.add(m3);
        menu.addSeparator();
        menu.add(m4);
        frame.setJMenuBar(mb);
        
        m1.addActionListener(this);
        m2.addActionListener(this);
        m3.addActionListener(this);
        m4.addActionListener(this);
        
        container.add(tarea);
        frame.add(container);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == m1) {
            tarea.setText("");
        } else if (e.getSource() == m2) {
            fc.showOpenDialog(frame);
            File f = fc.getSelectedFile();
        } else if (e.getSource() == m3) {
            fc.showSaveDialog(frame);
            File f = fc.getSelectedFile();
        } else if (e.getSource() == m4) {
            frame.dispose();
        }
    }
    
    public static void main(String[] args) {
        new MyTextEditor();
    }
}
