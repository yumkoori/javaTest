package days05;

import java.util.Scanner;

public class game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int com = (int)(Math.random() * 2) + 1;
		
		while (true) {
			System.out.print("user 가위(1)/바위(2)/보(3) 선택 ?");
			int user = sc.nextInt();
			
			if (user >=1 && user <= 3) {
				System.out.printf("com = %d, user = %d\n", com, user);
				play(com, user);
				break;
			}
			System.out.println("가위, 바위, 보만 내세요");
		}
	}
	
	static void play(int com, int user) {
		if (com == user) {
			System.out.println("무승부");
		} else if((com == 1 && user == 3) || (com == 3 && user == 1)) {
			System.out.println((com > user? "user" : "컴퓨터" )+ "승리");
		} else if((com == 1 && user == 2) || (com == 2 && user == 1)) {
			System.out.println((com > user? "컴퓨터" : "user" )+ "승리");
		} else if((com == 2 && user == 3) || (com == 3 && user == 2)) {
			System.out.println((com > user? "컴퓨터" : "user" )+ "승리");
		}
	}
}
