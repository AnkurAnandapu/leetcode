import java.util.stream.IntStream;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class BestTimeToBuyAndSellStock3 {
    Integer maxProfit(Integer[] input) {

        final Integer[] left = getMaxOnLeft(input);
        final Integer[] right = getMaxOnRight(input);
        return getMaxProfit(input, left, right);

    }

    private Integer getMaxProfit(final Integer[] input, final Integer[] left, final Integer[] right) {
        final Integer[] profit = {0};
        IntStream.range(0, input.length).forEach(i -> {
            profit[0] = max(profit[0], left[i] + right[i]);
        });
        return profit[0];
    }

    private Integer[] getMaxOnRight(final Integer[] input) {
        final Integer[] right = new Integer[input.length];
        final Integer[] maximum = {input[input.length - 1]};
        right[input.length - 1] = 0;
        for (int i = input.length - 2; i >= 0; i--) {
            maximum[0] = max(maximum[0], input[i]);
            right[i] = max(right[i + 1], maximum[0] - input[i]);
        }
        //System.out.println(Arrays.toString(right));
        return right;
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
