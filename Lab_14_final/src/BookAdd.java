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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
public class BookAdd implements ActionListener{
    private ArrayList<Book> list;
    private JFrame frame;
    private JPanel allcon, container1, container2;
    private JLabel name, price, type;
    private JTextField fname, fprice;
    private JComboBox ctype;
    private JButton insert;
    public BookAdd(ArrayList<Book> list){
        this.list = list;
        String[] choices = { "General", "Computer", "Math&Sci", "Photo", "else"};
        frame = new JFrame();
        allcon = new JPanel(new BorderLayout());
        container1 = new JPanel(new GridLayout(3,2));
        container2 = new JPanel(new FlowLayout());
        name = new JLabel(" Name");
        price = new JLabel(" Price");
        type = new JLabel(" Type");
        ctype = new JComboBox(choices);
        fname = new JTextField(10);
        fprice = new JTextField(10);
        insert = new JButton("Insert");
        
        insert.addActionListener(this);
        
        container1.add(name);
        container1.add(fname);
        container1.add(price);
        container1.add(fprice);
        container1.add(type);
        container1.add(ctype);
        container2.add(insert);
        allcon.add(container1, BorderLayout.NORTH);
        allcon.add(container2, BorderLayout.SOUTH);
        
        frame.add(allcon);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == insert) {
            try {
                String strname = fname.getText();
                double numprice = Double.parseDouble(fprice.getText());
                String strtype = (String) ctype.getSelectedItem();
                Book newBook = new Book(strname, numprice, strtype);
                list.add(new Book(strname, numprice, strtype));
                JOptionPane.showMessageDialog(frame, "Done it.");
            } catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(frame, "Type number");
            }
        }
    }
}
