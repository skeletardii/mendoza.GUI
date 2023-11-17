package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Leapyear extends JFrame{

    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;
    public Leapyear(){
        setContentPane(panel1);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Leap Year Checker");
        setSize(320,240);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int year = 1;
                try {
                    year = Integer.parseInt(tfYear.getText());
                } catch (Exception e1) {
                    JOptionPane.showMessageDialog(null,"Invalid Input :(((((","Message", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if(year%4==0 && (year%100!=0 || year%400==0) ){
                    JOptionPane.showMessageDialog(null,"Leap Year","Message", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null,"Not a Leap Year","Message", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }
    public static void main(String[] args) {
        Leapyear app = new Leapyear();
    }
}
