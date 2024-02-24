import java.time.LocalDate;

public class SubsequentDates {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        System.out.println("Current Date: " + currentDate);
        System.out.println("Subsequent Dates:");

        for (int i = 0; i < 5; i++) {
            LocalDate subsequentDate = currentDate.plusDays(i);
            System.out.println("Date at index " + i + ": " + subsequentDate);
        }
    }
}
