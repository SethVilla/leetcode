// 35. Search Insert Position

// https://leetcode.com/problems/search-insert-position/description/

class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = high / 2;

        while (low < high) {
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            mid = (high + low) / 2;
        }

        return nums[mid] >= target ? mid: mid + 1;
    }
}