//Write a GUI based Java Program which will add two decimal
// numbers and show the summation of them

import javax.swing.JOptionPane;
public class Question3 {
    public static void main(String[] args) {
        String num1, num2;
        Double n, m, summ;
        num1 = JOptionPane.showInputDialog("Enter first number : ");
        num2 = JOptionPane.showInputDialog("Enter Second number : ");

        n = Double.parseDouble(num1);
        m = Double.parseDouble(num2);

        summ = n + m;
        JOptionPane.showMessageDialog(null, "The Sum is" + summ, "Result", JOptionPane.PLAIN_MESSAGE);

    }
}
