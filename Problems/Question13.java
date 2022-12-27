
//A java program to show the use of while loop in GUI based program
import javax.swing.JOptionPane;

public class Question13 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter a Number : "));

        while (a != 0) {
            System.out.println(a);
            a--;
        }

    }
}
