package exam1;

import java.util.Scanner;

public class Ex44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//accepts an integer (n) and computes the value of n+nn+nnn
		int n;
		//char s1,s2;
		Scanner in = new Scanner(System.in);
		System.out.println("Input Number:- ");
		n=in.nextInt();
		System.out.printf("%d +%d%d +%d%d%d",n,n,n,n,n,n);
	}

}
