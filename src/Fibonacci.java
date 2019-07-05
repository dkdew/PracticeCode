

public class Fibonacci {
    public int CalculateFibonacci(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++)
            dp[i] = dp[i - 1] + dp[i - 2];
        return dp[n];
    }

    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        System.out.println(fib.CalculateFibonacci(5));
        System.out.println(fib.CalculateFibonacci(6));
        System.out.println(fib.CalculateFibonacci(7));
    }
}