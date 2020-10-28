import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SummaryRangesTest {

    @Test
    void testSummaryRanges(){

        assertEquals(List.of("0->2","4->5","7"), new SummaryRanges().summaryRanges(new int[]{0,1,2,4,5,7}));
    }

}