package hackerRank;

import java.util.HashMap;

public class SockMerchantSolution {
	public int sockMerchant(int n, int[] ar) {
		int result = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i: ar) {
			map.put(i, map.getOrDefault(i, 0) +1 );
		}
		for(int key :map.keySet())
			result += map.get(key) / 2;
		return result;
    }
	
	public static void main(String[] args) {
		int[]arr= {10, 20, 20, 10, 10, 30, 50, 10, 20};
		SockMerchantSolution solution = new SockMerchantSolution();
		int result = solution.sockMerchant(arr.length, arr);
		System.out.println("La cantidad de pares es " + result);
	}
}
