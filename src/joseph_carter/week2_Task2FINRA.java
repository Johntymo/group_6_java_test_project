package joseph_carter;

public class week2_Task2FINRA {
    /*
     Numbers -- FINRA
Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple
of 3, print "FIN" instead of the number and for numbers which are a multiple of 5,
print "RA" instead of the number. for numbers which are a multiple of both 3 and 5,
print "FINRA" instead of the number.
     */
    public static void main(String[] args) {

        /*
				Example:
					1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN...
         */

        int i = 1;

        // i % 3 == 0 ==> prints "FIN'
        // i % 5 == 0 ==> prints "RA"
        // i % 3 == 0 && i % 5 = 0 ==> "FINRA"

        do {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FINRA ");
            } else if (i % 5 == 0) {
                System.out.print("RA ");
            } else if (i % 3 == 0) {
                System.out.print("FIN ");
            } else {
                System.out.print(i + " ");

            }

            i++;

        } while (i <= 30);
    }
}
