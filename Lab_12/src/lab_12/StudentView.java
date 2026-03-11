/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_12;

/**
 *
 * @author USER
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
public class StudentView implements ActionListener, WindowListener{
    private JLabel ID, Name, Money;
    private JTextField tID, tName, tMoney;
    private JButton Deposit, Withdraw;
    private Student s1;
    public StudentView(){
        s1 = new Student();
        JFrame frame = new JFrame("StudentProfile");
        JPanel Panel = new JPanel(new BorderLayout());
        JPanel info = new JPanel(new GridLayout(3,2));
        JPanel PanelButton = new JPanel(new FlowLayout());
        
        ID = new JLabel(" ID:");
        Name = new JLabel(" Name:");
        Money = new JLabel(" Money:");
        tID = new JTextField();
        tName = new JTextField();
        tMoney = new JTextField();
        tMoney.setEditable(false);
        Deposit = new JButton("Deposit");
        Withdraw = new JButton("Withdraw");
        
        info.add(ID);
        info.add(tID);
        info.add(Name);
        info.add(tName);
        info.add(Money);
        info.add(tMoney);
        PanelButton.add(Deposit);
        PanelButton.add(Withdraw);
        
        Deposit.addActionListener(this);
        Withdraw.addActionListener(this);
        
        readData();
        
        frame.addWindowListener(this);
        Panel.add(info, BorderLayout.NORTH);
        Panel.add(PanelButton, BorderLayout.SOUTH);
        frame.add(Panel);
        frame.setSize(200, 135);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    public void saveData(Student data) {
        try (FileOutputStream fout = new FileOutputStream("StudentM.dat"); ObjectOutputStream dout = new ObjectOutputStream(fout)) {
            dout.writeObject(data);
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
    
    public void readData() {
        try (FileInputStream fin = new FileInputStream("StudentM.dat"); ObjectInputStream din = new ObjectInputStream(fin)) {
            s1 = (Student) din.readObject();
        } catch (IOException | ClassNotFoundException e) {
            s1 = new Student();
        }
        tID.setText(String.valueOf(s1.getID()));
        tName.setText(s1.getName());
        tMoney.setText(String.valueOf(s1.getMoney()));
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == Deposit) {
            s1.setMoney(s1.getMoney() + 100);
            tMoney.setText(s1.getMoney() + "");
        } else if (e.getSource() == Withdraw) {
            s1.setMoney(s1.getMoney() - 100);
            tMoney.setText(s1.getMoney() + "");
        }
    }
    
    @Override
    public void windowOpened(WindowEvent e) {
        readData();
    }

    @Override
    public void windowClosing(WindowEvent e) {
        s1.setName(tName.getText());
        
        try {
            s1.setID(Integer.parseInt(tID.getText()));

        } catch (NumberFormatException ex) {
            s1.setID(0);
        }
        saveData(s1);
    }

    @Override 
    public void windowClosed(WindowEvent e) {}
    @Override
    public void windowIconified(WindowEvent e) {}
    @Override
    public void windowDeiconified(WindowEvent e) {}
    @Override
    public void windowActivated(WindowEvent e) {}
    @Override
    public void windowDeactivated(WindowEvent e) {}
    
    public static void main(String[] args) {
        new StudentView();
    }
}
