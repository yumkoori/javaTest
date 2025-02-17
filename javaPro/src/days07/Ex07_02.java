package days07;

import java.util.Scanner;

public class Ex07_02 {

	public static void main(String[] args) {
		int user;
		int wrongNumber = 0;
		int END_NUMBER = 3;
		boolean isFirst = true;
		Scanner scanner = new Scanner(System.in);
		
		do {
			if (!isFirst) {
				System.out.println("[알림]1~3 정수를 다시 입력!!!");
				wrongNumber++;
			}
			
			if (wrongNumber == END_NUMBER) {
				System.out.printf("%d회 잘못 입력, 게임 종료", END_NUMBER);
				System.exit(END_NUMBER);
			}
			
			System.out.print("> user 가위(1)/바위(2)/보(3) 선택 ? ");
			user = scanner.nextInt();
			
			isFirst = false;
		} while (!(user == 1 || user ==2 || user == 3));
		
		System.out.printf("> user=%d\n", user);
	}

}
