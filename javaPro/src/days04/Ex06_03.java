package days04;

import java.util.Scanner;

public class Ex06_03 {

	public static void main(String[] args) {
		//���� ������ �Է� �޾Ƽ�
		//��/��/��/��/��
		//���
		//��	90�̻� ~ 100����
		//��	80�̻� ~ 90�̸�(89����)
		
		Scanner sc = new Scanner(System.in);
		
		
		int score = sc.nextInt();
		String result = "";
		
		if (score >= 90 && score <= 100) {
			result = "��";
		} else if (score >= 80 && score < 90) {
			result = "��";
		} else if (score >= 70 && score < 80) {
			result = "��";
		} else if (score >=60 && score < 70) {
			result = "��";
		} else if (score >= 0 && score < 60){
			result = "��";
		}
		
		System.out.println(result);
		
	}

}
