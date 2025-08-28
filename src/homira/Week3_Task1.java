package homira;

public class Week3_Task1 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("Before swap: a = " + a + ", b = " + b);

        // swap without third variable
        a = a + b; // a = 30
        b = a - b; // b = 10
        a = a - b; // a = 20

        System.out.println("After swap:  a = " + a + ", b = " + b);

    }
}
