import java.util.Scanner;
public class TempConverter {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 System.out.print("Enter the temperature in celsius :");
 double celsius = input.nextDouble();
 double farenheit = celsius * 9.0 / 5.0 + 32.0;
 System.out.println("Temprature in farenheit is :: "+farenheit + " F");
 input.close();
}
}