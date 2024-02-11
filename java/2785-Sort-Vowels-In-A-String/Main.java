//  2785. Sort Vowels in a String
//  https://leetcode.com/problems/sort-vowels-in-a-string/description/

public class Solution {
    public String sortVowels(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        StringBuilder result = new StringBuilder();
        StringBuilder vowels = new StringBuilder();
        List<Character> consonants = new ArrayList<>();

        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                vowels.append(c);
            } else {
                consonants.add(c);
            }
        }

        sortVowelsInPlace(vowels);

        int vowelIndex = 0;
        int consonantIndex = 0;

        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                result.append(vowels.charAt(vowelIndex++));
            } else {
                result.append(consonants.get(consonantIndex++));
            }
        }

        return result.toString();
    }

    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    private void sortVowelsInPlace(StringBuilder vowels) {
        for (int i = 0; i < vowels.length() - 1; i++) {
            for (int j = 0; j < vowels.length() - i - 1; j++) {
                if (vowels.charAt(j) > vowels.charAt(j + 1)) {
                    char temp = vowels.charAt(j);
                    vowels.setCharAt(j, vowels.charAt(j + 1));
                    vowels.setCharAt(j + 1, temp);
                }
            }
        }
    }
}
