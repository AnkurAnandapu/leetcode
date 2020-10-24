import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BestTimeToBuyAndSellStock1Test {
    @Test
    void test_BestTimeToBuySell() {
        assertEquals(5, new BestTimeToBuyAndSellStock1().maxProfit(new Integer[]{7, 1, 5, 3, 6, 4}));
    }
}