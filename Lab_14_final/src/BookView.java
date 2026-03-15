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
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import java.io.*;
public class BookView implements ActionListener, WindowListener{
    private ArrayList<Book> bookList = new ArrayList<>();
    private JFrame frame;
    private JPanel allcon, container1, container2, container3;
    private JLabel name, price, type;
    private JTextField fname, fprice, indexbook;
    private JComboBox ctype;
    private JButton bleft, bright, badd, bupdate, bdel;
    private int count;

    public BookView(){
        frame = new JFrame();
        allcon = new JPanel(new BorderLayout());
        container1 = new JPanel(new GridLayout(3, 2));
        container2 = new JPanel(new FlowLayout());
        container3 = new JPanel(new FlowLayout());
        name = new JLabel(" Name");
        price = new JLabel(" Price");
        type = new JLabel(" Type");
        fname = new JTextField(8);
        fprice = new JTextField(8);
        indexbook = new JTextField("0",4);
        String[] choices = { "General", "Computer", "Math&Sci", "Photo", "else"};
        ctype = new JComboBox(choices);
        bleft = new JButton("<<<");
        bright = new JButton(">>>");
        badd = new JButton("Add");
        bupdate = new JButton("Update");
        bdel = new JButton("Delete");
        
        bleft.addActionListener(this);
        bright.addActionListener(this);
        badd.addActionListener(this);
        bupdate.addActionListener(this);
        bdel.addActionListener(this);
         
        container1.add(name);
        container1.add(fname);
        container1.add(price);
        container1.add(fprice);
        container1.add(type);
        container1.add(ctype);
        container2.add(bleft);
        container2.add(indexbook);
        container2.add(bright);
        container3.add(badd);
        container3.add(bupdate);
        container3.add(bdel);
        
        allcon.add(container1, BorderLayout.NORTH);
        allcon.add(container2, BorderLayout.CENTER);
        allcon.add(container3, BorderLayout.SOUTH);
        frame.add(allcon);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        readData();
        frame.addWindowListener(this);
        frame.setVisible(true);
    }
    
    private void readData() {
        File f = new File("Book.data");
        if (f.exists()) {try (FileInputStream fin = new FileInputStream("Book.data"); 
                ObjectInputStream din = new ObjectInputStream(fin)) {
                bookList = (ArrayList<Book>) din.readObject();
                updateDisplay();
            } catch (IOException | ClassNotFoundException e) {
                System.out.println(e.toString());
            }
        }
    }

    private void saveData() {
        try (FileOutputStream fout = new FileOutputStream("Book.data"); 
                ObjectOutputStream dout = new ObjectOutputStream(fout)) {
            dout.writeObject(bookList);
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == badd) {
            new BookAdd(bookList);
        } else if(e.getSource() == bupdate){
            if (!bookList.isEmpty()) {
                try {
                    String newName = fname.getText();
                    double newPrice = Double.parseDouble(fprice.getText());
                    String newType = (String) ctype.getSelectedItem();
                    Book currentBook = bookList.get(count);

                    currentBook.setName(newName);
                    currentBook.setPrice(newPrice);
                    currentBook.setType(newType);
                    JOptionPane.showMessageDialog(frame, "Done it.");
                } catch (NumberFormatException ex) {
                    throw ex;
                }
            }
        }else if(e.getSource() == bdel){
            if (!bookList.isEmpty()) {
                bookList.remove(count);
                if (count >= bookList.size() && count > 0) {
                count--;
                }
                if (bookList.isEmpty()) {
                fname.setText("");
                fprice.setText("");
                ctype.setSelectedIndex(0);
                indexbook.setText("0");
                } else {
                updateDisplay();
                }
                JOptionPane.showMessageDialog(frame, "Done it.");
            }
        }else if (e.getSource() == bright) {
            if (count < bookList.size() - 1) {
                count++;
                updateDisplay();
            }
        } else if (e.getSource() == bleft) {
            if (count > 0) {
                count--;
                updateDisplay();
            }
        }
    }
    
    public void updateDisplay() {
        if (!bookList.isEmpty()) {
            Book b = bookList.get(count);
            fname.setText(b.getName());
            fprice.setText(b.getPrice() + "");
            ctype.setSelectedItem(b.getType());
            indexbook.setText(count + "");
        }
    }
    
    public static void main(String[] args) {
        new BookView();
    }

    @Override
    public void windowOpened(WindowEvent e) {}

    @Override
    public void windowClosing(WindowEvent e) {
        if (!bookList.isEmpty()) {
            saveData(); 
        }
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
}
