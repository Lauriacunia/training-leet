package arrays.leetcode.singlenum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    //opcion1
    /*
    public int singleNumber(int[] nums) {
        // crear un Map para guardar los valores y sus ocurrencias
        Map<Integer, Integer> ocurrencias = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // si el valor ya existe en el Map, incrementar su ocurrencia
            if (ocurrencias.containsKey(nums[i])) {
                ocurrencias.put(nums[i], ocurrencias.get(nums[i]) + 1);
            } else {
                // si no existe, agregarlo con ocurrencia 1
                ocurrencias.put(nums[i], 1);
            }
        }
        // Obtener el valor que solo tiene una ocurrencia con un get
        int uniqueKey = ocurrencias.entrySet().stream()
                                   .filter(entry -> entry.getValue() == 1)
                                   .findFirst()
                                   .map(Map.Entry::getKey)
                                   .orElse(null);

        return uniqueKey;


    } */

    // opcion 2 mas performante
    public int singleNumber(int[] nums) {
        /* Dado que el operador XOR devuelve 1 si los bits en las mismas posiciones son diferentes,
        y 0 si son iguales, al aplicar el XOR repetidamente,
        los números que aparecen dos veces se "cancelan"
         y solo queda el número que aparece una sola vez.*/
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            // XOR de todos los valores
            result ^= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = {4,1,2,1,2};
        System.out.println(solution.singleNumber(numbers));
    }
}
