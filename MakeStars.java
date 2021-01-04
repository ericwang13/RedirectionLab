import java.util.Scanner;

public class MakeStars {
    public static void main(String[] args) {
        Scanner fileScan = new Scanner(System.in);
        String current;

        while (fileScan.hasNextLine()) {
            Scanner lineScan = new Scanner(fileScan.nextLine());
            while (lineScan.hasNext()) {
                current = lineScan.next();
                for (int i = 0; i < current.length(); i++) {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}