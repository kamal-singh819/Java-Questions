//Write a java program to add last four digits of your roll number, take input

//your roll number as STRING 

public class Question2 {
    public static void main(String[] args) {
        String roll = "20201001";
        int len = roll.length();
        int ans = 0;
        for (int i = len - 1; i >= len - 4; i--) {
            ans += roll.charAt(i) - '0';
        }

        System.out.println("Sum is " + ans);
    }

}
