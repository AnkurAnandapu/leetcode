import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        final List<List<Integer>> res = new ArrayList<>();
        if (numRows == 0) {
            return res;
        }
        res.add(List.of(1));
        IntStream.range(1, numRows).forEach(i -> {
            final List<Integer> previous = res.get(i - 1);
            final List<Integer> current = new ArrayList<>();
            current.add(1);
            IntStream.range(1, i).forEach(j -> current.add(previous.get(j - 1) + previous.get(j)));
            current.add(1);
            res.add(current);
        });
        return res;
    }
}