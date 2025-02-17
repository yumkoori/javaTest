package days06;

import java.util.Scanner;

public class test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor = -1;
		
		while (true) {
			System.out.print("국어 점수: ");
			kor = sc.nextInt();
			
			if (kor <= 100 && kor >=0) break;
		}
		
		if (kor >= 90) {
			System.out.println("수");
		} else if (kor >= 80) {
			System.out.println("우");
		} else if (kor >= 70) {
			System.out.println("미");
		} else if (kor >= 60) {
			System.out.println("양");
		} else if (kor >= 0) {
			System.out.println("가");
		}
	}
}
