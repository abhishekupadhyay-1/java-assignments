import java.util.Scanner;

    public class Gradingsystem {
        public static void main(String[] args) {
            Scanner x = new Scanner(System.in);
             System.out.println("Enter marks:");
             int marks =x.nextInt();

             if((marks>=80) &&(marks <=100)){

                System.out.println("Distinction");
             }else if((marks>=70) && (marks<= 79)){

                System.out.println("Merit");
             }else if((marks>=50) && (marks<=69)){

                System.out.println("Pass");
             }else{

                System.out.println("Fail");
             }
             x.close();
        }}