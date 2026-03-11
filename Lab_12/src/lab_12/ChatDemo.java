package lab_12;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.io.*;
public class ChatDemo implements ActionListener{
    private JButton submit, reset;
    private JTextArea textArea;
    private JTextField textField;
    public ChatDemo() {
        JFrame frame = new JFrame("ChatDemo");
        JPanel Panel = new JPanel(new BorderLayout());
        JPanel PanelButton = new JPanel(new FlowLayout());
        JPanel bottomPanel = new JPanel(new BorderLayout());
        
        textArea = new JTextArea(20, 45);
        textArea.setEditable(false);
        textField = new JTextField(45);
        submit = new JButton("Submit");
        reset = new JButton("Reset");
        
        submit.addActionListener(this);
        reset.addActionListener(this);
        
        PanelButton.add(submit);
        PanelButton.add(reset);
        bottomPanel.add(textField, BorderLayout.NORTH);
        bottomPanel.add(PanelButton, BorderLayout.SOUTH);
        
        Panel.add(textArea, BorderLayout.CENTER);
        Panel.add(bottomPanel, BorderLayout.SOUTH);
        
        readData();
        
        frame.add(Panel);
        frame.setSize(800, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
}
    
     public void saveData(String data) {
        try (FileOutputStream fout = new FileOutputStream("ChatDemo.dat"); DataOutputStream dout = new DataOutputStream(fout)) {
            dout.writeUTF(data);
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    public void readData() {
        try (FileInputStream fin = new FileInputStream("ChatDemo.dat"); DataInputStream din = new DataInputStream(fin)) {
            String data = din.readUTF();
            textArea.setText(data);
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            String currentTime = dtf.format(LocalDateTime.now());
            textArea.append(currentTime + " : " + textField.getText() + "\n");
            textField.setText("");
            saveData(textArea.getText());
        } else if (e.getSource() == reset) {
            textArea.setText("");
            saveData("");
        }
    }
    
    public static void main(String[] args) {
        new ChatDemo();
    }
}
