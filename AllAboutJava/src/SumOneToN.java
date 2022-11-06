


public class SumOneToN {
    public static void main(String[] args) {
        int n, sumOne, sumTwo;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an integer: ");
        n = Integer.parseInt(br.readLine());
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