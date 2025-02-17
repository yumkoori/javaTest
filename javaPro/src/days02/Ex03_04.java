package days02;

public class Ex03_04 {

	public static void main(String[] args) {
		String name = "홍길동";
		int age = 10;
		double height = 170.58;
		
		System.out.println("이름은 \"" + name + "\"이고, 나이는 " + age + "살이고, 키는 " + height + "cm이다.");
		System.out.printf("이름은 \"%s\"이고, 나이는 %d살이고, 키는 %.2fcm이다.", name, age, height);
		System.out.printf("%1$s!!!\n 안녕하세요. %1$s입니다. %1$s입니다.", name);
	}
}
