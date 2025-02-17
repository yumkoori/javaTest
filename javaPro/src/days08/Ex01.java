package days08;

import java.io.IOException;
import java.util.Scanner;

public class Ex01 {
/*
 *    1) 입력 실패시 알림 주기 
      [알림] 1~3 정수를 다시 입력(실패횟수:1)!!!
   2) 3번 입력 실패시 프로그램 종료
      [알림] 실패횟수:3 
 		프로그램 종료!!!
   3) String.matches() 메서드 사용해서 입력값(1~3) 유효성 검사를 하세요.

 * */
	
	public static void main(String[] args) throws IOException {
		int com, user;
		Scanner scanner = new Scanner(System.in);
		char con = 'y';
		String regex = "[1-3]";
		int badInputNumber = 0;
		String input = "";

		int comScore = 0, userScore = 0; 
		String [] rpsArr = {"", "가위", "바위", "보"};

		do {
			com = (int) (Math.random() * 3) + 1;
			
			while(true) {
				System.out.print("> user 가위(1)/바위(2)/보(3) 선택 ? ");
				input = scanner.next();	
				
				if(input.matches(regex)) {
					break;
				} 
				badInputNumber++;
				System.out.printf("[알림] 1~3 정수를 다시 입력(실패횟수:%d)!!!", badInputNumber);
				
				if(badInputNumber == 3) {
					System.out.printf("[알림] 실패횟수:%d \r\n"
							+ " 		프로그램 종료!!!", badInputNumber);
				}
				
			}  

			user = Integer.parseInt(input);
			
			System.out.printf("> com=%s, user=%s\n"
					, rpsArr[com], rpsArr[user]);

			// 승자 판단해서 출력...
			switch (user - com) {
			case 0:
				System.out.print("무승부");
				break;
			case 1:
			case -2:
				System.out.print("사용자 승리"); 
				userScore++; 
				break;
			case -1:
			case 2:
				System.out.print("컴퓨터 승리");
				comScore++; 
				break;
			} // switch
			System.out.printf("( %d : %d )\n",comScore, userScore); 
 
			if (comScore == 3 || userScore == 3) {
				System.out.printf("최종 승리자: %s 입니다.\n"
						, comScore == 3 ? "컴퓨터" : "사용자" );
			} // if

			// 1) 게임을 계속 여부 ? y
			System.out.print("\n 게임 계속합니까 ? ");
			con = (char)System.in.read(); // y, n
		} while ( con == 'y' || con == 'Y' ); 

		System.out.println("end");

	}

}
