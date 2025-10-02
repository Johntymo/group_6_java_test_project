package instructor;
/*Write  a method which can identify given number is even or odd
         Output ex:
         identify(5); ->"Odd"
         identify(6); ->"Even"

 */

public class Week01_OddOrEven {

    public static void main(String[] args) {


        int num1 = 6;


        if (num1 == 0) {
            System.out.println("The number is ZERO");
            return;
        }

        if ((num1 % 2) == 0)
            System.out.println("The number is Even.");
        else
            System.out.println("The number is Odd");

    }

}



