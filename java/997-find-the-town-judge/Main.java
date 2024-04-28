// 997. Find the Town Judge
// https://leetcode.com/problems/find-the-town-judge/description/

class Solution {
    public int findJudge(int n, int[][] trust) {

        // people are represented from 1 to n
        // account to this by increasing size by 1
        int[] trustList = new int[n + 1];

        // Input: n = 2, trust = [[1,2]]
        // only judge should equal n - 1
        // Track town member that is trusted
        // decrease trustee count
        for (int[] relation : trust) {
            trustList[relation[0]]--;
            trustList[relation[1]]++;
        }

        // for (int[] relation : trust) {
        //     System.out.println(trustCount[relation[0]]);
        //     System.out.println(trustCount[relation[1]]);
        // }

        // only the judge will have a trust count of n - 1
        for (int i = 1; i <= n; i++) {
            if (trustList[i] == n - 1) {
                return i;
            }
        }

        return -1; // No judge found
    }
}