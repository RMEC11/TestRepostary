package exam1;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Ex64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Ist digit");
		int a = in.nextInt();
		System.out.println("Enter IInd digit");
		int b = in.nextInt();
		System.out.println("Result: "+common_digit(a, b));
	}

	public static boolean common_digit(int p, int q) 
	{
		if (p < 25 || q > 75) 
			return false;
		int x= p%10;
		int y=q%10;
		p/=10;
		q/=10;
		return(p==q||p==y||x==q||x==y);
		

	}

}
