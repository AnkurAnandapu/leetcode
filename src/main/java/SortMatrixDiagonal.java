import java.util.PriorityQueue;
import java.util.stream.IntStream;

public class SortMatrixDiagonal {

    int[][] sortMatrixDiagonal(int[][] mat) {

        final int numberOfRows = mat.length;
        final int numberOfColumns = mat[0].length;
        final int numberOfDiagonals = numberOfRows + numberOfColumns - 1;
        final PriorityQueue<Integer>[] sortedDiagonals = new PriorityQueue[numberOfDiagonals];
        IntStream.range(0, numberOfDiagonals).forEach(i -> sortedDiagonals[i] = new PriorityQueue<>());

        IntStream.range(0, numberOfRows)
                .forEach(i -> IntStream.range(0, numberOfColumns)
                        .forEach(j ->
                                sortedDiagonals[id(i, j, numberOfColumns)].offer(mat[i][j])));

        IntStream.range(0, numberOfRows)
                .forEach(i -> IntStream.range(0, numberOfColumns)
                        .forEach(j ->
                                mat[i][j] = sortedDiagonals[id(i, j, numberOfColumns)].poll()));
        return mat;

    }

    private int id(final int row, final int col, final int numberOfColumns) {
        return row - col + numberOfColumns - 1;
    }
}
