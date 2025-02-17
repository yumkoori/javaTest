package days04;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("> 정수(n) 입력 ? ");
		int n = sc.nextInt();	//1.기능, 2.매개변수 3.리턴값

		System.out.println(n);
		
		String name; 
		byte kor, eng, mat;
		short tot;
		double avg;
		
		name = sc.next();
		kor = sc.nextByte();
		eng = sc.nextByte();
		mat = sc.nextByte();
		
		tot = (short) (kor + eng + mat);
		avg = (double)tot/3;
		
		
		

	}

}
