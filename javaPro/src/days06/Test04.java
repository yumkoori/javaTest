package days06;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String rank = "";
		int kor = -1;
		
		while (true) {
			System.out.print("국어 점수: ");
			kor = sc.nextInt();
			if (kor <= 100 && kor >=0) break;
		}
		
		switch (kor / 10) {
		case 10:
			rank = "수";
		case 9:
			rank = "수";
			break;
		case 8:
			rank = "우";
			break;
		case 7:
			rank = "미";
			break;
		case 6: 
			rank = "양";
			break;
		default:
			rank = "가";
			break;
		} 
	}
}
