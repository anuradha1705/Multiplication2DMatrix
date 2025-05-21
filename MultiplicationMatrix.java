public class MultiplicationMatrix {
    public static void main(String[] args) {
        // First matrix (2x3)
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Second matrix (3x2)
        int[][] B = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        // Result matrix will be (2x2)
        int[][] result = new int[A.length][B[0].length];

        // Matrix multiplication
        for (int i = 0; i < A.length; i++) { // rows of A
            for (int j = 0; j < B[0].length; j++) { // columns of B
                for (int k = 0; k < A[0].length; k++) { // columns of A / rows of B
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Printing the result matrix
        System.out.println("Multiplication of matrices:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
