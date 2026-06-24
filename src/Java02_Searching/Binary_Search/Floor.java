package Java02_Searching.Binary_Search;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 15, 16, 20};
        int target = 1;

        int result = floorNumber(arr, target);

        if (result != -1) {
            System.out.println("Greatest element smaller than or equal to target = " + arr[result]);
        } else {
            System.out.println("Target not found.");
        }

    }

    static int floorNumber(int[] nums, int target) {
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

        return end;
    }
}
