import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        MenuCalculator calc= new MenuCalculator();
        calc.startCalculate(input);
        

        input.close();
    }
}
