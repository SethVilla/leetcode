// 34. Find First and Last Position of Element in Sorted Array
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
class Solution {
    public int[] searchRange(int[] nums, int target) {

        int i = 0;
        int j = nums.length - 1;
        int lowR = -1;
        int highR = -1;

        while ( i < nums.length) {
            if (nums[i] == target) {
                lowR = i;
                break;
            }
            i++;
        }
        while ( j >= 0) {
            if (nums[j] == target) {
                highR = j;
                break;
            }
            j--;
        }

        int[] result = new int[2];

        result[0] = lowR;
        result[1] = highR;

        return result;
    }
}