package days02;

public class Ex03_04 {

	public static void main(String[] args) {
		String name = "ȫ�浿";
		int age = 10;
		double height = 170.58;
		
		System.out.println("�̸��� \"" + name + "\"�̰�, ���̴� " + age + "���̰�, Ű�� " + height + "cm�̴�.");
		System.out.printf("�̸��� \"%s\"�̰�, ���̴� %d���̰�, Ű�� %.2fcm�̴�.", name, age, height);
		System.out.printf("%1$s!!!\n �ȳ��ϼ���. %1$s�Դϴ�. %1$s�Դϴ�.", name);
	}
}
