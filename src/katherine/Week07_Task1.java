package katherine;

public class Week07_Task1 {

     /*
    Write a function that can reverse String
        Ex: Reverse("ABCD"); ==> DCBA
     */

    public static String reverseString(){
        String original = "ABCD";
        String reverse = " ";

        for (int i = original.length() -1 ; i >= 0; i--) {
            reverse += original.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(reverseString());
    }

}
