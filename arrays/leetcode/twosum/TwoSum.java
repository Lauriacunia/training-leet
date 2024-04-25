package arrays.leetcode.twosum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] numbersArray, int numberTarget) {
        Map<Integer, Integer> complements = new HashMap<>();

        for(int i=0; i < numbersArray.length ; i++) {
            Integer valueIndex = complements.get(numbersArray[i]);

            if(valueIndex != null){
                return new int[]{i, valueIndex};
            }

            complements.put((numberTarget - numbersArray[i] ),  i);
        }

        return null;

    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] numbersArray = {2, 7, 11, 15};
        int numberTarget = 9;
        int[] result = twoSum.twoSum(numbersArray, numberTarget);
        System.out.println(result[0] + " " + result[1]);
    }
}
