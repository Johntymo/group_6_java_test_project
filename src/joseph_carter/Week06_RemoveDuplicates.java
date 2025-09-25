package joseph_carter;

import java.util.ArrayList;
import java.util.Arrays;

public class Week06_RemoveDuplicates {
    /*
    Write function that can remove the duplicated values from String
            Ex: removeDup("AAABBBCCCAABBCCDD") ==> ABC
     */

    public static void main(String[] args) {
        String str = "AAABBBCCCAABBCCDD";

        ArrayList<String> hasDuplications = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            hasDuplications.add(String.valueOf(str.charAt(i)));
        }
        System.out.println("List with Duplications - " + hasDuplications);


        ArrayList<String> noDuplications = new ArrayList<>();

        for (String eachLetter : hasDuplications) {
            if (!noDuplications.contains(eachLetter)) {
                noDuplications.add(eachLetter);
            }
         }

        System.out.println("List without Duplications - " + noDuplications);
    }


      // Joseph is volunteer




}
