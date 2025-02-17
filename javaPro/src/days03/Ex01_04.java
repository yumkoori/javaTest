package days03;

public class Ex01_04 {
	public static void main(String[] args) {
		double money = 1234569.7089;
		
		String strMoney = String.format("\\%,.2f \n", money);
		
		//Invalid escape sequence (valid ones are  \b  \t  \n  \f  \r  \"  \'  \\ )
		System.out.printf("\\%,.2f \n", money);
		
		System.out.printf("n\tame=\b%s\nage=%d\n", "ȫ�浿", 20);
	}

}
