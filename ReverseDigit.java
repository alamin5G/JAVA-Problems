import java.util.Scanner;

public class ReverseDigit {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int aNumber = input.nextInt();
        System.out.println("Before Reverse The number is : " + aNumber);
        int reverseOrder = reversedNumber(aNumber);
        System.out.println("After Reverse The number is : " + reverseOrder);
        
    }

    private static int reversedNumber(int aNumber) {
        
        int reverse=0;
        while (aNumber!=0) {
            int a = aNumber%10;
            reverse = (reverse * 10)+ a;
            aNumber = aNumber/10;
        }
        return reverse;
    }
}
