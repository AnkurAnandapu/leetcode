public class MaximizeDistanceToClosestPerson {

    public Integer maxDistToClosest(int[] seats) {
        int start = -1;
        final int n = seats.length;
        int maxDistance = 0;
        for (int i = 0; i < n; i++) {
            if (seats[i] == 1) {
                if (start == -1) {
                    maxDistance = i;
                } else {
                    maxDistance = Math.max(maxDistance, (i - start) / 2);
                }
                start = i;
            }
        }
        if (seats[n - 1] == 0) {
            return Math.max(maxDistance, n - 1 - start);
        }
        return maxDistance;
    }
}