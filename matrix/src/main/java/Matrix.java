import java.util.Arrays;

class Matrix {

    private int[][] matrix;

    public Matrix(String matrixAsString) {
String[] rows = matrixAsString.split("\n");
        int rowLength = rows[0].split(" ").length;
        matrix = new int[rows.length][];
        for(int i = 0; i < rows.length; i++){
            if(rows[i].split(" ").length != rowLength) {
                throw new IllegalArgumentException("Strange row: aborting!");
            }
            matrix[i] = Arrays.stream(rows[i].split(" ")).mapToInt(Integer::parseInt).toArray();
        }
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
