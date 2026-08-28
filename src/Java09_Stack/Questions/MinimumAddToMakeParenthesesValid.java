package Java09_Stack.Questions;

// https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/

import java.util.Stack;

public class MinimumAddToMakeParenthesesValid {
    public static void main(String[] args) {
        String str = "(((";
        int result = MakeValidSolution.minAddToMakeValid(str);

        System.out.println("Minimum number of moves required to make string valid = " + result);
    }
}

class MakeValidSolution {
    public static int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            } else {
                stack.push(ch);
            }
        }

        return stack.size();
    }
}
