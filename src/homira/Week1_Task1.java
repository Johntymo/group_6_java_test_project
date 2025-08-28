package homira;

public class Week1_Task1 {
    public static void main(String[] args) {
        identify(5);   // should print "Odd"
        identify(10);  // should print "Even"
    }

    public static void identify(int number) {
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
