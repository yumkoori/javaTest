package days05;

import java.util.Scanner;

public class game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int com = (int)(Math.random() * 2) + 1;
		
		while (true) {
			System.out.print("user ����(1)/����(2)/��(3) ���� ?");
			int user = sc.nextInt();
			
			if (user >=1 && user <= 3) {
				System.out.printf("com = %d, user = %d\n", com, user);
				play(com, user);
				break;
			}
			System.out.println("����, ����, ���� ������");
		}
	}
	
	static void play(int com, int user) {
		if (com == user) {
			System.out.println("���º�");
		} else if((com == 1 && user == 3) || (com == 3 && user == 1)) {
			System.out.println((com > user? "user" : "��ǻ��" )+ "�¸�");
		} else if((com == 1 && user == 2) || (com == 2 && user == 1)) {
			System.out.println((com > user? "��ǻ��" : "user" )+ "�¸�");
		} else if((com == 2 && user == 3) || (com == 3 && user == 2)) {
			System.out.println((com > user? "��ǻ��" : "user" )+ "�¸�");
		}
	}
}
