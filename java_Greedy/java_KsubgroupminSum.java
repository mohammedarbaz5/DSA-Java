class Solution {
    public int splitArray(int[] nums, int k) {

        int left = 0, right = 0;

        for (int n : nums) {
            left = Math.max(left, n); // minimum possible answer
            right += n;               // maximum possible answer
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            int countofsubarrays = 1, sum = 0;

            for (int n : nums) {
                if (sum + n > mid) {
                    countofsubarrays++;
                    sum = n;
                } else {
                    sum += n;
                }
            }

            if (countofsubarrays <= k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
