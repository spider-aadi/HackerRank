import java.util.Arrays;
import java.util.Scanner;

/**
 * <p>By starting at the top of the triangle below and moving to adjacent numbers on the row below, the maximum total from top to bottom is 23.</p>
 * <p class="monospace center"><span class="red"><b>3</b></span><br /><span class="red"><b>7</b></span> 4<br />
 * 2 <span class="red"><b>4</b></span> 6<br />
 * 8 5 <span class="red"><b>9</b></span> 3</p>
 * <p>That is, 3 + 7 + 4 + 9 = 23.</p>
 * <p>Find the maximum total from top to bottom in <a href="p067_triangle.txt">triangle.txt</a> (right click and 'Save Link/Target
 * As...'), a 15K text file containing a triangle with one-hundred rows.</p>
 * <p class="smaller"><b>NOTE:</b> This is a much more difficult version of <a href="problem=18">Problem 18</a>. It is not possible to try every route
 * to solve this problem, as there are 2<sup>99</sup> altogether! If you could check one trillion (10<sup>12</sup>) routes every second it would take
 * over twenty billion years to check them all. There is an efficient algorithm to solve it. ;o)</p>
 *
 * @author Oleg Cherednik
 * @since 19.09.2020
 */
public class Euler {

    public static void main(String... args) {
        try (Scanner scan = new Scanner(Euler.class.getResourceAsStream("./p067_triangle.txt"))) {
            int[][] data = new int[100][];

            for (int row = 0; row < data.length; row++)
                data[row] = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

            System.out.println(Solution.findMaxSum(data));   // 7273
        }
    }

}
