package arrays.leetcode.rotate;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int lenArray = nums.length;
        int k = 3;
        k %= lenArray; // Manejar k si es mayor que la longitud del array
       // System.out.println("Original array length: " + nums.length);
        // creo una copia del array original-> desde el inicio hasta la parte que hay que rotar
        int[] parte1 = Arrays.copyOfRange(nums, 0, lenArray - k);
        // creo una copia del array original-> desde la parte que hay que rotar hasta el final
        int[] parte2 = Arrays.copyOfRange(nums, lenArray - k, lenArray);

        // Unir las dos partes en un nuevo array final
        System.arraycopy(parte2, 0, nums, 0, parte2.length);
        System.arraycopy(parte1, 0, nums, parte2.length, parte1.length);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }
}
