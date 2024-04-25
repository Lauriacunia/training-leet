package arrays.leetcode.maxprofit;

public class Solution {
    /*
    Para resolver este problema, podemos recorrer la lista de precios
    y calcular el beneficio entre cada par de días
    donde el precio del día siguiente es mayor que el precio del día actual.
    Sumaremos todos los beneficios positivos para obtener el máximo beneficio total. */


    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Output 1: " + solution.maxProfit(prices1)); // Output: 7

        int[] prices2 = {1, 2, 3, 4, 5};
        System.out.println("Output 2: " + solution.maxProfit(prices2)); // Output: 4

        int[] prices3 = {7, 6, 4, 3, 1};
        System.out.println("Output 3: " + solution.maxProfit(prices3)); // Output: 0
    }
}
