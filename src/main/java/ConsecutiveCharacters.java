public class ConsecutiveCharacters {

    public int maxPower(String s) {
        int maxP = 0, sum = 1;
        char init = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == init) {
                sum++;
                maxP = Math.max(maxP, sum);
            } else {
                init = s.charAt(i);
                sum = 1;
            }
        }
        return maxP==0?1:maxP;

    }
}