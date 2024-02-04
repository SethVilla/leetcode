// 1122. Relative Sort Array
// https://leetcode.com/problems/relative-sort-array/description/

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr1) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int index = 0;

        for (int num : arr2) {
            int count = frequencyMap.getOrDefault(num, 0);
            Arrays.fill(arr1, index, index + count, num);
            index += count;
            frequencyMap.remove(num);
        }

        List<Integer> remainingKeys = frequencyMap.keySet().stream().sorted().collect(Collectors.toList());


        for (int num : remainingKeys) {
            int count = frequencyMap.get(num);
            Arrays.fill(arr1, index, index + count, num);
            index += count;
        }

        return arr1;
    }
}