package exam1;

import java.util.Scanner;

public class Ex38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//count the letters, spaces, numbers and other characters of an input string
		Scanner st = new Scanner(System.in);
		String test;
		System.out.println("Intsert string");
		test=st.nextLine();
		count(test);
	}
	public static void count(String x)
	{
		char[] ch =x.toCharArray();
		int letter=0;
		int space=0;
		int num=0;
		int other=0;
		for(int i=0;i<x.length();i++)
		{
			if(Character.isLetter(ch[i])) {
				letter++;
			}
			else if(Character.isDigit(ch[i])) {
				num++;
			}
			else if(Character.isSpaceChar(ch[i])) {
				space++;
			}else {
				other++;
			}
		}
		
		System.out.println("letter:- "+letter);
		System.out.println("space:- "+space);
		System.out.println("Number:- "+num);
		System.out.println("Other:- "+ other);
	}
	
}
