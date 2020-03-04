package exam1;

import java.util.Scanner;

public class Ex53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// accepts three integers from the user and return true if the second number is
		// greater than first number and third number is greater than second number.
		// If "abc" is true second number does not need to be greater than first number.
		Scanner in = new Scanner(System.in);
		System.out.println("Input the first number");
		int a = in.nextInt();
		System.out.println("Input the second number");
		int b = in.nextInt();
		System.out.println("Input the third number");
		int c= in.nextInt();
		if(a<b && b<c &&a<c) {
			System.out.println("true");
		}else {
			System.out.println("False");
		}

	}

}
