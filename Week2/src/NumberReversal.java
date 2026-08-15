import java.util.Scanner;
public class NumberReversal {
    public void numReverse(Scanner input) {
        System.out.print("enter the number :");
        int num = input.nextInt();
        int reversed_num = reverseNumber(num);
         System.out.println("Reversed number is: "+ reversed_num);
    }

    public int reverseNumber(int num){
        int rev = 0;
        while(num !=0)
        {
            int digit= num % 10;
            rev=rev*10 + digit;
            num= num/10;
        }
        return rev;
    }
}