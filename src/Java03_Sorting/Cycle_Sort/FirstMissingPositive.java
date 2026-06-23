package Java03_Sorting.Cycle_Sort;
// https://leetcode.com/problems/first-missing-positive/

import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
//        int[] arr = {3, 4, -1, 1};
        int[] arr = {1, 2, 0};

        int result = firstMissingPositive(arr);
        System.out.println("Sorted array = " + Arrays.toString(arr));
        System.out.println("First Missing Positive number = " + result);
    }

    static int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correctIndex]) {
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return index + 1;
            }
        }
        return nums.length + 1;
    }

}
