package main;


import java.util.ArrayList;
import java.util.List;

public class BalancedBrackets {
    public static void main(String[] args) {

        System.out.println(BalancedBrackets.hasBalancedBrackets("{LaunchCode}"));
        System.out.println(BalancedBrackets.hasBalBrackets("{LaunchCode}"));
        System.out.println(BalancedBrackets.hasTwoBackBrackets("]["));
    }

    /**
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     * <p>
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     * <p>
     * The string may contain non-bracket characters as well.
     * <p>
     * These strings have balanced brackets:
     * "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     * <p>
     * While these do not:
     * "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static boolean hasBalancedBrackets(String str) {

        int brackets = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '[' ) {
                brackets++;
            } else if (ch == ']') {
                brackets--;

            }
        }
        return brackets == 0;
    }
    public static boolean hasBalBrackets(String str) {
        boolean balanced = false;
        int brackets = 0;
        for (char ch : str.toCharArray()) {
            if ((ch == '[') || (ch == ']')) {
                System.out.println("Inside if");
                brackets++;
                balanced = true;
            } else if (ch == ']') {
                System.out.println("Inside else if 1");
                brackets--;
                balanced = false;
            }
        }
        return balanced;
    }

    public static boolean hasTwoBackBrackets(String str){
        boolean balance = false;
        int brackets = 0;
        for (char ch : str.toCharArray()) {
            if (ch == ']' ) {
                brackets--;
            } else if (ch == '[') {
                brackets--;

            }
        }
        return brackets == 0;
    }
}


