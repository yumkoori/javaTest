package days02;

import java.util.Calendar;

public class Ex03_05 {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		String s = String.format("Duke's Birthday: %1$tY.%1$tm,%1$t", c);
		System.out.println(s);
	}

}
