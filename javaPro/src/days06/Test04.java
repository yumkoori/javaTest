package days06;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String rank = "";
		int kor = -1;
		
		while (true) {
			System.out.print("���� ����: ");
			kor = sc.nextInt();
			if (kor <= 100 && kor >=0) break;
		}
		
		switch (kor / 10) {
		case 10:
			rank = "��";
		case 9:
			rank = "��";
			break;
		case 8:
			rank = "��";
			break;
		case 7:
			rank = "��";
			break;
		case 6: 
			rank = "��";
			break;
		default:
			rank = "��";
			break;
		} 
	}
}
