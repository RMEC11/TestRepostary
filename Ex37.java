package exam1;

import java.util.Scanner;

public class Ex37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Input a string: ");
		char[] letters=scanner.nextLine().toCharArray();
		System.out.println("Reverse String: ");
		for(int i=letters.length-1;i>=0;i--)
		{
			System.out.print(letters[i]);
		}
	}

}
