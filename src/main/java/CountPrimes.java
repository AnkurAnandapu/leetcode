import java.util.Arrays;
import java.util.stream.IntStream;

public class CountPrimes {

    Integer countOfPrimes(int n) {
        if(n==0 || n==1){
            return 0;
        }
        final Boolean[] isPrime = new Boolean[n];
        Arrays.fill(isPrime, Boolean.TRUE);
        IntStream.iterate(2, i -> i * i < n, i -> i + 1)
                .filter(i -> isPrime[i])
                .forEach(i -> IntStream.iterate(2, j -> j * i < n, j -> j + 1)
                        .forEach(j -> isPrime[j * i] = false));
        return Math.toIntExact(Arrays.stream(isPrime).filter(i -> i).count()) - 2;

    }
}
