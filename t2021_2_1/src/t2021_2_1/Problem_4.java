package t2021_2_1;
import java.util.*;
public class Problem_4 {


	
	    public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30);
	        int[] multiples = {1, 2, 3, 4, 5, 6, 7, 8, 9};

	        Map<Integer, Integer> countMap = new HashMap<>();
	        for (int multiple : multiples) {
	            int count = 0;
	            for (int number : numbers) {
	                if (number % multiple == 0) {
	                    count++;
	                }
	            }
	            countMap.put(multiple, count);
	        }

	        System.out.println("Output: " + countMap);
	    }
	}


