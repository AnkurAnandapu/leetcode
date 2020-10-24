import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void testInput() {
        assertEquals(2, new Solution().uniquePairs(new Integer[]{3, 1, 4, 1, 5}, 2));
    }

    @Test
    void testInput1() {
        assertEquals(4, new Solution().uniquePairs(new Integer[]{1, 2, 3, 4, 5}, 1));
    }

    @Test
    void testInput2() {
        assertEquals(2, new Solution().uniquePairs(new Integer[]{1, 2, 4, 4, 3, 3, 0, 9, 2, 3}, 3));
    }

    @Test
    void testInput3() {
        assertEquals(2, new Solution().uniquePairs(new Integer[]{-1,-2,-3}, 1));
    }

}