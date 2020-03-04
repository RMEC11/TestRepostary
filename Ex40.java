package exam1;

import java.nio.charset.Charset;

public class Ex40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// list the available character sets in charset objects
		System.out.println("List of available character sets:- ");
		for (String str : Charset.availableCharsets().keySet()) {
			System.out.println(str);
		}
	}

}
