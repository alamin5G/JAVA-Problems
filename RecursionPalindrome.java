import java.util.Scanner;

public class RecursionPalindrome {
    public static boolean isPalindrome(String s) {

        StringBuilder charAndDigit = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(Character.isLetterOrDigit(s.charAt(i))){
                charAndDigit.append(s.charAt(i));
            }
        }

        String str = charAndDigit.toString();
        str = str.toLowerCase();

        return checkPalindrome(str, 0, str.length()-1);
    }

    public static boolean checkPalindrome(String s, int start, int end) {
        if (start >= end) return true;

        if (s.charAt(start) != s.charAt(end)) return false;


        return checkPalindrome(s, start + 1, end-1);

    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        System.out.println(isPalindrome(s));
    }
}
