import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BestTimeToBuyAndSellStock3Test {

    @Test
    void test_BestTimeToBuySell() {
        assertEquals(13, new BestTimeToBuyAndSellStock3().maxProfit(new Integer[]{1, 4, 5, 7, 6, 3, 2, 9}));
    }

}