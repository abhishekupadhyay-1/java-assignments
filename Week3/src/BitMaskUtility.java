import java.util.Scanner;

public class BitMaskUtility {

     public void runBMU(Scanner input) {

        System.out.print("Enter number: ");
        int number = input.nextInt();

        System.out.println("Before:");
        System.out.println("Decimal: " + number);
        System.out.println("Binary:  " + toBinary32(number));

        System.out.println("1. Check Bit");
        System.out.println("2. Set Bit");
        System.out.println("3. Clear Bit");
        System.out.println("4. Toggle Bit");
        System.out.print("Enter operation: ");

        int operation = input.nextInt();

        System.out.print("Enter bit position (0-31): ");
        int position = input.nextInt();

        if (position < 0 || position > 31) {
            System.out.println("Invalid bit position.");
            return;
        }

        int result = number;

        switch (operation) {

            case 1:
                if (isBitSet(number, position)) {
                    System.out.println("Bit is SET (1)");
                } else {
                    System.out.println("Bit is CLEAR (0)");
                }
                break;

            case 2:
                result = setBit(number, position);
                break;

            case 3:
                result = clearBit(number, position);
                break;

            case 4:
                result = toggleBit(number, position);
                break;

            default:
                System.out.println("Invalid operation.");
                return;
        }

        if (operation != 1) {
            System.out.println("After:");
            System.out.println("Decimal: " + result);
            System.out.println("Binary:  " + toBinary32(result));
        }
    }
    
    public boolean isBitSet(int number, int position) {
        return (number & (1 << position)) != 0;
    }

    public int setBit(int number, int position) {
        return number | (1 << position);
    }

    public int clearBit(int number, int position) {
        return number & ~(1 << position);
    }

    public int toggleBit(int number, int position) {
        return number ^ (1 << position);
    }

    public String toBinary32(int number) {
        String result = "";

        for (int i = 31; i >= 0; i--) {
            if ((number & (1 << i)) != 0) {
                result += "1";
            } else {
                result += "0";
            }
        }

        return result;
    }
}