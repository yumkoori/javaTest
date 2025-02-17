package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05_02 {

	public static void main(String[] args) throws IOException {
		//문제
		//국어 점수를 키보드로부터 입력 받아서
		//변수에 저장하고
		//국어 = 90 이라고 출력하는 코딩을 하자

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("국어 점수 : ");
		byte kor = Byte.parseByte(br.readLine());
		
		System.out.printf("국어 = %d", kor);

	}
}
