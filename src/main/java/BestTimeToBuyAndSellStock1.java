import java.util.Arrays;
import java.util.stream.IntStream;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class BestTimeToBuyAndSellStock1 {
    Integer maxProfit(Integer[] input) {
        if(input==null || input.length==0){
            return 0;
        }
        final Integer[] left = getMaxOnLeft(input);
        return Arrays.stream(left).max(Integer::compare).orElse(0);

    }

    private Integer[] getMaxOnLeft(final Integer[] input) {
        final Integer[] left = new Integer[input.length];
        final Integer[] minimum = {input[0]};
        left[0] = 0;
        IntStream.range(1, input.length).forEach(i -> {
            minimum[0] = min(minimum[0], input[i]);
            left[i] = max(left[i - 1], input[i] - minimum[0]);
        });
        //System.out.println(Arrays.toString(left));
        return left;
    }
}
