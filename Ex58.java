package exam1;

import java.util.Scanner;

public class Ex58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//capitalize the first letter of each word in a sentence
		Scanner in = new Scanner(System.in);
		System.out.printf("Please Enter your sentance:- ");
		String st= in.nextLine();
		String sen="";
		Scanner linescan=new Scanner(st);
		while(linescan.hasNext()) {
			String word=linescan.next();
			 sen += Character.toUpperCase(word.charAt(0))+word.substring(1)+" ";
		}
		System.out.println(sen.trim());
	}

}
