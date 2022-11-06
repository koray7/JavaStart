


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
}