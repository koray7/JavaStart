
import java.io.BufferedReader;

public class SumOneToN {
    public static void main(String[] args) {
        int n, sumOne, sumTwo;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an integer: ");
        n = Integer.parseInt(br.readLine());
        sumOne = SumOneToN(n);
        System.out.println("The sum of 1 to n = O(1) = " + sumOne);
        sumTwo = anotherSum(n);
        System.out.println("The sum of 1 to n = O(n) = " + sumTwo);
    }
    public static long SumOneToN(long n) {
        return n * (n + 1) / 2;
    }

    public static long anotherSum(long n) {
        long sum = 0;
        for (long i=1; i<=n; i++) {
            sum += i;
        }
        return sum;
    }
}