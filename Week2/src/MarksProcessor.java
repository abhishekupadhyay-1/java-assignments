import java.util.Scanner;

public class MarksProcessor {

    public void start(Scanner input) {

        int count = 0;
        int sum = 0;
        int highest = 0;
        int passes = 0;
        int failures = 0;

        while (true) {

            System.out.print("Enter-1 to stop ");
            int mark = input.nextInt();

            if (mark == -1) {
                break;
            }

            if (!isValidMark(mark)) {
                System.out.println("Invalid mark! Enter a mark between 0 and 100.");
                continue;
            }

            count++;
            sum += mark;

            if (mark > highest) {
                highest = mark;
            }

            if (mark >= 50) {
                passes++;
            } else {
                failures++;
            }
        }

        displayResults(count, sum, highest, passes, failures);
    }

    public static boolean isValidMark(int mark) {

        return mark >= 0 && mark <= 100;
    }

    public void displayResults(int count, int sum, int highest,
                               int passes, int failures) {

        System.out.println("\n--- Results ---");
        System.out.println("No  of valid marks: " + count);
        System.out.println("Sum of marks: " + sum);

        if (count > 0) {
            System.out.println("Avg mark: " + (double) sum / count);
            System.out.println("Highest mark: " + highest);
        } else {
            System.out.println("Avg mark: 0");
            System.out.println("Highest mark: No marks entered");
        }

        System.out.println("No of passes: " + passes);
        System.out.println("No of failures: " + failures);
    }
}