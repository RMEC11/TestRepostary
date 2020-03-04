package Basic3;

import java.util.Scanner;

public class test29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input your choice");
		long a = sc.nextLong();
		while (a != 0) {
			a /= 10;
			++count;
		}

		System.out.println("Number of digit: " + count);

	}

}
