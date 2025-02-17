package days04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		//두 문자열을 비교
		String n1 = "홍길동";
		String n2;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("> 이름(n2)입력 ? ");
		n2 = reader.readLine();
		
		System.out.printf("> n2 = [%s]\n", n2);
		
		System.out.println(n1 == n2); 
		System.out.println(n1.equals(n2));
		System.out.println(n1.equals(n2)?"같다":"다르다");
	}

}
