/*!!!!!!!!!!!         ABHISHEK PANDIT JI KA CODE HAI YE          !!!!!!!!!!!! */

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        MenuCalculator calc= new MenuCalculator();
        calc.startCalculate(input);

        PrimeNumber prime = new PrimeNumber();
        prime.checkPrime(input);

        NumberReversal number = new NumberReversal();
        number.numReverse(input);

        LoopPatterns pattern = new LoopPatterns();
        pattern.lp(input);    

        MarksProcessor marks= new MarksProcessor();
        marks.start(input);
        

        input.close();
    }
}
