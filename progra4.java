package multiplication;

import java.util.*;
public class progra4 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int[] arr = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
	        Map<Integer, Integer> result = new LinkedHashMap<>();
	        for (int i = 1; i <= 9; i++) {
	            result.put(i, 0);
	        }
	        for (int num : arr) {
	            for (int i = 1; i <= 9; i++) {
	                if (num % i == 0) {
	                    result.put(i, result.get(i) + 1);
	                }
	            }
	        }
	     //   System.out.println(result);
	        for(Map.Entry<Integer, Integer>x:result.entrySet()) {
	        	System.out.print(x.getKey() + ":" + x.getValue()+", ");
	        }
	    }
	}
