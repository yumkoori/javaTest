package days05;

import java.util.Scanner;

public class BaskinGame {

	public static void main(String[] args) {
		int baskinNumber = 25;
		start(baskinNumber);
	}

	static int update(int callNumber, int baskinNumber) {
		for (int i = 1; i <= callNumber; i++) {
			baskinNumber ++;
			System.out.print(baskinNumber + " ");
		} 
		System.out.println();
		return baskinNumber;
	}
	
	static void start(int baskinNumber) {
		int firstPlayer = (int)(Math.random() * 2) + 1;  
		
		while(true) {
			if (firstPlayer == 1) {
				baskinNumber = playComputer(baskinNumber);
				firstPlayer ++;
			} else if (firstPlayer == 2){
				baskinNumber = playUser(baskinNumber);
				firstPlayer--;
			}
			if (baskinNumber >= 31) {
				System.out.print("31����, ");
				System.out.println(firstPlayer == 1 ? "������� �¸�" : "��ǻ���� �¸�");
				break;
			}
		}
	}
	
	static int playComputer(int baskinNumber) {
		int callNumber = (int)(Math.random() * 3) + 1;   
		System.out.print("��ǻ��: ");
		return update(callNumber, baskinNumber);
	}
	
	static int playUser(int baskinNumber) {
		Scanner sc = new Scanner(System.in);
		int userNumber = 0;

		System.out.println("�÷��̾�� ���� ������ �Է��ϼ��� (1~3)");
		userNumber = sc.nextInt();

		System.out.print("�÷��̾�: ");
		return update(userNumber, baskinNumber);
	}
}
