public class Matrix {
    private int[][] matrix;

    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int addMatrix() {
        int result = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result += matrix[i][j] ;
            }
        }
        return result;
    }

    public int addMatrix(int row) {
        int result = 0;
        for (int i = 0; i < matrix[row].length; i++) {
            result += matrix[row][i] ;
        }
        return result;
    }

    public int multMatrix() {
        int result = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result *= matrix[i][j] ;
            }
        }
        return result;
    }

    public int multMatrix(int row) {
        int result = 1;
        for (int i = 0; i < matrix[row].length; i++) {
            result *= matrix[row][i] ;
        }
        return result;
    }



    public static void main(String[] args) {
        Matrix matrix = new Matrix(new int[][]{{1,2,3},{2,3,4}});
        System.out.println(matrix.addMatrix());
        System.out.println(matrix.addMatrix(1));
        System.out.println(matrix.multMatrix());
        System.out.println(matrix.multMatrix(1));
    }

}
