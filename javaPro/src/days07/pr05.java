package days07;

import java.util.Scanner;

public class pr05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//두 정수(n,m)을 입력받아서 두 정수 사이의 짝수의 합을 구해서 출력하는 코딩을 하세요.

		
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수 입력");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int max = Math.max(num1, num2);
		int min = Math.min(num1, num2);
		int sum = 0;
		
		for (int i = min; i < max; i++) {
			if(min % 2 == 0) {
				sum += i;
			}
		} //for i
		System.out.println(sum);
	}

}
