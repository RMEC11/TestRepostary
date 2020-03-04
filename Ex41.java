package exam1;

import java.util.Scanner;

public class Ex41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//print the ascii value of a given character
		Scanner nu = new Scanner(System.in);
		System.out.println("Enter Char");
		String c = nu.nextLine();
		char c1 =c.charAt(0);
		int ch= c1;		
	System.out.println("The ASCII value is :-"+ch);
		
	}

}
