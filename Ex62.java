package exam1;

import java.util.Scanner;

public class Ex62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//accepts three integer values and return true if one of them is 20 or more less than one of the others
	Scanner in = new Scanner(System.in);
	System.out.println("Please enter first digit");
	int a= in.nextInt();
	System.out.println("Please enter second digit");
	int b=in.nextInt();
	System.out.println("Please enter third digit");
	int c=in.nextInt();
	//System.out.println(Math.abs(a-b)>=20||Math.abs(b-c)>=20||Math.abs(c-a)>=20);
	System.out.println(Math.abs(a-b)>=20&&Math.abs(b-c)>=20&&Math.abs(c-a)>=20);
	
	}

}
