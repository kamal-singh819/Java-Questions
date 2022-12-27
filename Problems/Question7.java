//A java program to show the narrowing conversion form
//1. double to tnt
//2. tnt to byte
public class Question7 {
    public static void main(String[] args) {
        double d = 2567.56;
        int i, b;

        i = (int) d;
        System.out.println("Double " + d + " to integer is : " + i);
        b = (byte) i;
        System.out.println("Integer " + i + " to byte is : " + b);
    }
}
