package exam1;

import java.util.Scanner;

public class Ex49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// accept a number and check the number is even or not. Prints 1 if the number
		// is even or 0 if the number is odd

		Scanner nu = new Scanner(System.in);
		System.out.println("Input a number:- ");
		int i = nu.nextInt();
		if (i % 2 == 0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

	}

}
