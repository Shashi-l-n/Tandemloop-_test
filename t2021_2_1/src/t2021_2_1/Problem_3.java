package t2021_2_1;
import java.util.Scanner;

public class Problem_3 {
	


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the value of x: ");
	        int x = scanner.nextInt();

	        System.out.print("Output: ");
        if(x%2==0) {
	      int j=0;
	        for (int i = 2; i <=x; i ++) {
	         j=(i*2)-1;
	        
	 // j=i-2;
	           System.out.print(j-2+" ");
        }
	        
	        }else {
	        int j=0;
	        for (int i = 0; i <x; i ++) {
	        	j=(i*2)+1;
	            System.out.print(j + " ");
	        }
	        /*if (x % 2 == 0) {
	            System.out.print(j+" ");*/
	        }
	    }
	    }
	    

