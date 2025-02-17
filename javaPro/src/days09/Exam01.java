package days09;

public class Exam01 {
	/*
	 * 1. 년도를 매개변수로 받아서 윤년, 평년을 boolean 형으로 반환하는 메서드만 선언하세요
 (  치윤법 사용 ) 
	 * 
	 * 
	 * */

	public static void main(String[] args) {
		int year = 2023;
		boolean result = isLeapYear(year);
	}

	private static boolean isLeapYear(int year) {
		return year % 4 == 0 && year != 100 || year % 400 == 0;
	}

}
