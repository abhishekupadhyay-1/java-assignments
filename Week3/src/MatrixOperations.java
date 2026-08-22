public class MatrixOperations {
    public int[] rowSums(int[][] matrix) {
        int[] rSum = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int s = 0;
            for (int j = 0; j <= matrix[i].length; j++) {
                s += matrix[i][j];
            }
            rSum[i] = s;
        }
        return rSum;
    }               
    public int[] columnSums(int[][] matrix) {
        int[] cSum = new int[matrix.length];
        for (int i = 0; i < matrix[i].length; i++) {
            int s = 0;
            for (int j = 0; j <= matrix.length; j++) {
                s += matrix[j][i];
            }
            cSum[i] = s;
        }
        return cSum;
    }
    public int[][] add(int[][] first, int[][] second) {
        if (first.length != second.length || first[0].length != second[0].length) {
            System.out.println("dimensions are not same");
            int[][] garbage = new int[1][1];
            garbage[0][0] = -1;
            return garbage;
        }
        int[][] arrSum = new int[second.length][second[0].length];
        for (int i = 0; i < second.length; i++) {
            for (int j = 0; j < second[0].length; j++) {
                arrSum[i][j] = first[i][j] + second[i][j];

            }
        }
        return arrSum;
    }
    public int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] tpose = new int[columns][rows];
        for(int i=0; i<rows ; i++){
            for(int j=0 ; j<columns ; j++){
                tpose[j][i]= matrix
            }
        }
    }
}
