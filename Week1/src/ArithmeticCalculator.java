import java.util.Scanner;
public class ArithmeticCalculator {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int n1 = input.nextInt();
    System.out.print("Enter second number: ");
    int n2 = input.nextInt();
    System.out.println("sum :" +(n1+n2));
    System.out.println("difference :" +(n1-n2));
    System.out.println("product :" +(n2*n1));
    System.out.println("quotient :"+(n1/n2));
    System.out.println("remainder :"+(n1%n2));
    input.close();
}
}