package exam1;

import java.util.Scanner;

public class Ex59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.printf("Please Enter your sentance:- ");
		String st= in.nextLine();
		String sen="";
		Scanner linescan=new Scanner(st);
		while(linescan.hasNext()) {
			String word=linescan.next();
			 sen += Character.toLowerCase(word.charAt(0))+word.substring(1)+" ";
		}
		System.out.println(sen.trim());
	}

}
