package Java02_Searching.Binary_Search;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 15, 16, 20};
        int target = 17;

        int result = ceilingNumber(arr, target);

        if (result != -1) {
            System.out.println("Smallest element greater than or equal to target = " + arr[result]);
        } else {
            System.out.println("Target not found.");
        }

    }

    static int ceilingNumber(int[] nums, int target) {
        if (target > nums[nums.length - 1]) {
            return -1;
        }

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) return mid;

            if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}
