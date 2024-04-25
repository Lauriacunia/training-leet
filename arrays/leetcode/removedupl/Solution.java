package arrays.leetcode.removedupl;

import java.util.*;

public class Solution {
    public int removeDuplicates(int[] nums) {

        // convertir la List en LinkedHashSet (eliminar duplicados y mantener el orden)
        Set<Integer> setNums = new LinkedHashSet<>();
        for (int num : nums) {
            setNums.add(num);
        }
       // System.out.println("Elementos unicos: " + setNums);
       // System.out.println("Cantidad de elementos unicos: " + setNums.size());

        // Convert the LinkedHashSet to an array (in order of insertion) - In-place modification
        // Modificar el array original dentro del método.
        int[] uniqueNumsArray = new int[setNums.size()];
        int i = 0;
        for (Integer num : setNums) {
            uniqueNumsArray[i++] = num;
        }

        // Copy the unique elements to the original array
        for (int j = 0; j < uniqueNumsArray.length; j++) {
            nums[j] = uniqueNumsArray[j];
        }

        // Return the number of unique elements (k)
        return setNums.size();
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        Solution solution = new Solution();
        int k = solution.removeDuplicates(nums);
        System.out.println("La cantidad de elementos unicos es: " + k);
    }
}
