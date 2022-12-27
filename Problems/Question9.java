//A java program to show how to use left shift and right shift operators
public class Question9 {
    public static void main(String[] args) {
        int x = 20;
        int a = 3;
        int left = x << a;
        int right = x >> a;

        System.out.println("Left shift to x by " + a + " : " + left);
        System.out.println("Right shift to x by " + a + " : " + right);
    }
}
