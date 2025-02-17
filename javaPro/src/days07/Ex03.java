package days07;

import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {
		String data = "홍길동,이창익,서영학,정창기";
		String [] names = data.split(",");
		System.out.println(Arrays.toString(names));
		
//		int size = names.length;
//		for (int i = 0; i < size; i++) {
//			System.out.printf("names[%d]=\"%s");
//		} //for i
		
		
		for (String name : names) {
			System.out.println(name);
		}
			
		
	}
	

}
