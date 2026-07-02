package Java05_Bitwise;

public class UniqueNumber {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4, 5, 4, 6, 7, 6, 7, 3};

        unique(arr);
    }

    static void unique(int[] arr) {
        int unique = 0;
        for (int num : arr) {
            unique ^= num;
        }

        System.out.println("Unique number = " + unique);
    }
}
