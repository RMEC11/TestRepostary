package Basic3;

import java.util.Scanner;

public class test30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ist number:- ");
		int a =sc.nextInt();
		System.out.println("2nd number:- ");
		int b =sc.nextInt();
		System.out.println("3rd number:- ");
		int c =sc.nextInt();
		
		if(a==b||b==c||c==a) {
			System.out.println("Same");
		}else {
			System.out.println("Diffrent");
		}
		

	}

}
