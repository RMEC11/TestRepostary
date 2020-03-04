package exam1;

import java.util.Scanner;

public class Ex60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//find the penultimate (next to last) word of a sentence
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter sentance");
		String st=in.nextLine();
		String[] words=st.split("[ ]+");
		System.out.println("Penultimate word: "+words[words.length-2]);
	}

}
