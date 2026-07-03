package Java06_Math;

public class NumberofDigits {
    public static void main(String[] args) {
        int number = 100;
        int base = 10;

        System.out.println(Integer.toBinaryString(number));

        int ans = (int) (Math.log(number) / Math.log(base)) + 1;
        System.out.println("Number of digits = " + ans);  //number 10 has 4 binary digits

    }
}
