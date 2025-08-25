package multiplication;

import java.util.Scanner;
public class nextseries {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int a = sc.nextInt();
	        int c = 0;
	        if(a%2==0) {
	        	c=a-1;
	        }
	        	else
	        	c=a;
	        for (int i = 0; i < c; i++) {
	            int odd = 2 * i + 1;
	            System.out.print(odd);

	            if (i < c - 1) { 
	                System.out.print(" ");
	            }
	        }

	    }
	}
