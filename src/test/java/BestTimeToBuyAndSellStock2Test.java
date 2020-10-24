import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BestTimeToBuyAndSellStock2Test {
    @Test
    void test_BestTimeToBuySell() {
        assertEquals(7, new BestTimeToBuyAndSellStock2().maxProfit(new Integer[]{7,1,5,3,6,4}));
    }
}