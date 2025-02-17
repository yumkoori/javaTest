package days08;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("약수 ?");
		int number = sc.nextInt();
		int tmep = number;
		//1, 2, 3, 자기 자신

		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				System.out.printf("%d ", i);
			}
		} //for i
		
		
		
	}

}
