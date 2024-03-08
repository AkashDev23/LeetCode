class Solution {
    public void nextPermutation(int[] nums) {
        // Find the first element from the end that is smaller than the element to its right
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i >= 0) {
            // Find the element to the right of nums[i] that is just larger than nums[i]
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            // Swap nums[i] and nums[j]
            swap(nums, i, j);
        }
        // Reverse the subarray starting from nums[i + 1] to the end
        reverse(nums, i + 1);
    }

    // Swap elements at indices i and j in the array nums
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Reverse the subarray from start to the end of the array nums
    private void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}