public class java_KsubgroupminSum {
    public static int splitArray(int[] arr, int k) {
        int low = 0, high = 0;

        // Step 1: search space
        for (int num : arr) {
            low = Math.max(low, num);
            high += num;
        }

        // Step 2: binary search
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canSplit(arr, k, mid)) {
                high = mid - 1; // try smaller max sum
            } else {
                low = mid + 1;  // increase max sum
            }
        }
        return low;
    }

    private static boolean canSplit(int[] arr, int k, int maxSum) {
        int count = 1;
        int currSum = 0;

        for (int num : arr) {
            if (currSum + num <= maxSum) {
                currSum += num;
            } else {
                count++;
                currSum = num;
                if (count > k) return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2};
        int k =2;
        int arr1[] = {1,2,3,4};
        int k1 =3;
        System.out.println(splitArray(arr, k));
        System.out.println(splitArray(arr1, k1));
    }
}
