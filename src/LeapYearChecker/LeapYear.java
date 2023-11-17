package LeapYearChecker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYear extends JFrame{
    private JButton btnCheckYear;
    private JPanel panel;
    private JTextField tfYear;

    public LeapYear(){

        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    int y = Integer.parseInt(tfYear.getText());
                    if (y <= 0) JOptionPane.showMessageDialog(null, "Invalid year");
                    if ((y % 4 == 0) && (!(y % 100 == 0) || (y % 400 == 0))) {
                        JOptionPane.showMessageDialog(null, "Leap Year");
                    } else {
                        JOptionPane.showMessageDialog(null, "Not a leap year");
                    }
                } catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Invalid input");
                }
            }
        });
    }
    public static void main(String[] args) {
        LeapYear year = new LeapYear();
        year.setContentPane(year.panel);
        year.setVisible(true);
        year.setDefaultCloseOperation(EXIT_ON_CLOSE);
        year.setTitle("Leap Year Checker");
        year.setSize(350, 300);
    }
}