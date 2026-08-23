import java.util.Scanner;

public class ArrayTransformations {

    public void reverseInPlace(int[] values) {
        int left = 0;
        int right = values.length - 1;

        while (left < right) {
            int temp = values[left];
            values[left] = values[right];
            values[right] = temp;

            left++;
            right--;
        }
    }

    public int[] reversedCopy(int[] values) {
        int[] result = new int[values.length];

        for (int i = 0; i < values.length; i++) {
            result[i] = values[values.length - 1 - i];
        }

        return result;
    }

    public int removeValue(int[] values, int target) {
        int write = 0;

        for (int i = 0; i < values.length; i++) {
            if (values[i] != target) {
                values[write] = values[i];
                write++;
            }
        }

        return write;
    }

    public int[] runningSum(int[] values) {
        int[] result = new int[values.length];

        if (values.length == 0) {
            return result;
        }

        result[0] = values[0];

        for (int i = 1; i < values.length; i++) {
            result[i] = result[i - 1] + values[i];
        }

        return result;
    }

    public void runTransformation(Scanner input) {
        System.out.print("Enter array size: ");
        int n = input.nextInt();

        int[] values = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            values[i] = input.nextInt();
        }

        if (n == 0) {
            System.out.println("Array is empty");
            return;
        }

        System.out.print("Enter value to remove: ");
        int target = input.nextInt();

        System.out.println("Original array:");

        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }

        reverseInPlace(values);

        System.out.println();
        System.out.println("After reverseInPlace:");

        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }

        int[] copy = reversedCopy(values);

        System.out.println();
        System.out.println("Reversed copy:");

        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }

        int newLength = removeValue(values, target);

        System.out.println();
        System.out.println("After removeValue:");

        for (int i = 0; i < newLength; i++) {
            System.out.print(values[i] + " ");
        }

        System.out.println();
        System.out.println("Original length: " + values.length);
        System.out.println("Logical length: " + newLength);

        int[] sums = runningSum(values);

        System.out.println("Running sum:");

        for (int i = 0; i < newLength; i++) {
            System.out.print(sums[i] + " ");
        }
    }
}