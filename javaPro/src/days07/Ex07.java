package days07;

import java.io.IOException;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) throws IOException {
		int com, user;
		int comScore =0, userScore = 0;
		int WIN_NUMBER = 3;
		char con ='y';
		String regex1 = "[1-3]";
		String regex2 = "[y,Y]";
		String inputString ="";
		String inputChar;
		
		String [] s = {"", "가위", "바위", "보"};
		Scanner scanner = new Scanner(System.in);

		do {
			com = (int) (Math.random() * 3) + 1;
			
			while(!inputString.matches(regex1)) {
				System.out.print("> user 가위(1)/바위(2)/보(3) 선택 ? ");
				inputString = scanner.next();
			}
			
			user = Integer.parseInt(inputString);
			
			System.out.printf("> com=%s, user=%s\n", s[com], s[user]);
			
			switch (user - com) {
			case 0:
				System.out.println("무승부");
				break;
			case 1:
			case -2:
				System.out.println("사용자 승리");
				userScore++;
				break;
			case -1:
			case 2:
				System.out.println("컴퓨터 승리");
				comScore++;
				break;
			} // switch
			
			System.out.printf("컴퓨터 : %d, 사용자: %d", comScore, userScore);
			
			if (comScore == WIN_NUMBER || userScore == WIN_NUMBER) {
				System.out.printf("최종 승리자: %s", comScore > userScore ? "컴퓨터 승":"사용자 승");
				break;
			}
			
			while(true) {
				System.out.print("\n 게임 계속합니까?");
				inputChar = (String) System.in.read();
				
				if(con == 'y' || con == 'Y') {
					break;
					
				} else {
					System.out.println("y나 Y만 가능합니다");
				}
				System.in.skip(2);	
			}
			
			
			
			
		} while (con == 'y' || con == 'Y');
		
		System.out.println("end");

	}

}
