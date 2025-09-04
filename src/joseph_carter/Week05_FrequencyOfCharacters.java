package joseph_carter;

import java.util.LinkedHashMap;
import java.util.Map;

public class Week05_FrequencyOfCharacters {

    /*
    Write function that can find the frequency of characters
            Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */

    public static void main(String[] args) {

        String str = "AAABBCDD";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            char current = str.charAt(i);

            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) == current) {
                    count++;
                }
            }
            result += current + "" + count;
            str = str.replace("" + str.charAt(i), "");
            //i += count;
        }

        System.out.println(result);











    }




}
