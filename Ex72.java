package exam1;

import java.util.Scanner;

public class Ex72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in= new Scanner(System.in);
		String str1=in.nextLine();
		System.out.println(str1);
		if(str1.length()>3) {
			
			System.out.println(str1.substring(0,3));
		}else if(str1.length()==1) {
			System.out.println(str1.charAt(0)+"##");
		}else if(str1.length()==2) {
			System.out.println(str1.substring(0,2)+"#");
		}else
		{
			System.out.println("###");
		}

	}

}
