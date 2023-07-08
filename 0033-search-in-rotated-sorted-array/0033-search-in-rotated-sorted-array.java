class Solution {
public int search(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (nums[mid] == target) {
            return mid;
        }

        if (nums[left] <= nums[mid]) {
            if (target >= nums[left] && target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        } else {
            if (target > nums[mid] && target <= nums[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    }

    return -1;
}
    static int pivot(int[] arr, int low, int high) {
        if (high < low) {
            return -1;
        }
        if (high == low) {
            return low;
        }
        int mid = (high + low) / 2;
        if (arr[mid] > arr[mid + 1]) {
            return mid;
        }
if (mid > low && arr[mid] < arr[mid - 1]) {
        return mid - 1;
    }
    if (arr[low] >= arr[mid]) {
        return pivot(arr, low, mid - 1);
    }
    return pivot(arr, mid + 1, high);
    }

    static int binarySearch(int[] arr, int start, int end, int key) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (key == arr[mid]) {
                return mid;
            } else if (key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
