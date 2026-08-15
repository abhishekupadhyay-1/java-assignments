/*mera hi code haiiiii copy nhi hai  */

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter first no :");
        int n1= input.nextInt();
        System.out.println("enter second no. : ");
        int n2 = input.nextInt();

        System.out.println("GCD is:  "+ gcd(n1,n2));
        
        input.close();
    }
    public static int gcd(int num1, int num2){
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);
        while(num2 !=0)
        {
            int remainder = num1 %num2;
            num1 = num2;
            num2 = remainder;
        }
        return num1;
    }

}
