package strings.leetcode.reverseint;

public class Solution {
    public int reverse(int x) {
        // Convertir el número en una cadena
        String str = String.valueOf(Math.abs((long) x)); // Usar long para evitar desbordamiento
        StringBuilder reversed = new StringBuilder();

        // Revertir la cadena
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        try {
            // Convertir la cadena revertida en un número entero
            int result = Integer.parseInt(reversed.toString());
            // Aplicar el signo original si el número original era negativo
            return x < 0 ? -result : result;
        } catch (NumberFormatException e) {
            // Si el resultado está fuera del rango, devolver 0
            return 0;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Ejemplos
       // System.out.println(solution.reverse(123));   // Output: 321
        System.out.println(solution.reverse(-123));  // Output: -321
        //System.out.println(solution.reverse(120));   // Output: 21

    }
}
