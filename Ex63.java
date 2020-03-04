package exam1;

import java.util.Scanner;

public class Ex63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Enter Ist digit");
		int a = in.nextInt();
		System.out.println("Enter IInd digit");
		int b = in.nextInt();
		if (a > b) {
			System.out.println("Large value:-" + a);
		} else {
			System.out.println("Large value:-" + b);
			if (a == b) {
				System.out.println("0");
			} else if (a % 6 == b % 6) {
				if (a < b) {
					System.out.println("Smaller value:-" + a);
				} else {
					System.out.println("Smaller value:-" + b);
				}

			}

		}
	}
}
