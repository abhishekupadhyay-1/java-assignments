import java.util.Scanner;

public class MenuCalculator{
    public void startCalculate(Scanner input){
        int choice;
        do{
            showMenu();
            choice= getChoice(input);
            if(!checkChoice(choice)) {
                System.out.println("Invalid choice!!! TRY AGAIN :(");
                continue;
            }
            if (choice==0){
                System.out.println("Exiting Calculator");
                break;
            }
            System.out.println("enter first no. :");
            float n1=input.nextFloat();
            System.out.println("enter second no. :");
            float n2=input.nextFloat();

            if(choice==4 && n2==0) {
                System.out.println("hahaha XD !!!division by zero errorrrrrrrr!!! :(");
                continue;
            }
            float result= doCalculation(n1, n2, choice);
            System.out.println("The result is :"+ result);
        }
        while(true);
    }
    public void showMenu(){
        System.out.println("Enter your choice :)");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. divide");
        System.out.println("0. exit");
    }

    public int getChoice(Scanner input) {
        return input.nextInt();
    }
    public boolean checkChoice(int choice) {
        if(choice>=0 && choice<=4){
            return true;
        }
        else {return false;}
    }
    public float doCalculation(float n1, float n2, int choice)
    {
        switch(choice) {
            case 1:
                return n1+n2;
            case 2:
                return n1-n2;
            case 3:
                return n1*n2;
            case 4:
                return n1/n2;
            default:
                return 0;
        }
    }
}