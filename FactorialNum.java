import java.util.ArrayList;

public class FactorialNum {

    public static ArrayList<Long> factorialNumbers(long N){
        // code here
        ArrayList<Long> fact = new ArrayList<>();
        findFactorial(N, 1L, 1, fact);
        return fact;
    }

    private  static void findFactorial(Long N, Long currentFactorial, int i, ArrayList<Long> fact){
        if (currentFactorial > N){
            return;
        }

        fact.add(currentFactorial);
        findFactorial(N, currentFactorial*(i+1), i + 1, fact);
    }

    public static void main(String[] args) {

            ArrayList<Long> factorial = factorialNumbers(6);
        System.out.println(factorial);
    }
}
