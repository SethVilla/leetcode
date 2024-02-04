// 88. Merge Sorted Array
// https://leetcode.com/problems/merge-sorted-array/description/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        Integer[] tempArray = new Integer[m + n];

        int num1Index = 0;
        int num2Index = 0;
        int tempIndex = 0;

        while (num1Index < m || num2Index < n) {

            if (num1Index >= m) {
                tempArray[tempIndex] = nums2[num2Index];
                tempIndex++;
                num2Index++;
                continue;
            }

            if (num2Index >= n) {
                tempArray[tempIndex] = nums1[num1Index];
                tempIndex++;
                num1Index++;
                continue;
            }

            if (nums1[num1Index] <= nums2[num2Index]) {
                tempArray[tempIndex] = nums1[num1Index];
                num1Index++;
                tempIndex++;
            } else {
                tempArray[tempIndex] = nums2[num2Index];
                num2Index++;
                tempIndex++;
            }
        }

        for (int i = 0; i < n + m; i++) {
            nums1[i] = tempArray[i];
        }
    }
}