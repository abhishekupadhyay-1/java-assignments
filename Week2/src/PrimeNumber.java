import java.util.Scanner;
public class PrimeNumber {
    public void checkPrime(Scanner input) {
        int num = takeinput(input);
        if(isPrime(num)) 
        {
            System.out.println("yes it is prime no.   :)");
        }
        else {
            System.out.println("not a prime no. :(");
        }
    }
    public int takeinput(Scanner input) {
        System.out.println("enter the no. :");
        int num = input.nextInt();
        return num;
    }
    public boolean isPrime(int num) {
        if(num<2 ) {
            return false;
        }
        for (int i=2; i<= num/2; i++)
        {
            if(num%i == 0)
            {
                return false;
            }
        }
        return true;
    }

}
