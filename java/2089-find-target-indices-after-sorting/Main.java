// 2089. Find Target Indices After Sorting Array
// https://leetcode.com/problems/find-target-indices-after-sorting-array/description/

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            int mini = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[mini]) {
                    mini = j;
                }
            }
            if (nums[mini] < nums[i]) {
                int temp = nums[mini];
                nums[mini] = nums[i];
                nums[i] = temp;
            }
        }

        for (int i = 0; i < nums.length && nums[i] <= target; i++) {
            if (nums[i] == target) {
                result.add(i);
            }
        }

        return result;
    }
}