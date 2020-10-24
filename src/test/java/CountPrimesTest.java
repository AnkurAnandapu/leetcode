import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountPrimesTest {

    @Test
    void test_CountOfPrimes(){
        assertEquals(4, new CountPrimes().countOfPrimes(10));
    }
}