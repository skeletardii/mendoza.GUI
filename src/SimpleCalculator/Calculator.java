package SimpleCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame{
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JTextField tfNumber2;
    private JButton btnCompute;
    private JLabel lblResult;
    private JPanel panel1;

    public Calculator(){
        setContentPane(panel1);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Simple Calculator");
        setSize(640,240);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);

        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res="Invalid";
                try {
                    double num1 = Double.parseDouble(tfNumber1.getText());
                    double num2 = Double.parseDouble(tfNumber2.getText());
                    int op = cbOperations.getSelectedIndex() + 1;
                    switch(op){
                        case 1:
                            res=""+(num1+num2);
                            break;
                        case 2:
                            res=""+(num1-num2);
                            break;
                        case 3:
                            res=""+(num1*num2);
                            break;
                        case 4:
                            res=""+(num1/num2);
                            if(num2==0) {
                                res = "Invalid";
                                JOptionPane.showMessageDialog(null,"Division by Zero","Your pet calculator has died", JOptionPane.ERROR_MESSAGE);
                            }
                            break;
                    }
                } catch (Exception e1) {
                    res = "Invalid";
                    JOptionPane.showMessageDialog(null,"Invalid Input :(((((","Your pet calculator has died", JOptionPane.ERROR_MESSAGE);
                }
                if(!res.equals("Invalid")) {
                    double d = Double.parseDouble(res);
                    if (d == (long) d)
                        res = String.format("%d", (long) d);
                    else
                        res = String.format("%s", d);
                }
                lblResult.setText(res);
            }
        });
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
    }
}
