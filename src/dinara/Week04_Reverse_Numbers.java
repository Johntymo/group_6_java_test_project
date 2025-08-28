package dinara;

public class Week04_Reverse_Numbers {

      /*
    Write a return method that can reverse
negative number and return it as int
     */

          public static int reverseNumbers ( int num){

              if (num < 0) {
                  num = -num;
              }
              return num;

          }

    public static void main(String[] args) {
        System.out.println(reverseNumbers(-7));
        System.out.println(reverseNumbers(-12));
    }

}
