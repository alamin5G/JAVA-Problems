public class SubsequentStringCharacters {
    public static void main(String[] args) {
        String inputString = "Java";

        System.out.println("Original String: " + inputString);
        System.out.println("Subsequent Characters:");

        for (int i = 0; i < inputString.length() - 1; i++) {
            char currentChar = inputString.charAt(i);
            char subsequentChar = inputString.charAt(i + 1);
            System.out.println("Character at index " + i + ": " + currentChar + ", Subsequent Character: " + subsequentChar);
        }
    }
}
