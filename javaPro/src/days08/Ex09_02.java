package days08;

public class Ex09_02 {

	public static void main(String[] args) {
		System.out.println(countLeapYear(1, 2025));
		
		int leapYearCount = 2025 / 4 - 2025/100 + 2025/400;
	}
	
	private static int countLeapYear(int start, int end) {
		int count = 0;
		for (int i = start; i <= end; i++) {
			if (isLeapYear(i)) {
				count++;
				System.out.printf("윤년: %d \n", i);
			}
		}
		return count;
	}

	private static boolean isLeapYear(int year) {
		 return year % 4  == 0 && year % 100  != 0 || year % 400  == 0 ;
	}
	
	
}
