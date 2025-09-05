package joseph_carter;

public class week3_SwapTwoNumbers {

    public static void main(String[] args) {


    /*
    Swap two variable values without using a third variable
     */

        int v1 = 8;
        int v2 = 5;

        System.out.println("Before variables are swapped:" + "\n" + "v1 = " + v1 + ", v2 = " + v2);

        System.out.println();

        v1 = v1 + v2; // num1 = 13
        v2 = v1 - v2; // num2 = 8
        v1 = v1 - v2; // num1 = 5

        System.out.println("After variables are swapped:" + "\n" + "v1 = " + v1 + ", v2 = " + v2);
    }



    // Borys is volunteer


}
