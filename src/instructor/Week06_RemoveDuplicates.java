package instructor;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Week06_RemoveDuplicates {
    /*
    Write function that can remove the duplicated values from String
            Ex: removeDup("AAABBBCCCAABBCCDD") ==> ABC
     */

      // Joseph is volunteer

    public static String removeDup(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (!result.contains("" + str.charAt(i))) {
                result += "" + str.charAt(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(removeDup("AAABBBCCCAABBCCDD"));
    }




}
