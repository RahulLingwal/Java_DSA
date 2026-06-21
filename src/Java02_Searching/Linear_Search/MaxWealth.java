package Java02_Searching.Linear_Search;
// https://leetcode.com/problems/richest-customer-wealth/

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1, 5}, {7, 3}, {3, 5}};

        int result = maximumWealth(accounts);

        System.out.println("Maximum wealth = " + result);
    }

    static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int[] totalwealth : accounts) {
            int sum = 0;
            for (int wealth : totalwealth) {
                sum += wealth;
            }

            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }

}
