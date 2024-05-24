public class RecursionFibonacci {

    public static int fib(int n) {

        if (n == 0) return 0;
        if (n == 1) return 1;

        int first = fib(n-1);
        int second = fib(n-2);

        return  first + second;


    }

    public static void main(String[] args) {
        System.out.println(fib(5));
    }
}
