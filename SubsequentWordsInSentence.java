public class SubsequentWordsInSentence {
    public static void main(String[] args) {
        String sentence = "Programming is fun and rewarding";

        System.out.println("Original Sentence: " + sentence);
        System.out.println("Subsequent Words:");

        String[] words = sentence.split("\\s+");

        for (int i = 0; i < words.length - 1; i++) {
            String currentWord = words[i];
            String subsequentWord = words[i + 1];
            System.out.println("Word at index " + i + ": " + currentWord + ", Subsequent Word: " + subsequentWord);
        }
    }
}
