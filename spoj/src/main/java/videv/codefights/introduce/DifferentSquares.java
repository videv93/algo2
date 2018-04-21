package videv.codefights.introduce;

public class DifferentSquares {
    int differentSquares(int[][] matrix) {
        if (matrix.length < 2 || matrix[0].length < 2) {
            return 0;
        }
        int c = 0;
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                for (int k = 0; k < matrix.length - 1; k++) {
                    for (int l = 0; l < matrix[k].length - 1; l++) {
                        if (i != k || j != l) {
                            if (check(matrix, i, j, k, l)) c++;
                        }
                    }
                }
            }
        }
        return (matrix.length - 1) * (matrix[0].length - 1) - c/2;
    }

    boolean check(int[][] matrix, int i1, int j1, int i2, int j2) {
        return matrix[i1][j1] == matrix[i2][j2]
                && matrix[i1][j1+1] == matrix[i2][j2+1]
                && matrix[i1+1][j1] == matrix[i2+1][j2]
                && matrix[i1+1][j1+1] == matrix[i2+1][j2+1];
    }
}
