package days04;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {	
		//key : 수식, 변수 상수x
		//value: 값 (byte, short, int, char, String, 또는 열거형(enum)타입), 변수 x
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력: ");
		int n = sc.nextInt();
		
	
	
		String result;
		switch ( n % 2 ) {
		case 0:
			result = "짝수(Even Number";
				break;
		case 1:
			result = "홀수(Even Number";
			break;
		
		}
		}

}
