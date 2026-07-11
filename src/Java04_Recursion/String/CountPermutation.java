package Java04_Recursion.String;

public class CountPermutation {
    public static void main(String[] args) {
        int ans = permutationCount("", "abc");

        System.out.println("Permutation count = " + ans);
    }

    static int permutationCount(String p, String unp) {
        if (unp.isEmpty()) {
            return 1;
        }

        char ch = unp.charAt(0);
        int count = 0;
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i);
            count = count + permutationCount(f + ch + s, unp.substring(1));
        }

        return count;
    }
}
