package exam1;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Ex55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);	
		System.out.printf("Input the Seconds:- ");
		int a = in.nextInt();
		int day=(int)TimeUnit.SECONDS.toDays(a);
		long hours= TimeUnit.SECONDS.toHours(a)-(day*24);
		long minut=TimeUnit.SECONDS.toMinutes(a)-(TimeUnit.SECONDS.toHours(a)*60);
		long second=TimeUnit.SECONDS.toSeconds(a)-(TimeUnit.SECONDS.toMinutes(a)*60);
		
		System.out.println("Days: "+day+" Hours: "+hours+" Minute: "+minut+" Secons: "+second);
		
		

	}

}
