package SimpleCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpCalc extends JFrame{
    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JTextField lblResult;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JPanel panel;

    public SimpCalc() {
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(tfNumber1.getText());
                    double num2 = Double.parseDouble(tfNumber2.getText());

                    double res = 0;
                    switch (cbOperations.getSelectedIndex()) {
                        case 0:
                            res = num1 + num2;
                            break;
                        case 1:
                            res = num1 - num2;
                            break;
                        case 2:
                            res = num1 * num2;
                            break;
                        case 3:
                            res = num1 / num2;
                            break;
                    }
                    lblResult.setText(String.valueOf(res));
                } catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Both numbers should be entered");
                }
            }
        });
    }

    public static void main(String[] args) {
        SimpCalc calc = new SimpCalc();
        calc.setContentPane(calc.panel);
        calc.setVisible(true);
        calc.setDefaultCloseOperation(EXIT_ON_CLOSE);
        calc.setTitle("Simple Calculator");
        calc.setSize(600, 300);
    }
}
