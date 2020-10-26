import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortMatrixDiagonalTest {

    @Test
    void sortMatrixDiagonal() {
        assertArrayEquals(new int[][]{{1,1,1,1},{1,2,2,2},{1,2,3,3}}, new SortMatrixDiagonal().sortMatrixDiagonal(new int[][]{{3,3,1,1},{2,2,1,2},{1,1,1,2}}));
        //GIVEN

        //WHEN

        //THEN
    }
}