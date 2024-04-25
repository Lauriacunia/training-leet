package arrays.leetcode.containsdupl;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        //opcion 1 - mas lento porque recorre todo
        // converting the array to a set
        /*
        Set<Integer> numbersSet = new HashSet<>();
        for(int i=0; i < nums.length; i++) {
            numbersSet.add(nums[i]);
        }
        // conparar si el set es mas pequeño que el array
        return numbersSet.size() < nums.length;
        */

        //opcion 2 - mejor performance porque corta cuando encuentra el 1er duplicado
        Set<Integer> numbersSet = new HashSet<>();
        for (int num: nums) {
            if (numbersSet.contains(num)) {
                return true;
            }

            else {
                numbersSet.add(num);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] numbersArray = {1,1,1,3,3,4,3,2,4,2};
             System.out.println(solution.containsDuplicate(numbersArray));
    }
}
