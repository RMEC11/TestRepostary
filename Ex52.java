package exam1;

import java.util.Scanner;

public class Ex52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		//calculate the sum of two integers and return true if the sum is equal to a third integer.
		Scanner in=new Scanner(System.in);
		System.out.println("Input the first number :-");
		int a=in.nextInt();
		System.out.println("Input the Second number :-");
		int b=in.nextInt();
		System.out.println("Input the third number :-");
	    int c=in.nextInt();
	 int result = a+b;
	    if(result==c) {
	    	System.out.println("The result is :- True");
	    }else {
	    	System.out.println("The result is:- False");
	    }
	    	    
	    System.out.println("Second verification result:-"+sumoftwo(a, b, c));
	    System.out.println("\n");
	}
	public static boolean sumoftwo(int p, int q, int r) {
		return((p+q)==r||(q+r)==p||(r+p)==q);
	}

}
