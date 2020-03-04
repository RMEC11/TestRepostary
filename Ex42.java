package exam1;

import java.io.Console;

public class Ex42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //input and display your password
		
		Console cons;
		if((cons=System.console())!=null) {
			char[] pass_word = null;
			try {
				pass_word = cons.readPassword("Input your Password");
				System.out.println("Your Password is:- "+new String(pass_word));
			}finally {
				if(pass_word!=null) {
					java.util.Arrays.fill(pass_word, ' ');
				}
			}
				
			}else {
				throw new RuntimeException("Can't get password...No console");
		}
	}

}
