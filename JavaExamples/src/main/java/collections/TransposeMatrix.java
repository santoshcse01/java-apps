package collections;

import java.util.Arrays;

public class TransposeMatrix {

    public static void main(String a[]) {
        int matrix[][]={{1,3},{2,4}};
        transpose(2, matrix);
    }

    private static void transpose(int matrixSize, int[][] matrix) {
        int transposeMatrix[][] = new int[matrixSize][matrixSize];
        for (int i=0; i<matrixSize; i++) {
            for (int j=0; j<matrixSize; j++) {
                transposeMatrix[i][j] = matrix[j][i];
            }
        }
        Arrays.stream(transposeMatrix).forEach(row -> {
            Arrays.stream(row).forEach(System.out::print);
            System.out.println();
        });
    }

}
