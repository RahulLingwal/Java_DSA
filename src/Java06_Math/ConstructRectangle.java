package Java06_Math;
// https://leetcode.com/problems/construct-the-rectangle/

import java.util.Arrays;

public class ConstructRectangle {
    public static void main(String[] args) {
        int area = 37;
        int[] ans = constructRectangle(area);
        System.out.println("Length and Width = " + Arrays.toString(ans));
    }

    static int[] constructRectangle(int area) {
        int width = (int) (Math.sqrt(area));

        while (area % width != 0) {
            width--;
        }

        int length = area / width;

        return new int[]{length, width};
    }

}
