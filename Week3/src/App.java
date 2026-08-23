// ye code bhi ABHISHEK PANDIT JIII ka hi haiiii 
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        ArrayStatistics stats = new ArrayStatistics();
        stats.runAS(input);

        LinearSearchToolkit search = new LinearSearchToolkit();
        search.toolkit(input);
       
        MatrixOperations obj = new MatrixOperations();
        obj.run(input);

        ArrayTransformations AT = new ArrayTransformations();
        AT.runTransformation(input);

        BitMaskUtility BMU = new BitMaskUtility();
        BMU.runBMU(input);

        input.close();
    }
}
