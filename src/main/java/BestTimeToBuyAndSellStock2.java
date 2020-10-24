import java.util.Arrays;
import java.util.stream.IntStream;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class BestTimeToBuyAndSellStock2 {
    Integer maxProfit(Integer[] input) {
        if(input==null || input.length==0){
            return 0;
        }
        final Integer[] sum = {0};
        IntStream.range(1, input.length)
                .filter(i -> input[i] > input[i - 1])
                .forEach(i -> sum[0] = sum[0] + input[i] - input[i - 1]);
        return sum[0];

    }
}
