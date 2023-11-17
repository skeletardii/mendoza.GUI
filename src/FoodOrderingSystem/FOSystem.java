package FoodOrderingSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FOSystem extends JFrame {
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JButton btnOrder;
    private JPanel panel1;

    public FOSystem(){
        setContentPane(panel1);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Food Ordering System");
        setSize(400,360);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);

        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num=0;
                if(cPizza.isSelected())         num+=100;
                if(cBurger.isSelected())        num+=80;
                if(cFries.isSelected())         num+=65;
                if(cSoftDrinks.isSelected())    num+=55;
                if(cTea.isSelected())           num+=50;
                if(cSundae.isSelected())        num+=40;

                     if( rb5.isSelected())      num*=0.95;
                else if(rb10.isSelected())      num*=0.90;
                else if(rb15.isSelected())      num*=0.85;

                JOptionPane.showMessageDialog(null,"The total price is Php "+String.format("%.2f",num),"Message", JOptionPane.INFORMATION_MESSAGE);

            }
        });
    }
    public static void main(String[] args) {
        FOSystem fos = new FOSystem();
    }
}
