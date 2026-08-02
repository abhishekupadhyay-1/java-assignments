import java.util.Scanner;
public class rectangle {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length and breadth of rectangle");
        int length = input.nextInt();
        int breadth = input.nextInt();
        int area = (length*breadth);
        System.out.println("Area is : " + area);
        int perimeter = (2*length)+(2*breadth);
        System.out.println("perimeter is : "+perimeter);
  
        input.close();
    }
}
