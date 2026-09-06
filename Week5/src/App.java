//25csu014 Abhishekkkkkkkkkkk
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner in = new Scanner(System.in);

       ShapeManagementApp SMA = new ShapeManagementApp();
       SMA.ShapeManagementApp_main();

       CampusManagementApp CMA = new CampusManagementApp();
       CMA.CampusManagementApp_main();

       in.close();
    }
}
