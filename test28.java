package Basic3;

import java.util.Scanner;

public class test28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Input your choice:- ");
		double a=sc.nextDouble();
		
		if(a>0) {
			if(a<1) {
				System.out.println("Positive small number");
			}else if(a>100000) {
				System.out.println("Positive large number");
			}else {
				System.out.println("Positive number");
			}
		}else if(a<0) {
			if(Math.abs(a)<1) {
				System.out.println("Negative small");
			} else if(Math.abs(a)>100000)
			{
				System.out.println("Negative large");
			}else {
				System.out.println("Negative");
			}
		}
		else {
			System.out.println("Zero");
		}
	}

}
