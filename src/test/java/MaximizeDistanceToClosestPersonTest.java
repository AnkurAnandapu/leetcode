import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximizeDistanceToClosestPersonTest {

    @Test
    void maximizeDistanceToClosestPersonTest() {
        assertEquals(2, new MaximizeDistanceToClosestPerson().maxDistToClosest(new int[]{1, 0, 0, 0, 1, 0, 1}));
        assertEquals(3, new MaximizeDistanceToClosestPerson().maxDistToClosest(new int[]{1,0,0,0}));
        assertEquals(1, new MaximizeDistanceToClosestPerson().maxDistToClosest(new int[]{0, 1}));
        //GIVEN

        //WHEN

        //THEN
    }
}