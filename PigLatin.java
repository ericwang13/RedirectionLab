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
}