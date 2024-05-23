public class SumOfFirstNNumbers {

    public static long sumOfSeries(long n) {
        // code here
        if (n == 0) return 0;

        long sum = sumOfSeries(n - 1);
        long res = (long) Math.pow(n, 3);
        return res + sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfSeries(5));
    }
}
