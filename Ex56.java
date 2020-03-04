package exam1;

import java.util.Scanner;

public class Ex56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// to find the number of integers within the range of two specified numbers and
		// that are divisible by another number.
		Scanner in = new Scanner(System.in);
		System.out.printf("X:- ");
		int x = in.nextInt();
		System.out.printf("Y:- ");
		int y = in.nextInt();
		System.out.printf("Z:-");
		int z = in.nextInt();
		int c= y-x;
	//	for (int i = x; i <= y; i++) {
			if (c % z == 0) {
				System.out.println("Valid:- "+c/z);
              }else {
            	  System.out.println("Not valid:- "+ (c/z)+1);
              }
		}

	}


