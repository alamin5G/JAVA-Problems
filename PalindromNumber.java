public class PalindromNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(10101));
    }

    public static boolean isPalindrome(int x) {
        if (x<0) {
            return false;
        }
        int digitLength = (int) Math.floor(Math.log10(x)+1);
        int msd = (int) Math.pow(10, digitLength-1);

        for (int i = 0; i < (digitLength/2); i++) {
            
            if (x/msd != x%10) {
                return false;
            }
            x = x % msd; //remove the most significant digit of x;
            
            x = x/10; //remove the least significant digit of x;
            msd = msd/100;

        }

        return true;
    }
}
