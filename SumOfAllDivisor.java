public class SumOfAllDivisor {
    static long sumOfDivisors(int N){
        // code here
        long sum = 0;
        // Iterating from 1 to N.
        for (int i = 1; i <= N; i++) {
            // Calculating and accumulating the sum of divisors.
            sum += (N / i) * i;
        }

        return sum;
    }

    public static void main(String[] args) {
        long l = sumOfDivisors(6);
        System.out.println(l);
    }
}
