
public class FibonacciRec {
    public int CalculateFibonacci(int n) {
        if (n < 2)
            return n;
        return CalculateFibonacci(n - 1) + CalculateFibonacci(n - 2);
    }

    public static void main(String[] args) {
        FibonacciRec fib = new FibonacciRec();
        System.out.println(fib.CalculateFibonacci(5));
        System.out.println(fib.CalculateFibonacci(6));
    }
}