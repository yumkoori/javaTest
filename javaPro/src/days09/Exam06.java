package days09;

public class Exam06 {
// 2+3+5+7+...97=??? 
	public static void main(String[] args) {
		calculate();
	}
	
	public static int calculate() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0 && i % 3 != 0) {
				sum += i;
				System.out.printf("%d + ", i);
			}
		} 
		return sum;
	}

}
