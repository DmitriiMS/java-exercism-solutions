import java.util.Arrays;

class Matrix {

    private final int[][] matrix;

    public Matrix(String matrixAsString) {
        matrix = Arrays.stream(matrixAsString.split("\n"))
                .map(s -> Arrays.stream(s.split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray())
                .toArray(int[][]::new);
    }

    public int[] getRow(int rowNumber) {
        if(rowNumber < 1 || rowNumber > matrix.length) {
            return null;
        }
        return matrix[rowNumber - 1];
    }

    public int[] getColumn(int columnNumber) {
        if(columnNumber < 1 || columnNumber > matrix[0].length) {
            return null;
        }
        return Arrays.stream(matrix).mapToInt(r -> r[columnNumber - 1]).toArray();
    }
}
