class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int[] leftArr = new int[intervals.length];
        int[] rightArr = new int[intervals.length];

        int count = 0;

        for (int i = 0; i < intervals.length; i++) {
            leftArr[i] = intervals[i][0];
            rightArr[i] = intervals[i][1];
        }

        for (int i = 0; i < intervals.length; i++) {
            for (int l = 0; l < leftArr.length; l++) {
                if (intervals[i][0] >= leftArr[l] &&
                        intervals[i][1] <= rightArr[l] &&
                        i != l) {
                    count++;
                    intervals[i][0] = -1;
                    intervals[i][1] = -1;
                    break;
                }
            }
        }

        return intervals.length - count;
    }
}