import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SummaryRanges {

    //0,1,2,4,5,7
    public List<String> summaryRanges(int[] nums) {
        if (nums == null || nums.length == 0) {
            return Collections.emptyList();
        }
        final List<String> output = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            final int start = nums[i];
            i++;
            int end = start;
            while(i < nums.length && end+1 == nums[i]) {
                end++;
                i++;
            }
            if(start == end) {
                output.add(start + "");
            } else {
                output.add(start + "->" + end);
            }

        }
        return output;
    }
}