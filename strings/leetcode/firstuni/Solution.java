package strings.leetcode.firstuni;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int firstUniqChar(String s) {
        // Crear un mapa para almacenar el recuento de cada carácter
        Map<Character, Integer> charMap = new HashMap<>();
        // key es el carácter y value es el la cantidad de ocurrencias

        // Contar la frecuencia de cada carácter en la cadena
        char[] chars = s.toCharArray();
        for (char c : chars) {
            int count = charMap.getOrDefault(c, 0);
            charMap.put(c, count + 1); // si la key existe la actualiza, si no la crea
        }

        // Encontrar el primer carácter único y devolver su índice
        for (int i = 0; i < s.length(); i++) {
            if (charMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        // Si no se encuentra ningún carácter único, devolver -1
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Ejemplos
        System.out.println(solution.firstUniqChar("leetcode"));     // Output: 0
        System.out.println(solution.firstUniqChar("loveleetcode")); // Output: 2
        System.out.println(solution.firstUniqChar("aabb"));         // Output: -1
    }
}
