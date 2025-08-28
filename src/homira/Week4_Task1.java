package homira;

public class Week4_Task1 {
    public static void main(String[] args) {

        System.out.println(reverseNumber(-1234)); // Output: -4321
        System.out.println(reverseNumber(567));   // Output: 765
    }

    public static int reverseNumber(int number) {
        int reversed = 0;
        int sign = number < 0 ? -1 : 1; // store the sign (negative or positive)
        number = Math.abs(number);      // work with positive value for reversing

        while (number > 0) {
            int digit = number % 10;          // get last digit
            reversed = reversed * 10 + digit; // build reversed number
            number /= 10;                     // remove last digit
        }

        return reversed * sign; // reapply sign at the end

    }
}
