package exam1;

import java.util.Scanner;

public class Ex51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// convert a string to an integer in Java
		Scanner in = new Scanner(System.in);
		System.out.println("Input a number(string):- ");
		String str1 = in.nextLine();
		int result = Integer.parseInt(str1);
		System.out.printf("The integer value is:-"+result);
		System.out.printf("\n");

	}

}
