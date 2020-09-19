/**
 * <p>Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:</p>
 * <p class="center">1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...</p>
 * <p>By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.</p>
 *
 * @author Oleg Cherednik
 * @since 19.09.2020
 */
public class Euler {

    public static void main(String... args) {
        System.out.println(Solution.findEvenFibonacciSum(4_000_000));    //  4613732
    }
}
