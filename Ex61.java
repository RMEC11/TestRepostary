package exam1;

import java.util.Scanner;

public class Ex61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.print("\nPlease enter String: ");
		String sb = in.nextLine();
		sb = sb.trim();
		String result = "";
		char[] ch = sb.toCharArray();
		for (int i = sb.length() - 1; i>=0; i--) {
			result += ch[i];
		}
		System.out.println("Reverse word: " + result.trim());
	}

}
