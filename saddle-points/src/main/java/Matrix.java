import java.util.*;

class Matrix {

    private List<List<Integer>> matrix;
    private int rowLength;
    private  Set<MatrixCoordinate> saddlePoints = new HashSet<>();

    Matrix(List<List<Integer>> values) {
        this.matrix = values;
        rowLength = values.isEmpty() ? 0 : values.get(0).size();
    }

    Set<MatrixCoordinate> getSaddlePoints() {
        if (rowLength == 0) {
            return saddlePoints;
        }
        int maxInARow;
        int minInACol;

        for (int i = 0; i < matrix.size(); i++) {
            maxInARow = matrix.get(i).stream().max(Integer::compareTo).get();
            for (int j = 0; j < rowLength; j ++) {
               if (matrix.get(i).get(j) == maxInARow) {
                   minInACol = getColumn(j).stream().min(Integer::compareTo).get();
                   if (maxInARow == minInACol) {
                       saddlePoints.add(new MatrixCoordinate(i + 1, j + 1));
                   }
               }
            }
        }

        return saddlePoints;
    }

    private List<Integer> getColumn(int colIndex) {
        List<Integer> column = new ArrayList<>();
        for (int i = 0; i < matrix.size(); i++) {
            column.add(matrix.get(i).get(colIndex));
        }
        return column;
    }

}
