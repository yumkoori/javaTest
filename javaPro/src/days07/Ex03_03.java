package days07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex03_03 {

	public static void main(String[] args) throws IOException {
		String name;
		byte kor, eng, mat;
		short tot;
		double avg;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//홍길동,90,78,97
		System.out.print("이름, 국어, 영어, 수학 입력 ? : ");
		String data = reader.readLine().trim();
		
		String [] answer = data.split(",");
	
		name = answer[0];
		kor = Byte.parseByte(answer[1]);
		eng = Byte.parseByte(answer[2]);
		mat = Byte.parseByte(answer[3]);
		
		//name = reader.readLine();
		//kor = Byte.parseByte(reader.readLine());
		//eng = Byte.parseByte(reader.readLine());
		//mat = Byte.parseByte(reader.readLine());

		
		tot = (short) (kor + eng + mat); 
		avg = (double)tot / 3;
		
		System.out.printf("이름=\"%s\", 국어=%d, 영어=%d, 수학=%d, 총점=%d, 평균=%.2f", name, kor, eng, mat, tot, avg);

	}

}
