

import java.util.Scanner;

public class FacCalc {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int i,fac=1;
		
		 for(i =n;i>=1; i--) {
	      if(n==0 || n==1)
	     fac = 1;
		 else {
				 fac = fac *i;
				 
			 }
			 
		 } 
		 System.out.println("Factorial = " + fac);
		 sc.close();
	}
				
}

