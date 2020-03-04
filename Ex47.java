package exam1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Ex47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleDateFormat cdt =new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
		cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
		System.out.println("\nNow: "+cdt.format(System.currentTimeMillis()));

	}

}
