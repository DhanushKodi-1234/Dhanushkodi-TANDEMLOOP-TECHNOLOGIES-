package multiplication;
import java.util.Scanner;
public class series {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int a = sc.nextInt();
	        int c=0;
	        for (int i = 0; i < a*2; i++) {
	            if(i%2!=0) {
	            	c++;
	            	System.out.print(i+" 1");
	            }
	            if(c==a)
	            	break;

	        }

	        
	    }
	}
