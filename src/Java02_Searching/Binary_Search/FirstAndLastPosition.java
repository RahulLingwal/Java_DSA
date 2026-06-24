package Java02_Searching.Binary_Search;
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

import java.util.Arrays;
import java.util.Scanner;

public class FirstAndLastPosition {
    static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        System.out.println("Letters = " + Arrays.toString(nums));

        Scanner input = new Scanner(System.in);
        System.out.print("Enter target letter = ");
        int target = input.nextInt();

        int[] result = searchRange(nums, target);

        if (!Arrays.equals(result, new int[]{-1, -1})) {
            System.out.println("Starting and Ending position(index) of target = " + Arrays.toString(result));
        } else {
            System.out.println("Target not found! ");
        }

    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        ans[0] = search(nums, target, true);

        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }

        return ans;
    }

    static int search(int[] nums, int target, boolean isFirstElementSearch) {
        int found = -1;

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                found = mid;
                if (isFirstElementSearch) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return found;
    }
}
