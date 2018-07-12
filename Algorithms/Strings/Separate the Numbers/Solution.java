import java.util.Scanner;

/**
 * @author Oleg Cherednik
 * @since 11.07.2018
 */
public class Solution {

    static void separateNumbers(String s) {
        for (int i = 1; i <= s.length() / 2; i++) {
            long num = Long.parseLong(s.substring(0, i));

            if (isMatch(s, i, num)) {
                System.out.println("YES " + num);
                return;
            }
        }

        System.out.println("NO");
    }

    private static boolean isMatch(String s, int i, long num) {
        long nextNum = num + 1;
        boolean match = true;

        while (match && i < s.length()) {
            int len = String.valueOf(nextNum).length();
            match = nextNum == Long.parseLong(s.substring(i, Math.min(s.length(), i + len)));
            i += len;
            nextNum++;
        }

        return match;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            separateNumbers(s);
        }

        scanner.close();
    }
}