public class LargeArrayExample {
    public static void main(String[] args) {
        try {
            int size = 2_000_000_000; // Example large size
            int[] largeArray = new int[size];
            System.out.println("Array of size " + size + " created successfully.");
        } catch (OutOfMemoryError e) {
            System.out.println("Failed to allocate memory for array: " + e.getMessage());
        }
    }
}
