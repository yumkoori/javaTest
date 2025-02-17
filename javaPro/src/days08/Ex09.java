package days08;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		//[문제] 년도를 입력받아서 윤년/평년 출력
		int year;
		Scanner sc = new Scanner(System.in);
		year = getYear(sc);
		
		if(isLeapYear(year)) {
			System.out.println("윤년(leap year)");
		} else {
			System.out.println("평년");
		}
	}

	private static boolean isLeapYear(int year) {
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}

	private static int getYear(Scanner sc) {
		String regex = "\\d*";
		String strYear;
		do {
			System.out.print("년도 입력 ?");
			strYear = sc.next();
			
		} while (!strYear.matches(regex));
		
		return Integer.parseInt(strYear);
	}
}
