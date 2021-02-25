package codewars.chalenges;

import java.util.Scanner;

/** Description:
 * Each new line from the input will give us a string, followed by an integer.
 * Each string will have a maximum of 10 alphabetic characters and each integer will be in the range 0 to 999.
 * We need to write a program that has two columns on each output row:
 * The first column contains a String and is left-aligned using exactly 15 characters.
 * The second column contains the integer, expressed in exactly 3 digits. If the original input
 * has less than three digits, we must put the leading digits on your output with zeros.
 */

public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = scan.next();
            int x = scan.nextInt();

            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");

    }
}
