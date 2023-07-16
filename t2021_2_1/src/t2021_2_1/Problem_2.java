package t2021_2_1;
import java.util.Scanner;
public class Problem_2 {
	


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter only odd value of x: ");
	        int x = scanner.nextInt();

	        System.out.print("Output: ");
	        int j=0;
	        for (int i = 0; i < x; i ++) {
	         j=(i*2)+1;
	        	//int j=i+2;
	            System.out.print(j + " ");
	        }
	    }
	}

