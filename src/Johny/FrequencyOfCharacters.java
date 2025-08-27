package Johny;

public class FrequencyOfCharacters {

    /*
   Write function that can find the frequency of characters
           Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
    */

    public static void main(String[] args) {


        String original = "AAABBCDD"; //7
        String result = "";

        for (int i = 0; i < original.length(); ) {
            int count = 1;
            char current = original.charAt(i);

            for (int j = i + 1; j < original.length(); j++) {
                if (original.charAt(j) == current) {
                    count++;
                } else {
                    break;
                }
            }

            result += current + "" + count;
            i += count;

        }

        System.out.println(result);

    }
}
