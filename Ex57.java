package exam1;

import java.util.Scanner;

public class Ex57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// accepts an integer and count the factors of the number
		Scanner in = new Scanner(System.in);
		System.out.printf("Input a number:- ");
		int a = in.nextInt();
		
		
		int count = 0;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				count++;
				System.out.println(i);

			}

		}
		System.out.println("Count:- " + count);

	}

}
