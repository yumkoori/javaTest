package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05_02 {

	public static void main(String[] args) throws IOException {
		//����
		//���� ������ Ű����κ��� �Է� �޾Ƽ�
		//������ �����ϰ�
		//���� = 90 �̶�� ����ϴ� �ڵ��� ����

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("���� ���� : ");
		byte kor = Byte.parseByte(br.readLine());
		
		System.out.printf("���� = %d", kor);

	}
}
