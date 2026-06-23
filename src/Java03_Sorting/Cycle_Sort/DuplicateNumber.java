package Java03_Sorting.Cycle_Sort;
// https://leetcode.com/problems/find-the-duplicate-number/

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};

        int result = findDuplicate(arr);

        System.out.println("Duplicate Number = " + result);
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int findDuplicate(int[] nums) {
//        int i = 0;
//        while (i < nums.length) {
//            int correct = nums[i] - 1;
//            if (nums[i] != nums[correct]) {
//                swap(nums, i, correct);
//            } else {
//                i++;
//            }
//        }
//
//        int ans = 0;
//        for (int index = 0; index < nums.length; index++) {
//            if (nums[index] != index + 1) {
//                ans = nums[index];
//            }
//        }
//
//        return ans;
//    }

        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }
}
