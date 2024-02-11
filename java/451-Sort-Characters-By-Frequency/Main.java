// 451. Sort Characters By Frequency
// https://leetcode.com/problems/sort-characters-by-frequency/description/

public class Solution {
    public String frequencySort(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        // Step 1: Count the frequency of each character
        Map<Character, Integer> charFrequencyMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
        }

        // Step 2: Create a priority queue to sort characters by frequency
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> charFrequencyMap.get(b) - charFrequencyMap.get(a));
        maxHeap.addAll(charFrequencyMap.keySet());

        // Step 3: Build the result string
        StringBuilder result = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            char currentChar = maxHeap.poll();
            int frequency = charFrequencyMap.get(currentChar);
            
            for (int i = 0; i < frequency; i++) {
                result.append(currentChar);
            }
        }

        return result.toString();
    }
}
