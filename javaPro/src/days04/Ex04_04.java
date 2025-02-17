package days04;

import java.util.Scanner;

public class Ex04_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		
//		String name; 
//		byte age;
//		double height;
//		boolean gender;
//		
//		System.out.print("이름 = ");
//		name = sc.next();
//		
//		System.out.print("나이 = ");
//		age = sc.nextByte();
//		
//		System.out.print("키 = ");
//		height = sc.nextDouble();
//		
//		System.out.print("성별 = ");
//		gender = sc.next().equals("여자") ? true : false;
//		
//		System.out.printf("> 이름:%s, 나이:%d살, 키:%.2f, 성별:%s", name, age, height, gender == true ? "여자" : "남자");
		
		System.out.println("> 이름 나이 키 성별 입력 ?");
		String name = sc.next();
		byte age = sc.nextByte();
		double height = sc.nextDouble();
		boolean gender = sc.nextBoolean();
		
		System.out.printf("> 이름:%s, 나이:%d살, 키:%.2f, 성별:%s", name, age, height, gender == true ? "여자" : "남자");
		
		
		
		
		
	}
}