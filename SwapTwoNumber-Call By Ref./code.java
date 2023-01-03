//Show the use of CALL BY REFERENCE in java---------------------

//? Java code to swap two numbers by "Call by Reference" ?//

//file name is - Question23.java
class Swapping {
    public int x;
    public int y;

    public Swapping(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Swapping() {
    }

    public void swapped(Swapping swp) {
        int temp = swp.x;
        swp.x = swp.y;
        swp.y = temp;
    }

    public Swapping getValues() { //This is a function to return multiple values using object of class....
        Swapping values = new Swapping();
        values.x = x;
        values.y = y;
        return values;
    }
}

public class Question23 {
    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        System.out.println("Before swapping : " + x + " " + y);
        Swapping swp = new Swapping(x, y);

        swp.swapped(swp);

        Swapping val = swp.getValues();
        System.out.println("After swapping : " + val.x + " " + val.y);
    }
}
