package days08;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		int x, y, result;
		Scanner sc = new Scanner(System.in);
		System.out.println(" x, y input");
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		result = sum(x ,y);
		System.out.printf("%d+%d=%d\n", x, y, result);
		
		
		
	}

	private static int sum(int x, int y) {
		return x + y;
	}

}
