//905. Sort Array By Parity
// https://leetcode.com/problems/sort-array-by-parity/description/

// Attempt One
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        List<Integer> evens = new ArrayList();
        List<Integer> odds = new ArrayList();

        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] % 2) == 0) {
                evens.add(nums[i]);
            } else {
                odds.add(nums[i]);
            }
        }

        Collections.sort(evens);
        Collections.sort(odds);

        evens.addAll(odds);

        for (int i = 0; i < nums.length; i++) {
            nums[i] = evens.get(i);
        }

        return nums;

    }
}

// Attempt 2
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        int evenIndex = 0;
        int oddIndex = nums.length - 1;

        for (int num : nums) {
            if (num % 2 == 0) {
                result[evenIndex++] = num;
            } else {
                result[oddIndex--] = num;
            }
        }

        Arrays.sort(result, 0, evenIndex);
        Arrays.sort(result, oddIndex + 1, nums.length);

        return result;
    }

}

// 0 runtime leetcode implementation

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if (nums == null) {
            throw new RuntimeException("");
        }
        int lastEvenIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                int temp = nums[lastEvenIndex];
                nums[lastEvenIndex] = nums[i];
                nums[i] = temp;
                lastEvenIndex++;
            }
        }

        return nums;
    }
}
