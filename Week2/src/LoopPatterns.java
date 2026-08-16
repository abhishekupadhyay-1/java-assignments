import java.util.Scanner;
public class LoopPatterns {
    public void patternA(int size){
         System.out.println("Pattern A = ");
         for(int i=1; i<=size; i++) {       //this loop is controlling row ;)
            for (int j =1; j<= size; j++) {     //this is for column :)
                 System.out.print("* ");
            }
             System.out.println();
         }
    }

    public void patternC (int size) {
         System.out.println("Pattern C = ");
         for (int i=1; i<=size ; i++) {     //row
                for(int j=1; j<=i ; j++) {      //column
                    System.out.print(j + " ");
                }
                 System.out.println();
         }
    }    

    public void lp(Scanner input) {
        System.out.println("enter the size: ");
        int size = input.nextInt();
        if (size<1)
        {
           System.out.println("Invalid size!!!");  
        }
        else{
            patternA(size);
            System.out.println();
            patternC(size);
        }
    }
}
