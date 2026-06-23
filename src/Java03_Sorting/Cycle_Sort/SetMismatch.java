package Java03_Sorting.Cycle_Sort;
// https://leetcode.com/problems/set-mismatch/

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4};

        int[] result = findErrorNums(arr);

        System.out.println("Number that occur twice and number that is missing = " + Arrays.toString(result));
    }


    static int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++) {
            if (index + 1 != nums[index]) {
                return new int[]{nums[index], index + 1};
            }
        }

        return new int[]{-1, -1};
    }

    static void swap(int[] arr, int i, int correctIndex) {
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
}
