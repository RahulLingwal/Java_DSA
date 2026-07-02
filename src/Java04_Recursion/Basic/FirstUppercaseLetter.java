package Java04_Recursion.Basic;

public class FirstUppercaseLetter {
    public static void main(String[] args) {
        String name = "rahul Lingwal";
        int result = search(name, 0);

        System.out.println("First uppercase letter found at index = " + result);
    }

    static int search(String name, int i) {
        if (name == "/0") return -1;

        if (Character.isUpperCase(name.charAt(i))) {
            return i;
        }

        return search(name, i + 1);
    }
}
