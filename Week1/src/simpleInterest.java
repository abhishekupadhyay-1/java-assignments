import java.util.Scanner;
public class simpleInterest {
public static void main(String[] args)
{
Scanner input =new Scanner(System.in);
System.out.println("Enter Principal : ");
double principal =input.nextDouble();
System.out.println("Enter Annual Interest Rate :");
double rate=input.nextDouble();
System.out.println("Enter Time in years :");
double time=input.nextDouble();
double simpleInterest=principal*rate* time/100;
double finalAmount=principal+simpleInterest;
System.out.println("Your Interest Amount is "+simpleInterest);
System.out.println("Your finalAmount Amount is "+finalAmount);

input.close();
}
}