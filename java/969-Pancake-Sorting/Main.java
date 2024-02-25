// 969. Pancake Sorting
// https://leetcode.com/problems/pancake-sorting/description/

class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> result = new ArrayList<>();

        for (int end = arr.length; end > 0; end--) {
            int maxIndex = findMaxIndex(arr, end);

            if (maxIndex != end - 1) {
                flip(arr, maxIndex);
                result.add(maxIndex + 1);

                flip(arr, end - 1);
                result.add(end);
            }
        }

        return result;
    }

    private int findMaxIndex(int[] arr, int end) {
        int maxIndex = 0;
        for (int i = 1; i < end; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private void flip(int[] arr, int end) {
        int start = 0;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}