import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*532. K-diff Pairs in an Array*/
public class Solution {

    Integer uniquePairs(Integer[] input, Integer k) {

        final Map<Integer, Integer> inputMap = new HashMap<>();
        Arrays.stream(input).forEach(i -> inputMap.put(i, inputMap.getOrDefault(i, 0) + 1));
        Integer uniquePairCount = 0;
        for (Integer key : inputMap.keySet()) {
            if (k == 0) {
                if (inputMap.get(key) > 1) {
                    uniquePairCount++;
                }
            } else if (inputMap.containsKey(k + key)) {
                uniquePairCount++;
            }
        }
        return uniquePairCount;
    }
}
