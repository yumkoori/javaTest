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
//		System.out.print("�̸� = ");
//		name = sc.next();
//		
//		System.out.print("���� = ");
//		age = sc.nextByte();
//		
//		System.out.print("Ű = ");
//		height = sc.nextDouble();
//		
//		System.out.print("���� = ");
//		gender = sc.next().equals("����") ? true : false;
//		
//		System.out.printf("> �̸�:%s, ����:%d��, Ű:%.2f, ����:%s", name, age, height, gender == true ? "����" : "����");
		
		System.out.println("> �̸� ���� Ű ���� �Է� ?");
		String name = sc.next();
		byte age = sc.nextByte();
		double height = sc.nextDouble();
		boolean gender = sc.nextBoolean();
		
		System.out.printf("> �̸�:%s, ����:%d��, Ű:%.2f, ����:%s", name, age, height, gender == true ? "����" : "����");
		
		
		
		
		
	}
}