package FoodOrderingSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrder extends JFrame {
    private JPanel panel;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoda;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JButton btnOrder;

    public FoodOrder() {
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JRadioButton[] discounts = {rbNone, rb5, rb10, rb15};
                double total = 0;
                if (cPizza.isSelected()) total += 100;
                if (cBurger.isSelected()) total += 80;
                if (cFries.isSelected()) total += 65;
                if (cSoda.isSelected()) total += 55;
                if (cTea.isSelected()) total += 50;
                if (cSundae.isSelected()) total += 40;

                if (discounts[0].isSelected()) total *= 1;
                if (discounts[1].isSelected()) total *= 0.95;
                if (discounts[2].isSelected()) total *= 0.90;
                if (discounts[3].isSelected()) total *= 0.85;
                JOptionPane.showMessageDialog(null, "The total price is Php " + String.format("%.2f", total));
            }
        });
    }

    public static void main(String[] args) {
        FoodOrder order = new FoodOrder();
        order.setContentPane(order.panel);
        order.setVisible(true);
        order.setDefaultCloseOperation(EXIT_ON_CLOSE);
        order.setTitle("Food Ordering System");
        order.setSize(600, 500);
    }
}
