import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args) {
    }

    public static String pigLatinSimple(String s) {
        s = s.toLowerCase();
        char first = s.charAt(0);

        if (first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u') {
            s += "hay";
        } else {
            s = s.substring(1, s.length()) + first + "ay";
        }

        return s;
    }

    public static String pigLatin(String s) {
        s = s.toLowerCase();

        String[] digraphsArr = { "bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph",
                "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr" };
        List<String> digraphs = Arrays.asList(digraphsArr);

        if (s.length() == 1)
            return pigLatinSimple(s);

        String firstTwo = s.substring(0, 2);

        if (digraphs.contains(firstTwo)) {
            return s.substring(2, s.length()) + firstTwo + "ay";
        } else {
            return pigLatinSimple(s);
        }
    }

    public static String pigLatinBest(String s) {
        s = s.toLowerCase();

        char first = s.charAt(0);
        char last = s.charAt(s.length() - 1);

        if (!Character.isAlphabetic(first)) {
            return s;
        } else if (!Character.isAlphabetic(last)) {
            return pigLatin(s.substring(0, s.length() - 1)) + last;
        } else {
            return pigLatin(s);
        }
    }
}