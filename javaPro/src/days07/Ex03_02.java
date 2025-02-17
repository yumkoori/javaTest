package days07;

import java.util.Arrays;

public class Ex03_02 {

	public static void main(String[] args) {
		String data = "홍길동 ,  이창익,		서영학 , 정창기";
		String regex = "\\s*,\\s*";
		String [] names = data.split(",");

		for (String name : names) {
//			System.out.printf("[%s]\n", name.trim());
			System.out.printf("[%s]\n", name);
		}
	}
}
