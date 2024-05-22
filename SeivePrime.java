
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeivePrime {

    //find the n numbers of prime from 1 to n;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want 1 upto n prime numbers: ");
        int n = input.nextInt();

        List<Boolean> isPrime = new ArrayList<>();

        for (int i = 0; i < n+1; i++) {
           isPrime.add(Boolean.TRUE);
        }


        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(isPrime.get(i)){
                for (int j = 2*i; j <=n; j=j+i) {
                    isPrime.set(j, Boolean.FALSE);
                }
            }
        }

        for (int i = 2; i < n+1; i++) {
            if(isPrime.get(i)){
                System.out.print(i + " ");
            }
        }
        
    }

}
