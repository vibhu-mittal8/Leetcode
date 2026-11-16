class Solution {
    public int splitArray(int[] arr, int k) {
        if (k > arr.length) {
            return -1;
        }

        long low = 0;
        long high = 0;

        for (int val : arr) {
            low = Math.max(low, val);
            high += val;
        }

        long ans = -1;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (isPossible(arr, k, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return (int) ans;
    }

    public boolean isPossible(int[] arr, int k, long mid) {
        int count = 1;
        long sum = 0;

        for (int val : arr) {
            if (sum + val > mid) {
                count++;
                sum = val;
            } else {
                sum += val;
            }
        }

        return count <= k;
    }
}