package strings.leetcode.reversestr;

import java.util.*;

public class Solution {
    public void reverseString(char[] s) {
        int left = 0; // primera posición
        int right = s.length - 1; // última posición

        while (left < right) {
            // Swap characters at left and right indices
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }


    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        char[] s = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(s);
        solution.reverseString(s);
        System.out.println(s);
    }
}
