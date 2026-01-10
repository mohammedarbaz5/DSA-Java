class Solution {
    public int[] applyOperations(int[] nums) {

        // Step 1: Apply operations
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] += nums[i+1];
                nums[i + 1] = 0;
            }
        }

        // Moving zeroes to the end
        int j = 0;
        

        for (int num : nums) {
            if (num != 0) {
                nums[j++] = num;
            }
        }


        return result;
    }
}