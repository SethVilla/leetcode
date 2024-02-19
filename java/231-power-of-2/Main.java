// 231. Power of Two
// https://leetcode.com/problems/power-of-two/description/?envType=daily-question&envId=2024-02-19
class Solution {
    public boolean isPowerOfTwo(int n) {

        if (n == 1) {
            return true;
        }

        if (n <= 0 || n % 2 != 0) {
            return false;
        }

        return isPowerOfTwo(n / 2);
    }
}