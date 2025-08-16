package joseph_carter;

public class week1_Task1EvenOrOdd {
/*Write  a method which can identify given number is even or odd
         Output ex:
         identify(5); ->"Odd"
         identify(6); ->"Even"

 */


    public static boolean isOdd(int num) {
        if (num % 2 == 1) {
            return true;
        }else{
            return false;
        }
    }

    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        }else{
            return false;
        }
    }

        public static void main(String[] args) {

            boolean result1 = isOdd(313);
            System.out.println("Is the number Odd? " + result1);

            boolean result2 = isEven(272);
            System.out.println("Is the number Even? " + result2);


        }
}
